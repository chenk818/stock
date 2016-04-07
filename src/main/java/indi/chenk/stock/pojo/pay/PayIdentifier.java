package com.art58.site.pojo.pay;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("pay_identifier")
public class PayIdentifier extends BaseEntity {
		

	/**
	 * 
	 */
	@Column("partner")
	private String partner;
	/**
	 * 
	 */
	@Column("key")
	private String key;
	/**
	 * 
	 */
	@Column("crt_time")
	private java.util.Date crtTime;
}