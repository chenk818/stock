package com.art58.site.module.art;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.art.ArtPartyGoods;
import com.art58.site.service.art.ArtPartyGoodsService;

@At("/artPartyGoods")
@IocBean
@Log4j
public class ArtPartyGoodsModule {

    
	@Inject("artPartyGoodsService")
	ArtPartyGoodsService service;

	@At("/view")
	@Ok("jsp:art/artpartygoods")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:art/artpartygoods")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:art/artpartygoods")
	public Object insert(@Param("..") ArtPartyGoods obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:art/artpartygoods")
	public Object update(@Param("..") ArtPartyGoods obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:art/artpartygoods")
	public Object queryPage(@Param("..") ArtPartyGoods obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:art/artpartygoods")
	public Object query(@Param("..") ArtPartyGoods obj) {
		return service.query(obj);
	}
}