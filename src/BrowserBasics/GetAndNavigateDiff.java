package BrowserBasics;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetAndNavigateDiff {

	public static void main(String[] args) throws InterruptedException {
		// open chrome browser 
		//2  create obj for ChromeDriver- Class 
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// open some url in browser-https://www.amazon.com/
		//  get()  it waits till it loads all elements in the page  , then only it goes to next stmt
		driver.get("https://www.amazon.com/");

		Thread.sleep(5000);

		// open https://www.facebook.com/
		driver.navigate().to("https://www.facebook.com/");
		// navigate() -  it does not wait till it loads all elements in the page 
		//			Thread.sleep(5000);

		// to navigate to previous page --https://www.amazon.com/
		driver.navigate().back();

		Thread.sleep(5000);

		//  go to next page 
		driver.navigate().forward();
		//used to navigate to  next page based on browser history
		//https://www.facebook.com/

		// Refresh page
		driver.navigate().refresh();

		// FAQ Diff get() and Navigate


	}

}
