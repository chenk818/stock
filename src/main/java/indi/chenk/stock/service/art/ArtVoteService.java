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

import com.art58.site.pojo.art.ArtVote;

@Log4j
@IocBean
public class ArtVoteService extends BaseService {


	public PageResult<ArtVote> queryPage(ArtVote obj) {
		return super.queryPage(ArtVote.class, obj, getCri(obj));
	}

	public List<ArtVote> query(ArtVote obj) {
		return super.query(ArtVote.class, getCri(obj));
	}

   	public ArtVote get(String id) {
		return super.fetch(ArtVote.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(ArtVote.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(ArtVote obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getModuletype())) {
			cri.where().andEquals("MODULETYPE", obj.getModuletype());
		}
		if(StringTool.isNotNull(obj.getModuleid())) {
			cri.where().andEquals("MODULEID", obj.getModuleid());
		}
		if(StringTool.isNotNull(obj.getVotetype())) {
			cri.where().andEquals("VOTETYPE", obj.getVotetype());
		}
		if(StringTool.isNotNull(obj.getVoteid())) {
			cri.where().andEquals("VOTEID", obj.getVoteid());
		}
		if(StringTool.isNotNull(obj.getVoter())) {
			cri.where().andEquals("VOTER", obj.getVoter());
		}
		if(StringTool.isNotNull(obj.getVotetm())) {
			cri.where().andEquals("VOTETM", obj.getVotetm());
		}
		return cri;
	}

}