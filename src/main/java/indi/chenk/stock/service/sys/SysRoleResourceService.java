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

import com.art58.site.pojo.sys.SysRoleResource;

@Log4j
@IocBean
public class SysRoleResourceService extends BaseService {


	public PageResult<SysRoleResource> queryPage(SysRoleResource obj) {
		return super.queryPage(SysRoleResource.class, obj, getCri(obj));
	}

	public List<SysRoleResource> query(SysRoleResource obj) {
		return super.query(SysRoleResource.class, getCri(obj));
	}

   	public SysRoleResource get(String id) {
		return super.fetch(SysRoleResource.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(SysRoleResource.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(SysRoleResource obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getRoleId())) {
			cri.where().andEquals("ROLE_ID", obj.getRoleId());
		}
		if(StringTool.isNotNull(obj.getResId())) {
			cri.where().andEquals("RES_ID", obj.getResId());
		}
		if(StringTool.isNotNull(obj.getCrtTellerId())) {
			cri.where().andEquals("CRT_TELLER_ID", obj.getCrtTellerId());
		}
		if(StringTool.isNotNull(obj.getCrtTime())) {
			cri.where().andEquals("CRT_TIME", obj.getCrtTime());
		}
		if(StringTool.isNotNull(obj.getUpdTellerId())) {
			cri.where().andEquals("UPD_TELLER_ID", obj.getUpdTellerId());
		}
		if(StringTool.isNotNull(obj.getUpdTime())) {
			cri.where().andEquals("UPD_TIME", obj.getUpdTime());
		}
		return cri;
	}

}