package com.art58.site.module.art;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.art.ArtRecommend;
import com.art58.site.service.art.ArtRecommendService;

@At("/artRecommend")
@IocBean
@Log4j
public class ArtRecommendModule {

    
	@Inject("artRecommendService")
	ArtRecommendService service;

	@At("/view")
	@Ok("jsp:art/artrecommend")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:art/artrecommend")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:art/artrecommend")
	public Object insert(@Param("..") ArtRecommend obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:art/artrecommend")
	public Object update(@Param("..") ArtRecommend obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:art/artrecommend")
	public Object queryPage(@Param("..") ArtRecommend obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:art/artrecommend")
	public Object query(@Param("..") ArtRecommend obj) {
		return service.query(obj);
	}
}