package com.atguigu.electricity.manager.service;

import com.atguigu.electricity.manager.pojo.Product;

public interface ProductService extends BaseService<Product> {

	public void saveSelective(Product product,String editorValue);

}
