package com.art58.site.pojo.art;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("art_show")
public class ArtShow extends BaseEntity {
		

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
	 * 策展人ID
	 */
	@Column("CURATOR")
	private String curator;
	/**
	 * 推荐语
	 */
	@Column("RECOMMEND")
	private String recommend;
	/**
	 * 状态
	 */
	@Column("STATE")
	private Integer state;
	/**
	 * 展览类型
	 */
	@Column("TYPE")
	private Integer type;
	/**
	 * 展览形式
	 */
	@Column("FORM")
	private Integer form;
	/**
	 * 
	 */
	@Column("STARTTM")
	private java.util.Date starttm;
	/**
	 * 展览结束时间
	 */
	@Column("ENDTM")
	private java.util.Date endtm;
	/**
	 * 报名截止时间
	 */
	@Column("SIGNENDTM")
	private java.util.Date signendtm;
	/**
	 * 系列编号
	 */
	@Column("SERIALNO")
	private String serialno;
	/**
	 * 策展人文章ID
	 */
	@Column("ARTICLEID")
	private String articleid;
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
	 * 展览地点
	 */
	@Column("showlocale")
	private String showlocale;
	/**
	 * 报名作品限制数量
	 */
	@Column("LIMITCOUNT")
	private String limitcount;
	/**
	 * 投票开始时间
	 */
	@Column("VOTESTIME")
	private java.util.Date votestime;
	/**
	 * 投票标志
	 */
	@Column("CANVOTE")
	private Integer canvote;
	/**
	 * 艺术品投票标志
	 */
	@Column("ARTCANVOTE")
	private Integer artcanvote;
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
	/**
	 * 
	 */
	@Column("SORT_NUM")
	private Integer sortNum;
}