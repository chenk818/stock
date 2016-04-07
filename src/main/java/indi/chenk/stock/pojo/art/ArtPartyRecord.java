package com.art58.site.pojo.art;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("art_party_record")
public class ArtPartyRecord extends BaseEntity {
		

	/**
	 * 项目ID
	 */
	@Column("PARTYID")
	private String partyid;
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