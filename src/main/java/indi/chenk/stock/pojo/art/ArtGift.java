package com.art58.site.pojo.art;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("art_gift")
public class ArtGift extends BaseEntity {
		

	/**
	 * 
	 */
	@Column("NAME")
	private String name;
	/**
	 * 
	 */
	@Column("TYPE")
	private String type;
	/**
	 * 
	 */
	@Column("PICURL")
	private String picurl;
	/**
	 * 
	 */
	@Column("PRICE")
	private Long price;
	/**
	 * 
	 */
	@Column("STATE")
	private Integer state;
	/**
	 * 
	 */
	@Column("DESCRIPTION")
	private String description;
	/**
	 * 
	 */
	@Column("CRT_TELLER_ID")
	private String crtTellerId;
	/**
	 * 
	 */
	@Column("CRT_TIME")
	private java.util.Date crtTime;
	/**
	 * 
	 */
	@Column("CENTERPICURL")
	private String centerpicurl;
}