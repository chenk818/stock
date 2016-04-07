package com.art58.site.module.art;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.art.ArtVoteStat;
import com.art58.site.service.art.ArtVoteStatService;

@At("/artVoteStat")
@IocBean
@Log4j
public class ArtVoteStatModule {

    
	@Inject("artVoteStatService")
	ArtVoteStatService service;

	@At("/view")
	@Ok("jsp:art/artvotestat")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:art/artvotestat")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:art/artvotestat")
	public Object insert(@Param("..") ArtVoteStat obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:art/artvotestat")
	public Object update(@Param("..") ArtVoteStat obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:art/artvotestat")
	public Object queryPage(@Param("..") ArtVoteStat obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:art/artvotestat")
	public Object query(@Param("..") ArtVoteStat obj) {
		return service.query(obj);
	}
}