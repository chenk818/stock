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

import com.art58.site.pojo.art.ArtVoteChampion;

@Log4j
@IocBean
public class ArtVoteChampionService extends BaseService {


	public PageResult<ArtVoteChampion> queryPage(ArtVoteChampion obj) {
		return super.queryPage(ArtVoteChampion.class, obj, getCri(obj));
	}

	public List<ArtVoteChampion> query(ArtVoteChampion obj) {
		return super.query(ArtVoteChampion.class, getCri(obj));
	}

   	public ArtVoteChampion get(String id) {
		return super.fetch(ArtVoteChampion.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(ArtVoteChampion.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(ArtVoteChampion obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getStarttm())) {
			cri.where().andEquals("STARTTM", obj.getStarttm());
		}
		if(StringTool.isNotNull(obj.getEndtm())) {
			cri.where().andEquals("ENDTM", obj.getEndtm());
		}
		if(StringTool.isNotNull(obj.getChampionid())) {
			cri.where().andEquals("CHAMPIONID", obj.getChampionid());
		}
		if(StringTool.isNotNull(obj.getCount())) {
			cri.where().andEquals("COUNT", obj.getCount());
		}
		return cri;
	}

}