package com.spring.demo3;

public class Run {

	public static void main(String[] args) {
		
		ReportService reportService = (ReportService)Container.getInstance().getComponent("reportService");
		
		reportService.generateReport();

	}

}
