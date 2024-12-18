package AllWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonBasics {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver  driver =  new ChromeDriver();

		// open url  file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");

		// clear, Enter some value 'Raju' in first name text box ele by using 'name' 	
//		2 steps  1.  2
		WebElement   firstnameTxtboxEle = driver.findElement(By.name("firstname"));
		firstnameTxtboxEle.clear();
		
		firstnameTxtboxEle.sendKeys("Raju");
		
		// clear,Enter some value 'Swathi' in last name text box ele by using name
		WebElement  lastnameTxtBoxele=  driver.findElement(By.name("lastname"));		
		lastnameTxtBoxele.clear();			
		lastnameTxtBoxele.sendKeys("Swathi");
		
		Thread.sleep(5000);
		
		// Click 'My submit' button by name 
		//		driver.findElement(By.name("")); //  no name attr/ property in html tag
		
		//  so we go with id locator
		WebElement MySubmitBtEle=  driver.findElement(By.id("MyButton"));

		MySubmitBtEle.click();

		// HW click Login1 button


		//  HW  2.get attributes of 'MySubmit' button ex:  type, id , value
		
		

		//	HW	3. check 'Login1'  btn is displayed --> isDisplayed

		//	HW 	4. check 'Login1'  btn is              enabled  --> isEnabled()

		//	5.  check 'Login1'  btn is selected  --> isSelected()
		//			 

//		boolean isSelected = MySubmitBtEle.isSelected();
		
//		boolean  isSelected = MyButtonEle.isSelected();
		//Exception in thread "main" org.openqa.selenium.StaleElementReferenceException: stale element reference: stale element not found
//		  (Session info: chrome=116.0.5845.180)		

		//      Re identify  element 
		WebElement MysubmitBtnEle = driver.findElement(By.id("MyButton"));
		boolean isSelected = MysubmitBtnEle.isSelected();
			//                            false
//		Note :  We can write above 2 stmts in single line also
		
		// isSelected=false
		System.out.println("isSelected="+isSelected);// false

		//  dont prefer using isSelected() for textbox, Button elements
		// use isSelected()  for Radio button,  checbox ele


	}

}
