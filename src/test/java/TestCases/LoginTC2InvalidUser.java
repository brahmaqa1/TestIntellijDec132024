package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import AllPages.LoginPage;
import Utilities.WebUtilites;

public class LoginTC2InvalidUser {

	@Test
	public void loginTC2()
	{
//		// open browser		
		WebUtilites wutil = new WebUtilites();
		WebDriver driver =  wutil.openBrowser("chrome");
//
//
//		// open url = https://opensource-demo.orangehrmlive.com/auth/login
//
		wutil.openUrlInBrowser("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//

//		// open browser		
//		// open url in browser
//		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
//
////		//		//open chrome browser
//		WebDriver driver =  new ChromeDriver();
////		// open url = https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
//		driver.get("https://opensource-demo.orangehrmlive.com/auth/login");
////                   https://opensource-demo.orangehrmlive.com/auth/login
//		// .implicitlyWait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		// Enter user name  = Admin
		// Create loginpage class object

		// enter_Password -admin123


		// clickLoginBtn'
		LoginPage lpage = new LoginPage(driver);
		lpage.loginToAppl("Admin", "admin12345");


		// Verify 'Invalid credentials' msg is displayed
		lpage.verifyInValidCrednetialsMsg();
	}

}
