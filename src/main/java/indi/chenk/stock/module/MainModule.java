package com.art58.site.module;

import org.nutz.mvc.annotation.By;
import org.nutz.mvc.annotation.Encoding;
import org.nutz.mvc.annotation.Fail;
import org.nutz.mvc.annotation.Filters;
import org.nutz.mvc.annotation.IocBy;
import org.nutz.mvc.annotation.Modules;
import org.nutz.mvc.ioc.provider.ComboIocProvider;

import com.art58.site.filter.UserFilter;

@Modules(scanPackage = true)
@Encoding(input="utf8",output="utf8")
@IocBy(type = ComboIocProvider.class, args = {
		"*org.nutz.ioc.loader.json.JsonLoader", "ioc/",
		"*org.nutz.ioc.loader.annotation.AnnotationIocLoader", "com.art58.site" })
@Filters(@By(type = UserFilter.class))
public class MainModule {

}
