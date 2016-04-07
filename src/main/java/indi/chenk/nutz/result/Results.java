package indi.chenk.nutz.result;

public class Results {
	public static final String FAIL = "0";// 后台执行失败，若用户没有权限，也返回该 状态
	public static final String SUCCESS = "1";// 后台执行成功
	public static final String UNLOGIN = "2";// 用户尚未登录

	private Object data;
	private String code;
	private String msg;

	public Results() {
		this.code = SUCCESS;
	}

	public static Results parse(String code) {
		return parse(code, "");
	}

	public static Results parse(String code, String msg) {
		return parse(code, msg, null);
	}

	public static Results parse(String code, String msg, Object result) {
		Results r = new Results();
		r.setCode(code);
		r.setMsg(msg);
		r.setData(result);
		return r;
	}
	

	@SuppressWarnings("rawtypes")
	public static Results parse(PageResult result) {
		Results r = new Results();
		r.setData(result);
		return r;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
