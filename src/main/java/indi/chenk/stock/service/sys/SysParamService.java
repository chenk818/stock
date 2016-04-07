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

import com.art58.site.pojo.sys.SysParam;

@Log4j
@IocBean
public class SysParamService extends BaseService {


	public PageResult<SysParam> queryPage(SysParam obj) {
		return super.queryPage(SysParam.class, obj, getCri(obj));
	}

	public List<SysParam> query(SysParam obj) {
		return super.query(SysParam.class, getCri(obj));
	}

   	public SysParam get(String id) {
		return super.fetch(SysParam.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(SysParam.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(SysParam obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getCode())) {
			cri.where().andEquals("CODE", obj.getCode());
		}
		if(StringTool.isNotNull(obj.getName())) {
			cri.where().andEquals("NAME", obj.getName());
		}
		if(StringTool.isNotNull(obj.getValue())) {
			cri.where().andEquals("VALUE", obj.getValue());
		}
		if(StringTool.isNotNull(obj.getRemark())) {
			cri.where().andEquals("REMARK", obj.getRemark());
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