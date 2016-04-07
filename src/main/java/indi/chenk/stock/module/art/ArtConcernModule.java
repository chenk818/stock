package com.art58.site.module.art;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.art.ArtConcern;
import com.art58.site.service.art.ArtConcernService;

@At("/artConcern")
@IocBean
@Log4j
public class ArtConcernModule {

    
	@Inject("artConcernService")
	ArtConcernService service;

	@At("/view")
	@Ok("jsp:art/artconcern")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:art/artconcern")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:art/artconcern")
	public Object insert(@Param("..") ArtConcern obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:art/artconcern")
	public Object update(@Param("..") ArtConcern obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:art/artconcern")
	public Object queryPage(@Param("..") ArtConcern obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:art/artconcern")
	public Object query(@Param("..") ArtConcern obj) {
		return service.query(obj);
	}
}