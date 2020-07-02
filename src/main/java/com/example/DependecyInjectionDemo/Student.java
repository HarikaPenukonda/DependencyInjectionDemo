package com.example.DependecyInjectionDemo;

import org.springframework.stereotype.Component;

@Component 
/*when we mention s = context.getBean(Student.class); the compiler will 
 * check wether there is student class is available in the container or not.
 * If the bean is available, then the spring framework is basically injecting student object in our application
 * This object is created by spring framework*/
public class Student {
	
	private int sid;
	private String sname;
	private String dept;
	
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
	}

}
