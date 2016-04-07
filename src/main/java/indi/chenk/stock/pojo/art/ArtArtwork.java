package com.art58.site.pojo.art;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("art_artwork")
public class ArtArtwork extends BaseEntity {
		

	/**
	 * 作品编号
	 */
	@Column("NUMBER")
	private String number;
	/**
	 * 作品名称
	 */
	@Column("NAME")
	private String name;
	/**
	 * 作者
	 */
	@Column("AUTHOR")
	private String author;
	/**
	 * 类型
	 */
	@Column("TYPE")
	private Integer type;
	/**
	 * 尺寸
	 */
	@Column("SIZE")
	private String size;
	/**
	 * 价格
	 */
	@Column("PRICE")
	private Long price;
	/**
	 * 材料
	 */
	@Column("MATERIAL")
	private String material;
	/**
	 * 年代
	 */
	@Column("AGE")
	private String age;
	/**
	 * 签名
	 */
	@Column("SIGN")
	private String sign;
	/**
	 * 成交价格
	 */
	@Column("CJPRICE")
	private Long cjprice;
	/**
	 * 出售渠道
	 */
	@Column("SALECHANNEL")
	private String salechannel;
	/**
	 * 对方提成比例
	 */
	@Column("GETPERCENT")
	private Integer getpercent;
	/**
	 * 是否装裱
	 */
	@Column("ISMOUNT")
	private Integer ismount;
	/**
	 * 是否允许出版画
	 */
	@Column("ALLOWPIC")
	private Integer allowpic;
	/**
	 * 是否允许处衍生品
	 */
	@Column("ALLOWDERIVE")
	private Integer allowderive;
	/**
	 * 版本
	 */
	@Column("PROPERTYID")
	private String propertyid;
	/**
	 * 图片地址
	 */
	@Column("PICURL")
	private String picurl;
	/**
	 * 状态
	 */
	@Column("STATE")
	private Integer state;
	/**
	 * 审核状态(0为审核中,1为已通过)
	 */
	@Column("ASTATE")
	private Integer astate;
	/**
	 * 所在地
	 */
	@Column("PLACE")
	private String place;
	/**
	 * 是否可以展示
	 */
	@Column("SHOWABLE")
	private Integer showable;
	/**
	 * 优先级
	 */
	@Column("PRIORITY")
	private Integer priority;
	/**
	 * 库存
	 */
	@Column("STOCK")
	private Integer stock;
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
	 * 关键词
	 */
	@Column("KEYWORDS")
	private String keywords;
	/**
	 * 描述
	 */
	@Column("DESCRIPTION")
	private String description;
	/**
	 * 
	 */
	@Column("ORIPICURL")
	private String oripicurl;
	/**
	 * 
	 */
	@Column("PICWIDTH")
	private Integer picwidth;
	/**
	 * 
	 */
	@Column("PICHEIGHT")
	private Integer picheight;
	/**
	 * 相关文章
	 */
	@Column("relarticle")
	private String relarticle;
	/**
	 * 相关出版
	 */
	@Column("relpublish")
	private String relpublish;
	/**
	 * 参加过的展览
	 */
	@Column("relshow")
	private String relshow;
	/**
	 * 是否已售
	 */
	@Column("issaled")
	private Integer issaled;
	/**
	 * 
	 */
	@Column("currentstock")
	private Integer currentstock;
	/**
	 * 
	 */
	@Column("CENTERPICURL")
	private String centerpicurl;
	/**
	 * 
	 */
	@Column("DETAILPICURL")
	private String detailpicurl;
}