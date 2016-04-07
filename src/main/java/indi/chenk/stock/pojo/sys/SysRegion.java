package com.art58.site.pojo.sys;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("sys_region")
public class SysRegion extends BaseEntity {
		

	/**
	 * 区域代码
	 */
	@Column("REGION_CODE")
	private String regionCode;
	/**
	 * 区域名
	 */
	@Column("REGION_NAME")
	private String regionName;
	/**
	 * 父ID
	 */
	@Column("PARENT_ID")
	private String parentId;
	/**
	 * 级别
	 */
	@Column("REGION_LEVEL")
	private Integer regionLevel;
	/**
	 * 顺序
	 */
	@Column("REGION_ORDER")
	private Integer regionOrder;
	/**
	 * 英文名称
	 */
	@Column("REGION_NAME_EN")
	private String regionNameEn;
	/**
	 * 英文简称
	 */
	@Column("REGION_SHORTNAME_EN")
	private String regionShortnameEn;
}