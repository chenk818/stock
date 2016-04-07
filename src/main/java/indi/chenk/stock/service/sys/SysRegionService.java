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

import com.art58.site.pojo.sys.SysRegion;

@Log4j
@IocBean
public class SysRegionService extends BaseService {


	public PageResult<SysRegion> queryPage(SysRegion obj) {
		return super.queryPage(SysRegion.class, obj, getCri(obj));
	}

	public List<SysRegion> query(SysRegion obj) {
		return super.query(SysRegion.class, getCri(obj));
	}

   	public SysRegion get(String id) {
		return super.fetch(SysRegion.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(SysRegion.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(SysRegion obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getRegionCode())) {
			cri.where().andEquals("REGION_CODE", obj.getRegionCode());
		}
		if(StringTool.isNotNull(obj.getRegionName())) {
			cri.where().andEquals("REGION_NAME", obj.getRegionName());
		}
		if(StringTool.isNotNull(obj.getParentId())) {
			cri.where().andEquals("PARENT_ID", obj.getParentId());
		}
		if(StringTool.isNotNull(obj.getRegionLevel())) {
			cri.where().andEquals("REGION_LEVEL", obj.getRegionLevel());
		}
		if(StringTool.isNotNull(obj.getRegionOrder())) {
			cri.where().andEquals("REGION_ORDER", obj.getRegionOrder());
		}
		if(StringTool.isNotNull(obj.getRegionNameEn())) {
			cri.where().andEquals("REGION_NAME_EN", obj.getRegionNameEn());
		}
		if(StringTool.isNotNull(obj.getRegionShortnameEn())) {
			cri.where().andEquals("REGION_SHORTNAME_EN", obj.getRegionShortnameEn());
		}
		return cri;
	}

}