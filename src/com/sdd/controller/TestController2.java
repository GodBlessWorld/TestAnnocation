package com.sdd.controller;

import com.sdd.annotation.Controller;
import com.sdd.annotation.RequestMapping;
import com.sdd.annotation.RequestMethod;

@Controller(value = "/testAnnotation2")
public class TestController2 {
	
	@RequestMapping(method = RequestMethod.MEthod_GET, value = "/test21")
	public String testAnnotation21(){
		System.out.println("test annotion21 ");
		return "annotion21";
	}
	@RequestMapping(method = RequestMethod.MEthod_GET, value = "/test22")
	public String testAnnotation22(){
		System.out.println("test annotion22 ");
		return "annotion22";
	}
}
