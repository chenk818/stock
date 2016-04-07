package com.art58.site.pojo.art;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("art_transboundary")
public class ArtTransboundary extends BaseEntity {
		

	/**
	 * 跨界活动名称
	 */
	@Column("NAME")
	private String name;
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
	 * 跨界简介
	 */
	@Column("DESCRIPTION")
	private String description;
	/**
	 * 策展人ID
	 */
	@Column("CURATOR")
	private String curator;
	/**
	 * 状态
	 */
	@Column("STATE")
	private Integer state;
	/**
	 * 跨界类型
	 */
	@Column("TYPE")
	private String type;
	/**
	 * 跨界活动开始时间
	 */
	@Column("STARTTM")
	private java.util.Date starttm;
	/**
	 * 跨界活动结束时间
	 */
	@Column("ENDTM")
	private java.util.Date endtm;
	/**
	 * 报名截止时间
	 */
	@Column("SIGNENDTM")
	private java.util.Date signendtm;
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
	 * 审批人
	 */
	@Column("APPROVETM")
	private java.util.Date approvetm;
	/**
	 * 审批时间
	 */
	@Column("APPROVEID")
	private String approveid;
	/**
	 * 跨界活动地点
	 */
	@Column("showlocale")
	private String showlocale;
	/**
	 * 
	 */
	@Column("CURATORDESC")
	private String curatordesc;
	/**
	 * 
	 */
	@Column("ASTATE")
	private Integer astate;
	/**
	 * 
	 */
	@Column("ISHOT")
	private Integer ishot;
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