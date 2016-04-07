package com.art58.site.service.art;

import java.util.List;

import org.nutz.dao.Cnd;
import org.nutz.dao.util.cri.SimpleCriteria;
import org.nutz.ioc.loader.annotation.IocBean;

import com.art58.nutz.result.PageResult;
import com.art58.nutz.service.BaseService;
import com.art58.site.pojo.SampleBean;
import com.art58.tool.util.StringTool;

import lombok.extern.log4j.Log4j;

import com.art58.site.pojo.art.ArtGroupbuy;

@Log4j
@IocBean
public class ArtGroupbuyService extends BaseService {


	public PageResult<ArtGroupbuy> queryPage(ArtGroupbuy obj) {
		return super.queryPage(ArtGroupbuy.class, obj, getCri(obj));
	}

	public List<ArtGroupbuy> query(ArtGroupbuy obj) {
		return super.query(ArtGroupbuy.class, getCri(obj));
	}

   	public ArtGroupbuy get(String id) {
		return super.fetch(ArtGroupbuy.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(ArtGroupbuy.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(ArtGroupbuy obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getName())) {
			cri.where().andEquals("NAME", obj.getName());
		}
		if(StringTool.isNotNull(obj.getOrgprice())) {
			cri.where().andEquals("ORGPRICE", obj.getOrgprice());
		}
		if(StringTool.isNotNull(obj.getPrice())) {
			cri.where().andEquals("PRICE", obj.getPrice());
		}
		if(StringTool.isNotNull(obj.getCount())) {
			cri.where().andEquals("COUNT", obj.getCount());
		}
		if(StringTool.isNotNull(obj.getDealcount())) {
			cri.where().andEquals("DEALCOUNT", obj.getDealcount());
		}
		if(StringTool.isNotNull(obj.getLimitcount())) {
			cri.where().andEquals("LIMITCOUNT", obj.getLimitcount());
		}
		if(StringTool.isNotNull(obj.getBuyremark())) {
			cri.where().andEquals("BUYREMARK", obj.getBuyremark());
		}
		if(StringTool.isNotNull(obj.getDescription())) {
			cri.where().andEquals("DESCRIPTION", obj.getDescription());
		}
		if(StringTool.isNotNull(obj.getGoodsdetail())) {
			cri.where().andEquals("GOODSDETAIL", obj.getGoodsdetail());
		}
		if(StringTool.isNotNull(obj.getCurator())) {
			cri.where().andEquals("CURATOR", obj.getCurator());
		}
		if(StringTool.isNotNull(obj.getState())) {
			cri.where().andEquals("STATE", obj.getState());
		}
		if(StringTool.isNotNull(obj.getAstate())) {
			cri.where().andEquals("ASTATE", obj.getAstate());
		}
		if(StringTool.isNotNull(obj.getPicurl())) {
			cri.where().andEquals("PICURL", obj.getPicurl());
		}
		if(StringTool.isNotNull(obj.getCrtTellerId())) {
			cri.where().andEquals("CRT_TELLER_ID", obj.getCrtTellerId());
		}
		if(StringTool.isNotNull(obj.getCrtTime())) {
			cri.where().andEquals("CRT_TIME", obj.getCrtTime());
		}
		if(StringTool.isNotNull(obj.getIshot())) {
			cri.where().andEquals("ISHOT", obj.getIshot());
		}
		if(StringTool.isNotNull(obj.getApproveid())) {
			cri.where().andEquals("APPROVEID", obj.getApproveid());
		}
		if(StringTool.isNotNull(obj.getApprovetm())) {
			cri.where().andEquals("APPROVETM", obj.getApprovetm());
		}
		if(StringTool.isNotNull(obj.getCenterpicurl())) {
			cri.where().andEquals("CENTERPICURL", obj.getCenterpicurl());
		}
		if(StringTool.isNotNull(obj.getModbmcount())) {
			cri.where().andEquals("MODBMCOUNT", obj.getModbmcount());
		}
		if(StringTool.isNotNull(obj.getSortNum())) {
			cri.where().andEquals("SORT_NUM", obj.getSortNum());
		}
		return cri;
	}

}