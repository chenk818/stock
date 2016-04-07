package com.art58.site.pojo.art;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("art_plan_record")
public class ArtPlanRecord extends BaseEntity {
		

	/**
	 * 研修计划ID
	 */
	@Column("PLANID")
	private String planid;
	/**
	 * 报名人ID
	 */
	@Column("APPLICANTID")
	private String applicantid;
	/**
	 * 报名时间
	 */
	@Column("TIME")
	private java.util.Date time;
	/**
	 * 状态
	 */
	@Column("STATE")
	private Integer state;
	/**
	 * 审批人
	 */
	@Column("APPROVEID")
	private String approveid;
	/**
	 * 审批时间
	 */
	@Column("APPROVETM")
	private java.util.Date approvetm;
	/**
	 * 备注
	 */
	@Column("REMARK")
	private String remark;
	/**
	 * 
	 */
	@Column("ORDERNO")
	private String orderno;
}