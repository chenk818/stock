package com.art58.site.pojo.pay;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("pay_account")
public class PayAccount extends BaseEntity {
		

	/**
	 * 账号
	 */
	@Column("ACCOUNTNUM")
	private String accountnum;
	/**
	 * 所有者ID
	 */
	@Column("OWNERID")
	private String ownerid;
	/**
	 * 账户余额
	 */
	@Column("MONEY")
	private Long money;
	/**
	 * 艺术币
	 */
	@Column("INTEGRATE")
	private Long integrate;
	/**
	 * 账户状态
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
}