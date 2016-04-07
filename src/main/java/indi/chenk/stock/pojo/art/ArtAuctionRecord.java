package com.art58.site.pojo.art;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("art_auction_record")
public class ArtAuctionRecord extends BaseEntity {
		

	/**
	 * 竞拍ID
	 */
	@Column("AUCTION_ID")
	private String auctionId;
	/**
	 * 拍卖作品ID
	 */
	@Column("AUCTIONARTID")
	private String auctionartid;
	/**
	 * 竞拍人ID
	 */
	@Column("BIDDERSID")
	private String biddersid;
	/**
	 * 出价
	 */
	@Column("PRICE")
	private Double price;
	/**
	 * 状态
	 */
	@Column("STATE")
	private Integer state;
	/**
	 * 创建时间
	 */
	@Column("TIME")
	private java.util.Date time;
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
	 * 备注
	 */
	@Column("REMARK")
	private String remark;
}