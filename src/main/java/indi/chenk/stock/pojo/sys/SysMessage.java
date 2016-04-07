package com.art58.site.pojo.sys;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("sys_message")
public class SysMessage extends BaseEntity {
		

	/**
	 * 内容ID
	 */
	@Column("CONTENTID")
	private String contentid;
	/**
	 * 接收人ID
	 */
	@Column("RECEIVERID")
	private String receiverid;
	/**
	 * 发送人ID
	 */
	@Column("SENDERID")
	private String senderid;
	/**
	 * 发送时间
	 */
	@Column("TIME")
	private java.util.Date time;
	/**
	 * 是否已读
	 */
	@Column("ISREAD")
	private Integer isread;
}