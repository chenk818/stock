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

import com.art58.site.pojo.art.ArtTransboundaryRecord;

@Log4j
@IocBean
public class ArtTransboundaryRecordService extends BaseService {


	public PageResult<ArtTransboundaryRecord> queryPage(ArtTransboundaryRecord obj) {
		return super.queryPage(ArtTransboundaryRecord.class, obj, getCri(obj));
	}

	public List<ArtTransboundaryRecord> query(ArtTransboundaryRecord obj) {
		return super.query(ArtTransboundaryRecord.class, getCri(obj));
	}

   	public ArtTransboundaryRecord get(String id) {
		return super.fetch(ArtTransboundaryRecord.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(ArtTransboundaryRecord.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(ArtTransboundaryRecord obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getBoundaryid())) {
			cri.where().andEquals("BOUNDARYID", obj.getBoundaryid());
		}
		if(StringTool.isNotNull(obj.getApplicantid())) {
			cri.where().andEquals("APPLICANTID", obj.getApplicantid());
		}
		if(StringTool.isNotNull(obj.getTime())) {
			cri.where().andEquals("TIME", obj.getTime());
		}
		if(StringTool.isNotNull(obj.getState())) {
			cri.where().andEquals("STATE", obj.getState());
		}
		if(StringTool.isNotNull(obj.getRemark())) {
			cri.where().andEquals("REMARK", obj.getRemark());
		}
		return cri;
	}

}