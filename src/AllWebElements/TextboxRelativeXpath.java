package AllWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextboxRelativeXpath {

	public static void main(String[] args) {
		//open chrome browser
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver  driver =  new ChromeDriver();
		driver.get("file:///C:/brahma/Practise/SelniumPractiseNew/SampleWebpage.html");

		//how to use  Relative xpath 
		// enter "Ramu" in first name text box by using Relative xpath (name)
		WebElement firstNameTxtboxEle = driver.findElement(By.xpath("//input[@name='fname']"));
		firstNameTxtboxEle.sendKeys("Raju");
		
		// enter "yadhav" in Last name textbox  by using Relative xpath(name)
		WebElement lastNameTxtboxEle = driver.findElement(By.xpath("//input[@name='lname']"));
		lastNameTxtboxEle.sendKeys("yadhav");

		// HW  Enter some data in 'Middle name'  and 'user name'  text box using relative xpath ?



	}

}
