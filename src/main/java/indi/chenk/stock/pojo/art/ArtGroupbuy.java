package com.art58.site.pojo.art;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("art_groupbuy")
public class ArtGroupbuy extends BaseEntity {
		

	/**
	 * 团购名
	 */
	@Column("NAME")
	private String name;
	/**
	 * 原价
	 */
	@Column("ORGPRICE")
	private Long orgprice;
	/**
	 * 团购价
	 */
	@Column("PRICE")
	private Long price;
	/**
	 * 产品数量
	 */
	@Column("COUNT")
	private String count;
	/**
	 * 参团人数
	 */
	@Column("DEALCOUNT")
	private String dealcount;
	/**
	 * 限购数
	 */
	@Column("LIMITCOUNT")
	private String limitcount;
	/**
	 * 购买须知
	 */
	@Column("BUYREMARK")
	private String buyremark;
	/**
	 * 团购描述
	 */
	@Column("DESCRIPTION")
	private String description;
	/**
	 * 本单详情
	 */
	@Column("GOODSDETAIL")
	private String goodsdetail;
	/**
	 * 组织者
	 */
	@Column("CURATOR")
	private String curator;
	/**
	 * 团购状态
	 */
	@Column("STATE")
	private Integer state;
	/**
	 * 审核状态
	 */
	@Column("ASTATE")
	private Integer astate;
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
	 * 热点团购
	 */
	@Column("ISHOT")
	private Integer ishot;
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
	 * 
	 */
	@Column("CENTERPICURL")
	private String centerpicurl;
	/**
	 * 
	 */
	@Column("MODBMCOUNT")
	private String modbmcount;
	/**
	 * 
	 */
	@Column("SORT_NUM")
	private Integer sortNum;
}