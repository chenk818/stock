package com.art58.site.pojo.pay;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("pay_address")
public class PayAddress extends BaseEntity {
		

	/**
	 * 收货人ID
	 */
	@Column("USERID")
	private String userid;
	/**
	 * 
	 */
	@Column("NAME")
	private String name;
	/**
	 * 区域ID
	 */
	@Column("REGIONID")
	private String regionid;
	/**
	 * 收货地址
	 */
	@Column("ADDRESS")
	private String address;
	/**
	 * 邮编
	 */
	@Column("POSTCODE")
	private String postcode;
	/**
	 * 手机
	 */
	@Column("PHONE")
	private String phone;
	/**
	 * 创建时间
	 */
	@Column("CRT_TIME")
	private java.util.Date crtTime;
}