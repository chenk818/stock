package com.art58.site.pojo.sys;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("sys_param")
public class SysParam extends BaseEntity {
		

	/**
	 * 参数代码
	 */
	@Column("CODE")
	private String code;
	/**
	 * 参数名称
	 */
	@Column("NAME")
	private String name;
	/**
	 * 参数值
	 */
	@Column("VALUE")
	private String value;
	/**
	 * 备注
	 */
	@Column("REMARK")
	private String remark;
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
	 * 需改时间
	 */
	@Column("UPD_TIME")
	private java.util.Date updTime;
}