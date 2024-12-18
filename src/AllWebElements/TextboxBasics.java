package AllWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextboxBasics {

	public static void main(String[] args) throws InterruptedException {
		// open chrome browser
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// wait for 3 sec
		Thread.sleep(3000);
		// open url -file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");

		// Enter "Raju"  in  'First name' text box using by id 

		// 1. Identify/find 'first name' text box using properties --> id = idfirst
		// 2 . What action we are performing on element (Enter/ Send  "Raju" ) -- Method sendkeys()
		WebElement  firstNameTxtBoxEle = driver.findElement(By.id("idfirst"));		
		firstNameTxtBoxEle.sendKeys("Raju");

		// import webele 
		//  findElement() -   find the element in browser by using id= 'idfirst'
		// and returns 1st matched element

		//  goes to browser /  html page - it will find the ele by id = "idfirst"
		// if ele/ tag is found , it returns first matched webelement 
		//  return type of findElement() is WebElement

		//   what action --> 


		// enter 'Swathi' in 'Last name' textbox using id
//		WebElement  lastNameTxtBox =  driver.findElement(By.id("idfirst"));
//		lastNameTxtBox.sendKeys("Swathi");
		//   it enters data in first name text box only but not last name 
		//    it returns first matched webelement i.e first name text box

		// enter 'Sowmya' in 'Last name' textbox using 'name'
		WebElement lastNameTxtBoxEle=  driver.findElement(By.name("lastname"));
		lastNameTxtBoxEle.sendKeys("Sowmya");
		
		// passing invalid locator  anme= lastname123
//		lastNameTxtBoxEle=  driver.findElement(By.name("lastname123"));
//		lastNameTxtBoxEle.sendKeys("Rama");
		//Exception in thread "main" org.openqa.selenium.NoSuchElementException:
		//no such element: Unable to locate element: {"method":"css selector","selector":"*[name='lastname123']"}
		// if ele is not found using given By class locator, it throws NoSuchElementException
		Thread.sleep(3000);
		// clear the value from first name textbox using name 
//		firstNameTxtBoxEle.clear();
		Thread.sleep(3000);
		// clear the value from last name textbox using name 
//		lastNameTxtBoxEle.clear();

		// HW Enter sita in 'Test field:' text box by using id

		//HW Enter sita in 'Test field:' text box by using name

		// get val from 'last name' text box  using name
		String valFromFirstNameTxtbox =  firstNameTxtBoxEle.getAttribute("value");
		
		System.out.println("valFromFirstNameTxtbox="+valFromFirstNameTxtbox);

		//                         
		// valFromFirstNameTxtbox  =
		
		// get name attr val  for  firstNameTxtBoxEle
		String nameVal = firstNameTxtBoxEle.getAttribute("name");
		//                                   firstname
		//nameVal  =  firstname
		System.out.println("nameVal= "+ nameVal);
			//                                firstname
		
		// get id attr val  for  firstNameTxtBoxEle
		String idVal =  firstNameTxtBoxEle.getAttribute("id");
		//                                  idfirst
		//  idVal = idfirst
		System.out.println("idVal= "+ idVal);
		//                             idfirst

		// HW Clear the value from 'Test field'

		// HW Enter Raju in 'Test field '  text box 

		// HW get val from 'Test Field' text box 



	}

}
