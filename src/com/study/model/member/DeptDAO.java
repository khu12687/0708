package com.study.model.member;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository //스프링에서는 DAO를 리파지터리라 부른다!!
public class DeptDAO {
	@Autowired
	private SqlSessionTemplate sessionTemplate;
	public List selectAll() {
		return sessionTemplate.selectList("Dept.selectAll");
	}
}
