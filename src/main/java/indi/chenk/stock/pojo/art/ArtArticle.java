package com.art58.site.pojo.art;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("art_article")
public class ArtArticle extends BaseEntity {
		

	/**
	 * 标题
	 */
	@Column("TITLE")
	private String title;
	/**
	 * 类型
	 */
	@Column("TYPE")
	private Integer type;
	/**
	 * 内容
	 */
	@Column("CONTENT")
	private String content;
	/**
	 * 来源
	 */
	@Column("SOURCE")
	private String source;
	/**
	 * 
	 */
	@Column("RESTYPE")
	private Integer restype;
	/**
	 * 所属资源
	 */
	@Column("RESBELONG")
	private String resbelong;
	/**
	 * 排序
	 */
	@Column("NEWSORDER")
	private Integer newsorder;
	/**
	 * 焦点新闻
	 */
	@Column("HOTNEWS")
	private Integer hotnews;
	/**
	 * 关键字
	 */
	@Column("KEYWORDS")
	private String keywords;
	/**
	 * 点击量
	 */
	@Column("CLICKEDTIMES")
	private Long clickedtimes;
	/**
	 * 图片地址
	 */
	@Column("PICURL")
	private String picurl;
	/**
	 * 创建人
	 */
	@Column("CRT_TELLER_ID")
	private String crtTellerId;
	/**
	 * 创建时间
	 */
	@Column("CRT_TIME")
	private java.util.Date crtTime;
	/**
	 * 备注
	 */
	@Column("REMARK")
	private String remark;
	/**
	 * 发表刊物
	 */
	@Column("pubplace")
	private String pubplace;
	/**
	 * 写作年份
	 */
	@Column("writedate")
	private String writedate;
	/**
	 * 花费
	 */
	@Column("cost")
	private String cost;
	/**
	 * 
	 */
	@Column("CENTERPICURL")
	private String centerpicurl;
	/**
	 * 
	 */
	@Column("APPLYHOT")
	private Integer applyhot;
	/**
	 * 
	 */
	@Column("ASTATE")
	private Integer astate;
}