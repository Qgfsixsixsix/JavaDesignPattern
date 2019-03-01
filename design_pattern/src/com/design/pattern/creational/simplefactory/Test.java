package com.design.pattern.creational.simplefactory;


/**
 * 
 * @author Qgfzzzzzz
 * @date 2018-12-7
 * @version 1.0.0
 * The package is com.design.pattern.creational.simplefactory
 */
public class Test {

	public static void main(String[] args) {
		/*VideoFactory videoFactory = new VideoFactory();
		Video video = videoFactory.getVideo("java");
		if(video == null){
			return;
		}
		video.produce();*/
		
		VideoFactory videoFactory = new VideoFactory();
		Video video = videoFactory.getVideo(JavaVideo.class);
		if(video == null){
			return;
		}
		video.produce();
	}
}
