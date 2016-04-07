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

import com.art58.site.pojo.art.ArtPubrecord;

@Log4j
@IocBean
public class ArtPubrecordService extends BaseService {


	public PageResult<ArtPubrecord> queryPage(ArtPubrecord obj) {
		return super.queryPage(ArtPubrecord.class, obj, getCri(obj));
	}

	public List<ArtPubrecord> query(ArtPubrecord obj) {
		return super.query(ArtPubrecord.class, getCri(obj));
	}

   	public ArtPubrecord get(String id) {
		return super.fetch(ArtPubrecord.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(ArtPubrecord.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(ArtPubrecord obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getPublishid())) {
			cri.where().andEquals("PUBLISHID", obj.getPublishid());
		}
		if(StringTool.isNotNull(obj.getAuthorid())) {
			cri.where().andEquals("AUTHORID", obj.getAuthorid());
		}
		if(StringTool.isNotNull(obj.getArtid())) {
			cri.where().andEquals("ARTID", obj.getArtid());
		}
		if(StringTool.isNotNull(obj.getEnlisttm())) {
			cri.where().andEquals("ENLISTTM", obj.getEnlisttm());
		}
		if(StringTool.isNotNull(obj.getState())) {
			cri.where().andEquals("STATE", obj.getState());
		}
		if(StringTool.isNotNull(obj.getApproveid())) {
			cri.where().andEquals("APPROVEID", obj.getApproveid());
		}
		if(StringTool.isNotNull(obj.getApprovetm())) {
			cri.where().andEquals("APPROVETM", obj.getApprovetm());
		}
		if(StringTool.isNotNull(obj.getRemark())) {
			cri.where().andEquals("REMARK", obj.getRemark());
		}
		return cri;
	}

}