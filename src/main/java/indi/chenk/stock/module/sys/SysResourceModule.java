package com.art58.site.module.sys;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.sys.SysResource;
import com.art58.site.service.sys.SysResourceService;

@At("/sysResource")
@IocBean
@Log4j
public class SysResourceModule {

    
	@Inject("sysResourceService")
	SysResourceService service;

	@At("/view")
	@Ok("jsp:sys/sysresource")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:sys/sysresource")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:sys/sysresource")
	public Object insert(@Param("..") SysResource obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:sys/sysresource")
	public Object update(@Param("..") SysResource obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:sys/sysresource")
	public Object queryPage(@Param("..") SysResource obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:sys/sysresource")
	public Object query(@Param("..") SysResource obj) {
		return service.query(obj);
	}
}