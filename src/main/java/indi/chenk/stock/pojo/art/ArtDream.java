package com.art58.site.pojo.art;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("art_dream")
public class ArtDream extends BaseEntity {
		

	/**
	 * 名称
	 */
	@Column("NAME")
	private String name;
	/**
	 * 简介
	 */
	@Column("DESCRIPTION")
	private String description;
	/**
	 * 梦想者ID
	 */
	@Column("DREAMERID")
	private String dreamerid;
	/**
	 * 发布时间
	 */
	@Column("TIME")
	private java.util.Date time;
	/**
	 * 状态
	 */
	@Column("STATE")
	private Integer state;
	/**
	 * 点亮者ID
	 */
	@Column("LIGHTERID")
	private String lighterid;
	/**
	 * 点亮时间
	 */
	@Column("LIGHTTM")
	private java.util.Date lighttm;
	/**
	 * 图片地址
	 */
	@Column("PICURL")
	private String picurl;
	/**
	 * 备注
	 */
	@Column("REMARK")
	private String remark;
	/**
	 * 
	 */
	@Column("PHONE")
	private String phone;
	/**
	 * 
	 */
	@Column("MSG")
	private String msg;
	/**
	 * 
	 */
	@Column("UPCOUNT")
	private Integer upcount;
	/**
	 * 
	 */
	@Column("DOWNCOUNT")
	private Integer downcount;
	/**
	 * 
	 */
	@Column("ISHOT")
	private Integer ishot;
	/**
	 * 
	 */
	@Column("CENTERPICURL")
	private String centerpicurl;
}