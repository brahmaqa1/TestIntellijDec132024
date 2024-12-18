package BrowserBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserBasicsMethods1 {

	public static void main(String[] args) throws InterruptedException {

		
		//open chrome browser
//		ChromeDriver  driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		// we can store Chromdriver class obj reference in webdriver interface var
		WebDriver  driver =  new ChromeDriver();
		

					//  driver  - refers chrome browser
		//    Edgedriver

			// firefoxdriver		

		// to open the url in chrome browser
		//https://www.amazon.com/
		driver.get("https://www.amazon.com/");

		
		//  chrome browser
		Thread.sleep(3000);
		
		// get current url
		String url  = driver.getCurrentUrl();
		//                 
		//    url  = 
		System.out.println("url="+url);
		// 
		
		// get title of page 
		String    getTitle  = driver.getTitle();
		//                
		// getTitle  =  
		System.out.println("getTitle="+getTitle);
		//                      

		// get page source code of browser page
       String  htmlcode =   driver.getPageSource();
		
		System.out.println("htmlcode="+htmlcode);
		
		//		Thread.sleep(3000);
		// close()
		// close the currently focussed browser window
//		driver.close();
		
		//  quit() to close all browser windows which are opened by Selenium 
		driver.quit();
		// FAQ Diff close and quit()
		
		//FindElement()
		// findElements()
		// getWindowHandle()
		//				getWindowHandles()


	}

}
