package com.spring.demo3;

public class ReportService {																		    
//	ReportGenerator reportGenerator =(ReportGenerator) Container.getInstance().getComponent("pdfReportGenerator");

	ReportGenerator reportGenerator =(ReportGenerator) Container.getInstance().getComponent("htmlReportGenerator");

	public void generateReport() {
		System.out.println("收集、汇总数据！");
		System.out.println("生成柱状图等图标！");
		reportGenerator.generate();
	}
}
