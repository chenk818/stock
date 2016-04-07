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

import com.art58.site.pojo.pay.PayDealhis;

@Log4j
@IocBean
public class PayDealhisService extends BaseService {


	public PageResult<PayDealhis> queryPage(PayDealhis obj) {
		return super.queryPage(PayDealhis.class, obj, getCri(obj));
	}

	public List<PayDealhis> query(PayDealhis obj) {
		return super.query(PayDealhis.class, getCri(obj));
	}

   	public PayDealhis get(String id) {
		return super.fetch(PayDealhis.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(PayDealhis.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(PayDealhis obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getSerialno())) {
			cri.where().andEquals("SERIALNO", obj.getSerialno());
		}
		if(StringTool.isNotNull(obj.getAccountnum())) {
			cri.where().andEquals("ACCOUNTNUM", obj.getAccountnum());
		}
		if(StringTool.isNotNull(obj.getType())) {
			cri.where().andEquals("TYPE", obj.getType());
		}
		if(StringTool.isNotNull(obj.getPaytype())) {
			cri.where().andEquals("PAYTYPE", obj.getPaytype());
		}
		if(StringTool.isNotNull(obj.getOaccount())) {
			cri.where().andEquals("OACCOUNT", obj.getOaccount());
		}
		if(StringTool.isNotNull(obj.getOrdernum())) {
			cri.where().andEquals("ORDERNUM", obj.getOrdernum());
		}
		if(StringTool.isNotNull(obj.getMoney())) {
			cri.where().andEquals("MONEY", obj.getMoney());
		}
		if(StringTool.isNotNull(obj.getTime())) {
			cri.where().andEquals("TIME", obj.getTime());
		}
		if(StringTool.isNotNull(obj.getState())) {
			cri.where().andEquals("STATE", obj.getState());
		}
		return cri;
	}

}