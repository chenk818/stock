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

import com.art58.site.pojo.art.ArtExchange;

@Log4j
@IocBean
public class ArtExchangeService extends BaseService {


	public PageResult<ArtExchange> queryPage(ArtExchange obj) {
		return super.queryPage(ArtExchange.class, obj, getCri(obj));
	}

	public List<ArtExchange> query(ArtExchange obj) {
		return super.query(ArtExchange.class, getCri(obj));
	}

   	public ArtExchange get(String id) {
		return super.fetch(ArtExchange.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(ArtExchange.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(ArtExchange obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getTitle())) {
			cri.where().andEquals("TITLE", obj.getTitle());
		}
		if(StringTool.isNotNull(obj.getInstruction())) {
			cri.where().andEquals("INSTRUCTION", obj.getInstruction());
		}
		if(StringTool.isNotNull(obj.getState())) {
			cri.where().andEquals("STATE", obj.getState());
		}
		if(StringTool.isNotNull(obj.getRegion())) {
			cri.where().andEquals("REGION", obj.getRegion());
		}
		if(StringTool.isNotNull(obj.getLocation())) {
			cri.where().andEquals("LOCATION", obj.getLocation());
		}
		if(StringTool.isNotNull(obj.getEvaluateprice())) {
			cri.where().andEquals("EVALUATEPRICE", obj.getEvaluateprice());
		}
		if(StringTool.isNotNull(obj.getOriginurl())) {
			cri.where().andEquals("ORIGINURL", obj.getOriginurl());
		}
		if(StringTool.isNotNull(obj.getExchangeurl())) {
			cri.where().andEquals("EXCHANGEURL", obj.getExchangeurl());
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
		if(StringTool.isNotNull(obj.getType())) {
			cri.where().andEquals("TYPE", obj.getType());
		}
		if(StringTool.isNotNull(obj.getAssignto())) {
			cri.where().andEquals("ASSIGNTO", obj.getAssignto());
		}
		if(StringTool.isNotNull(obj.getOcpicurl())) {
			cri.where().andEquals("OCPICURL", obj.getOcpicurl());
		}
		if(StringTool.isNotNull(obj.getExpicurl())) {
			cri.where().andEquals("EXPICURL", obj.getExpicurl());
		}
		if(StringTool.isNotNull(obj.getExnumber())) {
			cri.where().andEquals("EXNUMBER", obj.getExnumber());
		}
		return cri;
	}

}