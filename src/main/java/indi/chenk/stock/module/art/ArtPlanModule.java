package com.art58.site.module.art;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.art.ArtPlan;
import com.art58.site.service.art.ArtPlanService;

@At("/artPlan")
@IocBean
@Log4j
public class ArtPlanModule {

    
	@Inject("artPlanService")
	ArtPlanService service;

	@At("/view")
	@Ok("jsp:art/artplan")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:art/artplan")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:art/artplan")
	public Object insert(@Param("..") ArtPlan obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:art/artplan")
	public Object update(@Param("..") ArtPlan obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:art/artplan")
	public Object queryPage(@Param("..") ArtPlan obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:art/artplan")
	public Object query(@Param("..") ArtPlan obj) {
		return service.query(obj);
	}
}