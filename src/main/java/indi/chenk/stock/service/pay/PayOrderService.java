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

import com.art58.site.pojo.pay.PayOrder;

@Log4j
@IocBean
public class PayOrderService extends BaseService {


	public PageResult<PayOrder> queryPage(PayOrder obj) {
		return super.queryPage(PayOrder.class, obj, getCri(obj));
	}

	public List<PayOrder> query(PayOrder obj) {
		return super.query(PayOrder.class, getCri(obj));
	}

   	public PayOrder get(String id) {
		return super.fetch(PayOrder.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(PayOrder.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(PayOrder obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getOrdernum())) {
			cri.where().andEquals("ORDERNUM", obj.getOrdernum());
		}
		if(StringTool.isNotNull(obj.getUserid())) {
			cri.where().andEquals("USERID", obj.getUserid());
		}
		if(StringTool.isNotNull(obj.getState())) {
			cri.where().andEquals("STATE", obj.getState());
		}
		if(StringTool.isNotNull(obj.getPaytype())) {
			cri.where().andEquals("PAYTYPE", obj.getPaytype());
		}
		if(StringTool.isNotNull(obj.getTime())) {
			cri.where().andEquals("TIME", obj.getTime());
		}
		if(StringTool.isNotNull(obj.getPaytm())) {
			cri.where().andEquals("PAYTM", obj.getPaytm());
		}
		if(StringTool.isNotNull(obj.getCount())) {
			cri.where().andEquals("COUNT", obj.getCount());
		}
		if(StringTool.isNotNull(obj.getGoodsprice())) {
			cri.where().andEquals("GOODSPRICE", obj.getGoodsprice());
		}
		if(StringTool.isNotNull(obj.getTransexpense())) {
			cri.where().andEquals("TRANSEXPENSE", obj.getTransexpense());
		}
		if(StringTool.isNotNull(obj.getAccountid())) {
			cri.where().andEquals("ACCOUNTID", obj.getAccountid());
		}
		if(StringTool.isNotNull(obj.getTotaldeals())) {
			cri.where().andEquals("TOTALDEALS", obj.getTotaldeals());
		}
		if(StringTool.isNotNull(obj.getIntegrate())) {
			cri.where().andEquals("INTEGRATE", obj.getIntegrate());
		}
		if(StringTool.isNotNull(obj.getPayprice())) {
			cri.where().andEquals("PAYPRICE", obj.getPayprice());
		}
		if(StringTool.isNotNull(obj.getAddressid())) {
			cri.where().andEquals("ADDRESSID", obj.getAddressid());
		}
		if(StringTool.isNotNull(obj.getRemark())) {
			cri.where().andEquals("REMARK", obj.getRemark());
		}
		return cri;
	}

}