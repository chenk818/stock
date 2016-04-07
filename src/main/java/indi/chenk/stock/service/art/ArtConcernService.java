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

import com.art58.site.pojo.art.ArtConcern;

@Log4j
@IocBean
public class ArtConcernService extends BaseService {


	public PageResult<ArtConcern> queryPage(ArtConcern obj) {
		return super.queryPage(ArtConcern.class, obj, getCri(obj));
	}

	public List<ArtConcern> query(ArtConcern obj) {
		return super.query(ArtConcern.class, getCri(obj));
	}

   	public ArtConcern get(String id) {
		return super.fetch(ArtConcern.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(ArtConcern.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(ArtConcern obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getUserid())) {
			cri.where().andEquals("USERID", obj.getUserid());
		}
		if(StringTool.isNotNull(obj.getConcernid())) {
			cri.where().andEquals("CONCERNID", obj.getConcernid());
		}
		if(StringTool.isNotNull(obj.getConcerntime())) {
			cri.where().andEquals("CONCERNTIME", obj.getConcerntime());
		}
		return cri;
	}

}