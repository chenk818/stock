package com.art58.site.pojo.sys;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("sys_resource")
public class SysResource extends BaseEntity {
		

	/**
	 * 资源名称
	 */
	@Column("RES_NAME")
	private String resName;
	/**
	 * 是否新闻模块
	 */
	@Column("IS_HEADLINE")
	private Integer isHeadline;
	/**
	 * 
	 */
	@Column("IMG")
	private String img;
	/**
	 * 
	 */
	@Column("VIEW")
	private String view;
	/**
	 * 
	 */
	@Column("OPTIONS")
	private String options;
	/**
	 * 
	 */
	@Column("PARENT_ID")
	private String parentId;
	/**
	 * 创建人
	 */
	@Column("CRT_TELLER_ID")
	private String crtTellerId;
	/**
	 * 创建时间
	 */
	@Column("CRT_TIME")
	private java.util.Date crtTime;
	/**
	 * 修改人
	 */
	@Column("UPD_TELLER_ID")
	private String updTellerId;
	/**
	 * 修改时间
	 */
	@Column("UPD_TIME")
	private java.util.Date updTime;
}