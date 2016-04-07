package com.art58.site.pojo.pay;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("pay_dealhis")
public class PayDealhis extends BaseEntity {
		

	/**
	 * 交易流水号
	 */
	@Column("SERIALNO")
	private String serialno;
	/**
	 * 账户
	 */
	@Column("ACCOUNTNUM")
	private String accountnum;
	/**
	 * 交易类型
	 */
	@Column("TYPE")
	private Integer type;
	/**
	 * 付款方式
	 */
	@Column("PAYTYPE")
	private Integer paytype;
	/**
	 * 对方账户
	 */
	@Column("OACCOUNT")
	private String oaccount;
	/**
	 * 订单号
	 */
	@Column("ORDERNUM")
	private String ordernum;
	/**
	 * 交易金额
	 */
	@Column("MONEY")
	private Long money;
	/**
	 * 交易时间
	 */
	@Column("TIME")
	private java.util.Date time;
	/**
	 * 状态
	 */
	@Column("STATE")
	private Integer state;
}