package Selenium4Features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchNewWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

				WebDriver driver = null;

				System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
				// //open chrome browser
				driver = new ChromeDriver();

//				driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
//				
//								  
//				  Thread.sleep(5000); 
//				  // open new window and switch to that window //
//				  driver.switchTo().newWindow(WindowType.WINDOW);
//				  
////				  driver.switchTo().newWindow(WindowType.WINDOW);
//				  
//				  
//				  // driver.switchTo().window(WindowType.WINDOW);// dont use this //
//						  
//				  // open some url in 2nd browser driver.get("https://www.google.com/");
//				  driver.get("https://www.google.com/");
//				  // search Rama in google 
//				  driver.findElement(By.name("q")).sendKeys("Rama");
//				 

				// ********************
//				// open given url in browser
				
				  driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
				  Thread.sleep(5000);
				  
				  // open "new tab" and switch control to new tab//
				  driver.switchTo().newWindow(WindowType.TAB);
				  
				  
				  
//				  driver.switchTo().window(WindowType.WINDOW);// dont use this
//				  driver.switchTo().newWindow(WindowType.TAB); // tab-2
				  
				  // open some url in 2nd  tab -https://www.google.com/
				  
				  driver.get("https://www.google.com/");
				  // search "Rama" in google 
				  driver.findElement(By.name("q")).sendKeys("Rama");
				  
				  Thread.sleep(5000);
				  
				  // open "new tab"  and Switch to new tab  --tab3
				  driver.switchTo().newWindow(WindowType.TAB);
				  Thread.sleep(5000);
				  // open https://www.facebook.com/ in tab3 

				  driver.get("https://www.facebook.com/");				  
				  


	}

}
