package com.art58.site.module.art;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.art.ArtCatalog;
import com.art58.site.service.art.ArtCatalogService;

@At("/artCatalog")
@IocBean
@Log4j
public class ArtCatalogModule {

    
	@Inject("artCatalogService")
	ArtCatalogService service;

	@At("/view")
	@Ok("jsp:art/artcatalog")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:art/artcatalog")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:art/artcatalog")
	public Object insert(@Param("..") ArtCatalog obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:art/artcatalog")
	public Object update(@Param("..") ArtCatalog obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:art/artcatalog")
	public Object queryPage(@Param("..") ArtCatalog obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:art/artcatalog")
	public Object query(@Param("..") ArtCatalog obj) {
		return service.query(obj);
	}
}