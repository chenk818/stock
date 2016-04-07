package com.art58.site.module.art;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.art.ArtCharity;
import com.art58.site.service.art.ArtCharityService;

@At("/artCharity")
@IocBean
@Log4j
public class ArtCharityModule {

    
	@Inject("artCharityService")
	ArtCharityService service;

	@At("/view")
	@Ok("jsp:art/artcharity")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:art/artcharity")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:art/artcharity")
	public Object insert(@Param("..") ArtCharity obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:art/artcharity")
	public Object update(@Param("..") ArtCharity obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:art/artcharity")
	public Object queryPage(@Param("..") ArtCharity obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:art/artcharity")
	public Object query(@Param("..") ArtCharity obj) {
		return service.query(obj);
	}
}