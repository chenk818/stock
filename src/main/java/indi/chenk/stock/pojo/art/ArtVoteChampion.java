package com.art58.site.pojo.art;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("art_vote_champion")
public class ArtVoteChampion extends BaseEntity {
		

	/**
	 * 
	 */
	@Column("STARTTM")
	private java.util.Date starttm;
	/**
	 * 
	 */
	@Column("ENDTM")
	private java.util.Date endtm;
	/**
	 * 
	 */
	@Column("CHAMPIONID")
	private String championid;
	/**
	 * 
	 */
	@Column("COUNT")
	private Integer count;
}