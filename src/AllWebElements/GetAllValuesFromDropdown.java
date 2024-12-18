package AllWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllValuesFromDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();

		Thread.sleep(3000);
		// open url -file:///C:/brahma/Practise/qtp%20practise/web%20apps/SampleWebpage.html
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/SampleWebpage.html");


		// get count of  cars dropdown vals using by select/option
		// count option tags in select tag
		List<WebElement>  allOptions = driver.findElements(By.xpath("//select[@id='carid']/option"));
		int  drodownValsCnt =  allOptions.size();
		System.out.println("drodownValsCnt=");// 5
		//  dont prefer this one 

		//  way-2 using getOptions()
		WebElement  carsDropdown =  driver.findElement(By.id("carid"));
		Select sel  = new Select(carsDropdown);
		List<WebElement> allOptions2 = sel.getOptions();//<option>  
			//            <options

		// String, Webelement , List<Webelement>
		int  cnt = allOptions2.size();
		System.out.println("cnt="+ cnt);//5 

		//  get all dropdown values Maruthi, Swiftvdi ,Mercedes
		//                  <option value="maruthival">Maruthi</option>
		// 		            <option value="audival">Audi</option>....

		// get first val in dropdown	- ie.  Maruthi
		String  val1Fromdropdown = allOptions2.get(0).getText();
		System.out.println("val1Fromdropdown="+val1Fromdropdown);

		// HW  get 2nd value in dropdown

		// // HW  get 3rd value in dropdown	

		// HW get 6 th value in dropdown?	

		// get all values from cars dropdown ?	
		for(int i=0;i<=allOptions2.size()-1;i++)
		{
		  	WebElement  OptionEle   =  allOptions2.get(i); 
		  	//<option>   </option>
		  	String val =  OptionEle.getText();
			System.out.println("all vals from dropdown =" + val);
		}		
		//			        all vals from dropdown =Maruthi
		//					all vals from dropdown =Audi
		//					all vals from dropdown =Kia
		//					all vals from dropdown =BMW

		// HW  get all values from cars dropdown  using for each loop?

		// HW 3 get all values from cars dropdown  using iterator()?

		// HW  4. get all values from cars dropdown  using listIterator () ?


	}

}
