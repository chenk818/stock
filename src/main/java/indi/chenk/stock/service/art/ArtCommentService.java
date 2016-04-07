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

import com.art58.site.pojo.art.ArtComment;

@Log4j
@IocBean
public class ArtCommentService extends BaseService {


	public PageResult<ArtComment> queryPage(ArtComment obj) {
		return super.queryPage(ArtComment.class, obj, getCri(obj));
	}

	public List<ArtComment> query(ArtComment obj) {
		return super.query(ArtComment.class, getCri(obj));
	}

   	public ArtComment get(String id) {
		return super.fetch(ArtComment.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(ArtComment.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(ArtComment obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getReviewer())) {
			cri.where().andEquals("REVIEWER", obj.getReviewer());
		}
		if(StringTool.isNotNull(obj.getTitle())) {
			cri.where().andEquals("TITLE", obj.getTitle());
		}
		if(StringTool.isNotNull(obj.getContent())) {
			cri.where().andEquals("CONTENT", obj.getContent());
		}
		if(StringTool.isNotNull(obj.getTime())) {
			cri.where().andEquals("TIME", obj.getTime());
		}
		if(StringTool.isNotNull(obj.getType())) {
			cri.where().andEquals("TYPE", obj.getType());
		}
		if(StringTool.isNotNull(obj.getCommentid())) {
			cri.where().andEquals("COMMENTID", obj.getCommentid());
		}
		if(StringTool.isNotNull(obj.getUpdTime())) {
			cri.where().andEquals("UPD_TIME", obj.getUpdTime());
		}
		if(StringTool.isNotNull(obj.getAccusation())) {
			cri.where().andEquals("ACCUSATION", obj.getAccusation());
		}
		if(StringTool.isNotNull(obj.getPid())) {
			cri.where().andEquals("pid", obj.getPid());
		}
		return cri;
	}

}