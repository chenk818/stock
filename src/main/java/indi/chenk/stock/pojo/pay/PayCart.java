package com.art58.site.pojo.pay;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("pay_cart")
public class PayCart extends BaseEntity {
		

	/**
	 * 
	 */
	@Column("USERID")
	private String userid;
	/**
	 * 
	 */
	@Column("GOODSID")
	private String goodsid;
	/**
	 * 
	 */
	@Column("GOODSNAME")
	private String goodsname;
	/**
	 * 
	 */
	@Column("PRICE")
	private Long price;
	/**
	 * 
	 */
	@Column("TIME")
	private java.util.Date time;
	/**
	 * 
	 */
	@Column("count")
	private Integer count;
	/**
	 * 
	 */
	@Column("type")
	private Integer type;
}