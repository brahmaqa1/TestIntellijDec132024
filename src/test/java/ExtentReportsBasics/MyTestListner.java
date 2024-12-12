package ExtentReportsBasics;

import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class MyTestListner implements ITestListener
{
	
	public static ExtentSparkReporter exSparkRepo;
	public static  ExtentReports exRepo;
	public static  ExtentTest exTest;
	
	@Override
	public void onStart(ITestContext context) 
{
		//		ITestListener.super.onStart(context);
		//exRep =  new ExtentReports(ResFile);
		// Reports will be created only once time
		String reportsFile = "C:\\brahma\\Practise\\SelniumPractiseNew\\JulMBtach2024WorkSpace\\MavenProjectThroughCommand2\\MyExtentReportsOne.html";
		
		// create date class obj 
		Date d = new Date();
		System.out.println("d="+ d);// Thu Oct 03 08:28:30 IST 2024
			     //Thu Oct 03 08:28:30 IST 2024
			//   Thu_Oct_03_08_28_30_IST_2024

			//replace space by _			                      
		String sdate = 	d.toString();
		sdate= sdate.replace(" ", "_");
		//     Thu_Oct_03_08:28:30_IST_2024
		
			//replace : -->  _
		sdate= sdate.replace(":", "_");
				// Thu_Oct_03_08_28_30_IST_2024
		System.out.println("sdate="+ sdate);
		
//		String reportsFile = "C:\\brahma\\Practise\\SelniumPractiseNew\\JulMBtach2024WorkSpace\\MavenProjectThroughCommand2\\MyExtentReports"+sdate+ ".html";


		
		// Create object for -ExtentReports class and pass file name
		System.out.println("reportsFile="+reportsFile);
		 exSparkRepo = new ExtentSparkReporter(reportsFile);
		 exRepo = new ExtentReports();		
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
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
//		ITestListener.super.onTestStart(result);
		//  gets executed for each @Test Method
//		exTest = exRepo.startTest("testA: TC01: Login Test");

		// get Test Method name in run time
		
		System.out.println("TestMethodName=");
		
		
		
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
//		ITestListener.super.onTestSuccess(result);
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
//		ITestListener.super.onTestFailure(result);
	}
	
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
//		ITestListener.super.onTestFailedWithTimeout(result);
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
//		ITestListener.super.onTestSkipped(result);
	}
	
	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
//		ITestListener.super.onFinish(context);
// 		at end - we have to endtest and 
			
		
		// to view reports -flush(); 
		// if we dont write  this line, results file will not be created
		exRepo.flush();
		
	}

	public void logPassMsg(String msg)
	{
		System.out.println("exTest ="+ exTest);
		exTest.log(Status.PASS, msg);
	}
	public void logFailMsg(String msg)
	{
		exTest.log(Status.FAIL, msg);
	}
	
	
	
}
