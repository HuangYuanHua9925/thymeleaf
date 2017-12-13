package com.test.www;

import com.yuan.www.model.Teacher;



public interface TeacherService {
	
	Teacher selectByPrimaryKey(int id);

	int insert(Teacher teacher);

	int update(Teacher teacher);
}
