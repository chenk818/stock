package com.art58.site.module.sys;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.sys.SysLog;
import com.art58.site.service.sys.SysLogService;

@At("/sysLog")
@IocBean
@Log4j
public class SysLogModule {

    
	@Inject("sysLogService")
	SysLogService service;

	@At("/view")
	@Ok("jsp:sys/syslog")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:sys/syslog")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:sys/syslog")
	public Object insert(@Param("..") SysLog obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:sys/syslog")
	public Object update(@Param("..") SysLog obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:sys/syslog")
	public Object queryPage(@Param("..") SysLog obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:sys/syslog")
	public Object query(@Param("..") SysLog obj) {
		return service.query(obj);
	}
}