package AllWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxBasics {

	public static void main(String[] args) throws InterruptedException {
		//open chrome browser
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();

		Thread.sleep(3000);

		//  open given url in
		// file:///C:/brahma/Practise/SelniumPractiseNew/SampleWebpage.html
		driver.get("file:///C:/brahma/Practise/SelniumPractiseNew/SampleWebpage.html");


		// click  Electronics checkbox using name
		WebElement   electronicsCheckboxEle = driver.findElement(By.name("electronics"));
		electronicsCheckboxEle.click();
		
		// click   'Computers'  checkbox using name
		WebElement  ComputersCheckBoxele = driver.findElement(By.name("computers"));
		ComputersCheckBoxele.click();
		
		Thread.sleep(5000);

		//again if we click  Computers  checkbox, it will unsleect chekcbox.
		ComputersCheckBoxele.click();

		// Hw check these checkboxes  'Electronics' is selected


		//  HW unselect 'Electronics' checkbox -- use click()


		// HW check 'Computers' checkbox is selected or not

		// HW  'Electronics'  checkbox is displayed 

		// HW  Electronics'  checkbox is enabled 


	}

}
