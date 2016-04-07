package com.art58.site.module.sys;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.sys.SysThirdlogin;
import com.art58.site.service.sys.SysThirdloginService;

@At("/sysThirdlogin")
@IocBean
@Log4j
public class SysThirdloginModule {

    
	@Inject("sysThirdloginService")
	SysThirdloginService service;

	@At("/view")
	@Ok("jsp:sys/systhirdlogin")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:sys/systhirdlogin")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:sys/systhirdlogin")
	public Object insert(@Param("..") SysThirdlogin obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:sys/systhirdlogin")
	public Object update(@Param("..") SysThirdlogin obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:sys/systhirdlogin")
	public Object queryPage(@Param("..") SysThirdlogin obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:sys/systhirdlogin")
	public Object query(@Param("..") SysThirdlogin obj) {
		return service.query(obj);
	}
}