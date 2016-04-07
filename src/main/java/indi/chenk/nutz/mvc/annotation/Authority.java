package com.art58.nutz.mvc.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Authority {
	public abstract String value();

	public abstract String module() default "";

	public abstract boolean isDefault() default false;

	public abstract String desc() default "";
}