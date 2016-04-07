package com.art58.site.module.art;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.art.ArtDream;
import com.art58.site.service.art.ArtDreamService;

@At("/artDream")
@IocBean
@Log4j
public class ArtDreamModule {

    
	@Inject("artDreamService")
	ArtDreamService service;

	@At("/view")
	@Ok("jsp:art/artdream")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:art/artdream")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:art/artdream")
	public Object insert(@Param("..") ArtDream obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:art/artdream")
	public Object update(@Param("..") ArtDream obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:art/artdream")
	public Object queryPage(@Param("..") ArtDream obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:art/artdream")
	public Object query(@Param("..") ArtDream obj) {
		return service.query(obj);
	}
}