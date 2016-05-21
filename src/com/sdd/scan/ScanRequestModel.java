package com.sdd.scan;

import java.lang.reflect.Method;

public class ScanRequestModel {
	private String path;
	private String methodType;
	private String className;
	private Method method;
	private Class class1;
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getMethodType() {
		return methodType;
	}
	public void setMethodType(String methodType) {
		this.methodType = methodType;
	}
	public Method getMethod() {
		return method;
	}
	public void setMethod(Method method) {
		this.method = method;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public Class getClass1() {
		return class1;
	}
	public void setClass1(Class class1) {
		this.class1 = class1;
	}
	@Override
	public String toString() {
		return "ScanRequestModel [path=" + path + ", methodType=" + methodType
				+ ", className=" + className + ", method=" + method
				+ ", class1=" + class1 + "]";
	}
	
	
}
