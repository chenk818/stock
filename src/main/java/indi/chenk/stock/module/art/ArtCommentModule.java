package com.art58.site.module.art;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.art.ArtComment;
import com.art58.site.service.art.ArtCommentService;

@At("/artComment")
@IocBean
@Log4j
public class ArtCommentModule {

    
	@Inject("artCommentService")
	ArtCommentService service;

	@At("/view")
	@Ok("jsp:art/artcomment")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:art/artcomment")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:art/artcomment")
	public Object insert(@Param("..") ArtComment obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:art/artcomment")
	public Object update(@Param("..") ArtComment obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:art/artcomment")
	public Object queryPage(@Param("..") ArtComment obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:art/artcomment")
	public Object query(@Param("..") ArtComment obj) {
		return service.query(obj);
	}
}