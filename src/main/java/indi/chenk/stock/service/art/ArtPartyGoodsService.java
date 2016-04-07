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

import com.art58.site.pojo.art.ArtPartyGoods;

@Log4j
@IocBean
public class ArtPartyGoodsService extends BaseService {


	public PageResult<ArtPartyGoods> queryPage(ArtPartyGoods obj) {
		return super.queryPage(ArtPartyGoods.class, obj, getCri(obj));
	}

	public List<ArtPartyGoods> query(ArtPartyGoods obj) {
		return super.query(ArtPartyGoods.class, getCri(obj));
	}

   	public ArtPartyGoods get(String id) {
		return super.fetch(ArtPartyGoods.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(ArtPartyGoods.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(ArtPartyGoods obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getPartyid())) {
			cri.where().andEquals("PARTYID", obj.getPartyid());
		}
		if(StringTool.isNotNull(obj.getGoodsname())) {
			cri.where().andEquals("GOODSNAME", obj.getGoodsname());
		}
		if(StringTool.isNotNull(obj.getCount())) {
			cri.where().andEquals("COUNT", obj.getCount());
		}
		if(StringTool.isNotNull(obj.getClaimid())) {
			cri.where().andEquals("CLAIMID", obj.getClaimid());
		}
		if(StringTool.isNotNull(obj.getClaimcount())) {
			cri.where().andEquals("CLAIMCOUNT", obj.getClaimcount());
		}
		if(StringTool.isNotNull(obj.getRemart())) {
			cri.where().andEquals("REMART", obj.getRemart());
		}
		return cri;
	}

}