package com.spring.demo4;

import java.util.HashMap;
import java.util.Map;

public class Container {
	private static Container instance;
	private Map<String , Object> components;
	
	private Container() {
		instance = this;
		components = new HashMap<String,Object>();
		
		ReportGenerator htmlReportGenerator = new HtmlReportGenerator();
		components.put("htmlReportGenerator",htmlReportGenerator);
		ReportGenerator pdfReportGenerator = new PdfReportGenerator();
		components.put("pdfReportGenerator", pdfReportGenerator);
		ReportService reportService = new ReportService();
		components.put("reportService", reportService);
		
//		reportService.setReportGenerator(htmlReportGenerator);
		reportService.setReportGenerator(pdfReportGenerator);
		
	}
	
	public static Container getInstance() {
		if(instance == null) {
			instance = new Container();
		}
		return instance;
	}
	
	public Object getComponent(String key) {
		return components.get(key);
	}
	
	
}
