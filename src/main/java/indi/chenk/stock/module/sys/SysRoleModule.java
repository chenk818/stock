package com.art58.site.module.sys;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.sys.SysRole;
import com.art58.site.service.sys.SysRoleService;

@At("/sysRole")
@IocBean
@Log4j
public class SysRoleModule {

    
	@Inject("sysRoleService")
	SysRoleService service;

	@At("/view")
	@Ok("jsp:sys/sysrole")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:sys/sysrole")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:sys/sysrole")
	public Object insert(@Param("..") SysRole obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:sys/sysrole")
	public Object update(@Param("..") SysRole obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:sys/sysrole")
	public Object queryPage(@Param("..") SysRole obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:sys/sysrole")
	public Object query(@Param("..") SysRole obj) {
		return service.query(obj);
	}
}