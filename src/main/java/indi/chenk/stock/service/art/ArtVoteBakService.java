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

import com.art58.site.pojo.art.ArtVoteBak;

@Log4j
@IocBean
public class ArtVoteBakService extends BaseService {


	public PageResult<ArtVoteBak> queryPage(ArtVoteBak obj) {
		return super.queryPage(ArtVoteBak.class, obj, getCri(obj));
	}

	public List<ArtVoteBak> query(ArtVoteBak obj) {
		return super.query(ArtVoteBak.class, getCri(obj));
	}

   	public ArtVoteBak get(String id) {
		return super.fetch(ArtVoteBak.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(ArtVoteBak.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(ArtVoteBak obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getId())) {
			cri.where().andEquals("ID", obj.getId());
		}
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