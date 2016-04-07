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

import com.art58.site.pojo.pay.PayOrderdetail;

@Log4j
@IocBean
public class PayOrderdetailService extends BaseService {


	public PageResult<PayOrderdetail> queryPage(PayOrderdetail obj) {
		return super.queryPage(PayOrderdetail.class, obj, getCri(obj));
	}

	public List<PayOrderdetail> query(PayOrderdetail obj) {
		return super.query(PayOrderdetail.class, getCri(obj));
	}

   	public PayOrderdetail get(String id) {
		return super.fetch(PayOrderdetail.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(PayOrderdetail.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(PayOrderdetail obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getOrdernum())) {
			cri.where().andEquals("ORDERNUM", obj.getOrdernum());
		}
		if(StringTool.isNotNull(obj.getArtnum())) {
			cri.where().andEquals("ARTNUM", obj.getArtnum());
		}
		if(StringTool.isNotNull(obj.getArtcount())) {
			cri.where().andEquals("ARTCOUNT", obj.getArtcount());
		}
		return cri;
	}

}