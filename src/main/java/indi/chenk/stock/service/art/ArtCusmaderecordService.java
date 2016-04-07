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

import com.art58.site.pojo.art.ArtCusmaderecord;

@Log4j
@IocBean
public class ArtCusmaderecordService extends BaseService {


	public PageResult<ArtCusmaderecord> queryPage(ArtCusmaderecord obj) {
		return super.queryPage(ArtCusmaderecord.class, obj, getCri(obj));
	}

	public List<ArtCusmaderecord> query(ArtCusmaderecord obj) {
		return super.query(ArtCusmaderecord.class, getCri(obj));
	}

   	public ArtCusmaderecord get(String id) {
		return super.fetch(ArtCusmaderecord.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(ArtCusmaderecord.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(ArtCusmaderecord obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getCusmadeid())) {
			cri.where().andEquals("CUSMADEID", obj.getCusmadeid());
		}
		if(StringTool.isNotNull(obj.getBiddersid())) {
			cri.where().andEquals("BIDDERSID", obj.getBiddersid());
		}
		if(StringTool.isNotNull(obj.getTime())) {
			cri.where().andEquals("TIME", obj.getTime());
		}
		if(StringTool.isNotNull(obj.getBidprice())) {
			cri.where().andEquals("BIDPRICE", obj.getBidprice());
		}
		if(StringTool.isNotNull(obj.getState())) {
			cri.where().andEquals("STATE", obj.getState());
		}
		if(StringTool.isNotNull(obj.getStime())) {
			cri.where().andEquals("STIME", obj.getStime());
		}
		if(StringTool.isNotNull(obj.getRemark())) {
			cri.where().andEquals("REMARK", obj.getRemark());
		}
		if(StringTool.isNotNull(obj.getAnonymous())) {
			cri.where().andEquals("ANONYMOUS", obj.getAnonymous());
		}
		return cri;
	}

}