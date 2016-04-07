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

import com.art58.site.pojo.sys.SysUser;

@Log4j
@IocBean
public class SysUserService extends BaseService {


	public PageResult<SysUser> queryPage(SysUser obj) {
		return super.queryPage(SysUser.class, obj, getCri(obj));
	}

	public List<SysUser> query(SysUser obj) {
		return super.query(SysUser.class, getCri(obj));
	}

   	public SysUser get(String id) {
		return super.fetch(SysUser.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(SysUser.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(SysUser obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getLoginid())) {
			cri.where().andEquals("LOGINID", obj.getLoginid());
		}
		if(StringTool.isNotNull(obj.getUsername())) {
			cri.where().andEquals("USERNAME", obj.getUsername());
		}
		if(StringTool.isNotNull(obj.getPassword())) {
			cri.where().andEquals("PASSWORD", obj.getPassword());
		}
		if(StringTool.isNotNull(obj.getNickname())) {
			cri.where().andEquals("NICKNAME", obj.getNickname());
		}
		if(StringTool.isNotNull(obj.getName())) {
			cri.where().andEquals("NAME", obj.getName());
		}
		if(StringTool.isNotNull(obj.getEmail())) {
			cri.where().andEquals("EMAIL", obj.getEmail());
		}
		if(StringTool.isNotNull(obj.getMobilephone())) {
			cri.where().andEquals("MOBILEPHONE", obj.getMobilephone());
		}
		if(StringTool.isNotNull(obj.getSex())) {
			cri.where().andEquals("SEX", obj.getSex());
		}
		if(StringTool.isNotNull(obj.getHeadimg())) {
			cri.where().andEquals("HEADIMG", obj.getHeadimg());
		}
		if(StringTool.isNotNull(obj.getHomepageimg())) {
			cri.where().andEquals("HOMEPAGEIMG", obj.getHomepageimg());
		}
		if(StringTool.isNotNull(obj.getBirthplace())) {
			cri.where().andEquals("BIRTHPLACE", obj.getBirthplace());
		}
		if(StringTool.isNotNull(obj.getLiveplace())) {
			cri.where().andEquals("LIVEPLACE", obj.getLiveplace());
		}
		if(StringTool.isNotNull(obj.getBirthday())) {
			cri.where().andEquals("BIRTHDAY", obj.getBirthday());
		}
		if(StringTool.isNotNull(obj.getGraduateplace())) {
			cri.where().andEquals("GRADUATEPLACE", obj.getGraduateplace());
		}
		if(StringTool.isNotNull(obj.getAward())) {
			cri.where().andEquals("AWARD", obj.getAward());
		}
		if(StringTool.isNotNull(obj.getRole())) {
			cri.where().andEquals("ROLE", obj.getRole());
		}
		if(StringTool.isNotNull(obj.getPersonalurl())) {
			cri.where().andEquals("PERSONALURL", obj.getPersonalurl());
		}
		if(StringTool.isNotNull(obj.getRecommendid())) {
			cri.where().andEquals("RECOMMENDID", obj.getRecommendid());
		}
		if(StringTool.isNotNull(obj.getPriority())) {
			cri.where().andEquals("PRIORITY", obj.getPriority());
		}
		if(StringTool.isNotNull(obj.getRegisttime())) {
			cri.where().andEquals("REGISTTIME", obj.getRegisttime());
		}
		if(StringTool.isNotNull(obj.getEdittime())) {
			cri.where().andEquals("EDITTIME", obj.getEdittime());
		}
		if(StringTool.isNotNull(obj.getComment())) {
			cri.where().andEquals("COMMENT", obj.getComment());
		}
		if(StringTool.isNotNull(obj.getState())) {
			cri.where().andEquals("STATE", obj.getState());
		}
		if(StringTool.isNotNull(obj.getLastlogintm())) {
			cri.where().andEquals("LASTLOGINTM", obj.getLastlogintm());
		}
		if(StringTool.isNotNull(obj.getCenterpicurl())) {
			cri.where().andEquals("CENTERPICURL", obj.getCenterpicurl());
		}
		if(StringTool.isNotNull(obj.getLiveplacebak())) {
			cri.where().andEquals("liveplacebak", obj.getLiveplacebak());
		}
		if(StringTool.isNotNull(obj.getHeadpicurl())) {
			cri.where().andEquals("HEADPICURL", obj.getHeadpicurl());
		}
		return cri;
	}

}