package com.example.DependecyInjectionDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component 
/*when we mention s = context.getBean(Student.class); the compiler will 
 * check wether there is student class is available in the container or not.
 * If the bean is available, then the spring framework is basically injecting student object in our application
 * This object is created by spring framework
 * Exception :  No qualifying bean of type 'com.example.DependecyInjectionDemo.Student' available*/
public class Student {
	
	private int sid;
	private String sname;
	private String dept;
	
	@Autowired
	/*This is used to enable a class to recognize the other class and make sure the dependencies are satisfied
	 * Student class is dependent on Course class but Student class doesn't knw the existence of Course class
	 * to know about the existence we are using autowire annotation 
	 * Exception : NullPointerException*/
	private Course coursedetails;
	
	public Course getCoursedetails() {
		return coursedetails;
	}
	public void setCoursedetails(Course coursedetails) {
		this.coursedetails = coursedetails;
	}
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void display()
	{
		System.out.println("Student Object returned successfully");
		coursedetails.tech();
	}

}
