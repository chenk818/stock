package com.art58.site.pojo.sys;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import lombok.Data;

import com.art58.nutz.pojo.BaseEntity;
/**
* 
*/
@Data
@Table("sys_user")
public class SysUser extends BaseEntity {
		

	/**
	 * 第三方登录表ID
	 */
	@Column("LOGINID")
	private String loginid;
	/**
	 * 用户名
	 */
	@Column("USERNAME")
	private String username;
	/**
	 * 密码
	 */
	@Column("PASSWORD")
	private String password;
	/**
	 * 昵称
	 */
	@Column("NICKNAME")
	private String nickname;
	/**
	 * 姓名
	 */
	@Column("NAME")
	private String name;
	/**
	 * 邮箱
	 */
	@Column("EMAIL")
	private String email;
	/**
	 * 手机号
	 */
	@Column("MOBILEPHONE")
	private String mobilephone;
	/**
	 * 性别
	 */
	@Column("SEX")
	private Integer sex;
	/**
	 * 头像
	 */
	@Column("HEADIMG")
	private String headimg;
	/**
	 * 首页图片
	 */
	@Column("HOMEPAGEIMG")
	private String homepageimg;
	/**
	 * 出生地
	 */
	@Column("BIRTHPLACE")
	private String birthplace;
	/**
	 * 现居住地
	 */
	@Column("LIVEPLACE")
	private String liveplace;
	/**
	 * 出生日期
	 */
	@Column("BIRTHDAY")
	private String birthday;
	/**
	 * 毕业院校
	 */
	@Column("GRADUATEPLACE")
	private String graduateplace;
	/**
	 * 获奖
	 */
	@Column("AWARD")
	private String award;
	/**
	 * 角色
	 */
	@Column("ROLE")
	private Integer role;
	/**
	 * 个人主页地址
	 */
	@Column("PERSONALURL")
	private String personalurl;
	/**
	 * 推荐人
	 */
	@Column("RECOMMENDID")
	private String recommendid;
	/**
	 * 
	 */
	@Column("PRIORITY")
	private Integer priority;
	/**
	 * 注册时间
	 */
	@Column("REGISTTIME")
	private java.util.Date registtime;
	/**
	 * 编辑时间
	 */
	@Column("EDITTIME")
	private java.util.Date edittime;
	/**
	 * 备注
	 */
	@Column("COMMENT")
	private String comment;
	/**
	 * 
	 */
	@Column("STATE")
	private Integer state;
	/**
	 * 
	 */
	@Column("LASTLOGINTM")
	private java.util.Date lastlogintm;
	/**
	 * 
	 */
	@Column("CENTERPICURL")
	private String centerpicurl;
	/**
	 * 
	 */
	@Column("liveplacebak")
	private String liveplacebak;
	/**
	 * 
	 */
	@Column("HEADPICURL")
	private String headpicurl;
}