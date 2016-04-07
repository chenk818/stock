package com.art58.site.module.art;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.art.ArtEvaluate;
import com.art58.site.service.art.ArtEvaluateService;

@At("/artEvaluate")
@IocBean
@Log4j
public class ArtEvaluateModule {

    
	@Inject("artEvaluateService")
	ArtEvaluateService service;

	@At("/view")
	@Ok("jsp:art/artevaluate")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:art/artevaluate")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:art/artevaluate")
	public Object insert(@Param("..") ArtEvaluate obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:art/artevaluate")
	public Object update(@Param("..") ArtEvaluate obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:art/artevaluate")
	public Object queryPage(@Param("..") ArtEvaluate obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:art/artevaluate")
	public Object query(@Param("..") ArtEvaluate obj) {
		return service.query(obj);
	}
}