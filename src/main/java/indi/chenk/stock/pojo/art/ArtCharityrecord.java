package com.art58.site.pojo.art;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("art_charityrecord")
public class ArtCharityrecord extends BaseEntity {
		

	/**
	 * 慈善ID
	 */
	@Column("CHARITYID")
	private String charityid;
	/**
	 * 捐赠者ID
	 */
	@Column("APPLICANTID")
	private String applicantid;
	/**
	 * 捐赠类型
	 */
	@Column("TYPE")
	private Integer type;
	/**
	 * 捐款额
	 */
	@Column("PRICE")
	private Long price;
	/**
	 * 捐物数量
	 */
	@Column("COUNT")
	private Integer count;
	/**
	 * 联系电话
	 */
	@Column("PHONE")
	private String phone;
	/**
	 * 捐赠时间
	 */
	@Column("TIME")
	private java.util.Date time;
	/**
	 * 备注
	 */
	@Column("REMARK")
	private String remark;
}