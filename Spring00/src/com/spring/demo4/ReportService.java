package com.spring.demo4;

public class ReportService {																		    
	private ReportGenerator reportGenerator;
	
	public void setReportGenerator(ReportGenerator reportGenerator) {
		this.reportGenerator = reportGenerator;
	}
	
	public void generateReport() {
		System.out.println("收集、汇总数据！");
		System.out.println("生成柱状图等图标！");
		reportGenerator.generate();
	}
}
