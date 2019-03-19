package first;

public class Test {

	public static void main(String[] args) {
		ReportService reportService = new ReportService(); 
		//pdf
		ReportGenerator pdfReportGenerator = new PdfReportGenerator();
		reportService.setReportGenerator(pdfReportGenerator);
		reportService.generateReport();
		
		//html
		ReportGenerator htmlReportGenerator = new HtmlReportGenerator();
		reportService.setReportGenerator(htmlReportGenerator);
		reportService.generateReport();
		
	}

}
