package com.sdd.controller;

import com.sdd.annotation.Controller;
import com.sdd.annotation.RequestMapping;
import com.sdd.annotation.RequestMethod;

@Controller(value = "/testAnnotation1")
public class TestController1 {
	
	@RequestMapping(method = RequestMethod.MEthod_GET, value = "/test1")
	public String testAnnotation1(String parameter){
		System.out.println("test annotion1 "+parameter);
		return "annotion1";
	}
	@RequestMapping(method = RequestMethod.MEthod_GET, value = "/test2")
	public String testAnnotation2(){
		System.out.println("test annotion2 ");
		return "annotion2";
	}
}
