package AllWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextboxAbsoluteXpath {

	public static void main(String[] args) {
		//open chrome browser
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver  driver =  new ChromeDriver();

		// open url file:///C:/brahma/Practise/SelniumPractiseNew/SampleWebpage.html
		driver.get("file:///C:/brahma/Practise/SelniumPractiseNew/SampleWebpage.html");


		//how to use  Absolute xpath 
		// enter some value in first name text box  by using absolute xpath

		WebElement firstNameTxtboxEle = driver.findElement(By.xpath("/html/body/input[1]"));
		firstNameTxtboxEle.sendKeys("Raju");
		
		// enter some value in Last name textbox  by using absolute xpath
		WebElement lastNameTxtboxEle = driver.findElement(By.xpath("/html/body/input[3]"));
		lastNameTxtboxEle.sendKeys("yadhav");

		// HW  Enter some value in new text box using absolute xpath

		// HW Enter some value in 'middle name'  textbox using absolute xpath


		// Note:  SessionNotcreatedException :   when browser version and chromedriver.exe file version are different, then it throws
		// SessionNotcreatedException
		// When we get this excpetion,  we have to check chrome browser version  and download repective chromedriver version.
		//  chrome browser 103  version --   download chromdriver.exe file 103 version
		//  101  -->   104 version



	}

}
