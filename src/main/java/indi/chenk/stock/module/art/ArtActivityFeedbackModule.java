package com.art58.site.module.art;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.art.ArtActivityFeedback;
import com.art58.site.service.art.ArtActivityFeedbackService;

@At("/artActivityFeedback")
@IocBean
@Log4j
public class ArtActivityFeedbackModule {

    
	@Inject("artActivityFeedbackService")
	ArtActivityFeedbackService service;

	@At("/view")
	@Ok("jsp:art/artactivityfeedback")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:art/artactivityfeedback")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:art/artactivityfeedback")
	public Object insert(@Param("..") ArtActivityFeedback obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:art/artactivityfeedback")
	public Object update(@Param("..") ArtActivityFeedback obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:art/artactivityfeedback")
	public Object queryPage(@Param("..") ArtActivityFeedback obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:art/artactivityfeedback")
	public Object query(@Param("..") ArtActivityFeedback obj) {
		return service.query(obj);
	}
}