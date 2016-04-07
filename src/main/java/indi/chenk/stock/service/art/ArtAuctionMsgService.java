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

import com.art58.site.pojo.art.ArtAuctionMsg;

@Log4j
@IocBean
public class ArtAuctionMsgService extends BaseService {


	public PageResult<ArtAuctionMsg> queryPage(ArtAuctionMsg obj) {
		return super.queryPage(ArtAuctionMsg.class, obj, getCri(obj));
	}

	public List<ArtAuctionMsg> query(ArtAuctionMsg obj) {
		return super.query(ArtAuctionMsg.class, getCri(obj));
	}

   	public ArtAuctionMsg get(String id) {
		return super.fetch(ArtAuctionMsg.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(ArtAuctionMsg.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(ArtAuctionMsg obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getTheme())) {
			cri.where().andEquals("THEME", obj.getTheme());
		}
		if(StringTool.isNotNull(obj.getState())) {
			cri.where().andEquals("STATE", obj.getState());
		}
		if(StringTool.isNotNull(obj.getStarttm())) {
			cri.where().andEquals("STARTTM", obj.getStarttm());
		}
		if(StringTool.isNotNull(obj.getEndtm())) {
			cri.where().andEquals("ENDTM", obj.getEndtm());
		}
		if(StringTool.isNotNull(obj.getPicurl())) {
			cri.where().andEquals("PICURL", obj.getPicurl());
		}
		if(StringTool.isNotNull(obj.getClicktime())) {
			cri.where().andEquals("CLICKTIME", obj.getClicktime());
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
		if(StringTool.isNotNull(obj.getIshot())) {
			cri.where().andEquals("ISHOT", obj.getIshot());
		}
		if(StringTool.isNotNull(obj.getCenterpicurl())) {
			cri.where().andEquals("CENTERPICURL", obj.getCenterpicurl());
		}
		if(StringTool.isNotNull(obj.getUnsoldNum())) {
			cri.where().andEquals("UNSOLD_NUM", obj.getUnsoldNum());
		}
		return cri;
	}

}