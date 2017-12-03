package com.atguigu.electricity.manager.service.impl;

import java.util.Date;

import org.apache.log4j.lf5.util.DateFormatManager;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.electricity.manager.service.GetDemo;

@Service(interfaceClass=GetDemo.class)
@Component
public class GetDemoImpl implements GetDemo {

	@Override
	public String getDate() {
		DateFormatManager dateFormatManager = new DateFormatManager();
		return dateFormatManager.format(new Date(),"YYYY-MM-dd hh:mm:ss");
	}
	
//	public static void main(String[] args) {
//		System.out.println(new GetDemoImpl().getDate());
//	}

}
