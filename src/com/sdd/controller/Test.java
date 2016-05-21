package com.sdd.controller;

import java.lang.reflect.InvocationTargetException;

import com.sdd.scan.AnnotationManager;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		AnnotationManager annotationManager = new AnnotationManager("com.sdd.controller");
		annotationManager.scanComponent();
		annotationManager.invoke("/testAnnotation1/test1","Hello");
	}
}
