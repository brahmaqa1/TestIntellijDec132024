package AllWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkBasics2 {

	public static void main(String[] args) throws InterruptedException {
		//open chrome browser
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		ChromeDriver  driver =  new ChromeDriver();

		Thread.sleep(3000);
		driver.navigate().to("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");

		// clikc 'click  My google  ' link
		//		1. Identify ele 2. what action to perform - click()
//				driver.findElement(By.name(""));// -- no name 
//				driver.findElement(By.id("")) ;// -- no id 
//				By.className("");// -- no class 
				
//			WebElement MygoogleLinkele= 	driver.findElement(By.linkText("Click My Google"));//					
//			MygoogleLinkele.click();
		
		
//		By.partialLinkText("partial link text");
//		By.partialLinkText("My Google");
//		By.partialLinkText("Google");

		// find element using by partialLinkText("My Google")
		WebElement clickMyGoogleLinkEle = driver.findElement(By.partialLinkText("My Google"));
		clickMyGoogleLinkEle.click();				
		// HW  if we pass invalid link text

//			Exception in thread "main" org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"link text","selector":"Click My Google1234"}

			
		//HW  get url name from  "click My google "link using partialLinkText()//				
//			// href val=https://www.google.com/
			
			
		// HW  get url of   'Click My Facebook'  link using partialLinkText()

		// HW Check Click My Facebook'  link  is displayed, is enabled using partialLinkText()


	}

}
