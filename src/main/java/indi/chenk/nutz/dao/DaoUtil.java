package indi.chenk.nutz.dao;

import org.nutz.dao.Dao;
import org.nutz.dao.impl.NutDao;
import org.nutz.ioc.Ioc;
import org.nutz.ioc.impl.NutIoc;
import org.nutz.ioc.loader.json.JsonLoader;
import org.nutz.mvc.Mvcs;

public class DaoUtil {
	private Dao dao = null;

	private static DaoUtil inst = new DaoUtil();

	private DaoUtil() {
		Ioc ioc = Mvcs.ctx().getDefaultIoc();
		if (ioc != null) {
			dao = ioc.get(NutDao.class, "dao");
		}
	}

	public static DaoUtil getInst() {
		return inst;
	}

	/**
	 * 获取Mvc环境下的dao
	 * 
	 * @return
	 */
	public Dao getDao() {
		return dao;
	}

	/**
	 * 获取非Mvc环境下dao
	 * 
	 * @return
	 */
	public Dao getNoneMvcDao() {
		Ioc ioc = new NutIoc(new JsonLoader("ioc/dao.js"));
		dao = ioc.get(Dao.class);
		return dao;
	}
}
