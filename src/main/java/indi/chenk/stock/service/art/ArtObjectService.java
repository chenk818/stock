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

import com.art58.site.pojo.art.ArtObject;

@Log4j
@IocBean
public class ArtObjectService extends BaseService {


	public PageResult<ArtObject> queryPage(ArtObject obj) {
		return super.queryPage(ArtObject.class, obj, getCri(obj));
	}

	public List<ArtObject> query(ArtObject obj) {
		return super.query(ArtObject.class, getCri(obj));
	}

   	public ArtObject get(String id) {
		return super.fetch(ArtObject.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(ArtObject.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(ArtObject obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getUserid())) {
			cri.where().andEquals("USERID", obj.getUserid());
		}
		if(StringTool.isNotNull(obj.getArtid())) {
			cri.where().andEquals("ARTID", obj.getArtid());
		}
		if(StringTool.isNotNull(obj.getCrtTime())) {
			cri.where().andEquals("CRT_TIME", obj.getCrtTime());
		}
		if(StringTool.isNotNull(obj.getRemark())) {
			cri.where().andEquals("REMARK", obj.getRemark());
		}
		return cri;
	}

}