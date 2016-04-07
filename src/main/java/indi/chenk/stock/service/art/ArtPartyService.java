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

import com.art58.site.pojo.art.ArtParty;

@Log4j
@IocBean
public class ArtPartyService extends BaseService {


	public PageResult<ArtParty> queryPage(ArtParty obj) {
		return super.queryPage(ArtParty.class, obj, getCri(obj));
	}

	public List<ArtParty> query(ArtParty obj) {
		return super.query(ArtParty.class, getCri(obj));
	}

   	public ArtParty get(String id) {
		return super.fetch(ArtParty.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(ArtParty.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(ArtParty obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getName())) {
			cri.where().andEquals("NAME", obj.getName());
		}
		if(StringTool.isNotNull(obj.getType())) {
			cri.where().andEquals("TYPE", obj.getType());
		}
		if(StringTool.isNotNull(obj.getDescription())) {
			cri.where().andEquals("DESCRIPTION", obj.getDescription());
		}
		if(StringTool.isNotNull(obj.getStarttm())) {
			cri.where().andEquals("STARTTM", obj.getStarttm());
		}
		if(StringTool.isNotNull(obj.getEndtm())) {
			cri.where().andEquals("ENDTM", obj.getEndtm());
		}
		if(StringTool.isNotNull(obj.getMincount())) {
			cri.where().andEquals("MINCOUNT", obj.getMincount());
		}
		if(StringTool.isNotNull(obj.getMaxcount())) {
			cri.where().andEquals("MAXCOUNT", obj.getMaxcount());
		}
		if(StringTool.isNotNull(obj.getCost())) {
			cri.where().andEquals("COST", obj.getCost());
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
		if(StringTool.isNotNull(obj.getRemark())) {
			cri.where().andEquals("REMARK", obj.getRemark());
		}
		if(StringTool.isNotNull(obj.getState())) {
			cri.where().andEquals("STATE", obj.getState());
		}
		if(StringTool.isNotNull(obj.getAssignto())) {
			cri.where().andEquals("ASSIGNTO", obj.getAssignto());
		}
		if(StringTool.isNotNull(obj.getIshot())) {
			cri.where().andEquals("ISHOT", obj.getIshot());
		}
		if(StringTool.isNotNull(obj.getAstate())) {
			cri.where().andEquals("ASTATE", obj.getAstate());
		}
		if(StringTool.isNotNull(obj.getModincount())) {
			cri.where().andEquals("MODINCOUNT", obj.getModincount());
		}
		if(StringTool.isNotNull(obj.getCenterpicurl())) {
			cri.where().andEquals("CENTERPICURL", obj.getCenterpicurl());
		}
		return cri;
	}

}