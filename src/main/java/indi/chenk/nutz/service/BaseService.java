package com.art58.nutz.service;

import java.util.List;
import java.util.Map;

import org.nutz.dao.Chain;
import org.nutz.dao.Cnd;
import org.nutz.dao.Condition;
import org.nutz.dao.Dao;
import org.nutz.dao.FieldFilter;
import org.nutz.dao.Sqls;
import org.nutz.dao.pager.Pager;
import org.nutz.dao.sql.Sql;
import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.log.Log;
import org.nutz.log.Logs;
import org.nutz.trans.Atom;

import com.art58.nutz.pojo.BaseEntity;
import com.art58.nutz.result.PageResult;
import com.art58.tool.util.StringTool;
import com.art58.tool.util.UUIDUtil;

/**
 * @Description: 后台操作基类
 * @author zbl
 * 
 * @date 2014年7月10日 下午4:55:59
 */
public class BaseService {
	protected static final Log log = Logs.get();

	@Inject
	protected Dao dao;

	public Dao getDao() {
		return dao;
	}

	public void setDao(Dao dao) {
		this.dao = dao;
	}

	/**
	 * 根据key执行查询，返回类型为cls的列表
	 * 
	 * @param key
	 *            sqls文件里面的key值
	 * @param cls
	 *            返回类型，需要与对应的sql语句映射上
	 * @return 返回列表结果
	 */
	public <T> List<T> query(String key, Class<T> cls) {
		return query(key, cls, Cnd.cri(), null);
	}

	/**
	 * 根据key执行条件查询，返回类型为cls的列表
	 * 
	 * @param key
	 *            sqls文件里面的key值
	 * @param cls
	 *            返回类型，需要与对应的sql语句映射上
	 * @param cnd
	 *            查询条件
	 * @return 返回列表结果
	 */
	public <T> List<T> query(String key, Class<T> cls, Condition cnd) {
		return query(key, cls, cnd, null);
	}

	/**
	 * 根据key执行带参数条件查询，返回类型为cls的列表
	 * 
	 * @param key
	 *            sqls文件里面的key值
	 * @param cls
	 *            返回类型，需要与对应的sql语句映射上
	 * @param cnd
	 *            查询条件
	 * @param params
	 *            sql文件里面的参数
	 * @return 返回列表结果
	 */
	public <T> List<T> query(String key, Class<T> cls, Condition cnd,
			Map<String, Object> params) {
		Sql sql = query(key, cls, cnd, params, null);
		return sql.getList(cls);
	}

	/**
	 * 根据key值和相关条件进行分页查询
	 * 
	 * @param key
	 *            sqls文件里面的key值
	 * @param cls
	 *            返回类型，需要与对应的sql语句映射上
	 * @param entity
	 *            分页信息，存在在pojo里面
	 * @param cnd
	 *            查询条件
	 * @return 分页查询结果
	 */
	public <T> PageResult<T> queryPage(String key, Class<T> cls,
			BaseEntity entity, Condition cnd) {
		return queryPage(key, cls, entity, cnd, null);
	}

	/**
	 * 根据key值和相关条件进行分页查询
	 * 
	 * @param key
	 *            sqls文件里面的key值
	 * @param cls
	 *            返回类型，需要与对应的sql语句映射上
	 * @param entity
	 *            分页信息，存在在pojo里面
	 * @param cnd
	 *            查询条件
	 * @param params
	 *            sql文件里面的参数
	 * @return 分页查询结果
	 */
	public <T> PageResult<T> queryPage(String key, Class<T> cls,
			BaseEntity entity, Condition cnd, Map<String, Object> params) {
		Pager page = getPager(entity);
		Sql sql = query(key, cls, cnd, params, page);
		List<T> rows = sql.getList(cls);

		sql = dao.sqls().create(key);
		if (null != params) {
			for (String p : params.keySet()) {
				sql.params().set(p, params.get(p));
			}
		}
		sql.setCondition(cnd);
		sql = Sqls.create(count(sql.toString()));
		sql.setCallback(Sqls.callback.integer());
		dao.execute(sql);
		return new PageResult<T>(rows, sql.getInt());
	}

	private static String count(String sql) {
		return "select count(1) from (" + sql + ") as total";
	}

	/**
	 * 根据条件进行分页查询
	 * 
	 * @param cls
	 *            数据表对应的pojo类
	 * @param entity
	 *            分页信息
	 * @param cnd
	 *            查询条件
	 * @return 分页查询结果
	 */
	public <T> PageResult<T> queryPage(Class<T> cls, BaseEntity entity,
			Condition cnd) {
		Pager page = getPager(entity);
		List<T> rows = dao.query(cls, cnd, page);
		int count = dao.count(cls, cnd);
		return new PageResult<T>(rows, count);
	}

	private <T> Sql query(String key, Class<T> cls, Condition cnd,
			Map<String, Object> params, Pager page) {
		Sql sql = dao.sqls().create(key);
		if (null != params) {
			for (String p : params.keySet()) {
				sql.params().set(p, params.get(p));
			}
		}
		sql.setCallback(Sqls.callback.entities());
		sql.setEntity(dao.getEntity(cls));
		sql.setCondition(cnd);
		if (null != page) {
			sql.setPager(page);
		}
		dao.execute(sql);
		return sql;
	}

	/**
	 * 查询一组对象。你可以为这次查询设定条件
	 * 
	 * @param cls
	 *            对象类型
	 * @param cnd
	 *            WHERE 条件。如果为 null，将获取全部数据，顺序为数据库原生顺序
	 * @return 对象列表
	 */
	public <T> List<T> query(Class<T> cls, Condition cnd) {
		return dao.query(cls, cnd);
	}

	public Map fetch(String key, Map<String, Object> params) {
		Sql sql = dao.sqls().create(key);
		if (null != params) {
			for (String p : params.keySet()) {
				sql.params().set(p, params.get(p));
			}
		}
		sql.setCallback(Sqls.callback.maps());
		dao.execute(sql);
		return sql.getList(Map.class).get(0);
	}

	/**
	 * 根据主键id返回一条记录
	 * 
	 * @param cls
	 *            数据表对应的pojo
	 * @param id
	 *            id值，该id值类型为字符串型
	 * @return
	 */
	public <T> T fetch(Class<T> cls, String id) {
		if(null == id) {
			return null;
		}
		return dao.fetch(cls, id);
	}

	/**
	 * 根据主键id返回一条记录
	 * 
	 * @param cls
	 *            数据表对应的pojo
	 * @param id
	 *            id值，该id值类型为数字型
	 * @return
	 */
	public <T> T fetch(Class<T> cls, long id) {
		return dao.fetch(cls, id);
	}

	/**
	 * 根据 WHERE 条件获取一个对象。如果有多个对象符合条件，将只获取 ResultSet 第一个记录
	 * <p>
	 * 适用于根据唯一值查询对象
	 * 
	 * @param cls
	 *            对象类型
	 * @param cnd
	 *            WHERE 条件
	 * @return 对象本身
	 */
	public <T> T fetch(Class<T> cls, Condition cnd) {
		return dao.fetch(cls, cnd);
	}

	/**
	 * 更新对象
	 * 
	 * @param obj
	 *            待更新对象
	 * @return
	 */
	public int update(Object obj) {
		return dao.update(obj);
	}

	/**
	 * 更新对象
	 * <p>
	 * 忽略空值
	 * 
	 * @param obj
	 *            待更新对象
	 * @return
	 */
	public int updateIgnoreNull(Object obj) {
		return dao.updateIgnoreNull(obj);
	}

	/**
	 * 与 update(String tableName, Chain chain, Condition cnd) 一样，不过，数据表名，将取自
	 * POJO 的数据表声明，请参看 '@Table' 注解的详细说明
	 * 
	 * @param classOfT
	 *            实体类型
	 * @param chain
	 *            数据名值链，注意，name首先与pojo里面的属性对应找到column，若找不到，则直接根据name设置。
	 * @param cnd
	 *            WHERE 条件
	 * 
	 * @return 有多少条记录被更新了
	 * 
	 * @see org.nutz.dao.entity.annotation.Table
	 */
	public int update(Class<?> classOfT, Chain chain, Condition cnd) {
		return dao.update(classOfT, chain, cnd);
	}

	/**
	 * 根据正则表达式进行字段更新
	 * 
	 * @param clazz
	 *            POJO 类型
	 * @param actived
	 *            正则表达式，哪些字段会被操作，语法请参看 Pattern 类的 JavaDoc
	 * @param locked
	 *            正则表达式，哪些字段会被忽略，语法请参看 Pattern 类的 JavaDoc
	 * @param ignoreNull
	 *            是否忽略 NULL 值字段
	 * @see java.util.regex.Pattern
	 */
	public <T> void updateIgoneField(Class<T> clazz, final T obj,
			String actived, String locked, boolean ignoreNull, final Dao dao) {
		FieldFilter.create(clazz, actived, locked, ignoreNull).run(new Atom() {
			@Override
			public void run() {
				dao.update(obj);
			}
		});
	}

	/**
	 * 将一个对象插入到一个数据源。
	 * <p>
	 * 声明了 '@Id'的字段会在插入数据库时被忽略，因为数据库会自动为其设值。如果想手动设置，请设置 '@Id(auto=false)'
	 * <p>
	 * <b>插入之前</b>，会检查声明了 '@Default(@SQL("SELECT ..."))' 的字段，预先执行 SQL 为字段设置。
	 * <p>
	 * <b>插入之后</b>，会检查声明了 '@Next(@SQL("SELECT ..."))' 的字段，通过执行 SQL 将值取回
	 * <p>
	 * 如果你的字段仅仅声明了 '@Id(auto=true)'，没有声明 '@Next'，则认为你还是想取回插入后最新的 ID 值，因为
	 * 自动为你添加类似 @Next(@SQL("SELECT MAX(id) FROM tableName")) 的设置
	 * 
	 * 
	 * 
	 * @param obj
	 *            要被插入的对象
	 *            <p>
	 *            它可以是：
	 *            <ul>
	 *            <li>普通 POJO
	 *            <li>集合
	 *            <li>数组
	 *            <li>Map
	 *            </ul>
	 *            <b style=color:red>注意：</b> 如果是集合，数组或者 Map，所有的对象必须类型相同，否则可能会出错
	 * 
	 * @return 插入后的对象
	 * 
	 * @see org.nutz.dao.entity.annotation.Id
	 * @see org.nutz.dao.entity.annotation.Default
	 * @see org.nutz.dao.entity.annotation.Next
	 */
	public <T extends BaseEntity> T insert(T obj) {
		if (StringTool.isNull(obj.getId())) {
			obj.setId(UUIDUtil.getUUID());
		}
		return dao.insert(obj);
	}

	/**
	 * 自动判断如何删除一个对象。
	 * <p>
	 * 如果声明了 '@Id' 则相当于 delete(Class<T>,long)<br>
	 * 如果声明了 '@Name'，则相当于 delete(Class<T>,String)<br>
	 * 如果声明了 '@PK'，则 deletex(Class<T>,Object ...)<br>
	 * 如果没声明任何上面三个注解，则会抛出一个运行时异常
	 * 
	 * @param obj
	 *            要被删除的对象
	 */
	public int delete(Object obj) {
		return dao.delete(obj);
	}

	/**
	 * 根据对象 Name 删除一个对象。它只会删除这个对象，关联对象不会被删除。
	 * <p>
	 * 你的对象必须在某个字段声明了注解 '@Name'，否则本操作会抛出一个运行时异常
	 * <p>
	 * 如果你设定了外键约束，没有正确的清除关联对象会导致这个操作失败
	 * 
	 * @param classOfT
	 *            对象类型
	 * @param name
	 *            对象 Name
	 * 
	 * @return 影响的行数
	 * @see org.nutz.dao.entity.annotation.Name
	 */
	public <T> int delete(Class<T> cls, String ids) {
		String[] idArr = ids.split(",");
		int count = 0;
		for (String id : idArr) {
			count += dao.delete(cls, id);
		}
		return count;
	}

	/**
	 * 根据一个 WHERE 条件，清除一组对象。只包括对象本身，不包括关联字段
	 * 
	 * @param classOfT
	 *            对象类型
	 * @param cnd
	 *            查询条件，如果为 null，则全部清除
	 * @return 影响的行数
	 */
	public <T> int delete(Class<T> cls, Condition cnd) {
		return dao.clear(cls, cnd);
	}

	public Pager getPager(BaseEntity entity) {
		int start;
		int limit;
		if (entity == null || entity.getPage() == null
				|| entity.getPageSize() == null) {
			start = 0;
			limit = 30;
			return dao.createPager(start, limit);
		}
		start = entity.getPage();
		limit = entity.getPageSize();
		return dao.createPager(start, limit);
	}
}
