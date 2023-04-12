package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("oracle")
@Primary
public class OracleDao implements ReportDao {
	
	
	
	public OracleDao() {
		System.out.println("oracle dao constructor calling");
	}

	@Override
	public String findData() {
		
		System.out.println("oracle findmethod");
		return "oracle ";
	}

}
