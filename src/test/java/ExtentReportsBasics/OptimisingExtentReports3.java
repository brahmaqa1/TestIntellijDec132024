package ExtentReportsBasics;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class OptimisingExtentReports3  extends MyTestListner
//extends MyTestListner
{ 
// get parent class var + Methods  i,e exRepo,exTest from MyTestListner-class  into child class
	
	
	@Test
	public void testB()
	{
		System.out.println("test B stmt-1");
		 exTest = exRepo.createTest("testB:TC02:Create Order", "Create Order Description ");
		
//		//Search for Product
//		exTest.log(Status.PASS, "Search for Product");
		
		logPassMsg("Search for Product");
//		
//		//Select the Samsung mobile
//		exTest.log(Status.PASS, "Select the Samsung mobile");
		logPassMsg("Select the Samsung mobile");
//		
//		// add 2 qty
//		exTest.log(Status.PASS, "add 2 qty");
		logPassMsg("add 2 qty");
		
		
				
	}
}
