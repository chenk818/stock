package com.art58.site.module.art;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.art.ArtShow;
import com.art58.site.service.art.ArtShowService;

@At("/artShow")
@IocBean
@Log4j
public class ArtShowModule {

    
	@Inject("artShowService")
	ArtShowService service;

	@At("/view")
	@Ok("jsp:art/artshow")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:art/artshow")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:art/artshow")
	public Object insert(@Param("..") ArtShow obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:art/artshow")
	public Object update(@Param("..") ArtShow obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:art/artshow")
	public Object queryPage(@Param("..") ArtShow obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:art/artshow")
	public Object query(@Param("..") ArtShow obj) {
		return service.query(obj);
	}
}