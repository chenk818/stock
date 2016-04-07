package com.art58.site.pojo.art;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("art_activity_feedback")
public class ArtActivityFeedback extends BaseEntity {
		

	/**
	 * 
	 */
	@Column("RELATIVE_ID")
	private String relativeId;
	/**
	 * 
	 */
	@Column("TYPE")
	private Integer type;
	/**
	 * 
	 */
	@Column("CONTENT")
	private String content;
	/**
	 * 
	 */
	@Column("PICURL")
	private String picurl;
	/**
	 * 
	 */
	@Column("STATE")
	private Integer state;
	/**
	 * 
	 */
	@Column("APPROVETM")
	private java.util.Date approvetm;
	/**
	 * 
	 */
	@Column("APPROVEID")
	private String approveid;
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