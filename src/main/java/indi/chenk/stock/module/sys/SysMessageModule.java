package com.art58.site.module.sys;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.sys.SysMessage;
import com.art58.site.service.sys.SysMessageService;

@At("/sysMessage")
@IocBean
@Log4j
public class SysMessageModule {

    
	@Inject("sysMessageService")
	SysMessageService service;

	@At("/view")
	@Ok("jsp:sys/sysmessage")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:sys/sysmessage")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:sys/sysmessage")
	public Object insert(@Param("..") SysMessage obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:sys/sysmessage")
	public Object update(@Param("..") SysMessage obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:sys/sysmessage")
	public Object queryPage(@Param("..") SysMessage obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:sys/sysmessage")
	public Object query(@Param("..") SysMessage obj) {
		return service.query(obj);
	}
}