package com.art58.site.module;

import java.util.ArrayList;
import java.util.List;

import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;

import com.art58.site.pojo.SampleBean;

@At("/")
@IocBean
public class SampleModule {

	@At("/list")
	@Ok("jsp:hello")
	public Object list(@Param("user") String user,
			@Param("password") String pwd) {
		
		List<SampleBean> list = new ArrayList<SampleBean>();
		for(int i=0;i<10;i++) {
			SampleBean bean = new SampleBean();
			bean.setAge(20+i);
			bean.setName("user"+i);
			bean.setSex("男");
			list.add(bean);
		}
		return list;
	}
	
	@At("/list2")
	@Ok("jsp:/hello")
	public Object list2(@Param("user") String user,
			@Param("password") String pwd) {
		
		List<SampleBean> list = new ArrayList<SampleBean>();
		for(int i=0;i<10;i++) {
			SampleBean bean = new SampleBean();
			bean.setAge(20+i);
			bean.setName("user"+i);
			bean.setSex("男");
			list.add(bean);
		}
		return list;
	}
}
