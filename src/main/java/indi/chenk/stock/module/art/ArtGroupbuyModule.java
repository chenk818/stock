package com.art58.site.module.art;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.art.ArtGroupbuy;
import com.art58.site.service.art.ArtGroupbuyService;

@At("/artGroupbuy")
@IocBean
@Log4j
public class ArtGroupbuyModule {

    
	@Inject("artGroupbuyService")
	ArtGroupbuyService service;

	@At("/view")
	@Ok("jsp:art/artgroupbuy")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:art/artgroupbuy")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:art/artgroupbuy")
	public Object insert(@Param("..") ArtGroupbuy obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:art/artgroupbuy")
	public Object update(@Param("..") ArtGroupbuy obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:art/artgroupbuy")
	public Object queryPage(@Param("..") ArtGroupbuy obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:art/artgroupbuy")
	public Object query(@Param("..") ArtGroupbuy obj) {
		return service.query(obj);
	}
}