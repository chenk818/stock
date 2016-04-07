package com.art58.site.module.art;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.art.ArtShowExtern;
import com.art58.site.service.art.ArtShowExternService;

@At("/artShowExtern")
@IocBean
@Log4j
public class ArtShowExternModule {

    
	@Inject("artShowExternService")
	ArtShowExternService service;

	@At("/view")
	@Ok("jsp:art/artshowextern")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:art/artshowextern")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:art/artshowextern")
	public Object insert(@Param("..") ArtShowExtern obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:art/artshowextern")
	public Object update(@Param("..") ArtShowExtern obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:art/artshowextern")
	public Object queryPage(@Param("..") ArtShowExtern obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:art/artshowextern")
	public Object query(@Param("..") ArtShowExtern obj) {
		return service.query(obj);
	}
}