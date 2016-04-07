package com.art58.site.service.pay;

import java.util.List;

import org.nutz.dao.Cnd;
import org.nutz.dao.util.cri.SimpleCriteria;
import org.nutz.ioc.loader.annotation.IocBean;

import com.art58.nutz.result.PageResult;
import com.art58.nutz.service.BaseService;
import com.art58.site.pojo.SampleBean;
import com.art58.tool.util.StringTool;

import lombok.extern.log4j.Log4j;

import com.art58.site.pojo.pay.PayOrderService;

@Log4j
@IocBean
public class PayOrderServiceService extends BaseService {


	public PageResult<PayOrderService> queryPage(PayOrderService obj) {
		return super.queryPage(PayOrderService.class, obj, getCri(obj));
	}

	public List<PayOrderService> query(PayOrderService obj) {
		return super.query(PayOrderService.class, getCri(obj));
	}

   	public PayOrderService get(String id) {
		return super.fetch(PayOrderService.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(PayOrderService.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(PayOrderService obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getOrderNo())) {
			cri.where().andEquals("order_no", obj.getOrderNo());
		}
		if(StringTool.isNotNull(obj.getCallbackUrl())) {
			cri.where().andEquals("callback_url", obj.getCallbackUrl());
		}
		if(StringTool.isNotNull(obj.getSubject())) {
			cri.where().andEquals("subject", obj.getSubject());
		}
		if(StringTool.isNotNull(obj.getTotalFee())) {
			cri.where().andEquals("total_fee", obj.getTotalFee());
		}
		if(StringTool.isNotNull(obj.getTimeout())) {
			cri.where().andEquals("timeout", obj.getTimeout());
		}
		if(StringTool.isNotNull(obj.getOrderState())) {
			cri.where().andEquals("order_state", obj.getOrderState());
		}
		if(StringTool.isNotNull(obj.getOrderDes())) {
			cri.where().andEquals("order_des", obj.getOrderDes());
		}
		if(StringTool.isNotNull(obj.getPartner())) {
			cri.where().andEquals("partner", obj.getPartner());
		}
		if(StringTool.isNotNull(obj.getTradeNo())) {
			cri.where().andEquals("trade_no", obj.getTradeNo());
		}
		if(StringTool.isNotNull(obj.getPayWay())) {
			cri.where().andEquals("pay_way", obj.getPayWay());
		}
		if(StringTool.isNotNull(obj.getCrtTime())) {
			cri.where().andEquals("crt_time", obj.getCrtTime());
		}
		return cri;
	}

}