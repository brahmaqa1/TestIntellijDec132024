package ActionsBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickBasics {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();

		Thread.sleep(3000);
		// get("url ") - to open the url in chrome browser
		driver.get("file:///C:/brahma/Practise/SelniumPractiseNew/SampleWebpage.html");

		// Right click on 'Open gmail'  link		
		Actions act = new Actions(driver);
		WebElement openGmailLink =  driver.findElement(By.xpath("//a[text()='My gmail']"));
//		act.contextClick(openGmailLink).perform();



		// HW Right click on 'Open Facebook'  link		

		// Move the mouse over on 'Open gmail'  link  and right click
		act.moveToElement(openGmailLink).contextClick().perform();


		System.out.println("ends");



	}

}
