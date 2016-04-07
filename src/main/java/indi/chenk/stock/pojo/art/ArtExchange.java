package com.art58.site.pojo.art;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("art_exchange")
public class ArtExchange extends BaseEntity {
		

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
	 * 预估价值
	 */
	@Column("EVALUATEPRICE")
	private Double evaluateprice;
	/**
	 * 原物图片
	 */
	@Column("ORIGINURL")
	private String originurl;
	/**
	 * 置换物图片
	 */
	@Column("EXCHANGEURL")
	private String exchangeurl;
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
	@Column("TYPE")
	private Integer type;
	/**
	 * 
	 */
	@Column("ASSIGNTO")
	private String assignto;
	/**
	 * 
	 */
	@Column("OCPICURL")
	private String ocpicurl;
	/**
	 * 
	 */
	@Column("EXPICURL")
	private String expicurl;
	/**
	 * 
	 */
	@Column("EXNUMBER")
	private Integer exnumber;
}