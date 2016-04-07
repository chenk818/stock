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

import com.art58.site.pojo.art.ArtArtworkInfo;

@Log4j
@IocBean
public class ArtArtworkInfoService extends BaseService {


	public PageResult<ArtArtworkInfo> queryPage(ArtArtworkInfo obj) {
		return super.queryPage(ArtArtworkInfo.class, obj, getCri(obj));
	}

	public List<ArtArtworkInfo> query(ArtArtworkInfo obj) {
		return super.query(ArtArtworkInfo.class, getCri(obj));
	}

   	public ArtArtworkInfo get(String id) {
		return super.fetch(ArtArtworkInfo.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(ArtArtworkInfo.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(ArtArtworkInfo obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getTitle())) {
			cri.where().andEquals("TITLE", obj.getTitle());
		}
		if(StringTool.isNotNull(obj.getInstruction())) {
			cri.where().andEquals("INSTRUCTION", obj.getInstruction());
		}
		if(StringTool.isNotNull(obj.getDescription())) {
			cri.where().andEquals("DESCRIPTION", obj.getDescription());
		}
		if(StringTool.isNotNull(obj.getType())) {
			cri.where().andEquals("TYPE", obj.getType());
		}
		if(StringTool.isNotNull(obj.getState())) {
			cri.where().andEquals("STATE", obj.getState());
		}
		if(StringTool.isNotNull(obj.getRegion())) {
			cri.where().andEquals("REGION", obj.getRegion());
		}
		if(StringTool.isNotNull(obj.getLocation())) {
			cri.where().andEquals("LOCATION", obj.getLocation());
		}
		if(StringTool.isNotNull(obj.getSalary())) {
			cri.where().andEquals("SALARY", obj.getSalary());
		}
		if(StringTool.isNotNull(obj.getEducation())) {
			cri.where().andEquals("EDUCATION", obj.getEducation());
		}
		if(StringTool.isNotNull(obj.getJobposition())) {
			cri.where().andEquals("JOBPOSITION", obj.getJobposition());
		}
		if(StringTool.isNotNull(obj.getPhone())) {
			cri.where().andEquals("PHONE", obj.getPhone());
		}
		if(StringTool.isNotNull(obj.getEmail())) {
			cri.where().andEquals("EMAIL", obj.getEmail());
		}
		if(StringTool.isNotNull(obj.getPicurl())) {
			cri.where().andEquals("PICURL", obj.getPicurl());
		}
		if(StringTool.isNotNull(obj.getCrtTellerId())) {
			cri.where().andEquals("CRT_TELLER_ID", obj.getCrtTellerId());
		}
		if(StringTool.isNotNull(obj.getCrtTime())) {
			cri.where().andEquals("CRT_TIME", obj.getCrtTime());
		}
		if(StringTool.isNotNull(obj.getAssignto())) {
			cri.where().andEquals("ASSIGNTO", obj.getAssignto());
		}
		if(StringTool.isNotNull(obj.getProvince())) {
			cri.where().andEquals("PROVINCE", obj.getProvince());
		}
		if(StringTool.isNotNull(obj.getCity())) {
			cri.where().andEquals("CITY", obj.getCity());
		}
		if(StringTool.isNotNull(obj.getDistrict())) {
			cri.where().andEquals("DISTRICT", obj.getDistrict());
		}
		if(StringTool.isNotNull(obj.getCenterpicurl())) {
			cri.where().andEquals("CENTERPICURL", obj.getCenterpicurl());
		}
		return cri;
	}

}