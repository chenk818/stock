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

import com.art58.site.pojo.art.ArtArtworkHis;

@Log4j
@IocBean
public class ArtArtworkHisService extends BaseService {


	public PageResult<ArtArtworkHis> queryPage(ArtArtworkHis obj) {
		return super.queryPage(ArtArtworkHis.class, obj, getCri(obj));
	}

	public List<ArtArtworkHis> query(ArtArtworkHis obj) {
		return super.query(ArtArtworkHis.class, getCri(obj));
	}

   	public ArtArtworkHis get(String id) {
		return super.fetch(ArtArtworkHis.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(ArtArtworkHis.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(ArtArtworkHis obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getArtid())) {
			cri.where().andEquals("ARTID", obj.getArtid());
		}
		if(StringTool.isNotNull(obj.getBuyerid())) {
			cri.where().andEquals("BUYERID", obj.getBuyerid());
		}
		if(StringTool.isNotNull(obj.getOriginowner())) {
			cri.where().andEquals("ORIGINOWNER", obj.getOriginowner());
		}
		if(StringTool.isNotNull(obj.getBuytm())) {
			cri.where().andEquals("BUYTM", obj.getBuytm());
		}
		if(StringTool.isNotNull(obj.getCjprice())) {
			cri.where().andEquals("CJPRICE", obj.getCjprice());
		}
		return cri;
	}

}