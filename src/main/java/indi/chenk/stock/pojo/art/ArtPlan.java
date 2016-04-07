package com.art58.site.pojo.art;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("art_plan")
public class ArtPlan extends BaseEntity {
		

	/**
	 * 项目名称
	 */
	@Column("NAME")
	private String name;
	/**
	 * 介绍
	 */
	@Column("DESCRIPTION")
	private String description;
	/**
	 * 地点
	 */
	@Column("ADDRESS")
	private String address;
	/**
	 * 定金
	 */
	@Column("PAYMENT")
	private String payment;
	/**
	 * 开始时间
	 */
	@Column("STARTTM")
	private java.util.Date starttm;
	/**
	 * 结束时间
	 */
	@Column("PENDTM")
	private java.util.Date pendtm;
	/**
	 * 研修内容
	 */
	@Column("CONTENT")
	private String content;
	/**
	 * 讲师团队
	 */
	@Column("TEACHERTEAM")
	private String teacherteam;
	/**
	 * 授课方式
	 */
	@Column("TEACHTYPE")
	private String teachtype;
	/**
	 * 点击次数
	 */
	@Column("CLICKTIME")
	private Long clicktime;
	/**
	 * 报名截止日期
	 */
	@Column("ENDTM")
	private java.util.Date endtm;
	/**
	 * 系列编号
	 */
	@Column("SERIALNO")
	private String serialno;
	/**
	 * 图片地址
	 */
	@Column("PICURL")
	private String picurl;
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
	 * 状态
	 */
	@Column("STATE")
	private Integer state;
	/**
	 * 备注
	 */
	@Column("REMARK")
	private String remark;
	/**
	 * 
	 */
	@Column("ASSIGNTO")
	private String assignto;
	/**
	 * 
	 */
	@Column("ISHOT")
	private Integer ishot;
	/**
	 * 研修费用
	 */
	@Column("price")
	private Double price;
	/**
	 * 
	 */
	@Column("CENTERPICURL")
	private String centerpicurl;
	/**
	 * 
	 */
	@Column("SORT_NUM")
	private Integer sortNum;
}