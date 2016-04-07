package com.art58.site.pojo.art;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("art_custommade")
public class ArtCustommade extends BaseEntity {
		

	/**
	 * 名称
	 */
	@Column("NAME")
	private String name;
	/**
	 * 定制描述
	 */
	@Column("DESCRIPTION")
	private String description;
	/**
	 * 类型
	 */
	@Column("TYPE")
	private Integer type;
	/**
	 * 竞标类型
	 */
	@Column("COMPTYPE")
	private Integer comptype;
	/**
	 * 定价
	 */
	@Column("PRICE")
	private Double price;
	/**
	 * 状态
	 */
	@Column("STATE")
	private Integer state;
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
	 * 结束时间
	 */
	@Column("END_TIME")
	private java.util.Date endTime;
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
	@Column("ISRECOMMENDED")
	private Integer isrecommended;
	/**
	 * 
	 */
	@Column("ASSIGNTO")
	private String assignto;
	/**
	 * 
	 */
	@Column("CENTERPICURL")
	private String centerpicurl;
}