package com.art58.site.module.sys;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.sys.SysParam;
import com.art58.site.service.sys.SysParamService;

@At("/sysParam")
@IocBean
@Log4j
public class SysParamModule {

    
	@Inject("sysParamService")
	SysParamService service;

	@At("/view")
	@Ok("jsp:sys/sysparam")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:sys/sysparam")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:sys/sysparam")
	public Object insert(@Param("..") SysParam obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:sys/sysparam")
	public Object update(@Param("..") SysParam obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:sys/sysparam")
	public Object queryPage(@Param("..") SysParam obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:sys/sysparam")
	public Object query(@Param("..") SysParam obj) {
		return service.query(obj);
	}
}