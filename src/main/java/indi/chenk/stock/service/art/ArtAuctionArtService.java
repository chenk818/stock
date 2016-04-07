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

import com.art58.site.pojo.art.ArtAuctionArt;

@Log4j
@IocBean
public class ArtAuctionArtService extends BaseService {


	public PageResult<ArtAuctionArt> queryPage(ArtAuctionArt obj) {
		return super.queryPage(ArtAuctionArt.class, obj, getCri(obj));
	}

	public List<ArtAuctionArt> query(ArtAuctionArt obj) {
		return super.query(ArtAuctionArt.class, getCri(obj));
	}

   	public ArtAuctionArt get(String id) {
		return super.fetch(ArtAuctionArt.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(ArtAuctionArt.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(ArtAuctionArt obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getArtid())) {
			cri.where().andEquals("ARTID", obj.getArtid());
		}
		if(StringTool.isNotNull(obj.getAuctionid())) {
			cri.where().andEquals("AUCTIONID", obj.getAuctionid());
		}
		if(StringTool.isNotNull(obj.getBaseprice())) {
			cri.where().andEquals("BASEPRICE", obj.getBaseprice());
		}
		if(StringTool.isNotNull(obj.getCurrentprice())) {
			cri.where().andEquals("CURRENTPRICE", obj.getCurrentprice());
		}
		if(StringTool.isNotNull(obj.getFinalprice())) {
			cri.where().andEquals("FINALPRICE", obj.getFinalprice());
		}
		if(StringTool.isNotNull(obj.getAddprice())) {
			cri.where().andEquals("ADDPRICE", obj.getAddprice());
		}
		if(StringTool.isNotNull(obj.getBail())) {
			cri.where().andEquals("BAIL", obj.getBail());
		}
		if(StringTool.isNotNull(obj.getDealtm())) {
			cri.where().andEquals("DEALTM", obj.getDealtm());
		}
		if(StringTool.isNotNull(obj.getPicurl())) {
			cri.where().andEquals("PICURL", obj.getPicurl());
		}
		if(StringTool.isNotNull(obj.getApproveid())) {
			cri.where().andEquals("APPROVEID", obj.getApproveid());
		}
		if(StringTool.isNotNull(obj.getApprovetm())) {
			cri.where().andEquals("APPROVETM", obj.getApprovetm());
		}
		if(StringTool.isNotNull(obj.getCrtTellerId())) {
			cri.where().andEquals("CRT_TELLER_ID", obj.getCrtTellerId());
		}
		if(StringTool.isNotNull(obj.getCrtTime())) {
			cri.where().andEquals("CRT_TIME", obj.getCrtTime());
		}
		if(StringTool.isNotNull(obj.getRemark())) {
			cri.where().andEquals("REMARK", obj.getRemark());
		}
		if(StringTool.isNotNull(obj.getValuePrice())) {
			cri.where().andEquals("valuePrice", obj.getValuePrice());
		}
		if(StringTool.isNotNull(obj.getChargePrice())) {
			cri.where().andEquals("chargePrice", obj.getChargePrice());
		}
		if(StringTool.isNotNull(obj.getAuctionOrg())) {
			cri.where().andEquals("auctionOrg", obj.getAuctionOrg());
		}
		if(StringTool.isNotNull(obj.getClicktime())) {
			cri.where().andEquals("CLICKTIME", obj.getClicktime());
		}
		if(StringTool.isNotNull(obj.getCenterpicurl())) {
			cri.where().andEquals("CENTERPICURL", obj.getCenterpicurl());
		}
		if(StringTool.isNotNull(obj.getResult())) {
			cri.where().andEquals("RESULT", obj.getResult());
		}
		if(StringTool.isNotNull(obj.getUnsoldReason())) {
			cri.where().andEquals("UNSOLD_REASON", obj.getUnsoldReason());
		}
		if(StringTool.isNotNull(obj.getBuyer())) {
			cri.where().andEquals("BUYER", obj.getBuyer());
		}
		if(StringTool.isNotNull(obj.getIscart())) {
			cri.where().andEquals("ISCART", obj.getIscart());
		}
		if(StringTool.isNotNull(obj.getIsdelayed())) {
			cri.where().andEquals("ISDELAYED", obj.getIsdelayed());
		}
		if(StringTool.isNotNull(obj.getRelayedPeriod())) {
			cri.where().andEquals("RELAYED_PERIOD", obj.getRelayedPeriod());
		}
		if(StringTool.isNotNull(obj.getRelayedEndTime())) {
			cri.where().andEquals("RELAYED_END_TIME", obj.getRelayedEndTime());
		}
		return cri;
	}

}