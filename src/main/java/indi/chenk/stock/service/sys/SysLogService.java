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

import com.art58.site.pojo.sys.SysLog;

@Log4j
@IocBean
public class SysLogService extends BaseService {


	public PageResult<SysLog> queryPage(SysLog obj) {
		return super.queryPage(SysLog.class, obj, getCri(obj));
	}

	public List<SysLog> query(SysLog obj) {
		return super.query(SysLog.class, getCri(obj));
	}

   	public SysLog get(String id) {
		return super.fetch(SysLog.class, id);
	}

	public int delete(String ids) {
		if(StringTool.isNotNull(ids)) {
			SimpleCriteria cri = Cnd.cri();
			cri.where().andIn("id", ids.split(","));
			return super.delete(SysLog.class, cri);
		}
		return 0;
	}

	

	private SimpleCriteria getCri(SysLog obj) {
		SimpleCriteria cri = Cnd.cri();

		if(StringTool.isNotNull(obj.getOprId())) {
			cri.where().andEquals("OPR_ID", obj.getOprId());
		}
		if(StringTool.isNotNull(obj.getOprCont())) {
			cri.where().andEquals("OPR_CONT", obj.getOprCont());
		}
		if(StringTool.isNotNull(obj.getMenuId())) {
			cri.where().andEquals("MENU_ID", obj.getMenuId());
		}
		if(StringTool.isNotNull(obj.getOprTm())) {
			cri.where().andEquals("OPR_TM", obj.getOprTm());
		}
		if(StringTool.isNotNull(obj.getOprResult())) {
			cri.where().andEquals("OPR_RESULT", obj.getOprResult());
		}
		if(StringTool.isNotNull(obj.getTmCount())) {
			cri.where().andEquals("TM_COUNT", obj.getTmCount());
		}
		if(StringTool.isNotNull(obj.getOprIp())) {
			cri.where().andEquals("OPR_IP", obj.getOprIp());
		}
		if(StringTool.isNotNull(obj.getOperandId())) {
			cri.where().andEquals("OPERAND_ID", obj.getOperandId());
		}
		if(StringTool.isNotNull(obj.getOperand())) {
			cri.where().andEquals("OPERAND", obj.getOperand());
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