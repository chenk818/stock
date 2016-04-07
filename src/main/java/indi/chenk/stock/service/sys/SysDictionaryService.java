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

import com.art58.site.pojo.sys.SysDictionary;

@Log4j
@IocBean
public class SysDictionaryService extends BaseService {


	public PageResult<SysDictionary> queryPage(SysDictionary obj) {
		return super.queryPage(SysDictionary.class, obj, getCri(obj));
	}

	public List<SysDictionary> query(SysDictionary obj) {
		return super.query(SysDictionary.class, getCri(obj));
	}

   	public SysDictionary get(String id) {
		return super.fetch(SysDictionary.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(SysDictionary.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(SysDictionary obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getParentId())) {
			cri.where().andEquals("PARENT_ID", obj.getParentId());
		}
		if(StringTool.isNotNull(obj.getDictCode())) {
			cri.where().andEquals("DICT_CODE", obj.getDictCode());
		}
		if(StringTool.isNotNull(obj.getCodeName())) {
			cri.where().andEquals("CODE_NAME", obj.getCodeName());
		}
		if(StringTool.isNotNull(obj.getCodeValue())) {
			cri.where().andEquals("CODE_VALUE", obj.getCodeValue());
		}
		if(StringTool.isNotNull(obj.getRemarks())) {
			cri.where().andEquals("REMARKS", obj.getRemarks());
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