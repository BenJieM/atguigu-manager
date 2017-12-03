package com.atguigu.electricity.manager.service.impl;

import org.springframework.stereotype.Service;

import com.atguigu.electricity.manager.pojo.Category;
import com.atguigu.electricity.manager.service.CategoryService;

@Service
public class CategoryServiceImpl extends BaseServiceImpl<Category> implements CategoryService {

	@Override
	public void save() {
		System.out.println("Hello");
	}

}
