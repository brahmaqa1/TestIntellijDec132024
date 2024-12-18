package AllWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RaidoBtnBasics {

	public static void main(String[] args) throws InterruptedException {
		//open chrome browser
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver  driver =  new ChromeDriver();

		// open url  file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");

		// click  'Male' radio btn using id
		WebElement maleRadioBtnEle = driver.findElement(By.id("maleid")); 
		maleRadioBtnEle.click();

		Thread.sleep(3000);

		//  check male radio btn is selected 
		boolean  isSelected =  maleRadioBtnEle.isSelected();
		//                                   true
		// isSelected = true 
		System.out.println("isSelected="+isSelected); // 
		//                isSelected=  true 

		// check 'Female' radio btn is selected using id 
		WebElement femaleRadioBtn =  driver.findElement(By.id("femaleid"));
		isSelected =  femaleRadioBtn.isSelected();
		//           isSelected2 =            

		//                             

		System.out.println("isSelected="+isSelected);// 

		// HW  check 'Male' radio btn is displayed

		// HW check 'Male' radio btn is enabled 


		//HW   get  id, type  attribute values for 'male' radio btn		 --getAttribute

		System.out.println("idVal=");

		//                  maleid 


		//                                radio
		System.out.println("type=");
		// type=radio


		//HW  click Female Radio btn using id

		// HW get  name, id attribute values for 'female' radio btn		




	}

}
