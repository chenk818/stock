package com.art58.site.pojo.art;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("art_workroom_record")
public class ArtWorkroomRecord extends BaseEntity {
		

	/**
	 * 工作室ID
	 */
	@Column("ROOMID")
	private String roomid;
	/**
	 * 用户ID
	 */
	@Column("USERID")
	private String userid;
	/**
	 * 状态
	 */
	@Column("STATE")
	private Integer state;
	/**
	 * 人数
	 */
	@Column("COUNT")
	private Double count;
	/**
	 * 创建时间
	 */
	@Column("CRT_TIME")
	private java.util.Date crtTime;
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
	@Column("CONTACT_PHONE")
	private String contactPhone;
}