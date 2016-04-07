package com.art58.site.module.pay;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.pay.PayOrderService;
import com.art58.site.service.pay.PayOrderServiceService;

@At("/payOrderService")
@IocBean
@Log4j
public class PayOrderServiceModule {

    
	@Inject("payOrderServiceService")
	PayOrderServiceService service;

	@At("/view")
	@Ok("jsp:pay/payorderservice")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:pay/payorderservice")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:pay/payorderservice")
	public Object insert(@Param("..") PayOrderService obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:pay/payorderservice")
	public Object update(@Param("..") PayOrderService obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:pay/payorderservice")
	public Object queryPage(@Param("..") PayOrderService obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:pay/payorderservice")
	public Object query(@Param("..") PayOrderService obj) {
		return service.query(obj);
	}
}