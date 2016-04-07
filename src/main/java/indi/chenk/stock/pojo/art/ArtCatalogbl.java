package com.art58.site.pojo.art;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("art_catalogbl")
public class ArtCatalogbl extends BaseEntity {
		

	/**
	 * 艺术品ID
	 */
	@Column("ARTID")
	private String artid;
	/**
	 * 分类ID
	 */
	@Column("CATALOGID")
	private String catalogid;
	/**
	 * 备注
	 */
	@Column("REMARK")
	private String remark;
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
	 * 修改人
	 */
	@Column("UPD_TELLER_ID")
	private String updTellerId;
	/**
	 * 修改时间
	 */
	@Column("UPD_TIME")
	private java.util.Date updTime;
}