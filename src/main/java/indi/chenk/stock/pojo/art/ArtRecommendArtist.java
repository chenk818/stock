package com.art58.site.pojo.art;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("art_recommend_artist")
public class ArtRecommendArtist extends BaseEntity {
		

	/**
	 * 艺术家ID
	 */
	@Column("USER_ID")
	private String userId;
	/**
	 * 图片URL
	 */
	@Column("PIC_URL")
	private String picUrl;
	/**
	 * 显示顺序
	 */
	@Column("SORT_NUM")
	private Integer sortNum;
	/**
	 * 修改粉丝数
	 */
	@Column("FANS")
	private Integer fans;
	/**
	 * 修改点赞数
	 */
	@Column("LIKES")
	private Integer likes;
	/**
	 * 艺术家首页链接
	 */
	@Column("LINK")
	private String link;
	/**
	 * 创建人ID
	 */
	@Column("CRT_TELLER_ID")
	private String crtTellerId;
	/**
	 * 创建时间
	 */
	@Column("CRT_TIME")
	private java.util.Date crtTime;
}