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

import com.art58.site.pojo.art.ArtVoteLasttop10;

@Log4j
@IocBean
public class ArtVoteLasttop10Service extends BaseService {


	public PageResult<ArtVoteLasttop10> queryPage(ArtVoteLasttop10 obj) {
		return super.queryPage(ArtVoteLasttop10.class, obj, getCri(obj));
	}

	public List<ArtVoteLasttop10> query(ArtVoteLasttop10 obj) {
		return super.query(ArtVoteLasttop10.class, getCri(obj));
	}

   	public ArtVoteLasttop10 get(String id) {
		return super.fetch(ArtVoteLasttop10.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(ArtVoteLasttop10.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(ArtVoteLasttop10 obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getName())) {
			cri.where().andEquals("NAME", obj.getName());
		}
		if(StringTool.isNotNull(obj.getCpurl())) {
			cri.where().andEquals("CPURL", obj.getCpurl());
		}
		if(StringTool.isNotNull(obj.getCount())) {
			cri.where().andEquals("COUNT", obj.getCount());
		}
		return cri;
	}

}