package com.art58.site.pojo.art;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("art_auction_art")
public class ArtAuctionArt extends BaseEntity {
		

	/**
	 * 拍卖作品ID
	 */
	@Column("ARTID")
	private String artid;
	/**
	 * 拍卖专场ID
	 */
	@Column("AUCTIONID")
	private String auctionid;
	/**
	 * 起拍价
	 */
	@Column("BASEPRICE")
	private Double baseprice;
	/**
	 * 当前价格
	 */
	@Column("CURRENTPRICE")
	private Double currentprice;
	/**
	 * 成交价
	 */
	@Column("FINALPRICE")
	private Double finalprice;
	/**
	 * 加价幅度
	 */
	@Column("ADDPRICE")
	private Double addprice;
	/**
	 * 保证金
	 */
	@Column("BAIL")
	private Double bail;
	/**
	 * 成交时间
	 */
	@Column("DEALTM")
	private java.util.Date dealtm;
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
	@Column("REMARK")
	private String remark;
	/**
	 * 保留价
	 */
	@Column("valuePrice")
	private Double valuePrice;
	/**
	 * 佣金
	 */
	@Column("chargePrice")
	private Double chargePrice;
	/**
	 * 送拍机构
	 */
	@Column("auctionOrg")
	private String auctionOrg;
	/**
	 * 围观人数
	 */
	@Column("CLICKTIME")
	private Integer clicktime;
	/**
	 * 
	 */
	@Column("CENTERPICURL")
	private String centerpicurl;
	/**
	 * 拍卖结果

	 */
	@Column("RESULT")
	private Integer result;
	/**
	 * 流拍原因
	 */
	@Column("UNSOLD_REASON")
	private String unsoldReason;
	/**
	 * 买受人
	 */
	@Column("BUYER")
	private String buyer;
	/**
	 * 是否加入购物车
	 */
	@Column("ISCART")
	private Integer iscart;
	/**
	 * 是否延时
	 */
	@Column("ISDELAYED")
	private Integer isdelayed;
	/**
	 * 延时周期(单位:分钟)
	 */
	@Column("RELAYED_PERIOD")
	private Integer relayedPeriod;
	/**
	 * 延时结束时间
	 */
	@Column("RELAYED_END_TIME")
	private java.util.Date relayedEndTime;
}