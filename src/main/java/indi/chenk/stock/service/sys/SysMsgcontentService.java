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

import com.art58.site.pojo.sys.SysMsgcontent;

@Log4j
@IocBean
public class SysMsgcontentService extends BaseService {


	public PageResult<SysMsgcontent> queryPage(SysMsgcontent obj) {
		return super.queryPage(SysMsgcontent.class, obj, getCri(obj));
	}

	public List<SysMsgcontent> query(SysMsgcontent obj) {
		return super.query(SysMsgcontent.class, getCri(obj));
	}

   	public SysMsgcontent get(String id) {
		return super.fetch(SysMsgcontent.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(SysMsgcontent.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(SysMsgcontent obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getContent())) {
			cri.where().andEquals("CONTENT", obj.getContent());
		}
		return cri;
	}

}