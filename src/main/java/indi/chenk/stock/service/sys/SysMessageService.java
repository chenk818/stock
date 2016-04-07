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

import com.art58.site.pojo.sys.SysMessage;

@Log4j
@IocBean
public class SysMessageService extends BaseService {


	public PageResult<SysMessage> queryPage(SysMessage obj) {
		return super.queryPage(SysMessage.class, obj, getCri(obj));
	}

	public List<SysMessage> query(SysMessage obj) {
		return super.query(SysMessage.class, getCri(obj));
	}

   	public SysMessage get(String id) {
		return super.fetch(SysMessage.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(SysMessage.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(SysMessage obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getContentid())) {
			cri.where().andEquals("CONTENTID", obj.getContentid());
		}
		if(StringTool.isNotNull(obj.getReceiverid())) {
			cri.where().andEquals("RECEIVERID", obj.getReceiverid());
		}
		if(StringTool.isNotNull(obj.getSenderid())) {
			cri.where().andEquals("SENDERID", obj.getSenderid());
		}
		if(StringTool.isNotNull(obj.getTime())) {
			cri.where().andEquals("TIME", obj.getTime());
		}
		if(StringTool.isNotNull(obj.getIsread())) {
			cri.where().andEquals("ISREAD", obj.getIsread());
		}
		return cri;
	}

}