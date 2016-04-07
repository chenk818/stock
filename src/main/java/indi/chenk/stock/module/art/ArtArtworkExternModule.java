package com.art58.site.module.art;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.art.ArtArtworkExtern;
import com.art58.site.service.art.ArtArtworkExternService;

@At("/artArtworkExtern")
@IocBean
@Log4j
public class ArtArtworkExternModule {

    
	@Inject("artArtworkExternService")
	ArtArtworkExternService service;

	@At("/view")
	@Ok("jsp:art/artartworkextern")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:art/artartworkextern")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:art/artartworkextern")
	public Object insert(@Param("..") ArtArtworkExtern obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:art/artartworkextern")
	public Object update(@Param("..") ArtArtworkExtern obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:art/artartworkextern")
	public Object queryPage(@Param("..") ArtArtworkExtern obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:art/artartworkextern")
	public Object query(@Param("..") ArtArtworkExtern obj) {
		return service.query(obj);
	}
}