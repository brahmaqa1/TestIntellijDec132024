package ActionsBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropBasics {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();

		Thread.sleep(3000);
		// get("url ") - to open the url in chrome browser
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/dragdrop.html");


		//drag and drop	
		Actions act  = new Actions(driver);
		
		WebElement srcEle = driver.findElement(By.id("drag1"));
		WebElement targetEle = driver.findElement(By.id("div1"));
		
//		act.dragAndDrop(srcEle, targetEle).perform();
		
//		act.dragAndDrop(srcEle, targetEle).perform(); // not working in chrome
		//  try in Edge browser -check it  


		//  2nd way  clickAndHold(srcEle).moveToElement(targetEle)
//		act.clickAndHold(srcEle).moveToElement(targetEle).release().perform();// ok
	

		//3 --clickAndHold(srcEle).release(targetEle).
		act.clickAndHold(srcEle).release(targetEle).perform();//   working

		System.out.println("ends");


	}

}
