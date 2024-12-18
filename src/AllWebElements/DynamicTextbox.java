package AllWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTextbox {

	public static void main(String[] args) {
		// open chrome 
		//  open Chrome browser
		//				1. 
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		//2  create obj for ChromeDriver- Class 
		WebDriver driver =  new ChromeDriver();// open chrome browser with empty url 

		driver.get("file:///C:/brahma/Practise/SelniumPractiseNew/SampleWebpage.html");

		// enter data in 'middle name' textbox  using mname345 -use contains
//		WebElement middleNAmeTxtboxEle = driver.findElement(By.xpath("//input[@name='mname502']"));
//		middleNAmeTxtboxEle.sendKeys("nanda");


		// enter data in middle name  using contains() 
		WebElement middleNAmeTxtboxEle = driver.findElement(By.xpath("//input[contains(@name,'mname')]"));
		middleNAmeTxtboxEle.sendKeys("nanda");



	}

}
