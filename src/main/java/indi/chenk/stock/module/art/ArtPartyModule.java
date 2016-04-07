package com.art58.site.module.art;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.art.ArtParty;
import com.art58.site.service.art.ArtPartyService;

@At("/artParty")
@IocBean
@Log4j
public class ArtPartyModule {

    
	@Inject("artPartyService")
	ArtPartyService service;

	@At("/view")
	@Ok("jsp:art/artparty")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:art/artparty")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:art/artparty")
	public Object insert(@Param("..") ArtParty obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:art/artparty")
	public Object update(@Param("..") ArtParty obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:art/artparty")
	public Object queryPage(@Param("..") ArtParty obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:art/artparty")
	public Object query(@Param("..") ArtParty obj) {
		return service.query(obj);
	}
}