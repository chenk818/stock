package com.art58.site.module.sys;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.sys.SysUserRole;
import com.art58.site.service.sys.SysUserRoleService;

@At("/sysUserRole")
@IocBean
@Log4j
public class SysUserRoleModule {

    
	@Inject("sysUserRoleService")
	SysUserRoleService service;

	@At("/view")
	@Ok("jsp:sys/sysuserrole")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:sys/sysuserrole")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:sys/sysuserrole")
	public Object insert(@Param("..") SysUserRole obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:sys/sysuserrole")
	public Object update(@Param("..") SysUserRole obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:sys/sysuserrole")
	public Object queryPage(@Param("..") SysUserRole obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:sys/sysuserrole")
	public Object query(@Param("..") SysUserRole obj) {
		return service.query(obj);
	}
}