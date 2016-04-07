package com.art58.site.module.art;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.art.ArtAuctionArt;
import com.art58.site.service.art.ArtAuctionArtService;

@At("/artAuctionArt")
@IocBean
@Log4j
public class ArtAuctionArtModule {

    
	@Inject("artAuctionArtService")
	ArtAuctionArtService service;

	@At("/view")
	@Ok("jsp:art/artauctionart")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:art/artauctionart")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:art/artauctionart")
	public Object insert(@Param("..") ArtAuctionArt obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:art/artauctionart")
	public Object update(@Param("..") ArtAuctionArt obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:art/artauctionart")
	public Object queryPage(@Param("..") ArtAuctionArt obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:art/artauctionart")
	public Object query(@Param("..") ArtAuctionArt obj) {
		return service.query(obj);
	}
}