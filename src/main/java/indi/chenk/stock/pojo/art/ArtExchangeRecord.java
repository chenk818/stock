package com.art58.site.pojo.art;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("art_exchange_record")
public class ArtExchangeRecord extends BaseEntity {
		

	/**
	 * 置换ID
	 */
	@Column("EXCHANGEID")
	private String exchangeid;
	/**
	 * 置换人ID
	 */
	@Column("USERID")
	private String userid;
	/**
	 * 状态
	 */
	@Column("STATE")
	private Integer state;
	/**
	 * 置换物图片
	 */
	@Column("EXCHANGEURL")
	private String exchangeurl;
	/**
	 * 置换物描述
	 */
	@Column("DESCRIPTION")
	private String description;
	/**
	 * 创建时间
	 */
	@Column("CRT_TIME")
	private java.util.Date crtTime;
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
	/**
	 * 
	 */
	@Column("CENTERPICURL")
	private String centerpicurl;
}