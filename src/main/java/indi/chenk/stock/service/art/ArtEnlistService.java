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

import com.art58.site.pojo.art.ArtEnlist;

@Log4j
@IocBean
public class ArtEnlistService extends BaseService {


	public PageResult<ArtEnlist> queryPage(ArtEnlist obj) {
		return super.queryPage(ArtEnlist.class, obj, getCri(obj));
	}

	public List<ArtEnlist> query(ArtEnlist obj) {
		return super.query(ArtEnlist.class, getCri(obj));
	}

   	public ArtEnlist get(String id) {
		return super.fetch(ArtEnlist.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(ArtEnlist.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(ArtEnlist obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getShowid())) {
			cri.where().andEquals("SHOWID", obj.getShowid());
		}
		if(StringTool.isNotNull(obj.getArtistid())) {
			cri.where().andEquals("ARTISTID", obj.getArtistid());
		}
		if(StringTool.isNotNull(obj.getArtid())) {
			cri.where().andEquals("ARTID", obj.getArtid());
		}
		if(StringTool.isNotNull(obj.getArticleid())) {
			cri.where().andEquals("ARTICLEID", obj.getArticleid());
		}
		if(StringTool.isNotNull(obj.getState())) {
			cri.where().andEquals("STATE", obj.getState());
		}
		if(StringTool.isNotNull(obj.getTime())) {
			cri.where().andEquals("TIME", obj.getTime());
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
		if(StringTool.isNotNull(obj.getAttendvote())) {
			cri.where().andEquals("ATTENDVOTE", obj.getAttendvote());
		}
		return cri;
	}

}