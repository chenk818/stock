package com.art58.site.pojo.art;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("art_party_goods")
public class ArtPartyGoods extends BaseEntity {
		

	/**
	 * 项目ID
	 */
	@Column("PARTYID")
	private String partyid;
	/**
	 * 物品名称
	 */
	@Column("GOODSNAME")
	private String goodsname;
	/**
	 * 数量
	 */
	@Column("COUNT")
	private Integer count;
	/**
	 * 认领人ID
	 */
	@Column("CLAIMID")
	private String claimid;
	/**
	 * 认领数量
	 */
	@Column("CLAIMCOUNT")
	private Integer claimcount;
	/**
	 * 备注
	 */
	@Column("REMART")
	private String remart;
}