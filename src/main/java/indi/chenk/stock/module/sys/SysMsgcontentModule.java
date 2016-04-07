package com.art58.site.module.sys;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.sys.SysMsgcontent;
import com.art58.site.service.sys.SysMsgcontentService;

@At("/sysMsgcontent")
@IocBean
@Log4j
public class SysMsgcontentModule {

    
	@Inject("sysMsgcontentService")
	SysMsgcontentService service;

	@At("/view")
	@Ok("jsp:sys/sysmsgcontent")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:sys/sysmsgcontent")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:sys/sysmsgcontent")
	public Object insert(@Param("..") SysMsgcontent obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:sys/sysmsgcontent")
	public Object update(@Param("..") SysMsgcontent obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:sys/sysmsgcontent")
	public Object queryPage(@Param("..") SysMsgcontent obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:sys/sysmsgcontent")
	public Object query(@Param("..") SysMsgcontent obj) {
		return service.query(obj);
	}
}