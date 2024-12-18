package ActionsBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DeleteValFromTextboxUsingActionsClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		// . Represents current project folder name

		//		//open chrome browser
		WebDriver  driver =  new ChromeDriver();
		// get("url ") - to open the url in chrome browser
		driver.get("file:///C:/brahma/Practise/SelniumPractiseNew/SampleWebpage.html");


		// Enter some data in first name text box 
		driver.findElement(By.id("fid")).sendKeys("Rama");
		Thread.sleep(4000);

		// delete the value from first name  text box using action class 
		// note :  assume that clear() - is not working
		// click in first name textbox and press ctrl + A  and Delete  from k/b
		Actions act = new Actions(driver);
		WebElement firstNameTxtbox  = driver.findElement(By.id("fid"));
//		act.click(firstNameTxtbox).sendKeys(Keys.CONTROL).sendKeys("A").sendKeys(Keys.DELETE).perform();
					//  not working 

		//  press contrl, shift,  --  we have to  use  keydown()
		act.keyDown(Keys.CONTROL).sendKeys("A").perform();
		Thread.sleep(3000);
		
		act.sendKeys(Keys.DELETE).perform();
		Thread.sleep(3000);
		
		// relase the pressed ctrl button
		act.keyUp(Keys.CONTROL).perform();
		System.out.println("removed the value from textbox");

		// Note:  if we use keydown(), we must use keyup() also  else it works differently in next steps
		// release the pressed control btn from k/b
		// if dont releases ctrl btn,   still control btn is pressed from k/b only


		//HW  enter some data in last name,  press control  + A + Delete  from k/b


	}

}
