package com.art58.site.pojo.art;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("art_pubrecord")
public class ArtPubrecord extends BaseEntity {
		

	/**
	 * 出版信息ID
	 */
	@Column("PUBLISHID")
	private String publishid;
	/**
	 * 作者ID
	 */
	@Column("AUTHORID")
	private String authorid;
	/**
	 * 作品ID
	 */
	@Column("ARTID")
	private String artid;
	/**
	 * 报名时间
	 */
	@Column("ENLISTTM")
	private java.util.Date enlisttm;
	/**
	 * 状态
	 */
	@Column("STATE")
	private Integer state;
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