package com.art58.site.pojo.art;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("art_charity")
public class ArtCharity extends BaseEntity {
		

	/**
	 * 艺术慈善名称
	 */
	@Column("NAME")
	private String name;
	/**
	 * 项目详情
	 */
	@Column("DESCRIPTION")
	private String description;
	/**
	 * 发起人
	 */
	@Column("CURATOR")
	private String curator;
	/**
	 * 发起人简介
	 */
	@Column("CURATORDESC")
	private String curatordesc;
	/**
	 * 状态
	 */
	@Column("STATE")
	private Integer state;
	/**
	 * 审核状态
	 */
	@Column("ASTATE")
	private Integer astate;
	/**
	 * 热点慈善
	 */
	@Column("ISHOT")
	private Integer ishot;
	/**
	 * 图片地址
	 */
	@Column("PICURL")
	private String picurl;
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
	 * 
	 */
	@Column("CENTERPICURL")
	private String centerpicurl;
}