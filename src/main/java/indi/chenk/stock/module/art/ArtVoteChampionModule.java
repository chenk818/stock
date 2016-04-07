package com.art58.site.module.art;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.art.ArtVoteChampion;
import com.art58.site.service.art.ArtVoteChampionService;

@At("/artVoteChampion")
@IocBean
@Log4j
public class ArtVoteChampionModule {

    
	@Inject("artVoteChampionService")
	ArtVoteChampionService service;

	@At("/view")
	@Ok("jsp:art/artvotechampion")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:art/artvotechampion")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:art/artvotechampion")
	public Object insert(@Param("..") ArtVoteChampion obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:art/artvotechampion")
	public Object update(@Param("..") ArtVoteChampion obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:art/artvotechampion")
	public Object queryPage(@Param("..") ArtVoteChampion obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:art/artvotechampion")
	public Object query(@Param("..") ArtVoteChampion obj) {
		return service.query(obj);
	}
}