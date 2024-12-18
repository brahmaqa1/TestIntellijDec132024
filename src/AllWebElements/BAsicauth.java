package AllWebElements;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BAsicauth {

	public static void main(String[] args) throws InterruptedException {
		// open chrome browser
//		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
//		
//		// Create an instance of ChromeOptions
//        ChromeOptions options = new ChromeOptions();
//        // Add the incognito argument
//        options.addArguments("--incognito");
//
//        // Initialize the WebDriver with ChromeDriver and ChromeOptions
//        WebDriver driver = new ChromeDriver(options);
//        
//		// wait for 3 sec
//		Thread.sleep(3000);
//		// open url -file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html
//		driver.get("https://httpbin.org/basic-auth/user/passwd");
		

//**************
//		 // Set proxy with credentials
//        Proxy proxy = new Proxy();
//        proxy.setHttpProxy("user:passwd@proxyserver:port");
//
//        // Configure ChromeOptions with proxy
//        ChromeOptions options = new ChromeOptions();
//        options.setProxy(proxy);
//
//        // Initialize WebDri	ver
//        WebDriver driver = new ChromeDriver(options);
//
//        driver.get("https://httpbin.org/basic-auth/user/passwd");
		//***************
//		Thread.sleep(3000);
//		 // Find an element (if needed) and send the Escape key
//        WebElement element = driver.findElement(By.tagName("body")); // Target the page
//        element.sendKeys(Keys.ESCAPE);
        
        //
        //****************
        
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		
		// Create an instance of ChromeOptions
        ChromeOptions options = new ChromeOptions();
        // Add the incognito argument
        options.addArguments("--incognito");

        // Initialize the WebDriver with ChromeDriver and ChromeOptions
        WebDriver driver = new ChromeDriver(options);
        
		// wait for 3 sec
		Thread.sleep(3000);
		// open url -file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html
		driver.get("https://httpbin.org/basic-auth/user/passwd");
		
        // Use Robot class to enter username and password
        Robot robot = new Robot();

        // Wait for the dialog to appear
        robot.delay(1000);

        // Enter username
        robot.keyPress(KeyEvent.VK_Y);
        robot.keyRelease(KeyEvent.VK_Y);
        // Add additional keys for the full username
        

        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);

        // Enter password
        robot.keyPress(KeyEvent.VK_P);
        robot.keyRelease(KeyEvent.VK_P);
        // Add additional keys for the full password

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        // Perform actions on the authenticated website

	}

}
