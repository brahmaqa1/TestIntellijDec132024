package AllWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownBasics {

	public static void main(String[] args) throws InterruptedException {
		//open chrome browser		
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();

		Thread.sleep(3000);
		// open url -file:///C:/brahma/Practise/qtp%20practise/web%20apps/SampleWebpage.html
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/SampleWebpage.html");


		// Select : is predefined class in Selenium 
		// has some methods , can select values in dropdown 
		//		1.selectByVisibleText​(java.lang.String text)
		//		2.selectByValue​(java.lang.String value)
		//		3.selectByIndex​(int index)


		// Select 'Audi'  value in cars dropdown		
		// create obj for 'Select'
		
		WebElement carsDropdownele = driver.findElement(By.id("carid"));
		Select sel = new Select(carsDropdownele);// 1 Pc 
		sel.selectByVisibleText("Audi");

		Thread.sleep(2000);

		// Select 'Kia'  value in dropdown	
		sel.selectByVisibleText("Kia");

		Thread.sleep(3000);

		//  get selected value in cars dropdown 
		//   gettext()   <a>  ToolTip link  </a>
		//       <option> Kia  </option>
		WebElement selectedOptionele = sel.getFirstSelectedOption();
		//  <option> Audi </option>   We or String or int 
		//
		String selectedValFromDropdown = selectedOptionele.getText();

		//or 
		// we can write above above code in single line


		//  Kia 
		System.out.println("selectedValFromDropdown="+selectedValFromDropdown);	


		//HW  Select ' Mercedes '  value in cars dropdown	

		// HW  get selected value in cars dropdown 

		// HW  Select  'Maruthi' values in cars dropdown ?

		// HW   get selected value in cars dropdown 


		// check dropdown down values are Case sensitive. so we have to give exact visible text from cars dropdown
		// select 'audi' pass invalid text
		sel.selectByVisibleText("audi");

		//				Thread.sleep(2000);
		//		" org.openqa.selenium.NoSuchElementException: Cannot locate option with text: audi
		// audi  and Audi  both are different .  We have to give 'Audi' only but not 'audi'	


		//HW selecting 'Honda'  val is not exist in cars dropdown



	}

}
