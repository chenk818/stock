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

import com.art58.site.pojo.art.ArtVoteStat;

@Log4j
@IocBean
public class ArtVoteStatService extends BaseService {


	public PageResult<ArtVoteStat> queryPage(ArtVoteStat obj) {
		return super.queryPage(ArtVoteStat.class, obj, getCri(obj));
	}

	public List<ArtVoteStat> query(ArtVoteStat obj) {
		return super.query(ArtVoteStat.class, getCri(obj));
	}

   	public ArtVoteStat get(String id) {
		return super.fetch(ArtVoteStat.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(ArtVoteStat.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(ArtVoteStat obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getModuleid())) {
			cri.where().andEquals("MODULEID", obj.getModuleid());
		}
		if(StringTool.isNotNull(obj.getCount())) {
			cri.where().andEquals("COUNT", obj.getCount());
		}
		if(StringTool.isNotNull(obj.getVoteid())) {
			cri.where().andEquals("VOTEID", obj.getVoteid());
		}
		if(StringTool.isNotNull(obj.getVotetype())) {
			cri.where().andEquals("VOTETYPE", obj.getVotetype());
		}
		return cri;
	}

}