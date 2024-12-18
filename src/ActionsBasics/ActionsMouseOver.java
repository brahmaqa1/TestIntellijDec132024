package ActionsBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMouseOver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();

		Thread.sleep(3000);
		// get("url ") - to open the url in chrome browser
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/MenuDesciption.html");

		// Move mouse over  to 'W3Schools ' ele 
		// create obj for Actions class
		Actions act  = new Actions(driver);//  1 PC
		
		WebElement w3schoolsEle=  driver.findElement(By.id("id1"));
		act.moveToElement(w3schoolsEle).perform();

	// 1 PC 
		
//		act.moveToElement(w3schooleEle);// not working
		// at end we have to use perform();. if we don t use .perform() at end,  mouse movement operations will not be performed
	

		// get text from column -2
		// Col2Text =W3Schools is the best Web Developers resource on the Web
		//				<a>  my gmail </a>
		//				<td> W3Schools is the best Web Developers resource on the Web	</td>
		String Col2Msg =  driver.findElement(By.id("tip")).getText();
		
		System.out.println("Col2Msg="+Col2Msg);
		//Col2Msg=W3Schools is the best Web Developers resource on the Web		

		Thread.sleep(3000);

		//HW  Move mouse over  to 'Internet Explorer ' ele   and get column2 text
		///  Col2Text =Internet Explorer is winning the browser war


		// HW  Move mouse over  to 'Netscape Navigator' ele  and get column2 text



	}

}
