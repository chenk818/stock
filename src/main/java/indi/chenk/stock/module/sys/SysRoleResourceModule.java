package com.art58.site.module.sys;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.sys.SysRoleResource;
import com.art58.site.service.sys.SysRoleResourceService;

@At("/sysRoleResource")
@IocBean
@Log4j
public class SysRoleResourceModule {

    
	@Inject("sysRoleResourceService")
	SysRoleResourceService service;

	@At("/view")
	@Ok("jsp:sys/sysroleresource")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:sys/sysroleresource")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:sys/sysroleresource")
	public Object insert(@Param("..") SysRoleResource obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:sys/sysroleresource")
	public Object update(@Param("..") SysRoleResource obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:sys/sysroleresource")
	public Object queryPage(@Param("..") SysRoleResource obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:sys/sysroleresource")
	public Object query(@Param("..") SysRoleResource obj) {
		return service.query(obj);
	}
}