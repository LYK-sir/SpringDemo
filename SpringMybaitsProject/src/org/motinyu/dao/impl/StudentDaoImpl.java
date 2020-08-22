package org.motinyu.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.motinyu.dao.StudentDao;
import org.motinyu.entity.Student;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class StudentDaoImpl extends SqlSessionDaoSupport implements StudentDao{

	@Override
	public void addStudent(Student student) {
		SqlSession sqlSession = super.getSqlSession();
		StudentDao mapper = sqlSession.getMapper(StudentDao.class);
		mapper.addStudent(student);
	}

}
