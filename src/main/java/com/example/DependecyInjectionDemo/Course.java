package com.example.DependecyInjectionDemo;

import org.springframework.stereotype.Component;

@Component
public class Course {
	
	private int courseid;
	private String coursename;
	
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	
	
	public void tech()
	{
		System.out.println("Course class");
	}
	

}
