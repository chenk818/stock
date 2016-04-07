package com.art58.site.module.pay;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.pay.PayDealhis;
import com.art58.site.service.pay.PayDealhisService;

@At("/payDealhis")
@IocBean
@Log4j
public class PayDealhisModule {

    
	@Inject("payDealhisService")
	PayDealhisService service;

	@At("/view")
	@Ok("jsp:pay/paydealhis")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:pay/paydealhis")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:pay/paydealhis")
	public Object insert(@Param("..") PayDealhis obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:pay/paydealhis")
	public Object update(@Param("..") PayDealhis obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:pay/paydealhis")
	public Object queryPage(@Param("..") PayDealhis obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:pay/paydealhis")
	public Object query(@Param("..") PayDealhis obj) {
		return service.query(obj);
	}
}