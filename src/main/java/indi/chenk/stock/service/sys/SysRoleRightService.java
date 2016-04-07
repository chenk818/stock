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

import com.art58.site.pojo.sys.SysRoleRight;

@Log4j
@IocBean
public class SysRoleRightService extends BaseService {


	public PageResult<SysRoleRight> queryPage(SysRoleRight obj) {
		return super.queryPage(SysRoleRight.class, obj, getCri(obj));
	}

	public List<SysRoleRight> query(SysRoleRight obj) {
		return super.query(SysRoleRight.class, getCri(obj));
	}

   	public SysRoleRight get(String id) {
		return super.fetch(SysRoleRight.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(SysRoleRight.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(SysRoleRight obj) {
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