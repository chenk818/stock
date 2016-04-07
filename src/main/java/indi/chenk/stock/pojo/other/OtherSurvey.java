package com.art58.site.pojo.other;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("other_survey")
public class OtherSurvey extends BaseEntity {
		

	/**
	 * 
	 */
	@Column("username")
	private String username;
	/**
	 * 
	 */
	@Column("staff")
	private String staff;
	/**
	 * 
	 */
	@Column("sex")
	private Integer sex;
	/**
	 * 
	 */
	@Column("nation")
	private String nation;
	/**
	 * 
	 */
	@Column("place")
	private String place;
	/**
	 * 
	 */
	@Column("birthday")
	private java.util.Date birthday;
	/**
	 * 
	 */
	@Column("GRADUATEPLACE")
	private String graduateplace;
	/**
	 * 
	 */
	@Column("GRADUATETIME")
	private String graduatetime;
	/**
	 * 
	 */
	@Column("EMAIL")
	private String email;
	/**
	 * 
	 */
	@Column("MOBILEPHONE")
	private String mobilephone;
	/**
	 * 
	 */
	@Column("workunit")
	private String workunit;
	/**
	 * 
	 */
	@Column("getknown")
	private String getknown;
	/**
	 * 
	 */
	@Column("gobj")
	private String gobj;
	/**
	 * 
	 */
	@Column("workplace")
	private String workplace;
	/**
	 * 
	 */
	@Column("located")
	private String located;
	/**
	 * 
	 */
	@Column("gonow")
	private String gonow;
	/**
	 * 
	 */
	@Column("studiotype")
	private String studiotype;
	/**
	 * 
	 */
	@Column("studiofor")
	private String studiofor;
	/**
	 * 
	 */
	@Column("studiorent")
	private String studiorent;
	/**
	 * 
	 */
	@Column("rentrise")
	private String rentrise;
	/**
	 * 
	 */
	@Column("cost")
	private String cost;
	/**
	 * 
	 */
	@Column("worktype")
	private String worktype;
	/**
	 * 
	 */
	@Column("works")
	private String works;
	/**
	 * 
	 */
	@Column("reward")
	private String reward;
	/**
	 * 
	 */
	@Column("goods")
	private String goods;
	/**
	 * 
	 */
	@Column("bads")
	private String bads;
	/**
	 * 
	 */
	@Column("evaluate")
	private String evaluate;
	/**
	 * 
	 */
	@Column("invite")
	private Integer invite;
	/**
	 * 
	 */
	@Column("SURVEYTM")
	private java.util.Date surveytm;
	/**
	 * 
	 */
	@Column("workplacedetail")
	private String workplacedetail;
}