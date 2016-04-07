package com.art58.site.pojo.pay;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("pay_order")
public class PayOrder extends BaseEntity {
		

	/**
	 * 订单编号
	 */
	@Column("ORDERNUM")
	private String ordernum;
	/**
	 * 客户ID
	 */
	@Column("USERID")
	private String userid;
	/**
	 * 订单状态
	 */
	@Column("STATE")
	private Integer state;
	/**
	 * 付款方式
	 */
	@Column("PAYTYPE")
	private Integer paytype;
	/**
	 * 下单时间
	 */
	@Column("TIME")
	private java.util.Date time;
	/**
	 * 付款时间
	 */
	@Column("PAYTM")
	private java.util.Date paytm;
	/**
	 * 产品数量
	 */
	@Column("COUNT")
	private Integer count;
	/**
	 * 商品总额
	 */
	@Column("GOODSPRICE")
	private Long goodsprice;
	/**
	 * 运费
	 */
	@Column("TRANSEXPENSE")
	private Long transexpense;
	/**
	 * 58账户ID
	 */
	@Column("ACCOUNTID")
	private String accountid;
	/**
	 * 优惠总额
	 */
	@Column("TOTALDEALS")
	private Long totaldeals;
	/**
	 * 艺术币金额
	 */
	@Column("INTEGRATE")
	private Long integrate;
	/**
	 * 付款总额
	 */
	@Column("PAYPRICE")
	private Long payprice;
	/**
	 * 收货地址ID
	 */
	@Column("ADDRESSID")
	private String addressid;
	/**
	 * 备注
	 */
	@Column("REMARK")
	private String remark;
}