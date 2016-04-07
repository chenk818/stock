package com.art58.site.module.pay;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.pay.PayAddress;
import com.art58.site.service.pay.PayAddressService;

@At("/payAddress")
@IocBean
@Log4j
public class PayAddressModule {

    
	@Inject("payAddressService")
	PayAddressService service;

	@At("/view")
	@Ok("jsp:pay/payaddress")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:pay/payaddress")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:pay/payaddress")
	public Object insert(@Param("..") PayAddress obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:pay/payaddress")
	public Object update(@Param("..") PayAddress obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:pay/payaddress")
	public Object queryPage(@Param("..") PayAddress obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:pay/payaddress")
	public Object query(@Param("..") PayAddress obj) {
		return service.query(obj);
	}
}