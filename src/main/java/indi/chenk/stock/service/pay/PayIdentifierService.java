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

import com.art58.site.pojo.pay.PayIdentifier;

@Log4j
@IocBean
public class PayIdentifierService extends BaseService {


	public PageResult<PayIdentifier> queryPage(PayIdentifier obj) {
		return super.queryPage(PayIdentifier.class, obj, getCri(obj));
	}

	public List<PayIdentifier> query(PayIdentifier obj) {
		return super.query(PayIdentifier.class, getCri(obj));
	}

   	public PayIdentifier get(String id) {
		return super.fetch(PayIdentifier.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(PayIdentifier.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(PayIdentifier obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getPartner())) {
			cri.where().andEquals("partner", obj.getPartner());
		}
		if(StringTool.isNotNull(obj.getKey())) {
			cri.where().andEquals("key", obj.getKey());
		}
		if(StringTool.isNotNull(obj.getCrtTime())) {
			cri.where().andEquals("crt_time", obj.getCrtTime());
		}
		return cri;
	}

}