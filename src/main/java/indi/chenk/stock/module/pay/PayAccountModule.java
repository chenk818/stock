package com.art58.site.module.pay;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.pay.PayAccount;
import com.art58.site.service.pay.PayAccountService;

@At("/payAccount")
@IocBean
@Log4j
public class PayAccountModule {

    
	@Inject("payAccountService")
	PayAccountService service;

	@At("/view")
	@Ok("jsp:pay/payaccount")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:pay/payaccount")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:pay/payaccount")
	public Object insert(@Param("..") PayAccount obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:pay/payaccount")
	public Object update(@Param("..") PayAccount obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:pay/payaccount")
	public Object queryPage(@Param("..") PayAccount obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:pay/payaccount")
	public Object query(@Param("..") PayAccount obj) {
		return service.query(obj);
	}
}