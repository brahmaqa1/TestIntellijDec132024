package TestCases;

// TestCases.LoginTC01

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import AllPages.HomePage;
import AllPages.LoginPage;

public class LoginTC01 {

    @Test
    public void loginTc01() {
        // open browser
        // open url in browser
        System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

        //		//open chrome browser
        WebDriver driver = new ChromeDriver();
        // open url = https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        //          https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
//                           https://opensource-demo.orangehrmlive.com/auth/login
        // .implicitlyWait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Enter user name  = Admin
        // Create loginpage class object
        LoginPage lpage = new LoginPage(driver);
        //enterUserName("Admin");
//				lpage.enterUserName("Admin");

        // enter_Password -admin123
//				lpage.enterPassword("admin123");


        // clickLoginBtn'
//				lpage.clickLoginBtn();


        // or

        // logintoAppl  pass user, pwd
        lpage.loginToAppl("Admin", "admin123");

        // Verify home page is displayed --isProfileImageDisplayed

        // Verify Profile Image is displayed or not
        // Create obj for HomePage - class
        HomePage hPage = new HomePage(driver);
        hPage.isProfileImageDisplayed();

    }


}
