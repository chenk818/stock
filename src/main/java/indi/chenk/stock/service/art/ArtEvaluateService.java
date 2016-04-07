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

import com.art58.site.pojo.art.ArtEvaluate;

@Log4j
@IocBean
public class ArtEvaluateService extends BaseService {


	public PageResult<ArtEvaluate> queryPage(ArtEvaluate obj) {
		return super.queryPage(ArtEvaluate.class, obj, getCri(obj));
	}

	public List<ArtEvaluate> query(ArtEvaluate obj) {
		return super.query(ArtEvaluate.class, getCri(obj));
	}

   	public ArtEvaluate get(String id) {
		return super.fetch(ArtEvaluate.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(ArtEvaluate.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(ArtEvaluate obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getReviewer())) {
			cri.where().andEquals("REVIEWER", obj.getReviewer());
		}
		if(StringTool.isNotNull(obj.getType())) {
			cri.where().andEquals("TYPE", obj.getType());
		}
		if(StringTool.isNotNull(obj.getEvaluatetype())) {
			cri.where().andEquals("EVALUATETYPE", obj.getEvaluatetype());
		}
		if(StringTool.isNotNull(obj.getEvaluateid())) {
			cri.where().andEquals("EVALUATEID", obj.getEvaluateid());
		}
		if(StringTool.isNotNull(obj.getTime())) {
			cri.where().andEquals("TIME", obj.getTime());
		}
		if(StringTool.isNotNull(obj.getState())) {
			cri.where().andEquals("STATE", obj.getState());
		}
		return cri;
	}

}