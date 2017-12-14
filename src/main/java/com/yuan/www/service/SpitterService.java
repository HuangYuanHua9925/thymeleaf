package com.yuan.www.service;

import javax.jws.WebService;

import com.yuan.www.model.Teacher;


@WebService
public interface SpitterService {
	
	Teacher show();
}
