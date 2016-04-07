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

import com.art58.site.pojo.art.ArtCatalogbl;

@Log4j
@IocBean
public class ArtCatalogblService extends BaseService {


	public PageResult<ArtCatalogbl> queryPage(ArtCatalogbl obj) {
		return super.queryPage(ArtCatalogbl.class, obj, getCri(obj));
	}

	public List<ArtCatalogbl> query(ArtCatalogbl obj) {
		return super.query(ArtCatalogbl.class, getCri(obj));
	}

   	public ArtCatalogbl get(String id) {
		return super.fetch(ArtCatalogbl.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(ArtCatalogbl.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(ArtCatalogbl obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getArtid())) {
			cri.where().andEquals("ARTID", obj.getArtid());
		}
		if(StringTool.isNotNull(obj.getCatalogid())) {
			cri.where().andEquals("CATALOGID", obj.getCatalogid());
		}
		if(StringTool.isNotNull(obj.getRemark())) {
			cri.where().andEquals("REMARK", obj.getRemark());
		}
		if(StringTool.isNotNull(obj.getCrtTellerId())) {
			cri.where().andEquals("CRT_TELLER_ID", obj.getCrtTellerId());
		}
		if(StringTool.isNotNull(obj.getCrtTime())) {
			cri.where().andEquals("CRT_TIME", obj.getCrtTime());
		}
		if(StringTool.isNotNull(obj.getUpdTellerId())) {
			cri.where().andEquals("UPD_TELLER_ID", obj.getUpdTellerId());
		}
		if(StringTool.isNotNull(obj.getUpdTime())) {
			cri.where().andEquals("UPD_TIME", obj.getUpdTime());
		}
		return cri;
	}

}