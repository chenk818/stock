package com.art58.site.pojo.sys;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("sys_thirdlogin")
public class SysThirdlogin extends BaseEntity {
		

	/**
	 * 第三方平台名称
	 */
	@Column("PLATFORM")
	private String platform;
	/**
	 * 身份识别ID
	 */
	@Column("OPENID")
	private String openid;
	/**
	 * 昵称
	 */
	@Column("SERIAL_NO")
	private String serialNo;
}