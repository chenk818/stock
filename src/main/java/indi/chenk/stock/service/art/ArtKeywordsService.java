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

import com.art58.site.pojo.art.ArtKeywords;

@Log4j
@IocBean
public class ArtKeywordsService extends BaseService {


	public PageResult<ArtKeywords> queryPage(ArtKeywords obj) {
		return super.queryPage(ArtKeywords.class, obj, getCri(obj));
	}

	public List<ArtKeywords> query(ArtKeywords obj) {
		return super.query(ArtKeywords.class, getCri(obj));
	}

   	public ArtKeywords get(String id) {
		return super.fetch(ArtKeywords.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(ArtKeywords.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(ArtKeywords obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getKeywords())) {
			cri.where().andEquals("KEYWORDS", obj.getKeywords());
		}
		if(StringTool.isNotNull(obj.getIsshow())) {
			cri.where().andEquals("ISSHOW", obj.getIsshow());
		}
		return cri;
	}

}