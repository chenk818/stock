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

import com.art58.site.pojo.art.ArtShowExtern;

@Log4j
@IocBean
public class ArtShowExternService extends BaseService {


	public PageResult<ArtShowExtern> queryPage(ArtShowExtern obj) {
		return super.queryPage(ArtShowExtern.class, obj, getCri(obj));
	}

	public List<ArtShowExtern> query(ArtShowExtern obj) {
		return super.query(ArtShowExtern.class, getCri(obj));
	}

   	public ArtShowExtern get(String id) {
		return super.fetch(ArtShowExtern.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(ArtShowExtern.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(ArtShowExtern obj) {
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
		if(StringTool.isNotNull(obj.getForm())) {
			cri.where().andEquals("FORM", obj.getForm());
		}
		if(StringTool.isNotNull(obj.getYear())) {
			cri.where().andEquals("YEAR", obj.getYear());
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
		if(StringTool.isNotNull(obj.getType())) {
			cri.where().andEquals("TYPE", obj.getType());
		}
		if(StringTool.isNotNull(obj.getOtherartist())) {
			cri.where().andEquals("OTHERARTIST", obj.getOtherartist());
		}
		return cri;
	}

}