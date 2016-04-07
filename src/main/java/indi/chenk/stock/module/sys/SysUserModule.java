package com.art58.site.module.sys;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.sys.SysUser;
import com.art58.site.service.sys.SysUserService;

@At("/sysUser")
@IocBean
@Log4j
public class SysUserModule {

    
	@Inject("sysUserService")
	SysUserService service;

	@At("/view")
	@Ok("jsp:sys/sysuser")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:sys/sysuser")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:sys/sysuser")
	public Object insert(@Param("..") SysUser obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:sys/sysuser")
	public Object update(@Param("..") SysUser obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:sys/sysuser")
	public Object queryPage(@Param("..") SysUser obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:sys/sysuser")
	public Object query(@Param("..") SysUser obj) {
		return service.query(obj);
	}
}