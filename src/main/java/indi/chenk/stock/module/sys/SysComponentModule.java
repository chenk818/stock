package com.art58.site.module.sys;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.sys.SysComponent;
import com.art58.site.service.sys.SysComponentService;

@At("/sysComponent")
@IocBean
@Log4j
public class SysComponentModule {

    
	@Inject("sysComponentService")
	SysComponentService service;

	@At("/view")
	@Ok("jsp:sys/syscomponent")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:sys/syscomponent")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:sys/syscomponent")
	public Object insert(@Param("..") SysComponent obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:sys/syscomponent")
	public Object update(@Param("..") SysComponent obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:sys/syscomponent")
	public Object queryPage(@Param("..") SysComponent obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:sys/syscomponent")
	public Object query(@Param("..") SysComponent obj) {
		return service.query(obj);
	}
}