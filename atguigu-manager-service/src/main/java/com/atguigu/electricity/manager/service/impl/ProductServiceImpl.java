package com.atguigu.electricity.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.electricity.manager.mapper.ProductMapper;
import com.atguigu.electricity.manager.mapper.ProductdescMapper;
import com.atguigu.electricity.manager.pojo.Product;
import com.atguigu.electricity.manager.pojo.Productdesc;
import com.atguigu.electricity.manager.service.ProductService;

@Service
public class ProductServiceImpl extends BaseServiceImpl<Product> 
	implements ProductService {

	@Autowired
	private ProductMapper productMapper;
	
	@Autowired
	private ProductdescMapper productdescMapper;
	
	@Override
	public void saveSelective(Product product,String editorValue) {
		productMapper.insertSelective(product);
		
		Productdesc productdesc = new Productdesc();
		productdesc.setId(product.getId());
		productdesc.setProductdesc(editorValue);;
		
		productdescMapper.insertSelective(productdesc);
	}

}
