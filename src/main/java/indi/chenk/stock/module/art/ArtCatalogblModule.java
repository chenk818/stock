package com.art58.site.module.art;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.art.ArtCatalogbl;
import com.art58.site.service.art.ArtCatalogblService;

@At("/artCatalogbl")
@IocBean
@Log4j
public class ArtCatalogblModule {

    
	@Inject("artCatalogblService")
	ArtCatalogblService service;

	@At("/view")
	@Ok("jsp:art/artcatalogbl")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:art/artcatalogbl")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:art/artcatalogbl")
	public Object insert(@Param("..") ArtCatalogbl obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:art/artcatalogbl")
	public Object update(@Param("..") ArtCatalogbl obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:art/artcatalogbl")
	public Object queryPage(@Param("..") ArtCatalogbl obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:art/artcatalogbl")
	public Object query(@Param("..") ArtCatalogbl obj) {
		return service.query(obj);
	}
}