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

import com.art58.site.pojo.art.ArtArtworkRecord;

@Log4j
@IocBean
public class ArtArtworkRecordService extends BaseService {


	public PageResult<ArtArtworkRecord> queryPage(ArtArtworkRecord obj) {
		return super.queryPage(ArtArtworkRecord.class, obj, getCri(obj));
	}

	public List<ArtArtworkRecord> query(ArtArtworkRecord obj) {
		return super.query(ArtArtworkRecord.class, getCri(obj));
	}

   	public ArtArtworkRecord get(String id) {
		return super.fetch(ArtArtworkRecord.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(ArtArtworkRecord.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(ArtArtworkRecord obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getWorkid())) {
			cri.where().andEquals("WORKID", obj.getWorkid());
		}
		if(StringTool.isNotNull(obj.getUserid())) {
			cri.where().andEquals("USERID", obj.getUserid());
		}
		if(StringTool.isNotNull(obj.getState())) {
			cri.where().andEquals("STATE", obj.getState());
		}
		if(StringTool.isNotNull(obj.getWorktime())) {
			cri.where().andEquals("WORKTIME", obj.getWorktime());
		}
		if(StringTool.isNotNull(obj.getCrtTime())) {
			cri.where().andEquals("CRT_TIME", obj.getCrtTime());
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