package AllWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdownBasic1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();

		Thread.sleep(3000);
		// open url -file:///C:/brahma/Practise/qtp%20practise/web%20apps/SampleWebpage.html
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/SampleWebpage.html");

		//select  'Maruthi' in Multi Select dropdown?
		
		WebElement carsDropdown =  driver.findElement(By.name("multicars")); 
		Select sel = new Select(carsDropdown);
		sel.selectByVisibleText("Maruthi");
		
		// select Audi	
		sel.selectByVisibleText("Audi");
		

		// HW Select  'Kia' in Multi Sleect dropdown
		

		//HW  invalid  Volksswagen

		// org.openqa.selenium.NoSuchElementException: Cannot locate option with text: Volksswagen


		// HW 2.select Maruthi, Audi values by using SelectByValue()

		// HW 3. select 1st, 2nd value by using  Select By Index ()

		// HW  get all dropdown values count

		// HW get all vals from Multi Select drop down?


		// get all selected values from Multi select dropdown ?
		//				                selectedValsFromDropdown=Maruthi
		//						selectedValsFromDropdown=Benz
		//						selectedValsFromDropdown=Audi
		
		//                                                getptions()
		 //  String, Webele, List<Webele>
		//  <option>  </option>
		
		List<WebElement> AllSelectedOptions =  sel.getAllSelectedOptions();// <option>  
		
		// count of selected values 
		 int selectedValsCnt =  AllSelectedOptions.size();
		System.out.println("selectedValsCnt="+selectedValsCnt); // 4

		// display all selected values 
		for(int i=0;i<=selectedValsCnt-1;i++)
		{
			String selectedValue =  AllSelectedOptions.get(i).getText();
			System.out.println("selectedValue="+selectedValue);
		}
			 
		
		

		// HW 2.get all selected values using for each loop,

		// Hw 3. get all selected values using iterator()
		
		// HW 4.get all selected values using listIterator()

		// Check Dropdown is multiple Selection or single selection
//		<select multiple="" name="multicars">

		//                           true
		//  isMultiple  = true 
		//  can be used to check given dropdown is multiple selection or not
		// if it is Multi select dropdown , this method returns true else false
		System.out.println("isMultiple=");// true 

		


	}

}
