package ActionsBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickUsingActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();

		Thread.sleep(3000);
		// get("url ") - to open the url in chrome browser
		driver.get("file:///C:/brahma/Practise/SelniumPractiseNew/SampleWebpage.html");

		// Click  'Male'  radio button using actions class
		Actions act  = new Actions(driver);
		WebElement maleRadioBtnEle = driver.findElement(By.id("maleId"));
		act.click(maleRadioBtnEle).perform();


		// HW Click Female  radio btn

		// click 'electronics' checkbox  using actions
		WebElement electronicsChkbox = driver.findElement(By.id("eleId"));
		act.click(electronicsChkbox).perform();
		
		// HW click ' Computers ' checkbox using actions

		// HW click on ' Civil' check box using actions

		//  2 nd way   click() -- no args 
		// Clicks at the current mouse location.
		//  move mouse over on 'FeMale'  raido btn  and click 
		WebElement femaleRadioBtnEle = driver.findElement(By.id("femaleId"));
		act.moveToElement(femaleRadioBtnEle).click().perform();		
		
		// In one line , We can perform multiple actions.--  composite actions
		


		////  move mouse over on 'Civil''  checkbox   and click
		WebElement  civilChkBoxEle = driver.findElement(By.id("civid"));
		act.moveToElement(civilChkBoxEle).click().perform();
		
		// HW Click Female  radio btn using click()  without args

		// HW click ''electronics' ' using click()  without args

				
		//		HW Click 'My gmail'  link using action class -  click() no args
		//		HW Click 'My gmail'  link using action class - click(ele) 
		
//	maleRadioBtnEle.click();
//		maleRadioBtnEle.doubleclick(); //  we dont have doubleclick in Webelement interface
//		   maleRadioBtnEle.righclick(); // //  we dont have righclick in Webelement interface



	}

}
