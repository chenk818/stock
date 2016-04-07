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

import com.art58.site.pojo.sys.SysThirdlogin;

@Log4j
@IocBean
public class SysThirdloginService extends BaseService {


	public PageResult<SysThirdlogin> queryPage(SysThirdlogin obj) {
		return super.queryPage(SysThirdlogin.class, obj, getCri(obj));
	}

	public List<SysThirdlogin> query(SysThirdlogin obj) {
		return super.query(SysThirdlogin.class, getCri(obj));
	}

   	public SysThirdlogin get(String id) {
		return super.fetch(SysThirdlogin.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(SysThirdlogin.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(SysThirdlogin obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getPlatform())) {
			cri.where().andEquals("PLATFORM", obj.getPlatform());
		}
		if(StringTool.isNotNull(obj.getOpenid())) {
			cri.where().andEquals("OPENID", obj.getOpenid());
		}
		if(StringTool.isNotNull(obj.getSerialNo())) {
			cri.where().andEquals("SERIAL_NO", obj.getSerialNo());
		}
		return cri;
	}

}