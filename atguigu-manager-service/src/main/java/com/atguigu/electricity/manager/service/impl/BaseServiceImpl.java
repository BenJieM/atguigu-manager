package com.atguigu.electricity.manager.service.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.atguigu.electricity.manager.service.BaseService;
import com.github.abel533.entity.Example;
import com.github.abel533.mapper.Mapper;
import com.github.pagehelper.PageHelper;

@Transactional
public abstract class BaseServiceImpl<T> implements BaseService<T> {

	@Autowired
	private Mapper<T> mapper;

	Class<T> clazz;

	// 反射
	public BaseServiceImpl() {
		Type type = this.getClass().getGenericSuperclass();
		ParameterizedType ptype = (ParameterizedType) type;
		this.clazz = (Class<T>) ptype.getActualTypeArguments()[0];
	}

	@Override
	public T queryById(Long id) {

		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<T> queryAll() {

		return mapper.select(null);
	}

	@Override
	public List<T> queryBySeletive(T t) {
		return mapper.select(t);
	}

	@Override
	public Integer queryCount() {
		return queryCountBySelective(null);
	}

	@Override
	public Integer queryCountBySelective(T t) {
		return mapper.selectCount(t);
	}

	@Override
	public List<T> queryByPage(Integer pageNum, Integer pageSize, T t) {
		PageHelper.startPage(pageNum, pageSize);
		List<T> list = mapper.select(t);
		return list;
	}

	@Override
	public void save(T t) {
		mapper.insert(t);
	}

	@Override
	public void saveSelective(T t) {
		mapper.insertSelective(t);
	}

	@Override
	public void saveBatch(List<T> list) {
		if (list == null || list.size() <= 0) {
			throw new RuntimeException();
		}
		for (T t : list) {
			mapper.insertSelective(t);
		}
	}

	@Override
	public void updataSelective(T t) {
		mapper.updateByExampleSelective(t, null);
	}

	@Override
	public void updataById(T t) {
		mapper.updateByPrimaryKey(t);
	}

	@Override
	public void deleteById(Long id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void deleteBatch(List<Object> ids) {
		Example example = new Example(clazz, true);
		example.createCriteria().andEqualTo("id", ids);
		mapper.deleteByExample(example);
	}
}
