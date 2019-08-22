package Utility;

import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.internal.DynamicGraph.Status;
import org.testng.xml.XmlSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.IReporter;
import com.relevantcodes.extentreports.LogStatus;

import com.relevantcodes.extentreports.model.Test;

public abstract class ExtentReportListener implements IReporter{
	//IReporter
	private ExtentReports extent; 

	
	//public static void main(String[] args) {
	
	
	public void generateReport(List<XmlSuite> xmlSuite, List<ISuite> Suits, String outputDirectory ) {
		extent= new ExtentReports(outputDirectory+File.separator+"MVCReport.html",true);
		
		for(ISuite suite:Suits ) {
			Map<String, ISuiteResult> result=suite.getResults();
			for(ISuiteResult r:result.values()) {
				
				ITestContext context = r.getTestContext();
				buildTestNodes(context.getPassedTests(),LogStatus.PASS);
				buildTestNodes(context.getFailedTests(),LogStatus.FAIL);
				buildTestNodes(context.getSkippedTests(),LogStatus.SKIP);
			}
			
		}
		extent.flush();
		
	}
	private void buildTestNodes(IResultMap tests, LogStatus status) {
		
		ExtentTest test; 
		System.out.println(tests.size()); 
			
			if(tests.size()>0) {
				
				for(ITestResult result: tests.getAllResults()) {
					
					test=extent.startTest(result.getMethod().getMethodName());
					test.setStartedTime(getTime(result.getStartMillis()));
					test.setEndedTime(getTime(result.getEndMillis()));
					for(String group: result.getMethod().getGroups()) {
						test.assignCategory(group);
						if(result.getThrowable()!=null) {
							test.log(status, result.getThrowable());
							
						} else
						{
							test.log(status, "Tests"+status.toString().toLowerCase()+"ed");
						}
						extent.endTest(test);
					}
					
				}
		}
	
		
	}
	private Date getTime(long millis) {
		// TODO Auto-generated method stub
		
		Calendar calen=  Calendar.getInstance();
		calen.setTimeInMillis(millis);
		return calen.getTime();
	}


}
