package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl {
	
	private ReportDao reportdao;
	
	

	
	  @Autowired
	  
	  @Qualifier("sql")
	  public void setReportdao(ReportDao reportdao) {
	  System.out.println("serviceimpl constructor calling"); 
	  this.reportdao = reportdao;
	  }
	 
		
		/*
		 * String data = reportdao.findData(); System.out.println("data is procesing");
		 */

		/*
		 * public ServiceImpl(ReportDao reportdao) { super();
		 * System.out.println("serviceimpl method"); this.reportdao = reportdao; }
		 */

	
	
	public void generteReport() {
		 reportdao.findData();
		System.out.println("data is processing");
		
	}
	
	

}
