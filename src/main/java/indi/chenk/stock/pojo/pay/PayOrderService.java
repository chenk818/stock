package com.art58.site.pojo.pay;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("pay_order_service")
public class PayOrderService extends BaseEntity {
		

	/**
	 * 
	 */
	@Column("order_no")
	private String orderNo;
	/**
	 * 
	 */
	@Column("callback_url")
	private String callbackUrl;
	/**
	 * 
	 */
	@Column("subject")
	private String subject;
	/**
	 * 
	 */
	@Column("total_fee")
	private String totalFee;
	/**
	 * 
	 */
	@Column("timeout")
	private String timeout;
	/**
	 * 
	 */
	@Column("order_state")
	private String orderState;
	/**
	 * 
	 */
	@Column("order_des")
	private String orderDes;
	/**
	 * 
	 */
	@Column("partner")
	private String partner;
	/**
	 * 
	 */
	@Column("trade_no")
	private String tradeNo;
	/**
	 * 
	 */
	@Column("pay_way")
	private String payWay;
	/**
	 * 
	 */
	@Column("crt_time")
	private java.util.Date crtTime;
}