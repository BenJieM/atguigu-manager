package com.atguigu.electricity.manager.service;

import java.util.List;

public interface BaseService<T> {
	
	
	//根据id获取对象信息
	public T queryById(Long id);

	//查询所有
	public List<T> queryAll();
	
	//根据指定条件查找
	public List<T> queryBySeletive(T t);

	//查询所有的记录数
	public Integer queryCount();
	
	public Integer queryCountBySelective(T t);
	
	 //分页查询
    public List<T> queryByPage(Integer page,Integer rows,T t);
	
	//保存信息
	public void save(T t);
	
	public void saveSelective(T t);
	
	//批量添加
	public void saveBatch(List<T> list);
	
	//修改
	public void updataSelective(T t);

	public void updataById(T t);
	
	//删除
	public void deleteById(Long id);
	
	//批量删除
	public void deleteBatch(List<?> ids);
	
	
}
