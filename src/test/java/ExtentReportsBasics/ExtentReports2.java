package ExtentReportsBasics;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReports2 {

	ExtentSparkReporter exSparkRepo;
	ExtentReports exRepo;
	
	
//	BT BM only once   - BM - multiple 
	@BeforeTest
	public void generateReport()
	{
		 exSparkRepo =  new ExtentSparkReporter("C:\\brahma\\Practise\\SelniumPractiseNew\\JulMBtach2024WorkSpace\\MavenProjectThroughCommand2\\src\\test\\java\\ExtentReportsBasics\\MyExtentReports.html");
		 exRepo =  new ExtentReports();
		exRepo.attachReporter(exSparkRepo);
		

		 //configuration items to change the look and feel
	       //add content, manage tests etc
		// setDocumentTitle
		exSparkRepo.config().setDocumentTitle("Orange HRMS Report title");
		
				
//		setReportName
		exSparkRepo.config().setReportName("Orange HRMS Automation Test Report");
		
		
//		setTheme
		exSparkRepo.config().setTheme(Theme.STANDARD);
				
		//setTimeStzampFormat
		exSparkRepo.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");

		

		
	}
	
	
	@Test
	public void testA()
	{
		System.out.println("stmt-1 from testA");

//		ExtentSparkReporter exSparkRepo =  new ExtentSparkReporter("C:\\brahma\\Practise\\SelniumPractiseNew\\FrameWorkDesigningPractiseWorkSpace\\DataDrivenFrameWorkAsh\\src\\test\\java\\ExtentReports2\\MyExtentReports.html");
//		ExtentReports exRepo =  new ExtentReports();
//		exRepo.attachReporter(exSparkRepo);

		// create Test - pass Test Name and description
		ExtentTest exTest = exRepo.createTest("LoginTC1", "Login Test 1 Description ");

		//Log diff msgs in reports(pass,fail, info, warning..etc)
		//log pass msgs in extent report
		//  1.Open Browser
		//  2.Enter url

		exTest.log(Status.PASS, "Open app");

		// Log fail  msgs in extent reports		
		// 3.enter user name
		// 4.enter password
		exTest.log(Status.PASS, "Eter user");				
		exTest.log(Status.PASS, "Enter pwd");
		exTest.log(Status.PASS, "click login");


		//HW  send  some'info' msg in extent reports

		//HW send some 'warning' msg  in extent reports
		
	

		// to view reports -flush(); 
		// if we dont write  this line, results file will not be created
//		exRepo.flush();
	}
	
	@Test
	public void testB()
	{
		//testB: TC02: Create Order
		ExtentTest exTest = exRepo.createTest("testB:TC02:Create Order", "Create Order Description ");
		
		//Search for Product
		exTest.log(Status.PASS, "Search for Product");
		
		//Select the Samsung mobile
		exTest.log(Status.PASS, "Select the Samsung mobile");
		
		// add 2 qty
		exTest.log(Status.PASS, "add 2 qty");
	}
	
//	AT AM
	@AfterTest
	public void endReport()
	{
		exRepo.flush();
	}
	

	
}
