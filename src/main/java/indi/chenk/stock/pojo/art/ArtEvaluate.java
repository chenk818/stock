package com.art58.site.pojo.art;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("art_evaluate")
public class ArtEvaluate extends BaseEntity {
		

	/**
	 * 评价人ID
	 */
	@Column("REVIEWER")
	private String reviewer;
	/**
	 * 评价类型
	 */
	@Column("TYPE")
	private Integer type;
	/**
	 * 评价对象类型
	 */
	@Column("EVALUATETYPE")
	private Integer evaluatetype;
	/**
	 * 
	 */
	@Column("EVALUATEID")
	private String evaluateid;
	/**
	 * 评价时间
	 */
	@Column("TIME")
	private java.util.Date time;
	/**
	 * 评价状态
	 */
	@Column("STATE")
	private Integer state;
}