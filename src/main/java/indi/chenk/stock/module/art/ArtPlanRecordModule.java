package com.art58.site.module.art;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.art.ArtPlanRecord;
import com.art58.site.service.art.ArtPlanRecordService;

@At("/artPlanRecord")
@IocBean
@Log4j
public class ArtPlanRecordModule {

    
	@Inject("artPlanRecordService")
	ArtPlanRecordService service;

	@At("/view")
	@Ok("jsp:art/artplanrecord")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:art/artplanrecord")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:art/artplanrecord")
	public Object insert(@Param("..") ArtPlanRecord obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:art/artplanrecord")
	public Object update(@Param("..") ArtPlanRecord obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:art/artplanrecord")
	public Object queryPage(@Param("..") ArtPlanRecord obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:art/artplanrecord")
	public Object query(@Param("..") ArtPlanRecord obj) {
		return service.query(obj);
	}
}