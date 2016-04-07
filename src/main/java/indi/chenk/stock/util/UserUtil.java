package indi.chenk.stock.util;


import javax.servlet.http.HttpSession;


import org.nutz.mvc.Mvcs;



public class UserUtil {

	public static final String USER_INFO = "USER_INFO";
	
	

	public static String getUser()  {
		HttpSession session = Mvcs.getReq().getSession();
		String user = (String) session.getAttribute(USER_INFO);
		return user;
	}
	
	public static void setUser(String user) {
		HttpSession session = Mvcs.getReq().getSession();
		session.setAttribute(USER_INFO, user);
	}
	
}
