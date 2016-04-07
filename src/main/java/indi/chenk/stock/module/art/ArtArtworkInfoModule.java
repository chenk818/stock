package com.art58.site.module.art;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.art.ArtArtworkInfo;
import com.art58.site.service.art.ArtArtworkInfoService;

@At("/artArtworkInfo")
@IocBean
@Log4j
public class ArtArtworkInfoModule {

    
	@Inject("artArtworkInfoService")
	ArtArtworkInfoService service;

	@At("/view")
	@Ok("jsp:art/artartworkinfo")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:art/artartworkinfo")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:art/artartworkinfo")
	public Object insert(@Param("..") ArtArtworkInfo obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:art/artartworkinfo")
	public Object update(@Param("..") ArtArtworkInfo obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:art/artartworkinfo")
	public Object queryPage(@Param("..") ArtArtworkInfo obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:art/artartworkinfo")
	public Object query(@Param("..") ArtArtworkInfo obj) {
		return service.query(obj);
	}
}