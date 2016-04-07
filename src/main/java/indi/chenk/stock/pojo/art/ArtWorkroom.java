package com.art58.site.pojo.art;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("art_workroom")
public class ArtWorkroom extends BaseEntity {
		

	/**
	 * 
	 */
	@Column("TITLE")
	private String title;
	/**
	 * 简介
	 */
	@Column("INSTRUCTION")
	private String instruction;
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
	 * 房屋面积
	 */
	@Column("AREA")
	private Double area;
	/**
	 * 房屋概况
	 */
	@Column("DESCRIPTION")
	private String description;
	/**
	 * 价格
	 */
	@Column("PRICE")
	private Double price;
	/**
	 * 入住时间
	 */
	@Column("LIVETIME")
	private java.util.Date livetime;
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
	@Column("CHECKCOUNT")
	private Integer checkcount;
	/**
	 * 
	 */
	@Column("OPENTIME")
	private String opentime;
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