package com.dataCloningTool.dao.impl;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.dataCloningTool.dao.CommonDao;

@Repository
public class CommonDaoImpl extends SqlSessionDaoSupport implements CommonDao {

	
	@Autowired()
	public CommonDaoImpl(
			@Qualifier("as400SessionFactory") SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	@Autowired()
	@Qualifier("as400SessionFactory")
	SqlSessionFactoryBean factoryBean;
	
	@Override
	public int getCurrentSequence(int customerId) {
		Integer currentSequence = getSqlSession().selectOne(
				"com.dataCloningTool.dao.CommonDao.testQuery",
				customerId);
		return (null != currentSequence ? currentSequence.intValue() : 0);
	}
	
}
