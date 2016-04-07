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

import com.art58.site.pojo.art.ArtArtwork;

@Log4j
@IocBean
public class ArtArtworkService extends BaseService {


	public PageResult<ArtArtwork> queryPage(ArtArtwork obj) {
		return super.queryPage(ArtArtwork.class, obj, getCri(obj));
	}

	public List<ArtArtwork> query(ArtArtwork obj) {
		return super.query(ArtArtwork.class, getCri(obj));
	}

   	public ArtArtwork get(String id) {
		return super.fetch(ArtArtwork.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(ArtArtwork.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(ArtArtwork obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getNumber())) {
			cri.where().andEquals("NUMBER", obj.getNumber());
		}
		if(StringTool.isNotNull(obj.getName())) {
			cri.where().andEquals("NAME", obj.getName());
		}
		if(StringTool.isNotNull(obj.getAuthor())) {
			cri.where().andEquals("AUTHOR", obj.getAuthor());
		}
		if(StringTool.isNotNull(obj.getType())) {
			cri.where().andEquals("TYPE", obj.getType());
		}
		if(StringTool.isNotNull(obj.getSize())) {
			cri.where().andEquals("SIZE", obj.getSize());
		}
		if(StringTool.isNotNull(obj.getPrice())) {
			cri.where().andEquals("PRICE", obj.getPrice());
		}
		if(StringTool.isNotNull(obj.getMaterial())) {
			cri.where().andEquals("MATERIAL", obj.getMaterial());
		}
		if(StringTool.isNotNull(obj.getAge())) {
			cri.where().andEquals("AGE", obj.getAge());
		}
		if(StringTool.isNotNull(obj.getSign())) {
			cri.where().andEquals("SIGN", obj.getSign());
		}
		if(StringTool.isNotNull(obj.getCjprice())) {
			cri.where().andEquals("CJPRICE", obj.getCjprice());
		}
		if(StringTool.isNotNull(obj.getSalechannel())) {
			cri.where().andEquals("SALECHANNEL", obj.getSalechannel());
		}
		if(StringTool.isNotNull(obj.getGetpercent())) {
			cri.where().andEquals("GETPERCENT", obj.getGetpercent());
		}
		if(StringTool.isNotNull(obj.getIsmount())) {
			cri.where().andEquals("ISMOUNT", obj.getIsmount());
		}
		if(StringTool.isNotNull(obj.getAllowpic())) {
			cri.where().andEquals("ALLOWPIC", obj.getAllowpic());
		}
		if(StringTool.isNotNull(obj.getAllowderive())) {
			cri.where().andEquals("ALLOWDERIVE", obj.getAllowderive());
		}
		if(StringTool.isNotNull(obj.getPropertyid())) {
			cri.where().andEquals("PROPERTYID", obj.getPropertyid());
		}
		if(StringTool.isNotNull(obj.getPicurl())) {
			cri.where().andEquals("PICURL", obj.getPicurl());
		}
		if(StringTool.isNotNull(obj.getState())) {
			cri.where().andEquals("STATE", obj.getState());
		}
		if(StringTool.isNotNull(obj.getAstate())) {
			cri.where().andEquals("ASTATE", obj.getAstate());
		}
		if(StringTool.isNotNull(obj.getPlace())) {
			cri.where().andEquals("PLACE", obj.getPlace());
		}
		if(StringTool.isNotNull(obj.getShowable())) {
			cri.where().andEquals("SHOWABLE", obj.getShowable());
		}
		if(StringTool.isNotNull(obj.getPriority())) {
			cri.where().andEquals("PRIORITY", obj.getPriority());
		}
		if(StringTool.isNotNull(obj.getStock())) {
			cri.where().andEquals("STOCK", obj.getStock());
		}
		if(StringTool.isNotNull(obj.getCrtTellerId())) {
			cri.where().andEquals("CRT_TELLER_ID", obj.getCrtTellerId());
		}
		if(StringTool.isNotNull(obj.getCrtTime())) {
			cri.where().andEquals("CRT_TIME", obj.getCrtTime());
		}
		if(StringTool.isNotNull(obj.getKeywords())) {
			cri.where().andEquals("KEYWORDS", obj.getKeywords());
		}
		if(StringTool.isNotNull(obj.getDescription())) {
			cri.where().andEquals("DESCRIPTION", obj.getDescription());
		}
		if(StringTool.isNotNull(obj.getOripicurl())) {
			cri.where().andEquals("ORIPICURL", obj.getOripicurl());
		}
		if(StringTool.isNotNull(obj.getPicwidth())) {
			cri.where().andEquals("PICWIDTH", obj.getPicwidth());
		}
		if(StringTool.isNotNull(obj.getPicheight())) {
			cri.where().andEquals("PICHEIGHT", obj.getPicheight());
		}
		if(StringTool.isNotNull(obj.getRelarticle())) {
			cri.where().andEquals("relarticle", obj.getRelarticle());
		}
		if(StringTool.isNotNull(obj.getRelpublish())) {
			cri.where().andEquals("relpublish", obj.getRelpublish());
		}
		if(StringTool.isNotNull(obj.getRelshow())) {
			cri.where().andEquals("relshow", obj.getRelshow());
		}
		if(StringTool.isNotNull(obj.getIssaled())) {
			cri.where().andEquals("issaled", obj.getIssaled());
		}
		if(StringTool.isNotNull(obj.getCurrentstock())) {
			cri.where().andEquals("currentstock", obj.getCurrentstock());
		}
		if(StringTool.isNotNull(obj.getCenterpicurl())) {
			cri.where().andEquals("CENTERPICURL", obj.getCenterpicurl());
		}
		if(StringTool.isNotNull(obj.getDetailpicurl())) {
			cri.where().andEquals("DETAILPICURL", obj.getDetailpicurl());
		}
		return cri;
	}

}