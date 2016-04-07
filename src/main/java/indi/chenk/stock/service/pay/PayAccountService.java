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

import com.art58.site.pojo.pay.PayAccount;

@Log4j
@IocBean
public class PayAccountService extends BaseService {


	public PageResult<PayAccount> queryPage(PayAccount obj) {
		return super.queryPage(PayAccount.class, obj, getCri(obj));
	}

	public List<PayAccount> query(PayAccount obj) {
		return super.query(PayAccount.class, getCri(obj));
	}

   	public PayAccount get(String id) {
		return super.fetch(PayAccount.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(PayAccount.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(PayAccount obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getAccountnum())) {
			cri.where().andEquals("ACCOUNTNUM", obj.getAccountnum());
		}
		if(StringTool.isNotNull(obj.getOwnerid())) {
			cri.where().andEquals("OWNERID", obj.getOwnerid());
		}
		if(StringTool.isNotNull(obj.getMoney())) {
			cri.where().andEquals("MONEY", obj.getMoney());
		}
		if(StringTool.isNotNull(obj.getIntegrate())) {
			cri.where().andEquals("INTEGRATE", obj.getIntegrate());
		}
		if(StringTool.isNotNull(obj.getState())) {
			cri.where().andEquals("STATE", obj.getState());
		}
		if(StringTool.isNotNull(obj.getCrtTellerId())) {
			cri.where().andEquals("CRT_TELLER_ID", obj.getCrtTellerId());
		}
		if(StringTool.isNotNull(obj.getCrtTime())) {
			cri.where().andEquals("CRT_TIME", obj.getCrtTime());
		}
		return cri;
	}

}