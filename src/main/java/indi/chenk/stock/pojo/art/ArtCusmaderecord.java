package com.art58.site.pojo.art;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("art_cusmaderecord")
public class ArtCusmaderecord extends BaseEntity {
		

	/**
	 * 定制ID
	 */
	@Column("CUSMADEID")
	private String cusmadeid;
	/**
	 * 竞标者ID
	 */
	@Column("BIDDERSID")
	private String biddersid;
	/**
	 * 竞标时间
	 */
	@Column("TIME")
	private java.util.Date time;
	/**
	 * 竞标价
	 */
	@Column("BIDPRICE")
	private Double bidprice;
	/**
	 * 状态
	 */
	@Column("STATE")
	private Integer state;
	/**
	 * 中标时间
	 */
	@Column("STIME")
	private java.util.Date stime;
	/**
	 * 备注
	 */
	@Column("REMARK")
	private String remark;
	/**
	 * 
	 */
	@Column("ANONYMOUS")
	private Integer anonymous;
}