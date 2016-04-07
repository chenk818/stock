package com.art58.site.service.sys;

import java.util.List;

import org.nutz.dao.Cnd;
import org.nutz.dao.util.cri.SimpleCriteria;
import org.nutz.ioc.loader.annotation.IocBean;

import com.art58.nutz.result.PageResult;
import com.art58.nutz.service.BaseService;
import com.art58.site.pojo.SampleBean;
import com.art58.tool.util.StringTool;

import lombok.extern.log4j.Log4j;

import com.art58.site.pojo.sys.SysResource;

@Log4j
@IocBean
public class SysResourceService extends BaseService {


	public PageResult<SysResource> queryPage(SysResource obj) {
		return super.queryPage(SysResource.class, obj, getCri(obj));
	}

	public List<SysResource> query(SysResource obj) {
		return super.query(SysResource.class, getCri(obj));
	}

   	public SysResource get(String id) {
		return super.fetch(SysResource.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(SysResource.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(SysResource obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getResName())) {
			cri.where().andEquals("RES_NAME", obj.getResName());
		}
		if(StringTool.isNotNull(obj.getIsHeadline())) {
			cri.where().andEquals("IS_HEADLINE", obj.getIsHeadline());
		}
		if(StringTool.isNotNull(obj.getImg())) {
			cri.where().andEquals("IMG", obj.getImg());
		}
		if(StringTool.isNotNull(obj.getView())) {
			cri.where().andEquals("VIEW", obj.getView());
		}
		if(StringTool.isNotNull(obj.getOptions())) {
			cri.where().andEquals("OPTIONS", obj.getOptions());
		}
		if(StringTool.isNotNull(obj.getParentId())) {
			cri.where().andEquals("PARENT_ID", obj.getParentId());
		}
		if(StringTool.isNotNull(obj.getCrtTellerId())) {
			cri.where().andEquals("CRT_TELLER_ID", obj.getCrtTellerId());
		}
		if(StringTool.isNotNull(obj.getCrtTime())) {
			cri.where().andEquals("CRT_TIME", obj.getCrtTime());
		}
		if(StringTool.isNotNull(obj.getUpdTellerId())) {
			cri.where().andEquals("UPD_TELLER_ID", obj.getUpdTellerId());
		}
		if(StringTool.isNotNull(obj.getUpdTime())) {
			cri.where().andEquals("UPD_TIME", obj.getUpdTime());
		}
		return cri;
	}

}