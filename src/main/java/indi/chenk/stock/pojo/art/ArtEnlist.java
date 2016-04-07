package com.art58.site.pojo.art;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("art_enlist")
public class ArtEnlist extends BaseEntity {
		

	/**
	 * 展览ID
	 */
	@Column("SHOWID")
	private String showid;
	/**
	 * 报名艺术家ID
	 */
	@Column("ARTISTID")
	private String artistid;
	/**
	 * 报名作品ID
	 */
	@Column("ARTID")
	private String artid;
	/**
	 * 介绍文章ID
	 */
	@Column("ARTICLEID")
	private String articleid;
	/**
	 * 状态
	 */
	@Column("STATE")
	private Integer state;
	/**
	 * 报名时间
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
	/**
	 * 
	 */
	@Column("ATTENDVOTE")
	private Integer attendvote;
}