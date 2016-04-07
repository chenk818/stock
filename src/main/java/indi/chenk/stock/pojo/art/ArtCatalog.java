package com.art58.site.pojo.art;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("art_catalog")
public class ArtCatalog extends BaseEntity {
		

	/**
	 * 类型名
	 */
	@Column("TYPE")
	private String type;
	/**
	 * 类型值
	 */
	@Column("PROCESSOR")
	private String processor;
	/**
	 * 备注
	 */
	@Column("REMARK")
	private String remark;
	/**
	 * 状态
	 */
	@Column("STATE")
	private Integer state;
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