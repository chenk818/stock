package com.art58.site.module.art;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.art.ArtObject;
import com.art58.site.service.art.ArtObjectService;

@At("/artObject")
@IocBean
@Log4j
public class ArtObjectModule {

    
	@Inject("artObjectService")
	ArtObjectService service;

	@At("/view")
	@Ok("jsp:art/artobject")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:art/artobject")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:art/artobject")
	public Object insert(@Param("..") ArtObject obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:art/artobject")
	public Object update(@Param("..") ArtObject obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:art/artobject")
	public Object queryPage(@Param("..") ArtObject obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:art/artobject")
	public Object query(@Param("..") ArtObject obj) {
		return service.query(obj);
	}
}