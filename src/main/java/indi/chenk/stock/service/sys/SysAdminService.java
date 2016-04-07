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

import com.art58.site.pojo.sys.SysAdmin;

@Log4j
@IocBean
public class SysAdminService extends BaseService {


	public PageResult<SysAdmin> queryPage(SysAdmin obj) {
		return super.queryPage(SysAdmin.class, obj, getCri(obj));
	}

	public List<SysAdmin> query(SysAdmin obj) {
		return super.query(SysAdmin.class, getCri(obj));
	}

   	public SysAdmin get(String id) {
		return super.fetch(SysAdmin.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(SysAdmin.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(SysAdmin obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getUsername())) {
			cri.where().andEquals("USERNAME", obj.getUsername());
		}
		if(StringTool.isNotNull(obj.getPassword())) {
			cri.where().andEquals("PASSWORD", obj.getPassword());
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