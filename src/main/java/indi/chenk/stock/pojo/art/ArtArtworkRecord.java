package com.art58.site.pojo.art;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("art_artwork_record")
public class ArtArtworkRecord extends BaseEntity {
		

	/**
	 * 艺术工作ID
	 */
	@Column("WORKID")
	private String workid;
	/**
	 * 用户ID
	 */
	@Column("USERID")
	private String userid;
	/**
	 * 状态
	 */
	@Column("STATE")
	private Integer state;
	/**
	 * 工作年限
	 */
	@Column("WORKTIME")
	private Integer worktime;
	/**
	 * 创建时间
	 */
	@Column("CRT_TIME")
	private java.util.Date crtTime;
	/**
	 * 审批人ID
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