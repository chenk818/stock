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

import com.art58.site.pojo.art.ArtPartyRecord;

@Log4j
@IocBean
public class ArtPartyRecordService extends BaseService {


	public PageResult<ArtPartyRecord> queryPage(ArtPartyRecord obj) {
		return super.queryPage(ArtPartyRecord.class, obj, getCri(obj));
	}

	public List<ArtPartyRecord> query(ArtPartyRecord obj) {
		return super.query(ArtPartyRecord.class, getCri(obj));
	}

   	public ArtPartyRecord get(String id) {
		return super.fetch(ArtPartyRecord.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(ArtPartyRecord.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(ArtPartyRecord obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getPartyid())) {
			cri.where().andEquals("PARTYID", obj.getPartyid());
		}
		if(StringTool.isNotNull(obj.getApplicantid())) {
			cri.where().andEquals("APPLICANTID", obj.getApplicantid());
		}
		if(StringTool.isNotNull(obj.getTime())) {
			cri.where().andEquals("TIME", obj.getTime());
		}
		if(StringTool.isNotNull(obj.getState())) {
			cri.where().andEquals("STATE", obj.getState());
		}
		if(StringTool.isNotNull(obj.getRemark())) {
			cri.where().andEquals("REMARK", obj.getRemark());
		}
		return cri;
	}

}