package AllWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownBasicsBySelectByIndexNo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();

		Thread.sleep(3000);
		// open url -file:///C:/brahma/Practise/qtp%20practise/web%20apps/SampleWebpage.html
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/SampleWebpage.html");


		// Select : is predefined class in Selenium 
		// has some methods , can select values in dropdown 
		//		1.selectByVisibleText​(java.lang.String text)  --> done
		//		2.selectByValue​(java.lang.String value)  --> done 
		//		3.selectByIndex​(int index)

		// select 1st val in dropdown using index no =0 --> select maruthi
		WebElement  carsDropdown =  driver.findElement(By.id("carid"));
		Select sel  = new Select(carsDropdown);
		sel.selectByIndex(0);
		
		Thread.sleep(4000);
		// select 2nd val in dropdown using index no =1		
		sel.selectByIndex(1);

		// HW select 3rd value, in dropdown using index no

		// HW select 4th value in dropdown using index no


		// - ve  index no = 5
		sel.selectByIndex(5);
		// error :  we dont have any value at indexno 5 
		// org.openqa.selenium.NoSuchElementException: Cannot locate option with index: 5



	}

}
