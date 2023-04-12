package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("sql")
public class SqlDao implements ReportDao {
	
	
	
	public SqlDao() {
		System.out.println("sqldao constructor calling");
	}

	@Override
	public String findData() {
		
		System.out.println("sql dao finddata method");
		return "Sqldao";
	}

}
