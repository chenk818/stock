package indi.chenk.tool.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import lombok.extern.log4j.Log4j;

import org.apache.commons.lang3.StringUtils;

public class StringTool {


	/**
	 * 判断对象是否为空
	 * 
	 * @param resource
	 * @return 为空返回true,不为空返回false
	 */
	public static boolean isNull(Object obj) {
		if (obj == null) {
			return true;
		}
		if (StringUtils.isBlank(obj.toString())) {
			return true;
		}
		return false;
	}

	/**
	 * 判断对象是否不为空
	 * 
	 * @param resource
	 * @return 不为空返回true,为空返回false
	 */
	public static boolean isNotNull(Object obj) {
		if (obj == null) {
			return false;
		}
		if (StringUtils.isBlank(obj.toString())) {
			return false;
		}
		return true;
	}

	/**
	 * 去掉所有空格
	 * 
	 * @param str
	 * @return
	 */
	public static String trimAll(Object str) {
		String newStr = nullToString(str);
		return newStr.replace(" ", nullToString(null));
	}

	/**
	 * 判断对象是否为空
	 * 
	 * @param o
	 * @return
	 */
	public static boolean isBlank(Object o) {
		if (o == null) {
			return true;
		}
		if (StringUtils.isBlank(o.toString())) {
			return true;
		}
		return false;
	}

	/**
	 * 判断对象是否不为空
	 * 
	 * @param o
	 * @return
	 */
	public static boolean isNotBlank(Object o) {
		if (o == null) {
			return false;
		}
		if (StringUtils.isBlank(o.toString())) {
			return false;
		}
		return true;
	}

	/**
	 * 判断字符串是否为null或空字符串,在模糊查询的时候很有意义
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str) {
		return str == null || str.length() == 0 || str.trim().length() == 0;
	}

	public static boolean isEmpty(Long o) {
		return (o == null);
	}

	public static boolean isEmpty(Integer o) {
		return (o == null);
	}

	public static boolean isEmpty(Date o) {
		return (o == null);
	}

	public static boolean isEmpty(Object o) {
		return (o == null);
	}

	/**
	 * 判断字符串是否为null或空字符串,在模糊查询的时候很有意义
	 */
	public static boolean isNotEmpty(String str) {
		return (str != null && !"".equals(str.trim()));
	}

	public static boolean isNotEmpty(Long o) {
		return (o != null);
	}

	public static boolean isNotEmpty(Integer o) {
		return (o != null);
	}

	public static boolean isNotEmpty(Date o) {
		return (o != null);
	}

	public static boolean isNotEmpty(Object o) {
		return (o != null);
	}

	/**
	 * null和"null"转变成空
	 * 
	 * @param obj
	 * @return
	 */
	public static String nullToString(Object obj) {
		String resource = "";
		if (obj == null || obj.equals("null")) {
			return resource;
		} else {
			resource = obj.toString().trim();
		}
		return resource;
	}

	/**
	 * null或"null"转变成"0"
	 * 
	 * @param resource
	 * @return
	 */
	public static String nullToNumber(Object obj) {
		String resource = "0";
		if (obj == null || obj.equals("null")) {
			return resource;
		} else {
			resource = obj.toString().trim();
		}
		return resource;
	}

	/**
	 * 去掉DOUBLE 类型小数点后面的数字 变整数
	 * 
	 * @param doublestr
	 * @return
	 */
	public static String doubleToInteger(Double doublestr) {
		if (doublestr == null) {
			return "";
		}
		String[] strlast = String.valueOf(doublestr).split("\\.", -1);
		if (isNotEmpty(strlast[0])) {
			return strlast[0];
		} else {
			return "";
		}
	}

	/**
	 * 分隔字符 , 注意：如果前后有分隔符，String.split会多出来一个。该方法自动去掉前后分隔符再调用 String.split
	 * 注意：特殊字符 $ % 等，需要使用 转义 $, 改为 \\$
	 * 
	 * @param str
	 * @param ch
	 * @return
	 */
	public static String[] split(String str, char ch) {
		if (str == null) {
			return null;
		}
		if (str.charAt(0) == ch) {
			str = str.substring(1);
		}
		if (str.charAt(str.length() - 1) == ch) {
			str = str.substring(0, str.length() - 1);
		}
		return str.split(ch + "");
	}

	/**
	 * 将字符串转换成List对象,以分隔符分隔
	 * 
	 * @param obj
	 *            分隔符分隔的字符串对象
	 * @param split
	 *            分隔符
	 * @return
	 */
	public static List<String> getStringToList(String obj, char split) {
		if (obj == null || obj.equals("")) {
			return null;
		}

		String[] arr = split(obj, split);
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}

		return list;
	}

	/**
	 * 把参数通过URLEncode转码
	 * 
	 * @param oldParam
	 * @param format
	 * @return
	 */
	public static String parameterEncode(String beforeFormat, String format) {
		String afterFormat = "";
		try {
			afterFormat = URLEncoder.encode(beforeFormat, format);
		} catch (UnsupportedEncodingException e) {
		}
		return afterFormat;
	}

	/**
	 * 把所有标准的 http://www.cxxcom/sss/sxx/x/x/或者htpps://www.cxx.com/sdfsdfx/x/x/x/
	 * 截取到第3个/ 符号为止 结果形式：http://www.cxxcom/ htpps://www.cxx.com/
	 * 
	 * @param urlstr
	 *            需要截取的URL
	 * @return
	 */
	public static String cutUrl(String urlstr) {
		String http = "http://";
		String https = "https://";
		if (isNotEmpty(urlstr)) {
			if (urlstr.startsWith(http)) {
				urlstr = urlstr.substring(http.length(), urlstr.length());
				if (urlstr.contains("/")) {
					urlstr = urlstr.substring(0, urlstr.indexOf("/") + 1);
				}
				urlstr = http + urlstr;
			}
			if (urlstr.startsWith(https)) {
				urlstr = urlstr.substring(https.length(), urlstr.length());
				if (urlstr.contains("/")) {
					urlstr = urlstr.substring(0, urlstr.indexOf("/") + 1);
				}
				urlstr = https + urlstr;
			}

		} else {
			urlstr = "";
		}
		return urlstr;
	}

}
