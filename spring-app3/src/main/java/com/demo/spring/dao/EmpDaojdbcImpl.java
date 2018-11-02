package com.demo.spring.dao;

import org.springframework.stereotype.Repository;

import com.demo.spring.entity.Emp;

@Repository
public class EmpDaojdbcImpl implements EmpDao {

	@Override
	public String save(Emp e) {
		System.out.println("JDBC: Data Saved with id " + e.getEmpId());
		return "saved";
	}

}
