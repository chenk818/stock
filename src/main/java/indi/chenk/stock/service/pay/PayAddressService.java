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

import com.art58.site.pojo.pay.PayAddress;

@Log4j
@IocBean
public class PayAddressService extends BaseService {


	public PageResult<PayAddress> queryPage(PayAddress obj) {
		return super.queryPage(PayAddress.class, obj, getCri(obj));
	}

	public List<PayAddress> query(PayAddress obj) {
		return super.query(PayAddress.class, getCri(obj));
	}

   	public PayAddress get(String id) {
		return super.fetch(PayAddress.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(PayAddress.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(PayAddress obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getUserid())) {
			cri.where().andEquals("USERID", obj.getUserid());
		}
		if(StringTool.isNotNull(obj.getName())) {
			cri.where().andEquals("NAME", obj.getName());
		}
		if(StringTool.isNotNull(obj.getRegionid())) {
			cri.where().andEquals("REGIONID", obj.getRegionid());
		}
		if(StringTool.isNotNull(obj.getAddress())) {
			cri.where().andEquals("ADDRESS", obj.getAddress());
		}
		if(StringTool.isNotNull(obj.getPostcode())) {
			cri.where().andEquals("POSTCODE", obj.getPostcode());
		}
		if(StringTool.isNotNull(obj.getPhone())) {
			cri.where().andEquals("PHONE", obj.getPhone());
		}
		if(StringTool.isNotNull(obj.getCrtTime())) {
			cri.where().andEquals("CRT_TIME", obj.getCrtTime());
		}
		return cri;
	}

}