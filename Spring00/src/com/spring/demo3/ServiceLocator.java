package com.spring.demo3;

public class ServiceLocator {

	private static Container container = Container.getInstance();
	
	public static ReportGenerator getReportGenerator() {
		return (ReportGenerator) container.getComponent("htmlReportGenerator");
	}
	
	
}
