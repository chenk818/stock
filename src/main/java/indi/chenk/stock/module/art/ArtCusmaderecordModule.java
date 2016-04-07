package com.art58.site.module.art;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.art.ArtCusmaderecord;
import com.art58.site.service.art.ArtCusmaderecordService;

@At("/artCusmaderecord")
@IocBean
@Log4j
public class ArtCusmaderecordModule {

    
	@Inject("artCusmaderecordService")
	ArtCusmaderecordService service;

	@At("/view")
	@Ok("jsp:art/artcusmaderecord")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:art/artcusmaderecord")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:art/artcusmaderecord")
	public Object insert(@Param("..") ArtCusmaderecord obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:art/artcusmaderecord")
	public Object update(@Param("..") ArtCusmaderecord obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:art/artcusmaderecord")
	public Object queryPage(@Param("..") ArtCusmaderecord obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:art/artcusmaderecord")
	public Object query(@Param("..") ArtCusmaderecord obj) {
		return service.query(obj);
	}
}