package com.test.www;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yuan.www.service.SpitterService;
import com.yuan.www.service.TeacherService;

@Controller
public class TestThymeleaf {
	@Autowired
	TeacherService teacherService;

	@Autowired
	ExamineeMapper examineeMapper;
	
	@Autowired
	ExaminationsMapper examinationsMapper;
	
	@Autowired
	SpitterService service;
	
	@RequestMapping(value = "/", produces = "text/html; charset=UTF-8", method = RequestMethod.GET)
	public String index(Map<String, Object> model) {

		model.put("name", "123");
		System.out.println(teacherService.selectByPrimaryKey(1));
		System.out.println(service.show());
		System.out.println(examineeMapper.selectById(1));
		System.out.println(examinationsMapper.selectById(3));
		System.out.println(1);
		return "index";
	}

}
