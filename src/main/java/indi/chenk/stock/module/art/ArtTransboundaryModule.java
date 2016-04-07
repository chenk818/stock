package com.art58.site.module.art;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.art.ArtTransboundary;
import com.art58.site.service.art.ArtTransboundaryService;

@At("/artTransboundary")
@IocBean
@Log4j
public class ArtTransboundaryModule {

    
	@Inject("artTransboundaryService")
	ArtTransboundaryService service;

	@At("/view")
	@Ok("jsp:art/arttransboundary")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:art/arttransboundary")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:art/arttransboundary")
	public Object insert(@Param("..") ArtTransboundary obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:art/arttransboundary")
	public Object update(@Param("..") ArtTransboundary obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:art/arttransboundary")
	public Object queryPage(@Param("..") ArtTransboundary obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:art/arttransboundary")
	public Object query(@Param("..") ArtTransboundary obj) {
		return service.query(obj);
	}
}