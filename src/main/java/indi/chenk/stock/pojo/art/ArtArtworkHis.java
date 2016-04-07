package com.art58.site.pojo.art;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("art_artwork_his")
public class ArtArtworkHis extends BaseEntity {
		

	/**
	 * 
	 */
	@Column("ARTID")
	private String artid;
	/**
	 * 
	 */
	@Column("BUYERID")
	private String buyerid;
	/**
	 * 
	 */
	@Column("ORIGINOWNER")
	private String originowner;
	/**
	 * 
	 */
	@Column("BUYTM")
	private java.util.Date buytm;
	/**
	 * 成交价格
	 */
	@Column("CJPRICE")
	private Long cjprice;
}