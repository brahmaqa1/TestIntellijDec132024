package TestCases;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import AllPages.HomePage;
import AllPages.LoginPage;
import Utilities.ExcelUtilities;
import Utilities.WebUtilites;

public class CreateMultipleUsersTc06 {
	
	@Test
	public void createMultipleUsersTc06() throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		WebUtilites wutil = new WebUtilites();
		WebDriver driver = wutil.openBrowser("chrome");
		wutil.openUrlInBrowser("https://opensource-demo.orangehrmlive.com/auth/login");
//
//
//
//		// 	loginToAppl
		LoginPage  lpage=  new LoginPage(driver);
//	
		lpage.loginToAppl("Admin", "admin123");
//
//		// Verify Home page is displayed or not
		HomePage hpage = new HomePage(driver);
		hpage.isProfileImageDisplayed();
//
//
//		//  Navigate to admin menu
		hpage.navigateToAdminMenu();
//
//		// Verify System user page is displayed or not
		hpage.verifySystemUserPageDisplayed();
//

		String xlfile = ".\\TestData.xlsx";
		

		// read 'UserRole' column data from 'CreateUsers' sheet  and store into ArrayList
		ExcelUtilities xlutil = new ExcelUtilities();
		ArrayList<String>  UserRoleList = xlutil.readColumnData(xlfile, "CreateUsers", "UserRole");
		System.out.println("UserRoleList="+UserRoleList);

		// 		// read 'EmployeeName' column data from 'CreateUsers' sheet  and store into ArrayList
		ArrayList<String>  EmployeeNameList = xlutil.readColumnData(xlfile, "CreateUsers", "EmployeeName");
		System.out.println("EmployeeNameList="+EmployeeNameList);


		// 		// read 'Status' column data from 'CreateUsers' sheet  and store into ArrayList
		ArrayList<String>  StatusList = xlutil.readColumnData(xlfile, "CreateUsers", "Status");
		System.out.println("StatusList="+StatusList);

		// 		// read 'Username' column data from 'CreateUsers' sheet  and store into ArrayList
		ArrayList<String>  UsernameList = xlutil.readColumnData(xlfile, "CreateUsers", "Username");


		// 		// read 'Password' column data from 'CreateUsers' sheet  and store into ArrayList
		ArrayList<String>  PasswordList = xlutil.readColumnData(xlfile, "CreateUsers", "Password");


		// 		// read 'ConfirmPassword' column data from 'CreateUsers' sheet  and store into ArrayList
		ArrayList<String> ConfirmPasswordList = xlutil.readColumnData(xlfile, "CreateUsers", "ConfirmPassword");
			// create multiple users
//			hpage.createNewUser("Admin","orange","Enabled","sita","sita","sita");
			
			for(int i=0;i<=UserRoleList.size()-1;i++)
			{
				String userRole = UserRoleList.get(i);
				System.out.println("userRole= "+  userRole);
				
				String empName =  EmployeeNameList.get(i);
				
				String status =  StatusList.get(i);
				
				String userName =  UsernameList.get(i);
				String password =  PasswordList.get(i);
				String confirmPwd =  ConfirmPasswordList.get(i);
				
				hpage.createNewUser(userRole, empName, status, userName, password);
			}
			
				

		
	}

}
