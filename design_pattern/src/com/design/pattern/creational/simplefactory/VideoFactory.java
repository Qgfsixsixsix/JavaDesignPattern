package com.design.pattern.creational.simplefactory;


/**
 * 
 * @author Qgfzzzzzz
 * @date 2018-12-7
 * @version 1.0.0
 * The package is com.design.pattern.creational.simplefactory
 */
public class VideoFactory {

	@SuppressWarnings("rawtypes")
	public Video getVideo(Class c){
		Video video = null;
		try{
			video = (Video) Class.forName(c.getName()).newInstance();
		}catch (InstantiationException e) {
			e.printStackTrace();
		}catch (IllegalAccessException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return video;
	}
	
	public Video getVideo(String type){
		
		if("java".equalsIgnoreCase(type)){
			return new JavaVideo();
		}
		else if("python".equalsIgnoreCase(type)){
			return new PythonVideo();
		}
		return null;
	}
	
}
