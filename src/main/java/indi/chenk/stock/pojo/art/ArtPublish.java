package com.art58.site.pojo.art;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("art_publish")
public class ArtPublish extends BaseEntity {
		

	/**
	 * 名称
	 */
	@Column("NAME")
	private String name;
	/**
	 * 主题
	 */
	@Column("THEME")
	private String theme;
	/**
	 * 出版方
	 */
	@Column("CURATOR")
	private String curator;
	/**
	 * 类型
	 */
	@Column("TYPE")
	private Integer type;
	/**
	 * 简介
	 */
	@Column("DESCRIPTION")
	private String description;
	/**
	 * 状态
	 */
	@Column("STATE")
	private Integer state;
	/**
	 * 征稿开始时间
	 */
	@Column("STARTTM")
	private java.util.Date starttm;
	/**
	 * 征稿结束时间
	 */
	@Column("ENDTM")
	private java.util.Date endtm;
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
	 * 备注
	 */
	@Column("REMARK")
	private String remark;
	/**
	 * 
	 */
	@Column("PICWIDTH")
	private Integer picwidth;
	/**
	 * 
	 */
	@Column("PICHEIGHT")
	private Integer picheight;
	/**
	 * 修改报名作品数
	 */
	@Column("MODARTCOUNT")
	private String modartcount;
	/**
	 * 修改报名人数
	 */
	@Column("MODBMCOUNT")
	private String modbmcount;
	/**
	 * 
	 */
	@Column("CENTERPICURL")
	private String centerpicurl;
}