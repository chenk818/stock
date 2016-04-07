package indi.chenk.nutz.common;

public class Constants {
	/**
	 * 后台执行状态码 *
	 */
	public static final String STATE_FAIL = "0";// 后台执行失败，若用户没有权限，也返回该 状态
	public static final String STATE_SUCCESS = "1";// 后台执行成功
	public static final String STATE_UNLOGIN = "2";// 用户尚未登录
	public static final String STATE_UNAUTH = "3";// 用户未授权

}
