package com.art58.site.module.art;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.art.ArtCharityrecord;
import com.art58.site.service.art.ArtCharityrecordService;

@At("/artCharityrecord")
@IocBean
@Log4j
public class ArtCharityrecordModule {

    
	@Inject("artCharityrecordService")
	ArtCharityrecordService service;

	@At("/view")
	@Ok("jsp:art/artcharityrecord")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:art/artcharityrecord")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:art/artcharityrecord")
	public Object insert(@Param("..") ArtCharityrecord obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:art/artcharityrecord")
	public Object update(@Param("..") ArtCharityrecord obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:art/artcharityrecord")
	public Object queryPage(@Param("..") ArtCharityrecord obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:art/artcharityrecord")
	public Object query(@Param("..") ArtCharityrecord obj) {
		return service.query(obj);
	}
}