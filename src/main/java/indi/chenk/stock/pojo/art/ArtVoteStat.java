package com.art58.site.pojo.art;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("art_vote_stat")
public class ArtVoteStat extends BaseEntity {
		

	/**
	 * 模块id
	 */
	@Column("MODULEID")
	private String moduleid;
	/**
	 * 总票数
	 */
	@Column("COUNT")
	private Integer count;
	/**
	 * 投票id
	 */
	@Column("VOTEID")
	private String voteid;
	/**
	 * 投票类型
	 */
	@Column("VOTETYPE")
	private Integer votetype;
}