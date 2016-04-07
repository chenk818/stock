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

import com.art58.site.pojo.art.ArtArticle;

@Log4j
@IocBean
public class ArtArticleService extends BaseService {


	public PageResult<ArtArticle> queryPage(ArtArticle obj) {
		return super.queryPage(ArtArticle.class, obj, getCri(obj));
	}

	public List<ArtArticle> query(ArtArticle obj) {
		return super.query(ArtArticle.class, getCri(obj));
	}

   	public ArtArticle get(String id) {
		return super.fetch(ArtArticle.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(ArtArticle.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(ArtArticle obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getTitle())) {
			cri.where().andEquals("TITLE", obj.getTitle());
		}
		if(StringTool.isNotNull(obj.getType())) {
			cri.where().andEquals("TYPE", obj.getType());
		}
		if(StringTool.isNotNull(obj.getContent())) {
			cri.where().andEquals("CONTENT", obj.getContent());
		}
		if(StringTool.isNotNull(obj.getSource())) {
			cri.where().andEquals("SOURCE", obj.getSource());
		}
		if(StringTool.isNotNull(obj.getRestype())) {
			cri.where().andEquals("RESTYPE", obj.getRestype());
		}
		if(StringTool.isNotNull(obj.getResbelong())) {
			cri.where().andEquals("RESBELONG", obj.getResbelong());
		}
		if(StringTool.isNotNull(obj.getNewsorder())) {
			cri.where().andEquals("NEWSORDER", obj.getNewsorder());
		}
		if(StringTool.isNotNull(obj.getHotnews())) {
			cri.where().andEquals("HOTNEWS", obj.getHotnews());
		}
		if(StringTool.isNotNull(obj.getKeywords())) {
			cri.where().andEquals("KEYWORDS", obj.getKeywords());
		}
		if(StringTool.isNotNull(obj.getClickedtimes())) {
			cri.where().andEquals("CLICKEDTIMES", obj.getClickedtimes());
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
		if(StringTool.isNotNull(obj.getRemark())) {
			cri.where().andEquals("REMARK", obj.getRemark());
		}
		if(StringTool.isNotNull(obj.getPubplace())) {
			cri.where().andEquals("pubplace", obj.getPubplace());
		}
		if(StringTool.isNotNull(obj.getWritedate())) {
			cri.where().andEquals("writedate", obj.getWritedate());
		}
		if(StringTool.isNotNull(obj.getCost())) {
			cri.where().andEquals("cost", obj.getCost());
		}
		if(StringTool.isNotNull(obj.getCenterpicurl())) {
			cri.where().andEquals("CENTERPICURL", obj.getCenterpicurl());
		}
		if(StringTool.isNotNull(obj.getApplyhot())) {
			cri.where().andEquals("APPLYHOT", obj.getApplyhot());
		}
		if(StringTool.isNotNull(obj.getAstate())) {
			cri.where().andEquals("ASTATE", obj.getAstate());
		}
		return cri;
	}

}