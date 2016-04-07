package com.art58.site.pojo.art;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("art_keywords")
public class ArtKeywords extends BaseEntity {
		

	/**
	 * 
	 */
	@Column("KEYWORDS")
	private String keywords;
	/**
	 * 
	 */
	@Column("ISSHOW")
	private Integer isshow;
}