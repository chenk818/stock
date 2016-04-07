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

import com.art58.site.pojo.art.ArtDream;

@Log4j
@IocBean
public class ArtDreamService extends BaseService {


	public PageResult<ArtDream> queryPage(ArtDream obj) {
		return super.queryPage(ArtDream.class, obj, getCri(obj));
	}

	public List<ArtDream> query(ArtDream obj) {
		return super.query(ArtDream.class, getCri(obj));
	}

   	public ArtDream get(String id) {
		return super.fetch(ArtDream.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(ArtDream.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(ArtDream obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getName())) {
			cri.where().andEquals("NAME", obj.getName());
		}
		if(StringTool.isNotNull(obj.getDescription())) {
			cri.where().andEquals("DESCRIPTION", obj.getDescription());
		}
		if(StringTool.isNotNull(obj.getDreamerid())) {
			cri.where().andEquals("DREAMERID", obj.getDreamerid());
		}
		if(StringTool.isNotNull(obj.getTime())) {
			cri.where().andEquals("TIME", obj.getTime());
		}
		if(StringTool.isNotNull(obj.getState())) {
			cri.where().andEquals("STATE", obj.getState());
		}
		if(StringTool.isNotNull(obj.getLighterid())) {
			cri.where().andEquals("LIGHTERID", obj.getLighterid());
		}
		if(StringTool.isNotNull(obj.getLighttm())) {
			cri.where().andEquals("LIGHTTM", obj.getLighttm());
		}
		if(StringTool.isNotNull(obj.getPicurl())) {
			cri.where().andEquals("PICURL", obj.getPicurl());
		}
		if(StringTool.isNotNull(obj.getRemark())) {
			cri.where().andEquals("REMARK", obj.getRemark());
		}
		if(StringTool.isNotNull(obj.getPhone())) {
			cri.where().andEquals("PHONE", obj.getPhone());
		}
		if(StringTool.isNotNull(obj.getMsg())) {
			cri.where().andEquals("MSG", obj.getMsg());
		}
		if(StringTool.isNotNull(obj.getUpcount())) {
			cri.where().andEquals("UPCOUNT", obj.getUpcount());
		}
		if(StringTool.isNotNull(obj.getDowncount())) {
			cri.where().andEquals("DOWNCOUNT", obj.getDowncount());
		}
		if(StringTool.isNotNull(obj.getIshot())) {
			cri.where().andEquals("ISHOT", obj.getIshot());
		}
		if(StringTool.isNotNull(obj.getCenterpicurl())) {
			cri.where().andEquals("CENTERPICURL", obj.getCenterpicurl());
		}
		return cri;
	}

}