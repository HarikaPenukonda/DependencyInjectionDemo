package com.example.DependecyInjectionDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependecyInjectionDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DependecyInjectionDemoApplication.class, args);
		// ConfigurableApplicationContext returns an object at the time of execution
		
		Student s = context.getBean(Student.class);
		s.display();
	}

}
