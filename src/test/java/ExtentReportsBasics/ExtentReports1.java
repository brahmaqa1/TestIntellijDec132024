package ExtentReportsBasics;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentReports1 {
	
	@Test
	public void testA()
	{
		System.out.println("stmt-1 from testA");
		// Extent Reports:
//		 3 imp classes 
		//		ExtentSparkReporter
		//		ExtentReports
		//		ExtentTest
		
		// create obj - ExtentSparkReporter
		ExtentSparkReporter exSparkRepo = new ExtentSparkReporter("C:\\brahma\\Practise\\SelniumPractiseNew\\JulMBtach2024WorkSpace\\MavenProjectThroughCommand2\\src\\test\\java\\ExtentReportsBasics\\MyExtentReports.html");
		
		// Create obj for- ExtentReports
		ExtentReports exRepo =  new ExtentReports();
		exRepo.attachReporter(exSparkRepo);
		
		
		 //configuration items to change the look and feel
	       //add content, manage tests etc
		// setDocumentTitle
		exSparkRepo.config().setDocumentTitle("Orange HRMS Report title");
		
				
//		setReportName
		exSparkRepo.config().setReportName("Orange HRMS Automation Test Report");
		
		
//		setTheme
		exSparkRepo.config().setTheme(Theme.DARK);
				
		//setTimeStzampFormat
		exSparkRepo.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");

		
		
		// create Test - pass - Test Name and description
		ExtentTest  exTest =  exRepo.createTest("test A", "test A - describption");

		//Log diff msgs in reports(pass,fail, info, warning..etc)
		
		//log pass msgs in extent report
		//  1.Open Browser
		//  2.Enter url
		exTest.log(Status.PASS, "1.Open Browser");
		exTest.log(Status.PASS, "2.Enter url");

		// Log fail  msgs in extent reports		
		// 3.enter user name
		// 4.enter password
		exTest.log(Status.FAIL, "3.enter user name");
		exTest.log(Status.FAIL, "4.enter password");


		//HW  send  some'info' msg in extent reports

		//HW send some 'warning' msg  in extent reports
		
	

		// to view reports -flush(); 
		// if we dont write  this line, results file will not be created
		exRepo.flush();
	}



}
