package com.art58.site.pojo.sys;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("sys_msgcontent")
public class SysMsgcontent extends BaseEntity {
		

	/**
	 * 消息体
	 */
	@Column("CONTENT")
	private String content;
}