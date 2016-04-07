package com.art58.site.pojo.art;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("art_auction_msg")
public class ArtAuctionMsg extends BaseEntity {
		

	/**
	 * 拍卖主题
	 */
	@Column("THEME")
	private String theme;
	/**
	 * 拍卖状态
	 */
	@Column("STATE")
	private Integer state;
	/**
	 * 拍卖开始时间
	 */
	@Column("STARTTM")
	private java.util.Date starttm;
	/**
	 * 拍卖结束时间
	 */
	@Column("ENDTM")
	private java.util.Date endtm;
	/**
	 * 图片地址
	 */
	@Column("PICURL")
	private String picurl;
	/**
	 * 
	 */
	@Column("CLICKTIME")
	private Long clicktime;
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
	@Column("ISHOT")
	private Integer ishot;
	/**
	 * 
	 */
	@Column("CENTERPICURL")
	private String centerpicurl;
	/**
	 * 流拍作品数
	 */
	@Column("UNSOLD_NUM")
	private Integer unsoldNum;
}