package com.art58.site.pojo.art;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("art_party")
public class ArtParty extends BaseEntity {
		

	/**
	 * 项目名
	 */
	@Column("NAME")
	private String name;
	/**
	 * 项目类型
	 */
	@Column("TYPE")
	private Integer type;
	/**
	 * 项目介绍
	 */
	@Column("DESCRIPTION")
	private String description;
	/**
	 * 开始时间
	 */
	@Column("STARTTM")
	private java.util.Date starttm;
	/**
	 * 结束时间
	 */
	@Column("ENDTM")
	private java.util.Date endtm;
	/**
	 * 最小人数
	 */
	@Column("MINCOUNT")
	private Integer mincount;
	/**
	 * 最大人数
	 */
	@Column("MAXCOUNT")
	private Integer maxcount;
	/**
	 * 费用
	 */
	@Column("COST")
	private Double cost;
	/**
	 * 图片地址
	 */
	@Column("PICURL")
	private String picurl;
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
	@Column("STATE")
	private Integer state;
	/**
	 * 
	 */
	@Column("ASSIGNTO")
	private String assignto;
	/**
	 * 
	 */
	@Column("ISHOT")
	private Integer ishot;
	/**
	 * 审核状态
	 */
	@Column("ASTATE")
	private Integer astate;
	/**
	 * 修改报名人数
	 */
	@Column("MODINCOUNT")
	private String modincount;
	/**
	 * 
	 */
	@Column("CENTERPICURL")
	private String centerpicurl;
}