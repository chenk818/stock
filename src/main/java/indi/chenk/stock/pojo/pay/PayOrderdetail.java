package com.art58.site.pojo.pay;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("pay_orderdetail")
public class PayOrderdetail extends BaseEntity {
		

	/**
	 * 订单编号
	 */
	@Column("ORDERNUM")
	private String ordernum;
	/**
	 * 作品编号
	 */
	@Column("ARTNUM")
	private String artnum;
	/**
	 * 作品数量
	 */
	@Column("ARTCOUNT")
	private Integer artcount;
}