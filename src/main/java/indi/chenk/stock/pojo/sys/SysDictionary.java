package com.art58.site.pojo.sys;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("sys_dictionary")
public class SysDictionary extends BaseEntity {
		

	/**
	 * 父ID
	 */
	@Column("PARENT_ID")
	private String parentId;
	/**
	 * 字典代码
	 */
	@Column("DICT_CODE")
	private String dictCode;
	/**
	 * 名称
	 */
	@Column("CODE_NAME")
	private String codeName;
	/**
	 * 值
	 */
	@Column("CODE_VALUE")
	private String codeValue;
	/**
	 * 备注
	 */
	@Column("REMARKS")
	private String remarks;
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