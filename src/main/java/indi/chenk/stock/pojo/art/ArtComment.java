package com.art58.site.pojo.art;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("art_comment")
public class ArtComment extends BaseEntity {
		

	/**
	 * 评论人ID
	 */
	@Column("REVIEWER")
	private String reviewer;
	/**
	 * 评论标题
	 */
	@Column("TITLE")
	private String title;
	/**
	 * 评论内容
	 */
	@Column("CONTENT")
	private String content;
	/**
	 * 评论时间
	 */
	@Column("TIME")
	private java.util.Date time;
	/**
	 * 评论类型
	 */
	@Column("TYPE")
	private Integer type;
	/**
	 * 关联ID
	 */
	@Column("COMMENTID")
	private String commentid;
	/**
	 * 修改时间
	 */
	@Column("UPD_TIME")
	private java.util.Date updTime;
	/**
	 * 
	 */
	@Column("ACCUSATION")
	private String accusation;
	/**
	 * 
	 */
	@Column("pid")
	private String pid;
}