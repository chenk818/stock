package com.art58.site.module.art;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.art.ArtRecommendArtist;
import com.art58.site.service.art.ArtRecommendArtistService;

@At("/artRecommendArtist")
@IocBean
@Log4j
public class ArtRecommendArtistModule {

    
	@Inject("artRecommendArtistService")
	ArtRecommendArtistService service;

	@At("/view")
	@Ok("jsp:art/artrecommendartist")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:art/artrecommendartist")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:art/artrecommendartist")
	public Object insert(@Param("..") ArtRecommendArtist obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:art/artrecommendartist")
	public Object update(@Param("..") ArtRecommendArtist obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:art/artrecommendartist")
	public Object queryPage(@Param("..") ArtRecommendArtist obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:art/artrecommendartist")
	public Object query(@Param("..") ArtRecommendArtist obj) {
		return service.query(obj);
	}
}