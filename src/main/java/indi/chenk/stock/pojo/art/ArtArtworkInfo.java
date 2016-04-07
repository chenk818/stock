package com.art58.site.pojo.art;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("art_artwork_info")
public class ArtArtworkInfo extends BaseEntity {
		

	/**
	 * 标题
	 */
	@Column("TITLE")
	private String title;
	/**
	 * 简介
	 */
	@Column("INSTRUCTION")
	private String instruction;
	/**
	 * 职位描述
	 */
	@Column("DESCRIPTION")
	private String description;
	/**
	 * 类型
	 */
	@Column("TYPE")
	private Integer type;
	/**
	 * 状态
	 */
	@Column("STATE")
	private Integer state;
	/**
	 * 区域
	 */
	@Column("REGION")
	private String region;
	/**
	 * 地址
	 */
	@Column("LOCATION")
	private String location;
	/**
	 * 薪资待遇
	 */
	@Column("SALARY")
	private String salary;
	/**
	 * 学历
	 */
	@Column("EDUCATION")
	private Integer education;
	/**
	 * 职位
	 */
	@Column("JOBPOSITION")
	private String jobposition;
	/**
	 * 工作年限
	 */
	@Column("PHONE")
	private String phone;
	/**
	 * 福利待遇
	 */
	@Column("EMAIL")
	private String email;
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
	 * 
	 */
	@Column("ASSIGNTO")
	private String assignto;
	/**
	 * 
	 */
	@Column("PROVINCE")
	private String province;
	/**
	 * 
	 */
	@Column("CITY")
	private String city;
	/**
	 * 
	 */
	@Column("DISTRICT")
	private String district;
	/**
	 * 
	 */
	@Column("CENTERPICURL")
	private String centerpicurl;
}