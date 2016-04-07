package com.art58.site.module.other;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.other.OtherSurvey;
import com.art58.site.service.other.OtherSurveyService;

@At("/otherSurvey")
@IocBean
@Log4j
public class OtherSurveyModule {

    
	@Inject("otherSurveyService")
	OtherSurveyService service;

	@At("/view")
	@Ok("jsp:other/othersurvey")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:other/othersurvey")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:other/othersurvey")
	public Object insert(@Param("..") OtherSurvey obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:other/othersurvey")
	public Object update(@Param("..") OtherSurvey obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:other/othersurvey")
	public Object queryPage(@Param("..") OtherSurvey obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:other/othersurvey")
	public Object query(@Param("..") OtherSurvey obj) {
		return service.query(obj);
	}
}