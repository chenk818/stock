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

import com.art58.site.pojo.art.ArtGiftRecord;

@Log4j
@IocBean
public class ArtGiftRecordService extends BaseService {


	public PageResult<ArtGiftRecord> queryPage(ArtGiftRecord obj) {
		return super.queryPage(ArtGiftRecord.class, obj, getCri(obj));
	}

	public List<ArtGiftRecord> query(ArtGiftRecord obj) {
		return super.query(ArtGiftRecord.class, getCri(obj));
	}

   	public ArtGiftRecord get(String id) {
		return super.fetch(ArtGiftRecord.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(ArtGiftRecord.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(ArtGiftRecord obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getGiver())) {
			cri.where().andEquals("GIVER", obj.getGiver());
		}
		if(StringTool.isNotNull(obj.getReceiver())) {
			cri.where().andEquals("RECEIVER", obj.getReceiver());
		}
		if(StringTool.isNotNull(obj.getGiftid())) {
			cri.where().andEquals("GIFTID", obj.getGiftid());
		}
		if(StringTool.isNotNull(obj.getTime())) {
			cri.where().andEquals("TIME", obj.getTime());
		}
		if(StringTool.isNotNull(obj.getContent())) {
			cri.where().andEquals("CONTENT", obj.getContent());
		}
		return cri;
	}

}