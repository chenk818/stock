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

import com.art58.site.pojo.art.ArtShow;

@Log4j
@IocBean
public class ArtShowService extends BaseService {


	public PageResult<ArtShow> queryPage(ArtShow obj) {
		return super.queryPage(ArtShow.class, obj, getCri(obj));
	}

	public List<ArtShow> query(ArtShow obj) {
		return super.query(ArtShow.class, getCri(obj));
	}

   	public ArtShow get(String id) {
		return super.fetch(ArtShow.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(ArtShow.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(ArtShow obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getName())) {
			cri.where().andEquals("NAME", obj.getName());
		}
		if(StringTool.isNotNull(obj.getTitle())) {
			cri.where().andEquals("TITLE", obj.getTitle());
		}
		if(StringTool.isNotNull(obj.getSpacename())) {
			cri.where().andEquals("SPACENAME", obj.getSpacename());
		}
		if(StringTool.isNotNull(obj.getCity())) {
			cri.where().andEquals("CITY", obj.getCity());
		}
		if(StringTool.isNotNull(obj.getCountry())) {
			cri.where().andEquals("COUNTRY", obj.getCountry());
		}
		if(StringTool.isNotNull(obj.getDescription())) {
			cri.where().andEquals("DESCRIPTION", obj.getDescription());
		}
		if(StringTool.isNotNull(obj.getCurator())) {
			cri.where().andEquals("CURATOR", obj.getCurator());
		}
		if(StringTool.isNotNull(obj.getRecommend())) {
			cri.where().andEquals("RECOMMEND", obj.getRecommend());
		}
		if(StringTool.isNotNull(obj.getState())) {
			cri.where().andEquals("STATE", obj.getState());
		}
		if(StringTool.isNotNull(obj.getType())) {
			cri.where().andEquals("TYPE", obj.getType());
		}
		if(StringTool.isNotNull(obj.getForm())) {
			cri.where().andEquals("FORM", obj.getForm());
		}
		if(StringTool.isNotNull(obj.getStarttm())) {
			cri.where().andEquals("STARTTM", obj.getStarttm());
		}
		if(StringTool.isNotNull(obj.getEndtm())) {
			cri.where().andEquals("ENDTM", obj.getEndtm());
		}
		if(StringTool.isNotNull(obj.getSignendtm())) {
			cri.where().andEquals("SIGNENDTM", obj.getSignendtm());
		}
		if(StringTool.isNotNull(obj.getSerialno())) {
			cri.where().andEquals("SERIALNO", obj.getSerialno());
		}
		if(StringTool.isNotNull(obj.getArticleid())) {
			cri.where().andEquals("ARTICLEID", obj.getArticleid());
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
		if(StringTool.isNotNull(obj.getApprovetm())) {
			cri.where().andEquals("APPROVETM", obj.getApprovetm());
		}
		if(StringTool.isNotNull(obj.getApproveid())) {
			cri.where().andEquals("APPROVEID", obj.getApproveid());
		}
		if(StringTool.isNotNull(obj.getShowlocale())) {
			cri.where().andEquals("showlocale", obj.getShowlocale());
		}
		if(StringTool.isNotNull(obj.getLimitcount())) {
			cri.where().andEquals("LIMITCOUNT", obj.getLimitcount());
		}
		if(StringTool.isNotNull(obj.getVotestime())) {
			cri.where().andEquals("VOTESTIME", obj.getVotestime());
		}
		if(StringTool.isNotNull(obj.getCanvote())) {
			cri.where().andEquals("CANVOTE", obj.getCanvote());
		}
		if(StringTool.isNotNull(obj.getArtcanvote())) {
			cri.where().andEquals("ARTCANVOTE", obj.getArtcanvote());
		}
		if(StringTool.isNotNull(obj.getModartcount())) {
			cri.where().andEquals("MODARTCOUNT", obj.getModartcount());
		}
		if(StringTool.isNotNull(obj.getModbmcount())) {
			cri.where().andEquals("MODBMCOUNT", obj.getModbmcount());
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