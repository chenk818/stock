package com.art58.site.module.art;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.art.ArtVote;
import com.art58.site.service.art.ArtVoteService;

@At("/artVote")
@IocBean
@Log4j
public class ArtVoteModule {

    
	@Inject("artVoteService")
	ArtVoteService service;

	@At("/view")
	@Ok("jsp:art/artvote")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:art/artvote")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:art/artvote")
	public Object insert(@Param("..") ArtVote obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:art/artvote")
	public Object update(@Param("..") ArtVote obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:art/artvote")
	public Object queryPage(@Param("..") ArtVote obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:art/artvote")
	public Object query(@Param("..") ArtVote obj) {
		return service.query(obj);
	}
}