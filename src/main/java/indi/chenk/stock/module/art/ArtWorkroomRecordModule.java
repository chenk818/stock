package com.art58.site.module.art;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.art.ArtWorkroomRecord;
import com.art58.site.service.art.ArtWorkroomRecordService;

@At("/artWorkroomRecord")
@IocBean
@Log4j
public class ArtWorkroomRecordModule {

    
	@Inject("artWorkroomRecordService")
	ArtWorkroomRecordService service;

	@At("/view")
	@Ok("jsp:art/artworkroomrecord")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:art/artworkroomrecord")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:art/artworkroomrecord")
	public Object insert(@Param("..") ArtWorkroomRecord obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:art/artworkroomrecord")
	public Object update(@Param("..") ArtWorkroomRecord obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:art/artworkroomrecord")
	public Object queryPage(@Param("..") ArtWorkroomRecord obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:art/artworkroomrecord")
	public Object query(@Param("..") ArtWorkroomRecord obj) {
		return service.query(obj);
	}
}