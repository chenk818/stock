package com.art58.site.module.art;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.art.ArtEnlist;
import com.art58.site.service.art.ArtEnlistService;

@At("/artEnlist")
@IocBean
@Log4j
public class ArtEnlistModule {

    
	@Inject("artEnlistService")
	ArtEnlistService service;

	@At("/view")
	@Ok("jsp:art/artenlist")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:art/artenlist")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:art/artenlist")
	public Object insert(@Param("..") ArtEnlist obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:art/artenlist")
	public Object update(@Param("..") ArtEnlist obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:art/artenlist")
	public Object queryPage(@Param("..") ArtEnlist obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:art/artenlist")
	public Object query(@Param("..") ArtEnlist obj) {
		return service.query(obj);
	}
}