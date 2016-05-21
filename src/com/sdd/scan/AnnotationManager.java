package com.sdd.scan;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.common.base.CharMatcher;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.sdd.annotation.Controller;
import com.sdd.annotation.RequestMapping;

public class AnnotationManager {
	private String real_package_path;
	private String package_path;
	private List<String> file_paths;
	private Map<String, ScanRequestModel> pathMethod = Maps.newHashMap();
	public AnnotationManager(String package_path){
		if(Strings.isNullOrEmpty(package_path)){
			System.out.println("请输入正确的参数");
			throw new IllegalArgumentException("请输入正确的参数");
		}
		this.package_path = CharMatcher.is('.').replaceFrom(package_path, "\\");
		package_path = "./src/"+CharMatcher.is('.').replaceFrom(package_path, "/");
		this.real_package_path = package_path;
		this.file_paths = new ArrayList<>();
	}
	
	protected List<String> getTypePaths(){
		
		getFilePaths(this.file_paths,real_package_path);
		return this.file_paths;
	}
	
	
	private void getFilePaths(List<String> paths,String path){
		File file = new File(path);
		if(file.isDirectory()){
			System.out.println("文件夹："+file.getAbsolutePath());
			File[] files = file.listFiles();
			for(int i = 0;i < files.length;i++){
				getFilePaths(paths,files[i].getAbsolutePath());
			}
		}else{
			System.out.println("文件："+file.getName());
			String path1 = file.getAbsolutePath();
			paths.add((path1.substring(path1.indexOf(this.package_path),path1.indexOf(".java")).replaceAll("\\\\", ".")));
		}
	}
	
	/**
	 * 扫描指定包下的组件
	 * @throws ClassNotFoundException 
	 */
	public void scanComponent() throws ClassNotFoundException {
		getTypePaths();
		for(int i = 0;i < file_paths.size();i++){
			String className = file_paths.get(i);
			Class class1 =Class.forName(className);
			if(class1.isAnnotationPresent(Controller.class)){
				Controller controller = (Controller) class1.getAnnotation(Controller.class);
				String cotrollerPath = controller.value();
					Method[] methods = class1.getMethods();
					for(int i1 = 0;i1<methods.length;i1++){
						ScanRequestModel scanRequestModel = new ScanRequestModel();
						scanRequestModel.setClassName(className);
						scanRequestModel.setClass1(class1);
						Method method = methods[i1];
						if(method.isAnnotationPresent(RequestMapping.class)){
							RequestMapping requestMapping = (RequestMapping)method.getAnnotation(RequestMapping.class);
							scanRequestModel.setMethod(method);
							scanRequestModel.setPath(cotrollerPath+requestMapping.value());
							scanRequestModel.setMethodType(requestMapping.method());
							pathMethod.put((scanRequestModel.getPath()), scanRequestModel);
						}
					}
				
			};
			
		}
	}
	
	public void invoke(String path,String parameter) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException{
		if(pathMethod.containsKey(path)){
			ScanRequestModel valueModel = pathMethod.get(path);
			Class clazzClass = valueModel.getClass1();
			if((parameter==null)){
				valueModel.getMethod().invoke(clazzClass.newInstance());
			}else{
				 valueModel.getMethod().invoke(clazzClass.newInstance(),parameter);
			}
		}else{
			System.out.println(path+" 不存在");
		}
	}
	/**
	 * 
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		AnnotationManager annotationManager = new AnnotationManager("com.sdd.controller");
		annotationManager.scanComponent();
		System.out.println(annotationManager.pathMethod);
	}
}
