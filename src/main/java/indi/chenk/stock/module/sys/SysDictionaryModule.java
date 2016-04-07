package com.art58.site.module.sys;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.sys.SysDictionary;
import com.art58.site.service.sys.SysDictionaryService;

@At("/sysDictionary")
@IocBean
@Log4j
public class SysDictionaryModule {

    
	@Inject("sysDictionaryService")
	SysDictionaryService service;

	@At("/view")
	@Ok("jsp:sys/sysdictionary")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:sys/sysdictionary")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:sys/sysdictionary")
	public Object insert(@Param("..") SysDictionary obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:sys/sysdictionary")
	public Object update(@Param("..") SysDictionary obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:sys/sysdictionary")
	public Object queryPage(@Param("..") SysDictionary obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:sys/sysdictionary")
	public Object query(@Param("..") SysDictionary obj) {
		return service.query(obj);
	}
}