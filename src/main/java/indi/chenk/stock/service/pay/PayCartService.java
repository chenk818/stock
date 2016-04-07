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

import com.art58.site.pojo.pay.PayCart;

@Log4j
@IocBean
public class PayCartService extends BaseService {


	public PageResult<PayCart> queryPage(PayCart obj) {
		return super.queryPage(PayCart.class, obj, getCri(obj));
	}

	public List<PayCart> query(PayCart obj) {
		return super.query(PayCart.class, getCri(obj));
	}

   	public PayCart get(String id) {
		return super.fetch(PayCart.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(PayCart.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(PayCart obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getUserid())) {
			cri.where().andEquals("USERID", obj.getUserid());
		}
		if(StringTool.isNotNull(obj.getGoodsid())) {
			cri.where().andEquals("GOODSID", obj.getGoodsid());
		}
		if(StringTool.isNotNull(obj.getGoodsname())) {
			cri.where().andEquals("GOODSNAME", obj.getGoodsname());
		}
		if(StringTool.isNotNull(obj.getPrice())) {
			cri.where().andEquals("PRICE", obj.getPrice());
		}
		if(StringTool.isNotNull(obj.getTime())) {
			cri.where().andEquals("TIME", obj.getTime());
		}
		if(StringTool.isNotNull(obj.getCount())) {
			cri.where().andEquals("count", obj.getCount());
		}
		if(StringTool.isNotNull(obj.getType())) {
			cri.where().andEquals("type", obj.getType());
		}
		return cri;
	}

}