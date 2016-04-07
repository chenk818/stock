package com.art58.site.pojo;

import com.art58.nutz.pojo.BaseEntity;

import lombok.Data;

@Data
public class SampleBean  extends BaseEntity{

	private String name;
	
	private int age;
	
	private String sex;
}
