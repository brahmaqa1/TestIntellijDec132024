package AllWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageBasics {

	public static void main(String[] args) throws InterruptedException {
		//open chrome browser
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		ChromeDriver  driver =  new ChromeDriver();

		Thread.sleep(3000);
		driver.navigate().to("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");


		//  check 'Penguins' Image is displayed  by id
		WebElement penguinImg =  driver.findElement(By.id("idimage"));
		boolean isDisplayed=  penguinImg.isDisplayed();

		System.out.println("isDisplayed="+isDisplayed);
		// isDisplayed=                          true

		// HW get 'src' attribute value for image ?

		//HW get 'width' attribute value for image ?

		//HW get 'height' attribute value for image ?

		//HW get 'alt ' attribute value for image ?



		//  dont have  name , id , class --- >  xpath, cssSelector



	}

}
