package com.art58.site.module.art;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.art.ArtPartyRecord;
import com.art58.site.service.art.ArtPartyRecordService;

@At("/artPartyRecord")
@IocBean
@Log4j
public class ArtPartyRecordModule {

    
	@Inject("artPartyRecordService")
	ArtPartyRecordService service;

	@At("/view")
	@Ok("jsp:art/artpartyrecord")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:art/artpartyrecord")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:art/artpartyrecord")
	public Object insert(@Param("..") ArtPartyRecord obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:art/artpartyrecord")
	public Object update(@Param("..") ArtPartyRecord obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:art/artpartyrecord")
	public Object queryPage(@Param("..") ArtPartyRecord obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:art/artpartyrecord")
	public Object query(@Param("..") ArtPartyRecord obj) {
		return service.query(obj);
	}
}