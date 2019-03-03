package com.springboot.starter.topic;

public class Topic {
	
	private String id;
	private String courseName;
	private String courseDescription;
	
	public Topic(String id, String courseName, String courseDescription) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.courseDescription = courseDescription;
	}
	public String getId() {
		return id;
	}
	public String getCourseName() {
		return courseName;
	}
	public String getCourseDescription() {
		return courseDescription;
	}
	
			
	
}
