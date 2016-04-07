package com.art58.site.pojo.art;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("art_recommend")
public class ArtRecommend extends BaseEntity {
		

	/**
	 * 推荐人ID
	 */
	@Column("USERID")
	private String userid;
	/**
	 * 邀请码
	 */
	@Column("INVITATIONCODE")
	private String invitationcode;
	/**
	 * 
	 */
	@Column("TYPE")
	private Integer type;
	/**
	 * 状态
	 */
	@Column("STATUS")
	private Integer status;
	/**
	 * 创建时间
	 */
	@Column("CRT_TIME")
	private java.util.Date crtTime;
	/**
	 * 分发时间
	 */
	@Column("DIS_TIME")
	private java.util.Date disTime;
	/**
	 * 使用时间
	 */
	@Column("USE_TIME")
	private java.util.Date useTime;
	/**
	 * 备注
	 */
	@Column("REMARK")
	private String remark;
	/**
	 * 万能邀请码
	 */
	@Column("SUPERINVITE")
	private Integer superinvite;
}