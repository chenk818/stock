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

import com.art58.site.pojo.art.ArtPlanRecord;

@Log4j
@IocBean
public class ArtPlanRecordService extends BaseService {


	public PageResult<ArtPlanRecord> queryPage(ArtPlanRecord obj) {
		return super.queryPage(ArtPlanRecord.class, obj, getCri(obj));
	}

	public List<ArtPlanRecord> query(ArtPlanRecord obj) {
		return super.query(ArtPlanRecord.class, getCri(obj));
	}

   	public ArtPlanRecord get(String id) {
		return super.fetch(ArtPlanRecord.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(ArtPlanRecord.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(ArtPlanRecord obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getPlanid())) {
			cri.where().andEquals("PLANID", obj.getPlanid());
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
		if(StringTool.isNotNull(obj.getApproveid())) {
			cri.where().andEquals("APPROVEID", obj.getApproveid());
		}
		if(StringTool.isNotNull(obj.getApprovetm())) {
			cri.where().andEquals("APPROVETM", obj.getApprovetm());
		}
		if(StringTool.isNotNull(obj.getRemark())) {
			cri.where().andEquals("REMARK", obj.getRemark());
		}
		if(StringTool.isNotNull(obj.getOrderno())) {
			cri.where().andEquals("ORDERNO", obj.getOrderno());
		}
		return cri;
	}

}