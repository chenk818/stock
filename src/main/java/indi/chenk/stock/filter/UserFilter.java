package indi.chenk.stock.filter;

import org.nutz.json.JsonFormat;
import org.nutz.mvc.ActionContext;
import org.nutz.mvc.ActionFilter;
import org.nutz.mvc.View;
import org.nutz.mvc.view.UTF8JsonView;

import indi.chenk.nutz.mvc.annotation.Authority;
import indi.chenk.nutz.result.Results;
import indi.chenk.stock.util.UserUtil;


public class UserFilter implements ActionFilter {

	
	private static final UTF8JsonView UNLOGIN = new UTF8JsonView(
			JsonFormat.nice());
	
	
	static {
		UNLOGIN.setData(Results.parse(Results.UNLOGIN));
	}
	
	@Override
	public View match(ActionContext context) {
		Authority auth = context.getMethod().getAnnotation(Authority.class);
		// (1)若请求的方法名没有权限注解，或权限为默认权限，则不判断权限；
		if (null == auth || auth.isDefault()) {
			return null;
		}
		if(UserUtil.getUser() != null) {
			return null;
		}
		return UNLOGIN;
	}

}
