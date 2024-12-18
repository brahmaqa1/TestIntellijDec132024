package ActionsBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickUsingActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();

		Thread.sleep(3000);
		// get("url ") - to open the url in chrome browser
		driver.get("file:///C:/brahma/Practise/SelniumPractiseNew/SampleWebpage.html");

		//  doubleclick  -male radio btn	
		Actions act = new Actions(driver);
		WebElement maleRadioBtnEle = driver.findElement(By.id("maleId"));
		
		act.doubleClick(maleRadioBtnEle).perform();

		// Double click 'Electronics ' checkbox
//		electronics
		WebElement electronicsChkbox = driver.findElement(By.id("eleId"));
		act.doubleClick(electronicsChkbox).perform();
		
		Thread.sleep(5000);
		


		//HW  double click 'My gmail' link using actions class



	}

}
