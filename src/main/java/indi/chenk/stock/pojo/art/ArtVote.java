package com.art58.site.pojo.art;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("art_vote")
public class ArtVote extends BaseEntity {
		

	/**
	 * 模块类型
	 */
	@Column("MODULETYPE")
	private Integer moduletype;
	/**
	 * 模块id
	 */
	@Column("MODULEID")
	private String moduleid;
	/**
	 * 投票类型
	 */
	@Column("VOTETYPE")
	private Integer votetype;
	/**
	 * 投票id
	 */
	@Column("VOTEID")
	private String voteid;
	/**
	 * 投票人
	 */
	@Column("VOTER")
	private String voter;
	/**
	 * 投票时间
	 */
	@Column("VOTETM")
	private java.util.Date votetm;
}