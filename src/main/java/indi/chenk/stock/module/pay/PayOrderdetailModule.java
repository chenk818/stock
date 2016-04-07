package com.art58.site.module.pay;

import lombok.extern.log4j.Log4j;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;



import com.art58.site.pojo.pay.PayOrderdetail;
import com.art58.site.service.pay.PayOrderdetailService;

@At("/payOrderdetail")
@IocBean
@Log4j
public class PayOrderdetailModule {

    
	@Inject("payOrderdetailService")
	PayOrderdetailService service;

	@At("/view")
	@Ok("jsp:pay/payorderdetail")
	public Object get(@Param("id") String id) {
		return service.get(id);
	}
	
	@At("/delete")
	@Ok("jsp:pay/payorderdetail")
	public Object delete(@Param("ids") String ids) {
		return service.delete(ids);
	}
	
	@At("/save")
	@Ok("jsp:pay/payorderdetail")
	public Object insert(@Param("..") PayOrderdetail obj) {
		return service.insert(obj);
	}
	@At("/update")
	@Ok("jsp:pay/payorderdetail")
	public Object update(@Param("..") PayOrderdetail obj) {
		return service.update(obj);
	}

	@At("/queryPage")
	@Ok("jsp:pay/payorderdetail")
	public Object queryPage(@Param("..") PayOrderdetail obj) {
		return service.queryPage(obj);
	}

	@At("/query")
	@Ok("jsp:pay/payorderdetail")
	public Object query(@Param("..") PayOrderdetail obj) {
		return service.query(obj);
	}
}