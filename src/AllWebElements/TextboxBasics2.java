package AllWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextboxBasics2 {

	public static void main(String[] args) throws InterruptedException {
		// open chrome browser
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// wait for 3 sec
		Thread.sleep(3000);
		// open url -file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");


		//  check first name text box is displayed --isdisplayed()
		WebElement firstNameTxtboxEle =  driver.findElement(By.name("firstname"));
		boolean isDisplayed =  firstNameTxtboxEle.isDisplayed();
		
		///                                  true  
		//  isDisplayed  = true

		//		            isDisplayed=                 
		System.out.println("isDisplayed="+ isDisplayed);// true

		// check last anme text box is displayed or not using invalid locator
//		WebElement lastNameTxtboxEle = driver.findElement(By.name("lastname12345"));
//		isDisplayed =   lastNameTxtboxEle.isDisplayed();
		
		//   goes to browser / html page , it find the elmeent by name = lastname12345
		//  if ele is found in page with name = lastname12345, it returns 1st matched eleement only.
		// if ele is not found in page with name =lastname12345,  It throws NoSuchElementException:
		//    we dont have any tag anme where name = lastname12345



		//		System.out.println("isDisplayed2=");


		//   check  first name text box is enabled 
		boolean isEnabled =  firstNameTxtboxEle.isEnabled();
		//                                         true
		// isEnabled= true
		System.out.println("isEnabled="+isEnabled);//  true

		//  check Ename  text box is enabled or  not using name 
		WebElement enameTxtboxEle =  driver.findElement(By.name("ename"));
		isEnabled =  enameTxtboxEle.isEnabled();
		//                             false
		//
		System.out.println("isEnabled="+isEnabled);// false

		// first name text box is selected 
		boolean  isSelected =  firstNameTxtboxEle.isSelected();
		//                                    false
		// isSelected=false
		System.out.println("isSelected="+isSelected);//

		//note :  dont use isSelected() for text boxes 
		//use isSelected()   for radio btn, checkboxes but not for textbox   

		// by.id()   by.name()  by.className


		// Enter data  in 'First name : ' text box by  class locator
		firstNameTxtboxEle =  driver.findElement(By.className("firstclass"));
		firstNameTxtboxEle.sendKeys("Rama rao");
		
		//HW  Enter data  in 'Test field: ' text box by class locator



		//  it enters data first name texbox  ele but not testFieldTxtboxEle
		//   findEleemt()  returns 1st matched webelement only i.e first name text box


	}

}
