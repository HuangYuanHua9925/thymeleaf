package com.test.www;

import java.util.List;
import java.util.Map;

import com.yuan.www.model.Examinations;

public interface ExaminationsMapper {

	int deleteById(Integer id);

	int save(Examinations examinations);

	Examinations selectById( Integer id);

	int updateByiId(Examinations examinations);

	List<Examinations> selectOrderBy(Map<String, Object> map);
}