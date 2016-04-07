package com.art58.site.module.art;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.art.ArtAuctionRecord;
import com.art58.site.service.art.ArtAuctionRecordService;

@At("/artAuctionRecord")
@IocBean
@Log4j
public class ArtAuctionRecordModule {

    
	@Inject("artAuctionRecordService")
	ArtAuctionRecordService service;

	@At("/view")
	@Ok("jsp:art/artauctionrecord")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:art/artauctionrecord")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:art/artauctionrecord")
	public Object insert(@Param("..") ArtAuctionRecord obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:art/artauctionrecord")
	public Object update(@Param("..") ArtAuctionRecord obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:art/artauctionrecord")
	public Object queryPage(@Param("..") ArtAuctionRecord obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:art/artauctionrecord")
	public Object query(@Param("..") ArtAuctionRecord obj) {
		return service.query(obj);
	}
}