package AllWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownBasicsUsingSendkeys {

	public static void main(String[] args) throws InterruptedException {
		//open chrome browser		
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();

		Thread.sleep(3000);
		// open url -file:///C:/brahma/Practise/qtp%20practise/web%20apps/SampleWebpage.html
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/SampleWebpage.html");

		// Send keys 'Audi'
		driver.findElement(By.id("carid")).sendKeys("Audi");


		Thread.sleep(3000);
		// Send keys 'BMW'
		driver.findElement(By.id("carid")).sendKeys("BMW");

		Thread.sleep(3000);
//		// Send keys 'Kia'

		driver.findElement(By.id("carid")).sendKeys("Kia");

	}

}
