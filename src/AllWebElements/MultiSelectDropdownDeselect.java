package AllWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdownDeselect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();

		Thread.sleep(3000);
		// open url -file:///C:/brahma/Practise/qtp%20practise/web%20apps/SampleWebpage.html
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/SampleWebpage.html");

		//select  'Maruthi' in Multi Select dropdown?
		WebElement multicarsDropdownEle =  driver.findElement(By.name("multicars"));
		Select  sel  = new Select(multicarsDropdownEle);

		sel.selectByVisibleText("Maruthi");	
		Thread.sleep(4000);
		// select Audi	
		sel.selectByVisibleText("Audi");

		Thread.sleep(4000);
		// Deselect 'Maruthi' value in dropdown
		sel.deselectByVisibleText("Maruthi");
		Thread.sleep(4000);
		
		// Deselect 'Audi' value in dropdown
		sel.deselectByVisibleText("Audi");

		// HW deSelectByValue() 

		// HW DeselectByIndex ()		

		// deselect all values in Multi Sleect drodpown		

		sel.deselectAll();
		
		// check dropdown is multi select dropdown or not --isMultiple()
		 boolean  isMultiple = sel.isMultiple();
		 //                            true
		 System.out.println("isMultiple"+isMultiple);
		 
		 
		
		

	}

}
