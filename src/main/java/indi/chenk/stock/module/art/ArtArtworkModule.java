package com.art58.site.module.art;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.art.ArtArtwork;
import com.art58.site.service.art.ArtArtworkService;

@At("/artArtwork")
@IocBean
@Log4j
public class ArtArtworkModule {

    
	@Inject("artArtworkService")
	ArtArtworkService service;

	@At("/view")
	@Ok("jsp:art/artartwork")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:art/artartwork")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:art/artartwork")
	public Object insert(@Param("..") ArtArtwork obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:art/artartwork")
	public Object update(@Param("..") ArtArtwork obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:art/artartwork")
	public Object queryPage(@Param("..") ArtArtwork obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:art/artartwork")
	public Object query(@Param("..") ArtArtwork obj) {
		return service.query(obj);
	}
}