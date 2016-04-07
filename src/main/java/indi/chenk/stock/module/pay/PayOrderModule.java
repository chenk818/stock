package com.art58.site.module.pay;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.pay.PayOrder;
import com.art58.site.service.pay.PayOrderService;

@At("/payOrder")
@IocBean
@Log4j
public class PayOrderModule {

    
	@Inject("payOrderService")
	PayOrderService service;

	@At("/view")
	@Ok("jsp:pay/payorder")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:pay/payorder")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:pay/payorder")
	public Object insert(@Param("..") PayOrder obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:pay/payorder")
	public Object update(@Param("..") PayOrder obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:pay/payorder")
	public Object queryPage(@Param("..") PayOrder obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:pay/payorder")
	public Object query(@Param("..") PayOrder obj) {
		return service.query(obj);
	}
}