package com.art58.nutz.mvc.upload;


import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.nutz.lang.Lang;
import org.nutz.mvc.upload.FastUploading;
import org.nutz.mvc.upload.UploadAdaptor;
import org.nutz.mvc.upload.Uploading;
import org.nutz.mvc.upload.UploadingContext;


public class UpAdaptor extends UploadAdaptor {

	public UpAdaptor(UploadingContext context) {
		super(context);
	}

	@Override
	public Map<String, Object> getReferObject(ServletContext sc,
			HttpServletRequest request, HttpServletResponse response,
			String[] pathArgs) {
		// 看看是不是传统的上传
		String contentType = request.getContentType();
		if (contentType == null) {
			throw Lang.makeThrow(IllegalArgumentException.class,
					"Content-Type is NULL!!");
		}
		if (contentType.contains("application/x-www-form-urlenco")) { // 普通表单上传
			Uploading ing = new FastUploading();
			try {
				return ing.parse(request, getContext());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return super.getReferObject(sc, request, response, pathArgs);
	}

}
