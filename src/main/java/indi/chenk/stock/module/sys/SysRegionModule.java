package com.art58.site.module.sys;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.sys.SysRegion;
import com.art58.site.service.sys.SysRegionService;

@At("/sysRegion")
@IocBean
@Log4j
public class SysRegionModule {

    
	@Inject("sysRegionService")
	SysRegionService service;

	@At("/view")
	@Ok("jsp:sys/sysregion")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:sys/sysregion")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:sys/sysregion")
	public Object insert(@Param("..") SysRegion obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:sys/sysregion")
	public Object update(@Param("..") SysRegion obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:sys/sysregion")
	public Object queryPage(@Param("..") SysRegion obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:sys/sysregion")
	public Object query(@Param("..") SysRegion obj) {
		return service.query(obj);
	}
}