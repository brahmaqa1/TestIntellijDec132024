package ActionsBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardRelatedOpertaionsTabSpace {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		// . Represents current project folder name

		//		//open chrome browser
		WebDriver  driver =  new ChromeDriver();		
		driver.get("file:///C:/brahma/Practise/SelniumPractiseNew/SampleWebpage.html");		

		// send 'merucry '  in 'new password field
		// clicking new password ele  and send data 
		Actions act  = new Actions(driver);
		WebElement newPwdEle=  driver.findElement(By.id("pid2"));
		act.click(newPwdEle).sendKeys("new pwd").perform();	
		
		Thread.sleep(2000);
		
		// press tab
		act.sendKeys(Keys.TAB).perform();

		Thread.sleep(2000);		
		//press space btn from keyboard - select male radio button
		act.sendKeys(Keys.SPACE).perform();

		Thread.sleep(2000);

		// press tab from keyboard -- so focus on Female radio button
		act.sendKeys(Keys.TAB).perform();

		Thread.sleep(2000);
		//  Press space from k/b  - to select 'Female' radio btn
		act.sendKeys(Keys.SPACE).perform();
		Thread.sleep(2000);

		//HW  press tab and press space button from k/b - selects -'Electronics' chk box


		//HW  press tab and press space button from k/b - selects -'Computers' chk box

		//HW  press tab and press space button from k/b - selects -'Civil' chk box

		//HW  press tab  -  focus is on 'Login'  btn   and press Space or Enter button in k/b


		System.out.println("ends");



	}

}
