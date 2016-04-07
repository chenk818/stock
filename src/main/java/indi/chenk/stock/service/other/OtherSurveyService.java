package com.art58.site.service.other;

import java.util.List;

import org.nutz.dao.Cnd;
import org.nutz.dao.util.cri.SimpleCriteria;
import org.nutz.ioc.loader.annotation.IocBean;

import com.art58.nutz.result.PageResult;
import com.art58.nutz.service.BaseService;
import com.art58.site.pojo.SampleBean;
import com.art58.tool.util.StringTool;

import lombok.extern.log4j.Log4j;

import com.art58.site.pojo.other.OtherSurvey;

@Log4j
@IocBean
public class OtherSurveyService extends BaseService {


	public PageResult<OtherSurvey> queryPage(OtherSurvey obj) {
		return super.queryPage(OtherSurvey.class, obj, getCri(obj));
	}

	public List<OtherSurvey> query(OtherSurvey obj) {
		return super.query(OtherSurvey.class, getCri(obj));
	}

   	public OtherSurvey get(String id) {
		return super.fetch(OtherSurvey.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(OtherSurvey.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(OtherSurvey obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getUsername())) {
			cri.where().andEquals("username", obj.getUsername());
		}
		if(StringTool.isNotNull(obj.getStaff())) {
			cri.where().andEquals("staff", obj.getStaff());
		}
		if(StringTool.isNotNull(obj.getSex())) {
			cri.where().andEquals("sex", obj.getSex());
		}
		if(StringTool.isNotNull(obj.getNation())) {
			cri.where().andEquals("nation", obj.getNation());
		}
		if(StringTool.isNotNull(obj.getPlace())) {
			cri.where().andEquals("place", obj.getPlace());
		}
		if(StringTool.isNotNull(obj.getBirthday())) {
			cri.where().andEquals("birthday", obj.getBirthday());
		}
		if(StringTool.isNotNull(obj.getGraduateplace())) {
			cri.where().andEquals("GRADUATEPLACE", obj.getGraduateplace());
		}
		if(StringTool.isNotNull(obj.getGraduatetime())) {
			cri.where().andEquals("GRADUATETIME", obj.getGraduatetime());
		}
		if(StringTool.isNotNull(obj.getEmail())) {
			cri.where().andEquals("EMAIL", obj.getEmail());
		}
		if(StringTool.isNotNull(obj.getMobilephone())) {
			cri.where().andEquals("MOBILEPHONE", obj.getMobilephone());
		}
		if(StringTool.isNotNull(obj.getWorkunit())) {
			cri.where().andEquals("workunit", obj.getWorkunit());
		}
		if(StringTool.isNotNull(obj.getGetknown())) {
			cri.where().andEquals("getknown", obj.getGetknown());
		}
		if(StringTool.isNotNull(obj.getGobj())) {
			cri.where().andEquals("gobj", obj.getGobj());
		}
		if(StringTool.isNotNull(obj.getWorkplace())) {
			cri.where().andEquals("workplace", obj.getWorkplace());
		}
		if(StringTool.isNotNull(obj.getLocated())) {
			cri.where().andEquals("located", obj.getLocated());
		}
		if(StringTool.isNotNull(obj.getGonow())) {
			cri.where().andEquals("gonow", obj.getGonow());
		}
		if(StringTool.isNotNull(obj.getStudiotype())) {
			cri.where().andEquals("studiotype", obj.getStudiotype());
		}
		if(StringTool.isNotNull(obj.getStudiofor())) {
			cri.where().andEquals("studiofor", obj.getStudiofor());
		}
		if(StringTool.isNotNull(obj.getStudiorent())) {
			cri.where().andEquals("studiorent", obj.getStudiorent());
		}
		if(StringTool.isNotNull(obj.getRentrise())) {
			cri.where().andEquals("rentrise", obj.getRentrise());
		}
		if(StringTool.isNotNull(obj.getCost())) {
			cri.where().andEquals("cost", obj.getCost());
		}
		if(StringTool.isNotNull(obj.getWorktype())) {
			cri.where().andEquals("worktype", obj.getWorktype());
		}
		if(StringTool.isNotNull(obj.getWorks())) {
			cri.where().andEquals("works", obj.getWorks());
		}
		if(StringTool.isNotNull(obj.getReward())) {
			cri.where().andEquals("reward", obj.getReward());
		}
		if(StringTool.isNotNull(obj.getGoods())) {
			cri.where().andEquals("goods", obj.getGoods());
		}
		if(StringTool.isNotNull(obj.getBads())) {
			cri.where().andEquals("bads", obj.getBads());
		}
		if(StringTool.isNotNull(obj.getEvaluate())) {
			cri.where().andEquals("evaluate", obj.getEvaluate());
		}
		if(StringTool.isNotNull(obj.getInvite())) {
			cri.where().andEquals("invite", obj.getInvite());
		}
		if(StringTool.isNotNull(obj.getSurveytm())) {
			cri.where().andEquals("SURVEYTM", obj.getSurveytm());
		}
		if(StringTool.isNotNull(obj.getWorkplacedetail())) {
			cri.where().andEquals("workplacedetail", obj.getWorkplacedetail());
		}
		return cri;
	}

}