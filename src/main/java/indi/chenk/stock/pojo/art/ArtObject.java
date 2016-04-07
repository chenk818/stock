package com.art58.site.pojo.art;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("art_object")
public class ArtObject extends BaseEntity {
		

	/**
	 * 用户ID
	 */
	@Column("USERID")
	private String userid;
	/**
	 * 作品ID
	 */
	@Column("ARTID")
	private String artid;
	/**
	 * 收藏时间
	 */
	@Column("CRT_TIME")
	private java.util.Date crtTime;
	/**
	 * 备注
	 */
	@Column("REMARK")
	private String remark;
}