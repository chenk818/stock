package com.art58.site.pojo.art;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("art_transboundary_record")
public class ArtTransboundaryRecord extends BaseEntity {
		

	/**
	 * 项目ID
	 */
	@Column("BOUNDARYID")
	private String boundaryid;
	/**
	 * 报名人ID
	 */
	@Column("APPLICANTID")
	private String applicantid;
	/**
	 * 报名时间
	 */
	@Column("TIME")
	private java.util.Date time;
	/**
	 * 状态
	 */
	@Column("STATE")
	private Integer state;
	/**
	 * 备注
	 */
	@Column("REMARK")
	private String remark;
}