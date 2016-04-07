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

import com.art58.site.pojo.art.ArtExchangeRecord;

@Log4j
@IocBean
public class ArtExchangeRecordService extends BaseService {


	public PageResult<ArtExchangeRecord> queryPage(ArtExchangeRecord obj) {
		return super.queryPage(ArtExchangeRecord.class, obj, getCri(obj));
	}

	public List<ArtExchangeRecord> query(ArtExchangeRecord obj) {
		return super.query(ArtExchangeRecord.class, getCri(obj));
	}

   	public ArtExchangeRecord get(String id) {
		return super.fetch(ArtExchangeRecord.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(ArtExchangeRecord.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(ArtExchangeRecord obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getExchangeid())) {
			cri.where().andEquals("EXCHANGEID", obj.getExchangeid());
		}
		if(StringTool.isNotNull(obj.getUserid())) {
			cri.where().andEquals("USERID", obj.getUserid());
		}
		if(StringTool.isNotNull(obj.getState())) {
			cri.where().andEquals("STATE", obj.getState());
		}
		if(StringTool.isNotNull(obj.getExchangeurl())) {
			cri.where().andEquals("EXCHANGEURL", obj.getExchangeurl());
		}
		if(StringTool.isNotNull(obj.getDescription())) {
			cri.where().andEquals("DESCRIPTION", obj.getDescription());
		}
		if(StringTool.isNotNull(obj.getCrtTime())) {
			cri.where().andEquals("CRT_TIME", obj.getCrtTime());
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
		if(StringTool.isNotNull(obj.getCenterpicurl())) {
			cri.where().andEquals("CENTERPICURL", obj.getCenterpicurl());
		}
		return cri;
	}

}