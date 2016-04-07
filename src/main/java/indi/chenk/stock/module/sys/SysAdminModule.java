package com.art58.site.module.sys;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.sys.SysAdmin;
import com.art58.site.service.sys.SysAdminService;

@At("/sysAdmin")
@IocBean
@Log4j
public class SysAdminModule {

    
	@Inject("sysAdminService")
	SysAdminService service;

	@At("/view")
	@Ok("jsp:sys/sysadmin")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:sys/sysadmin")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:sys/sysadmin")
	public Object insert(@Param("..") SysAdmin obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:sys/sysadmin")
	public Object update(@Param("..") SysAdmin obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:sys/sysadmin")
	public Object queryPage(@Param("..") SysAdmin obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:sys/sysadmin")
	public Object query(@Param("..") SysAdmin obj) {
		return service.query(obj);
	}
}