package ActionsBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElementBasics {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		// . Represents current project folder name

		//		//open chrome browser
		WebDriver  driver =  new ChromeDriver();

		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");		
		
		Thread.sleep(4000);
		
		// Scroll to 'Choose File ' btn
		Actions act = new Actions(driver);
		WebElement ChooseFile = driver.findElement(By.id("fileid"));
		act.scrollToElement(ChooseFile).perform();
	

		System.out.println("ends");
		


	}

}
