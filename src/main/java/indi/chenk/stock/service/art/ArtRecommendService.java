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

import com.art58.site.pojo.art.ArtRecommend;

@Log4j
@IocBean
public class ArtRecommendService extends BaseService {


	public PageResult<ArtRecommend> queryPage(ArtRecommend obj) {
		return super.queryPage(ArtRecommend.class, obj, getCri(obj));
	}

	public List<ArtRecommend> query(ArtRecommend obj) {
		return super.query(ArtRecommend.class, getCri(obj));
	}

   	public ArtRecommend get(String id) {
		return super.fetch(ArtRecommend.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(ArtRecommend.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(ArtRecommend obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getUserid())) {
			cri.where().andEquals("USERID", obj.getUserid());
		}
		if(StringTool.isNotNull(obj.getInvitationcode())) {
			cri.where().andEquals("INVITATIONCODE", obj.getInvitationcode());
		}
		if(StringTool.isNotNull(obj.getType())) {
			cri.where().andEquals("TYPE", obj.getType());
		}
		if(StringTool.isNotNull(obj.getStatus())) {
			cri.where().andEquals("STATUS", obj.getStatus());
		}
		if(StringTool.isNotNull(obj.getCrtTime())) {
			cri.where().andEquals("CRT_TIME", obj.getCrtTime());
		}
		if(StringTool.isNotNull(obj.getDisTime())) {
			cri.where().andEquals("DIS_TIME", obj.getDisTime());
		}
		if(StringTool.isNotNull(obj.getUseTime())) {
			cri.where().andEquals("USE_TIME", obj.getUseTime());
		}
		if(StringTool.isNotNull(obj.getRemark())) {
			cri.where().andEquals("REMARK", obj.getRemark());
		}
		if(StringTool.isNotNull(obj.getSuperinvite())) {
			cri.where().andEquals("SUPERINVITE", obj.getSuperinvite());
		}
		return cri;
	}

}