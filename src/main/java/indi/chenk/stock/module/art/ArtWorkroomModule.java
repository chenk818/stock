package com.art58.site.module.art;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.art.ArtWorkroom;
import com.art58.site.service.art.ArtWorkroomService;

@At("/artWorkroom")
@IocBean
@Log4j
public class ArtWorkroomModule {

    
	@Inject("artWorkroomService")
	ArtWorkroomService service;

	@At("/view")
	@Ok("jsp:art/artworkroom")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:art/artworkroom")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:art/artworkroom")
	public Object insert(@Param("..") ArtWorkroom obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:art/artworkroom")
	public Object update(@Param("..") ArtWorkroom obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:art/artworkroom")
	public Object queryPage(@Param("..") ArtWorkroom obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:art/artworkroom")
	public Object query(@Param("..") ArtWorkroom obj) {
		return service.query(obj);
	}
}