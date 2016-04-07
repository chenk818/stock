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

import com.art58.site.pojo.art.ArtWorkroomRecord;

@Log4j
@IocBean
public class ArtWorkroomRecordService extends BaseService {


	public PageResult<ArtWorkroomRecord> queryPage(ArtWorkroomRecord obj) {
		return super.queryPage(ArtWorkroomRecord.class, obj, getCri(obj));
	}

	public List<ArtWorkroomRecord> query(ArtWorkroomRecord obj) {
		return super.query(ArtWorkroomRecord.class, getCri(obj));
	}

   	public ArtWorkroomRecord get(String id) {
		return super.fetch(ArtWorkroomRecord.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(ArtWorkroomRecord.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(ArtWorkroomRecord obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getRoomid())) {
			cri.where().andEquals("ROOMID", obj.getRoomid());
		}
		if(StringTool.isNotNull(obj.getUserid())) {
			cri.where().andEquals("USERID", obj.getUserid());
		}
		if(StringTool.isNotNull(obj.getState())) {
			cri.where().andEquals("STATE", obj.getState());
		}
		if(StringTool.isNotNull(obj.getCount())) {
			cri.where().andEquals("COUNT", obj.getCount());
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
		if(StringTool.isNotNull(obj.getContactPhone())) {
			cri.where().andEquals("CONTACT_PHONE", obj.getContactPhone());
		}
		return cri;
	}

}