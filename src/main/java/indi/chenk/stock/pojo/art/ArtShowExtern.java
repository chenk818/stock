package com.art58.site.pojo.art;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("art_show_extern")
public class ArtShowExtern extends BaseEntity {
		

	/**
	 * 展览名称
	 */
	@Column("NAME")
	private String name;
	/**
	 * 展览主题
	 */
	@Column("TITLE")
	private String title;
	/**
	 * 空间名称
	 */
	@Column("SPACENAME")
	private String spacename;
	/**
	 * 城市
	 */
	@Column("CITY")
	private String city;
	/**
	 * 国家
	 */
	@Column("COUNTRY")
	private String country;
	/**
	 * 展览简介
	 */
	@Column("DESCRIPTION")
	private String description;
	/**
	 * 展览形式
	 */
	@Column("FORM")
	private Integer form;
	/**
	 * 年代
	 */
	@Column("YEAR")
	private String year;
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
	 * 展览类型
	 */
	@Column("TYPE")
	private Integer type;
	/**
	 * 
	 */
	@Column("OTHERARTIST")
	private String otherartist;
}