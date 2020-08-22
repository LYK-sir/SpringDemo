package org.motinyu.test;

import org.motinyu.entity.Student;
import org.motinyu.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String []args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentService studentService = (StudentService)context.getBean("studentService");
		Student student = new Student();
		student.setStuNo(3);
		student.setStuName("’≈ŒÂ");
		student.setStuAge(23);
		studentService.addAtudent(student);
	}
}
