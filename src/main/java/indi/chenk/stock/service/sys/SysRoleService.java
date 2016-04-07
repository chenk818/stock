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

import com.art58.site.pojo.sys.SysRole;

@Log4j
@IocBean
public class SysRoleService extends BaseService {


	public PageResult<SysRole> queryPage(SysRole obj) {
		return super.queryPage(SysRole.class, obj, getCri(obj));
	}

	public List<SysRole> query(SysRole obj) {
		return super.query(SysRole.class, getCri(obj));
	}

   	public SysRole get(String id) {
		return super.fetch(SysRole.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(SysRole.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(SysRole obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getRoleName())) {
			cri.where().andEquals("ROLE_NAME", obj.getRoleName());
		}
		if(StringTool.isNotNull(obj.getState())) {
			cri.where().andEquals("STATE", obj.getState());
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