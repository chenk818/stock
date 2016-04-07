package com.art58.site.pojo.art;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("art_gift_record")
public class ArtGiftRecord extends BaseEntity {
		

	/**
	 * 
	 */
	@Column("GIVER")
	private String giver;
	/**
	 * 
	 */
	@Column("RECEIVER")
	private String receiver;
	/**
	 * 
	 */
	@Column("GIFTID")
	private String giftid;
	/**
	 * 
	 */
	@Column("TIME")
	private java.util.Date time;
	/**
	 * 
	 */
	@Column("CONTENT")
	private String content;
}