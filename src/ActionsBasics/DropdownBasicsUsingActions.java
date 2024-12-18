package ActionsBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropdownBasicsUsingActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		// . Represents current project folder name

		//		//open chrome browser
		WebDriver  driver =  new ChromeDriver();
		// note:   import all classes and interfaces -->  ctrl +  shift + o 
		
		driver.get("file:///C:/brahma/Practise/SelniumPractiseNew/SampleWebpage.html");		
		// Dropdown :   Select -  sleectbyVisibleText(), SelectByValue(), SelectByIndex()

		//using actions - class also I can handle dropdown
		// click cars dropdown using Actions class
		// Move mouse over to carsEle   and click		
		Actions act  = new Actions(driver);
		WebElement carsDropodnwel =  driver.findElement(By.id("carid"));
		act.click(carsDropodnwel).perform();	

		Thread.sleep(2000);
		// type in keyboard 'Audi'
		act.sendKeys("Audi").perform();
		//   send data to currenlty focusssed elemeent

		Thread.sleep(2000);

		// send  'Maruthi'
		act.sendKeys("Maruthi").perform();
		Thread.sleep(2000);

		// send  "Kia"
		act.sendKeys("Kia").perform();
		Thread.sleep(2000);		

		// Press enter  btn from keyboard
		act.sendKeys(Keys.ENTER).perform();
		
		// HW click cars dropdown and Send  'BMW  values and press enter 

		// HW Select 'TVS' in 'bikes' dropdown using actions class

		// HW Select 'yamaha' in 'bikes' dropdown using actions class	

		System.out.println("ends");


	}

}
