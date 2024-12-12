package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import AllPages.HomePage;
import AllPages.LoginPage;
import AllPages.SystemUsersPage;
import Utilities.WebUtilites;

public class SearchForValidUserTc04 {
	
	@Test
	public void searchForValidUserTc04()
	{
		// TODO Auto-generated method stub
		// open browser		
		// open url in browser
		WebUtilites wutil = new WebUtilites();
		WebDriver driver = wutil.openBrowser("chrome");
		wutil.openUrlInBrowser("https://opensource-demo.orangehrmlive.com/auth/login");

		// 	loginToAppl
		// logintoAppl  pass user, pwd
		LoginPage lpage = new LoginPage(driver);
		lpage.loginToAppl("Admin", "admin123");//	
		


		// Verify Home page is displayed or not
		// Create obj for HomePage - class
		HomePage hPage = new HomePage(driver);
		hPage.isProfileImageDisplayed();



		//  Navigate to admin menu
		hPage.navigateToAdminMenu();

		// Verify System user page is displayed or not
		hPage.verifySystemUserPageDisplayed();
		
		
		// Search with valid user		
		// EnterValueInUserName
		SystemUsersPage sysUsersPage =  new SystemUsersPage(driver);
		String user=  "ramarao50";
		sysUsersPage.EnterValueInUserName(user);
		
			
		/// click Search button
		sysUsersPage.ClickSearch();
				
			// Verify  '(1) Record Found'  msg is displayed
		sysUsersPage.verify1RecordFoundMsg();
		// Verify the user is exist in table 
		hPage.verifyUserExistInTable(user);

	}

}
