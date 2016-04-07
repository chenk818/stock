package com.art58.site.pojo.art;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("art_vote_lasttop10")
public class ArtVoteLasttop10 extends BaseEntity {
		

	/**
	 * 
	 */
	@Column("NAME")
	private String name;
	/**
	 * 
	 */
	@Column("CPURL")
	private String cpurl;
	/**
	 * 
	 */
	@Column("COUNT")
	private Integer count;
}