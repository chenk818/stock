package com.art58.site.module.pay;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.pay.PayOrderState;
import com.art58.site.service.pay.PayOrderStateService;

@At("/payOrderState")
@IocBean
@Log4j
public class PayOrderStateModule {

    
	@Inject("payOrderStateService")
	PayOrderStateService service;

	@At("/view")
	@Ok("jsp:pay/payorderstate")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:pay/payorderstate")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:pay/payorderstate")
	public Object insert(@Param("..") PayOrderState obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:pay/payorderstate")
	public Object update(@Param("..") PayOrderState obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:pay/payorderstate")
	public Object queryPage(@Param("..") PayOrderState obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:pay/payorderstate")
	public Object query(@Param("..") PayOrderState obj) {
		return service.query(obj);
	}
}