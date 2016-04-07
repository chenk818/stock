package indi.chenk.stock.module;

import org.nutz.mvc.annotation.By;
import org.nutz.mvc.annotation.Encoding;
import org.nutz.mvc.annotation.Filters;
import org.nutz.mvc.annotation.IocBy;
import org.nutz.mvc.annotation.Modules;
import org.nutz.mvc.ioc.provider.ComboIocProvider;

import indi.chenk.stock.filter.UserFilter;

@Modules(scanPackage = true)
@Encoding(input="utf8",output="utf8")
@IocBy(type = ComboIocProvider.class, args = {
		"*org.nutz.ioc.loader.json.JsonLoader", "ioc/",
		"*org.nutz.ioc.loader.annotation.AnnotationIocLoader", "indi.chenk.stock" })
@Filters(@By(type = UserFilter.class))
public class MainModule {

}
