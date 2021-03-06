package com.study.model.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	@Autowired
	private DeptDAO deptDAO;
	@Autowired
	private EmpDAO empDAO;
	
	public List selectAll() {
		return empDAO.selectAll();
	}
}
