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

import com.art58.site.pojo.art.ArtCharityrecord;

@Log4j
@IocBean
public class ArtCharityrecordService extends BaseService {


	public PageResult<ArtCharityrecord> queryPage(ArtCharityrecord obj) {
		return super.queryPage(ArtCharityrecord.class, obj, getCri(obj));
	}

	public List<ArtCharityrecord> query(ArtCharityrecord obj) {
		return super.query(ArtCharityrecord.class, getCri(obj));
	}

   	public ArtCharityrecord get(String id) {
		return super.fetch(ArtCharityrecord.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(ArtCharityrecord.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(ArtCharityrecord obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getCharityid())) {
			cri.where().andEquals("CHARITYID", obj.getCharityid());
		}
		if(StringTool.isNotNull(obj.getApplicantid())) {
			cri.where().andEquals("APPLICANTID", obj.getApplicantid());
		}
		if(StringTool.isNotNull(obj.getType())) {
			cri.where().andEquals("TYPE", obj.getType());
		}
		if(StringTool.isNotNull(obj.getPrice())) {
			cri.where().andEquals("PRICE", obj.getPrice());
		}
		if(StringTool.isNotNull(obj.getCount())) {
			cri.where().andEquals("COUNT", obj.getCount());
		}
		if(StringTool.isNotNull(obj.getPhone())) {
			cri.where().andEquals("PHONE", obj.getPhone());
		}
		if(StringTool.isNotNull(obj.getTime())) {
			cri.where().andEquals("TIME", obj.getTime());
		}
		if(StringTool.isNotNull(obj.getRemark())) {
			cri.where().andEquals("REMARK", obj.getRemark());
		}
		return cri;
	}

}