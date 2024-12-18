package AllWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownBasicsBySelectByValue {

	public static void main(String[] args) throws InterruptedException {
		//open chrome browser		
				System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
				WebDriver  driver = new ChromeDriver();

				Thread.sleep(3000);
				// open url -file:///C:/brahma/Practise/qtp%20practise/web%20apps/SampleWebpage.html
				driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/SampleWebpage.html");


				// Select : is predefined class in Selenium 
				// has some methods , can select values in dropdown 
				//		1.selectByVisibleText​(java.lang.String text)  --> done
				//		2.selectByValue​(java.lang.String value)
				//		3.selectByIndex​(int index)
				
				

				// 2nd way  SelectByValue("")
				// Select 'Mercedes'  by mercedesval
			WebElement  carsDropdown =  driver.findElement(By.id("carid"));
				Select sel = new Select(carsDropdown);
				sel.selectByValue("mercedesval");
				
				Thread.sleep(4000);

				// Select 'Audi'   by audi val
				sel.selectByValue("audival");
				
				// HW Select 'Kia' in dropdown  using selectByValue()

				// HW Select 'BMW' in dropdown using selectByValue

				// Case Sensitive -
				// pass invalid value -AudiVal
				sel.selectByValue("AudiVal");
					// error we have to give exact value attribute i.e 'audival'
				//   org.openqa.selenium.NoSuchElementException: Cannot locate option with value: AudiVal
				// AudiVal and 'audival'  both are diff


	}

}
