package com.art58.site.module.art;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.art.ArtArtworkRecord;
import com.art58.site.service.art.ArtArtworkRecordService;

@At("/artArtworkRecord")
@IocBean
@Log4j
public class ArtArtworkRecordModule {

    
	@Inject("artArtworkRecordService")
	ArtArtworkRecordService service;

	@At("/view")
	@Ok("jsp:art/artartworkrecord")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:art/artartworkrecord")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:art/artartworkrecord")
	public Object insert(@Param("..") ArtArtworkRecord obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:art/artartworkrecord")
	public Object update(@Param("..") ArtArtworkRecord obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:art/artartworkrecord")
	public Object queryPage(@Param("..") ArtArtworkRecord obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:art/artartworkrecord")
	public Object query(@Param("..") ArtArtworkRecord obj) {
		return service.query(obj);
	}
}