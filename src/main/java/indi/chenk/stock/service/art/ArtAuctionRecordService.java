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

import com.art58.site.pojo.art.ArtAuctionRecord;

@Log4j
@IocBean
public class ArtAuctionRecordService extends BaseService {


	public PageResult<ArtAuctionRecord> queryPage(ArtAuctionRecord obj) {
		return super.queryPage(ArtAuctionRecord.class, obj, getCri(obj));
	}

	public List<ArtAuctionRecord> query(ArtAuctionRecord obj) {
		return super.query(ArtAuctionRecord.class, getCri(obj));
	}

   	public ArtAuctionRecord get(String id) {
		return super.fetch(ArtAuctionRecord.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(ArtAuctionRecord.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(ArtAuctionRecord obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getAuctionId())) {
			cri.where().andEquals("AUCTION_ID", obj.getAuctionId());
		}
		if(StringTool.isNotNull(obj.getAuctionartid())) {
			cri.where().andEquals("AUCTIONARTID", obj.getAuctionartid());
		}
		if(StringTool.isNotNull(obj.getBiddersid())) {
			cri.where().andEquals("BIDDERSID", obj.getBiddersid());
		}
		if(StringTool.isNotNull(obj.getPrice())) {
			cri.where().andEquals("PRICE", obj.getPrice());
		}
		if(StringTool.isNotNull(obj.getState())) {
			cri.where().andEquals("STATE", obj.getState());
		}
		if(StringTool.isNotNull(obj.getTime())) {
			cri.where().andEquals("TIME", obj.getTime());
		}
		if(StringTool.isNotNull(obj.getApproveid())) {
			cri.where().andEquals("APPROVEID", obj.getApproveid());
		}
		if(StringTool.isNotNull(obj.getApprovetm())) {
			cri.where().andEquals("APPROVETM", obj.getApprovetm());
		}
		if(StringTool.isNotNull(obj.getRemark())) {
			cri.where().andEquals("REMARK", obj.getRemark());
		}
		return cri;
	}

}