package com.test.www;

import com.yuan.www.model.Examinee;




public interface ExamineeMapper {
	
	int deleteByPrimaryKey( Integer id);

	int save(Examinee examinee);

	Examinee selectById( Integer id);

	int update(Examinee examinee);
}