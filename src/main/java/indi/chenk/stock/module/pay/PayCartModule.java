package com.art58.site.module.pay;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.pay.PayCart;
import com.art58.site.service.pay.PayCartService;

@At("/payCart")
@IocBean
@Log4j
public class PayCartModule {

    
	@Inject("payCartService")
	PayCartService service;

	@At("/view")
	@Ok("jsp:pay/paycart")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:pay/paycart")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:pay/paycart")
	public Object insert(@Param("..") PayCart obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:pay/paycart")
	public Object update(@Param("..") PayCart obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:pay/paycart")
	public Object queryPage(@Param("..") PayCart obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:pay/paycart")
	public Object query(@Param("..") PayCart obj) {
		return service.query(obj);
	}
}