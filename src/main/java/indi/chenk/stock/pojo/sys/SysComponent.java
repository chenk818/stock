package com.art58.site.pojo.sys;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("sys_component")
public class SysComponent extends BaseEntity {
		

	/**
	 * 
	 */
	@Column("CONTENT")
	private String content;
	/**
	 * 
	 */
	@Column("TYPE")
	private Integer type;
	/**
	 * 
	 */
	@Column("XID")
	private String xid;
}