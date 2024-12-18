package AllWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleTextboxes {

	public static void main(String[] args) throws InterruptedException {
		//open chrome browser		
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();

		Thread.sleep(3000);
		// open url -file:///C:/brahma/Practise/qtp%20practise/web%20apps/SampleWebpage.html
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/SampleWebpage.html");

		//  get count of all textboxes in page 	-   findElement() -   findElements()
		List<WebElement>  allTextBoxes = driver.findElements(By.xpath("//DIV"));

		int allTextboxesCnt = allTextBoxes.size();
		//
		System.out.println("allTextboxesCnt="+allTextboxesCnt);

		// get first text box - from allTextboxes and enter 'first ' in first textbox
//		allTextBoxes.get(0).sendKeys("1st");

		// enter 'second ' value in 2nd element from all textboxes
//		allTextBoxes.get(1).sendKeys("2nd");

		//  HW  enter '3rd ' values in 3rd textbox from all textboxes

		//HW  enter ' 4 th ' values in 4th textbox from all textboxes


		//  enter 'Swathi' in all text boxes
		// 1. using for loop with index  no	
//		for(int i=0;i<=allTextBoxes.size()-1;i++)
//		{
////			allTextBoxes.get(0).
////			allTextBoxes.get(1). ..  100 text 
//			//          get(99)
//			WebElement ele = allTextBoxes.get(i);// String / Web ele / int	
//			
//			if(ele.isEnabled())
//			{
//				ele.clear();
//				Thread.sleep(1000);
//				ele.sendKeys("Swathi");	
//				//				Exception in thread "main" org.openqa.selenium.ElementNotInteractableException: element not interactable
//
//				//if ele (txt box) is disabled - if we try to clear data, enter data in text box- we will get ElementNotInteractableException
//
//			}		
//			
//		}



		//******************************************************
		//  2 nd use for each loop
		//		use for each loop for array list

//		for(WebElement  eachEle : allTextBoxes)
//		{
//			if(eachEle.isEnabled())
//			{
//				eachEle.clear();
//				eachEle.sendKeys("Mamatha");
//			}
//		}
		//						Exception in thread "main" org.openqa.selenium.InvalidElementStateException: 
		//							invalid element state: Element is not currently interactable and may not be manipulated
		//if ele (txt box) is disabled - if we try to clear data, enter data in text box-





		//				Exception in thread "main" org.openqa.selenium.ElementNotInteractableException: 
		//					invalid element state: Element is not currently interactable and may not be manipulated
		//if ele (txt box) is disabled - if we try to clear data, enter data in text box- we will get ElementNotInteractableException

		//		For example, trying to click on an element that is covered by another element or trying to interact with a disabled element may result in this exception.



		//***************************************
		// HW 3. way use iterartor ()				 

		// HW 4  way use listiterator()			




	}

}
