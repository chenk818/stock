package com.art58.site.module.art;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.art.ArtExchangeRecord;
import com.art58.site.service.art.ArtExchangeRecordService;

@At("/artExchangeRecord")
@IocBean
@Log4j
public class ArtExchangeRecordModule {

    
	@Inject("artExchangeRecordService")
	ArtExchangeRecordService service;

	@At("/view")
	@Ok("jsp:art/artexchangerecord")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:art/artexchangerecord")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:art/artexchangerecord")
	public Object insert(@Param("..") ArtExchangeRecord obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:art/artexchangerecord")
	public Object update(@Param("..") ArtExchangeRecord obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:art/artexchangerecord")
	public Object queryPage(@Param("..") ArtExchangeRecord obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:art/artexchangerecord")
	public Object query(@Param("..") ArtExchangeRecord obj) {
		return service.query(obj);
	}
}