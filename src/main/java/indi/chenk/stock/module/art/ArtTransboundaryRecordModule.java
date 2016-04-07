package com.art58.site.module.art;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.art.ArtTransboundaryRecord;
import com.art58.site.service.art.ArtTransboundaryRecordService;

@At("/artTransboundaryRecord")
@IocBean
@Log4j
public class ArtTransboundaryRecordModule {

    
	@Inject("artTransboundaryRecordService")
	ArtTransboundaryRecordService service;

	@At("/view")
	@Ok("jsp:art/arttransboundaryrecord")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:art/arttransboundaryrecord")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:art/arttransboundaryrecord")
	public Object insert(@Param("..") ArtTransboundaryRecord obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:art/arttransboundaryrecord")
	public Object update(@Param("..") ArtTransboundaryRecord obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:art/arttransboundaryrecord")
	public Object queryPage(@Param("..") ArtTransboundaryRecord obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:art/arttransboundaryrecord")
	public Object query(@Param("..") ArtTransboundaryRecord obj) {
		return service.query(obj);
	}
}