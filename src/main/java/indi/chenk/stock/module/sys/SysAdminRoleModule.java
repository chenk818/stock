package com.art58.site.module.sys;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.sys.SysAdminRole;
import com.art58.site.service.sys.SysAdminRoleService;

@At("/sysAdminRole")
@IocBean
@Log4j
public class SysAdminRoleModule {

    
	@Inject("sysAdminRoleService")
	SysAdminRoleService service;

	@At("/view")
	@Ok("jsp:sys/sysadminrole")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:sys/sysadminrole")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:sys/sysadminrole")
	public Object insert(@Param("..") SysAdminRole obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:sys/sysadminrole")
	public Object update(@Param("..") SysAdminRole obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:sys/sysadminrole")
	public Object queryPage(@Param("..") SysAdminRole obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:sys/sysadminrole")
	public Object query(@Param("..") SysAdminRole obj) {
		return service.query(obj);
	}
}