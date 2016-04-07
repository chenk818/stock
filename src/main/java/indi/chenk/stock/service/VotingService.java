package com.art58.site.service;

import java.util.List;

import org.nutz.dao.Cnd;
import org.nutz.dao.util.cri.SimpleCriteria;
import org.nutz.ioc.loader.annotation.IocBean;

import com.art58.nutz.result.PageResult;
import com.art58.nutz.service.BaseService;
import com.art58.site.pojo.SampleBean;
import com.art58.tool.util.StringTool;

@IocBean
public class VotingService  extends BaseService {

	
	public PageResult<SampleBean> queryPage(SampleBean obj) {
		return super.queryPage(SampleBean.class, obj, getCri(obj,null,null));
	}

	public List<SampleBean> query(SampleBean obj) {
		return super.query(SampleBean.class, getCri(obj,null,null));
	}

   	public SampleBean get(String id) {
		return super.fetch(SampleBean.class, id);
	}

   	
   	
	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(SampleBean.class, cri);
		}
		return 0;
	}




	private SimpleCriteria getCri(SampleBean obj,List<String> orderColumns , List<String>  orderTypes) {
		SimpleCriteria cri = Cnd.cri();

		
		
		return cri;
	}
	
	
}
