package com.art58.site.pojo.sys;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("sys_log")
public class SysLog extends BaseEntity {
		

	/**
	 * 操作人
	 */
	@Column("OPR_ID")
	private String oprId;
	/**
	 * 操作内容
	 */
	@Column("OPR_CONT")
	private String oprCont;
	/**
	 * 操作模块
	 */
	@Column("MENU_ID")
	private String menuId;
	/**
	 * 操作时间
	 */
	@Column("OPR_TM")
	private java.util.Date oprTm;
	/**
	 * 操做结果
	 */
	@Column("OPR_RESULT")
	private Integer oprResult;
	/**
	 * 耗时（秒）
	 */
	@Column("TM_COUNT")
	private Integer tmCount;
	/**
	 * 操作IP地址
	 */
	@Column("OPR_IP")
	private String oprIp;
	/**
	 * 操作对象ID
	 */
	@Column("OPERAND_ID")
	private String operandId;
	/**
	 * 操作对象
	 */
	@Column("OPERAND")
	private String operand;
	/**
	 * 备注
	 */
	@Column("REMARK")
	private String remark;
	/**
	 * 创建人
	 */
	@Column("CRT_TELLER_ID")
	private String crtTellerId;
	/**
	 * 创建时间
	 */
	@Column("CRT_TIME")
	private java.util.Date crtTime;
	/**
	 * 修改人
	 */
	@Column("UPD_TELLER_ID")
	private String updTellerId;
	/**
	 * 修改时间
	 */
	@Column("UPD_TIME")
	private java.util.Date updTime;
}