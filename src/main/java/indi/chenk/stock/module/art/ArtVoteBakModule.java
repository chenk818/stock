package com.art58.site.module.art;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.art.ArtVoteBak;
import com.art58.site.service.art.ArtVoteBakService;

@At("/artVoteBak")
@IocBean
@Log4j
public class ArtVoteBakModule {

    
	@Inject("artVoteBakService")
	ArtVoteBakService service;

	@At("/view")
	@Ok("jsp:art/artvotebak")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:art/artvotebak")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:art/artvotebak")
	public Object insert(@Param("..") ArtVoteBak obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:art/artvotebak")
	public Object update(@Param("..") ArtVoteBak obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:art/artvotebak")
	public Object queryPage(@Param("..") ArtVoteBak obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:art/artvotebak")
	public Object query(@Param("..") ArtVoteBak obj) {
		return service.query(obj);
	}
}