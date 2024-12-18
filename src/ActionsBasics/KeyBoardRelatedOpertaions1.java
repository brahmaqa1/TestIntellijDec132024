package ActionsBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardRelatedOpertaions1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		// . Represents current project folder name

		//		//open chrome browser
		WebDriver  driver =  new ChromeDriver();		
		driver.get("file:///C:/brahma/Practise/SelniumPractiseNew/SampleWebpage.html");	


		// Move mouse over 'first name' text box and click and send some  data 
		Actions act  = new Actions(driver);
		WebElement firstNameTxtbox = driver.findElement(By.id("fid"));
		act.moveToElement(firstNameTxtbox).click().sendKeys("Rama").perform();

		Thread.sleep(2000);
		// press 'tab'  and enter some value in 'new texbox' 
		act.sendKeys(Keys.TAB).perform();

		Thread.sleep(2000);
		act.sendKeys("new text ").perform();		
		// Send data to currently focussed ele 
		
		Thread.sleep(2000);

		// press tab
		act.sendKeys(Keys.TAB).perform();

		Thread.sleep(2000);
		//enter some value in 'last name' 
		act.sendKeys("last name").perform();


		// HW press tab  and enter 'rao' in 'MIDDLE NAME' text box 

		//HW  press tab and enter 'user -1' in 'user name' field

		//HW  press tab 2 times and enter 'mercury' in 'new password field


		System.out.println("ends");



	}

}
