package com.art58.site.module.art;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.art.ArtAuctionMsg;
import com.art58.site.service.art.ArtAuctionMsgService;

@At("/artAuctionMsg")
@IocBean
@Log4j
public class ArtAuctionMsgModule {

    
	@Inject("artAuctionMsgService")
	ArtAuctionMsgService service;

	@At("/view")
	@Ok("jsp:art/artauctionmsg")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:art/artauctionmsg")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:art/artauctionmsg")
	public Object insert(@Param("..") ArtAuctionMsg obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:art/artauctionmsg")
	public Object update(@Param("..") ArtAuctionMsg obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:art/artauctionmsg")
	public Object queryPage(@Param("..") ArtAuctionMsg obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:art/artauctionmsg")
	public Object query(@Param("..") ArtAuctionMsg obj) {
		return service.query(obj);
	}
}