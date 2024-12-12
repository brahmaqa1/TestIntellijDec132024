package Log4JBasics;

import org.apache.log4j.Logger;

//import java.util.logging.Logger;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Log4jBasics1 {
	@Test
	public void LoginTC1()
	{
		// In Java, we can send msgs to console window 
		//1.Open chrome browser
		System.out.println("1.Open chrome browser");
		//2.Enter user name
		System.out.println("2.Enter user name");
		//3.Enter pwd
		System.out.println("3.Enter pwd");
		System.out.println("4.click login button");
		System.out.println("5.Verify Home page is displayed");

		// Testng :we can send msgs in testNG reports 
		//  2. index.html 2. emailable-report.html
		Reporter.log("1.Open chrome browser");
	
			//1.Open chrome browser
	
			//2.Enter user name
	
			//3.Enter pwd
	
			//4.click login button
			//5.Verify Home page is displayed

		// Log msgs in Extent reports
		//	ExtentSparkReporter	  ExtentReports, ExtentTest
			// extTest.log(Status.PAss,"1.Open the application")

		// to log msgs in logger files -Logger.getLogger("Ram");
		Logger log = Logger.getLogger("Ram");

		// log msgs in logger file - debug()
		
		//1.Open chrome browser
		log.debug("1.Open chrome browser");

		//2.Enter user name
		log.debug("2.Enter user name");
		//3.Enter pwd
		log.debug("3.Enter pwd");
		//4.click login button
		log.debug("4.click login button");
		//5.Verify Home page is displayed	
		log.debug("5.Verify Home page is displayed");
		
		log.info("");

	}




}
