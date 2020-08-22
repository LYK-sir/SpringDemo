package org.motinyu.service.impl;

import org.motinyu.dao.StudentDao;
import org.motinyu.entity.Student;
import org.motinyu.service.StudentService;

public class StudentServiceImpl implements StudentService{
	private StudentDao studentDao;
	
	
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}


	@Override
	public void addAtudent(Student student) {
		//µ÷ÓÃDao²ã
		studentDao.addStudent(student);
	}

}
