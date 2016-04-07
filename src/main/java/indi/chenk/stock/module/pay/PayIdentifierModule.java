package com.art58.site.module.pay;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.pay.PayIdentifier;
import com.art58.site.service.pay.PayIdentifierService;

@At("/payIdentifier")
@IocBean
@Log4j
public class PayIdentifierModule {

    
	@Inject("payIdentifierService")
	PayIdentifierService service;

	@At("/view")
	@Ok("jsp:pay/payidentifier")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:pay/payidentifier")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:pay/payidentifier")
	public Object insert(@Param("..") PayIdentifier obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:pay/payidentifier")
	public Object update(@Param("..") PayIdentifier obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:pay/payidentifier")
	public Object queryPage(@Param("..") PayIdentifier obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:pay/payidentifier")
	public Object query(@Param("..") PayIdentifier obj) {
		return service.query(obj);
	}
}