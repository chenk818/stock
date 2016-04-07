package com.art58.site.pojo.pay;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("pay_order_state")
public class PayOrderState extends BaseEntity {
		

	/**
	 * 
	 */
	@Column("order_id")
	private String orderId;
	/**
	 * 
	 */
	@Column("order_state")
	private String orderState;
	/**
	 * 
	 */
	@Column("remarks")
	private String remarks;
	/**
	 * 
	 */
	@Column("crt_time")
	private java.util.Date crtTime;
}