package com.art58.site.pojo.sys;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("sys_admin")
public class SysAdmin extends BaseEntity {
		

	/**
	 * 账号
	 */
	@Column("USERNAME")
	private String username;
	/**
	 * 密码
	 */
	@Column("PASSWORD")
	private String password;
	/**
	 * 状态
	 */
	@Column("STATE")
	private Integer state;
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