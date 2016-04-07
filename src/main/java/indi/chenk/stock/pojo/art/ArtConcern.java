package com.art58.site.pojo.art;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("art_concern")
public class ArtConcern extends BaseEntity {
		

	/**
	 * 被关注者ID
	 */
	@Column("USERID")
	private String userid;
	/**
	 * 关注者ID
	 */
	@Column("CONCERNID")
	private String concernid;
	/**
	 * 关注时间
	 */
	@Column("CONCERNTIME")
	private java.util.Date concerntime;
}