package com.art58.site.module.art;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.art.ArtArticle;
import com.art58.site.service.art.ArtArticleService;

@At("/artArticle")
@IocBean
@Log4j
public class ArtArticleModule {

    
	@Inject("artArticleService")
	ArtArticleService service;

	@At("/view")
	@Ok("jsp:art/artarticle")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:art/artarticle")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:art/artarticle")
	public Object insert(@Param("..") ArtArticle obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:art/artarticle")
	public Object update(@Param("..") ArtArticle obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:art/artarticle")
	public Object queryPage(@Param("..") ArtArticle obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:art/artarticle")
	public Object query(@Param("..") ArtArticle obj) {
		return service.query(obj);
	}
}