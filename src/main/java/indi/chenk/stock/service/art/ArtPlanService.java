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

import com.art58.site.pojo.art.ArtPlan;

@Log4j
@IocBean
public class ArtPlanService extends BaseService {


	public PageResult<ArtPlan> queryPage(ArtPlan obj) {
		return super.queryPage(ArtPlan.class, obj, getCri(obj));
	}

	public List<ArtPlan> query(ArtPlan obj) {
		return super.query(ArtPlan.class, getCri(obj));
	}

   	public ArtPlan get(String id) {
		return super.fetch(ArtPlan.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(ArtPlan.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(ArtPlan obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getName())) {
			cri.where().andEquals("NAME", obj.getName());
		}
		if(StringTool.isNotNull(obj.getDescription())) {
			cri.where().andEquals("DESCRIPTION", obj.getDescription());
		}
		if(StringTool.isNotNull(obj.getAddress())) {
			cri.where().andEquals("ADDRESS", obj.getAddress());
		}
		if(StringTool.isNotNull(obj.getPayment())) {
			cri.where().andEquals("PAYMENT", obj.getPayment());
		}
		if(StringTool.isNotNull(obj.getStarttm())) {
			cri.where().andEquals("STARTTM", obj.getStarttm());
		}
		if(StringTool.isNotNull(obj.getPendtm())) {
			cri.where().andEquals("PENDTM", obj.getPendtm());
		}
		if(StringTool.isNotNull(obj.getContent())) {
			cri.where().andEquals("CONTENT", obj.getContent());
		}
		if(StringTool.isNotNull(obj.getTeacherteam())) {
			cri.where().andEquals("TEACHERTEAM", obj.getTeacherteam());
		}
		if(StringTool.isNotNull(obj.getTeachtype())) {
			cri.where().andEquals("TEACHTYPE", obj.getTeachtype());
		}
		if(StringTool.isNotNull(obj.getClicktime())) {
			cri.where().andEquals("CLICKTIME", obj.getClicktime());
		}
		if(StringTool.isNotNull(obj.getEndtm())) {
			cri.where().andEquals("ENDTM", obj.getEndtm());
		}
		if(StringTool.isNotNull(obj.getSerialno())) {
			cri.where().andEquals("SERIALNO", obj.getSerialno());
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
		if(StringTool.isNotNull(obj.getState())) {
			cri.where().andEquals("STATE", obj.getState());
		}
		if(StringTool.isNotNull(obj.getRemark())) {
			cri.where().andEquals("REMARK", obj.getRemark());
		}
		if(StringTool.isNotNull(obj.getAssignto())) {
			cri.where().andEquals("ASSIGNTO", obj.getAssignto());
		}
		if(StringTool.isNotNull(obj.getIshot())) {
			cri.where().andEquals("ISHOT", obj.getIshot());
		}
		if(StringTool.isNotNull(obj.getPrice())) {
			cri.where().andEquals("price", obj.getPrice());
		}
		if(StringTool.isNotNull(obj.getCenterpicurl())) {
			cri.where().andEquals("CENTERPICURL", obj.getCenterpicurl());
		}
		if(StringTool.isNotNull(obj.getSortNum())) {
			cri.where().andEquals("SORT_NUM", obj.getSortNum());
		}
		return cri;
	}

}