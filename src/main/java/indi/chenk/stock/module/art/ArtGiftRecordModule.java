package com.art58.site.module.art;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.art.ArtGiftRecord;
import com.art58.site.service.art.ArtGiftRecordService;

@At("/artGiftRecord")
@IocBean
@Log4j
public class ArtGiftRecordModule {

    
	@Inject("artGiftRecordService")
	ArtGiftRecordService service;

	@At("/view")
	@Ok("jsp:art/artgiftrecord")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:art/artgiftrecord")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:art/artgiftrecord")
	public Object insert(@Param("..") ArtGiftRecord obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:art/artgiftrecord")
	public Object update(@Param("..") ArtGiftRecord obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:art/artgiftrecord")
	public Object queryPage(@Param("..") ArtGiftRecord obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:art/artgiftrecord")
	public Object query(@Param("..") ArtGiftRecord obj) {
		return service.query(obj);
	}
}