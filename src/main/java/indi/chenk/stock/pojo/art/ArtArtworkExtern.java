package com.art58.site.pojo.art;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("art_artwork_extern")
public class ArtArtworkExtern extends BaseEntity {
		

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
	@Column("TRADEHIS")
	private String tradehis;
	/**
	 * 
	 */
	@Column("PRIORITY")
	private Integer priority;
	/**
	 * 
	 */
	@Column("ASTATE")
	private Integer astate;
	/**
	 * 
	 */
	@Column("relarticle")
	private String relarticle;
	/**
	 * 
	 */
	@Column("relpublish")
	private String relpublish;
	/**
	 * 
	 */
	@Column("relshow")
	private String relshow;
	/**
	 * 
	 */
	@Column("issaled")
	private Integer issaled;
	/**
	 * 
	 */
	@Column("KEYWORDS")
	private String keywords;
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
	 * 是否装裱
	 */
	@Column("ISMOUNT")
	private Integer ismount;
	/**
	 * 
	 */
	@Column("CENTERPICURL")
	private String centerpicurl;
}