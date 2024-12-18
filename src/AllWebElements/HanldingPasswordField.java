package AllWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HanldingPasswordField {

	public static void main(String[] args) throws InterruptedException {
		//open chrome browser		
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();

		Thread.sleep(3000);
		// open url -file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");

	
		// enter  Mercury "  in password text box
		//				1. find paassword ele  using id 

		WebElement   pwdEle =  driver.findElement(By.id("idpwd"));
		pwdEle.sendKeys("Mercury");
		

		// get the entered  val from password
		String valFromPwd = pwdEle.getAttribute("value");
		//                        Mercury   

		System.out.println("valFromPwd="+valFromPwd);
		//ValFromPwd= Mercury

		//	HW   check  pwd ele  is displayed 

		// HW  pwd ele is enabled 

		// HW pwd  ele is selected --  dont prefer   ????


		// HW Enter some data in password by  'name' locators

		// HW  enter 'merucry 3'  in 'New Password:' using name , id 



	}

}
