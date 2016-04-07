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

import com.art58.site.pojo.pay.PayOrderState;

@Log4j
@IocBean
public class PayOrderStateService extends BaseService {


	public PageResult<PayOrderState> queryPage(PayOrderState obj) {
		return super.queryPage(PayOrderState.class, obj, getCri(obj));
	}

	public List<PayOrderState> query(PayOrderState obj) {
		return super.query(PayOrderState.class, getCri(obj));
	}

   	public PayOrderState get(String id) {
		return super.fetch(PayOrderState.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(PayOrderState.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(PayOrderState obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getOrderId())) {
			cri.where().andEquals("order_id", obj.getOrderId());
		}
		if(StringTool.isNotNull(obj.getOrderState())) {
			cri.where().andEquals("order_state", obj.getOrderState());
		}
		if(StringTool.isNotNull(obj.getRemarks())) {
			cri.where().andEquals("remarks", obj.getRemarks());
		}
		if(StringTool.isNotNull(obj.getCrtTime())) {
			cri.where().andEquals("crt_time", obj.getCrtTime());
		}
		return cri;
	}

}