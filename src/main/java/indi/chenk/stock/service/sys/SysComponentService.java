package com.art58.site.service.sys;

import java.util.List;

import org.nutz.dao.Cnd;
import org.nutz.dao.util.cri.SimpleCriteria;
import org.nutz.ioc.loader.annotation.IocBean;

import com.art58.nutz.result.PageResult;
import com.art58.nutz.service.BaseService;
import com.art58.site.pojo.SampleBean;
import com.art58.tool.util.StringTool;

import lombok.extern.log4j.Log4j;

import com.art58.site.pojo.sys.SysComponent;

@Log4j
@IocBean
public class SysComponentService extends BaseService {


	public PageResult<SysComponent> queryPage(SysComponent obj) {
		return super.queryPage(SysComponent.class, obj, getCri(obj));
	}

	public List<SysComponent> query(SysComponent obj) {
		return super.query(SysComponent.class, getCri(obj));
	}

   	public SysComponent get(String id) {
		return super.fetch(SysComponent.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(SysComponent.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(SysComponent obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getContent())) {
			cri.where().andEquals("CONTENT", obj.getContent());
		}
		if(StringTool.isNotNull(obj.getType())) {
			cri.where().andEquals("TYPE", obj.getType());
		}
		if(StringTool.isNotNull(obj.getXid())) {
			cri.where().andEquals("XID", obj.getXid());
		}
		return cri;
	}

}