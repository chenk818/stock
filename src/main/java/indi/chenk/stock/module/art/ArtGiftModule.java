package com.art58.site.module.art;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.art.ArtGift;
import com.art58.site.service.art.ArtGiftService;

@At("/artGift")
@IocBean
@Log4j
public class ArtGiftModule {

    
	@Inject("artGiftService")
	ArtGiftService service;

	@At("/view")
	@Ok("jsp:art/artgift")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:art/artgift")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:art/artgift")
	public Object insert(@Param("..") ArtGift obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:art/artgift")
	public Object update(@Param("..") ArtGift obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:art/artgift")
	public Object queryPage(@Param("..") ArtGift obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:art/artgift")
	public Object query(@Param("..") ArtGift obj) {
		return service.query(obj);
	}
}