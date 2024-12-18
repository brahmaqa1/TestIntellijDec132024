package AllWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextboxesUsingCSs {

	public static void main(String[] args) throws InterruptedException {
		//  open Chrome browser
		//		1. 
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		//2  create obj for ChromeDriver- Class 
		WebDriver driver =  new ChromeDriver();// open chrome browser with empty url 	

		driver.get("file:///C:/brahma/Practise/SelniumPractiseNew/SampleWebpage.html");


		// Enter  "Raju" value in 'first name' text box using CSSSelector by using name
		// input[name='fname']
		WebElement firstNameTxtboxEle = driver.findElement(By.cssSelector("input[name='fname']"));
		firstNameTxtboxEle.sendKeys("Raju");
		
		Thread.sleep(3000);
		//  we can write in the single line 
		driver.findElement(By.cssSelector("input[name='fname']")).sendKeys("Swathi");
		
		
		// enter some value 'yadhav' in lAST NAME text box using CSS by using id
		//  input[id='lid']
		driver.findElement(By.cssSelector("input[id='lid']")).sendKeys("yadhav");
		
		//HW  Enter some value in pwd  using CSSSelector 

		// Hw get the entered value from last name text box using CSSSelector



	}

}
