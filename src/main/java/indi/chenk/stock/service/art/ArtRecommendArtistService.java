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

import com.art58.site.pojo.art.ArtRecommendArtist;

@Log4j
@IocBean
public class ArtRecommendArtistService extends BaseService {


	public PageResult<ArtRecommendArtist> queryPage(ArtRecommendArtist obj) {
		return super.queryPage(ArtRecommendArtist.class, obj, getCri(obj));
	}

	public List<ArtRecommendArtist> query(ArtRecommendArtist obj) {
		return super.query(ArtRecommendArtist.class, getCri(obj));
	}

   	public ArtRecommendArtist get(String id) {
		return super.fetch(ArtRecommendArtist.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(ArtRecommendArtist.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(ArtRecommendArtist obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getUserId())) {
			cri.where().andEquals("USER_ID", obj.getUserId());
		}
		if(StringTool.isNotNull(obj.getPicUrl())) {
			cri.where().andEquals("PIC_URL", obj.getPicUrl());
		}
		if(StringTool.isNotNull(obj.getSortNum())) {
			cri.where().andEquals("SORT_NUM", obj.getSortNum());
		}
		if(StringTool.isNotNull(obj.getFans())) {
			cri.where().andEquals("FANS", obj.getFans());
		}
		if(StringTool.isNotNull(obj.getLikes())) {
			cri.where().andEquals("LIKES", obj.getLikes());
		}
		if(StringTool.isNotNull(obj.getLink())) {
			cri.where().andEquals("LINK", obj.getLink());
		}
		if(StringTool.isNotNull(obj.getCrtTellerId())) {
			cri.where().andEquals("CRT_TELLER_ID", obj.getCrtTellerId());
		}
		if(StringTool.isNotNull(obj.getCrtTime())) {
			cri.where().andEquals("CRT_TIME", obj.getCrtTime());
		}
		return cri;
	}

}