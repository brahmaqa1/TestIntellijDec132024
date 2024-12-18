package ActionsBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShiftRamu {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		// . Represents current project folder name

		//		//open chrome browser
		WebDriver  driver =  new ChromeDriver();		
		driver.get("file:///C:/brahma/Practise/SelniumPractiseNew/SampleWebpage.html");	

		//  click first name text box --   shift -ramu
		driver.findElement(By.id("fid")).click();
		
		//press shift button
		Actions act  = new Actions(driver);
		act.keyDown(Keys.SHIFT).perform();		
		Thread.sleep(2000);	
		//press shift 

		//type ramu -
		act.sendKeys("ramu").perform();
		Thread.sleep(2000);	

		


		// note :  if we use keydown, we have to use keyup() else it performs abnormal operations 
//		as shift button is pressed,  Release shift  button
		//   ok  working 
//		act.keyUp(Keys.NULL).perform(); // Dont use 
		// note:Performs a modifier key press. Does not release the modifier key - subsequent interactions may assume it's kept pressed. Note that the modifier key is never released implicitly -
		//either keyUp(theKey) or sendKeys(Keys.NULL) must be called to release the modifier.

		//				act.sendKeys(Keys.NULL).perform(); //   not working ?????		
		act.keyUp(Keys.SHIFT).perform();
		
		// press tab  and send 'Rao' 		
		act.sendKeys(Keys.TAB).sendKeys("Rao").perform();
		
		// Note : press shft  + tab = contrl goes to/ focus previous element 


	}

}
