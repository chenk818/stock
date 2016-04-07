package com.art58.site.module.art;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.art.ArtCustommade;
import com.art58.site.service.art.ArtCustommadeService;

@At("/artCustommade")
@IocBean
@Log4j
public class ArtCustommadeModule {

    
	@Inject("artCustommadeService")
	ArtCustommadeService service;

	@At("/view")
	@Ok("jsp:art/artcustommade")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:art/artcustommade")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:art/artcustommade")
	public Object insert(@Param("..") ArtCustommade obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:art/artcustommade")
	public Object update(@Param("..") ArtCustommade obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:art/artcustommade")
	public Object queryPage(@Param("..") ArtCustommade obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:art/artcustommade")
	public Object query(@Param("..") ArtCustommade obj) {
		return service.query(obj);
	}
}