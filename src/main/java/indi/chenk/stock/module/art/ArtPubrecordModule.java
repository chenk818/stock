package com.art58.site.module.art;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.art.ArtPubrecord;
import com.art58.site.service.art.ArtPubrecordService;

@At("/artPubrecord")
@IocBean
@Log4j
public class ArtPubrecordModule {

    
	@Inject("artPubrecordService")
	ArtPubrecordService service;

	@At("/view")
	@Ok("jsp:art/artpubrecord")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:art/artpubrecord")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:art/artpubrecord")
	public Object insert(@Param("..") ArtPubrecord obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:art/artpubrecord")
	public Object update(@Param("..") ArtPubrecord obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:art/artpubrecord")
	public Object queryPage(@Param("..") ArtPubrecord obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:art/artpubrecord")
	public Object query(@Param("..") ArtPubrecord obj) {
		return service.query(obj);
	}
}