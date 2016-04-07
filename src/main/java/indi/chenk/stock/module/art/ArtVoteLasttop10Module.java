package com.art58.site.module.art;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.art.ArtVoteLasttop10;
import com.art58.site.service.art.ArtVoteLasttop10Service;

@At("/artVoteLasttop10")
@IocBean
@Log4j
public class ArtVoteLasttop10Module {

    
	@Inject("artVoteLasttop10Service")
	ArtVoteLasttop10Service service;

	@At("/view")
	@Ok("jsp:art/artvotelasttop10")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:art/artvotelasttop10")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:art/artvotelasttop10")
	public Object insert(@Param("..") ArtVoteLasttop10 obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:art/artvotelasttop10")
	public Object update(@Param("..") ArtVoteLasttop10 obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:art/artvotelasttop10")
	public Object queryPage(@Param("..") ArtVoteLasttop10 obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:art/artvotelasttop10")
	public Object query(@Param("..") ArtVoteLasttop10 obj) {
		return service.query(obj);
	}
}