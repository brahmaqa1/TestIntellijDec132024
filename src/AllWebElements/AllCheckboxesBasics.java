package AllWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllCheckboxesBasics {

	public static void main(String[] args) throws InterruptedException {
		//open chrome browser		
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();

		Thread.sleep(3000);
		// open url -file:///C:/brahma/Practise/qtp%20practise/web%20apps/SampleWebpage.html
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/SampleWebpage.html");

		// get all checkboxes cnt 	
		//    FE FELS
		List<WebElement> allCheckboxes =  driver.findElements(By.xpath("//input[@type='checkbox']"));

		int checkboxesCnt = allCheckboxes.size(); 
		System.out.println("checkboxesCnt ="+checkboxesCnt);

		//  Click first check box
		allCheckboxes.get(0).click();

		//HW  click 2nd checkbox		

		//HW  click 4 th check box		

		//   4  checkboxes 0 - 3 

		// click 5 th check box	
//		allCheckboxes.get(5).click();
		//				allcheckBoxesList.get(5).click();// error  :  dont have index no 5
		//java.lang.IndexOutOfBoundsException: Index 5 out of bounds for length 4


		//  1.Click all checkboxes using for loop with index no 	
		for(int i=0;i<=allCheckboxes.size()-1;i++)
		{
			// if checkbox is not sleected. click checkbox
			if(allCheckboxes.get(i).isSelected())
			{ //   false 
				
			}
			else
			{
				allCheckboxes.get(i).click();
			}
			
		}

		//  HW 2.Click all checkboxes using for each loop			

		// HW 3.Click all checkboxes using iterator ()		

		// HW 4.Click all checkboxes using listIterator()		

		//  HW unselect all check boxes 
		// hint :   if checkbox is selected --  click



	}

}
