package com.art58.site.module.art;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.art.ArtKeywords;
import com.art58.site.service.art.ArtKeywordsService;

@At("/artKeywords")
@IocBean
@Log4j
public class ArtKeywordsModule {

    
	@Inject("artKeywordsService")
	ArtKeywordsService service;

	@At("/view")
	@Ok("jsp:art/artkeywords")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:art/artkeywords")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:art/artkeywords")
	public Object insert(@Param("..") ArtKeywords obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:art/artkeywords")
	public Object update(@Param("..") ArtKeywords obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:art/artkeywords")
	public Object queryPage(@Param("..") ArtKeywords obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:art/artkeywords")
	public Object query(@Param("..") ArtKeywords obj) {
		return service.query(obj);
	}
}