package com.art58.site.module.art;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.art.ArtArtworkHis;
import com.art58.site.service.art.ArtArtworkHisService;

@At("/artArtworkHis")
@IocBean
@Log4j
public class ArtArtworkHisModule {

    
	@Inject("artArtworkHisService")
	ArtArtworkHisService service;

	@At("/view")
	@Ok("jsp:art/artartworkhis")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:art/artartworkhis")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:art/artartworkhis")
	public Object insert(@Param("..") ArtArtworkHis obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:art/artartworkhis")
	public Object update(@Param("..") ArtArtworkHis obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:art/artartworkhis")
	public Object queryPage(@Param("..") ArtArtworkHis obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:art/artartworkhis")
	public Object query(@Param("..") ArtArtworkHis obj) {
		return service.query(obj);
	}
}