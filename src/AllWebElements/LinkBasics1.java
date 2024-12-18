package AllWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkBasics1 {

	public static void main(String[] args) {
		//open chrome browser
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		WebDriver  driver  = new ChromeDriver();


		// open url -file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");


		// click 'My google' link
		//		1. Identify ele 2. what action to perform - click()
//		driver.findElement(By.id(""));
		// -- no name 
		// -- no id 
		//By.className("");// -- no class 

		//click 'My google'  link   By.linkText	
//		WebElement clickMygoogleLinkEle = driver.findElement(By.linkText("Click My Google"));
//		clickMygoogleLinkEle.click();
		
//		WebElement clickMygoogleLinkEle = driver.findElement(By.linkText("Click My Google1234"));
//		clickMygoogleLinkEle.click();
		// if no link text is there in page, ???
		//  it goes to html page ,  find the ele   by class locator i.e link text ="Click My Google1234"
		//   if  there is not match found in html page, it throws NoSuchElementException

		//			Exception in thread "main" org.openqa.selenium.NoSuchElementException: no such element:
		//Unable to locate element: {"method":"link text","selector":"Click My Google1234"}


		// get url name from link -"Click My Google"
		// href val=https://www.google.com/
		WebElement clickMygoogleLinkEle = driver.findElement(By.linkText("Click My Google"));
		String googleHrefAttr = clickMygoogleLinkEle.getAttribute("href");
		
		// 
		System.out.println("googleHrefAttr="+googleHrefAttr);
		//

		//  get link text for 'click My google' link --getText
		String Linktext = clickMygoogleLinkEle.getText();

		//       Linktext=
		//  use gettext()  for  <a>  clikc my google  <a>
		//                       <p>  </p>
		//                     <option>  </option>
		System.out.println("Linktext="+Linktext);


		// HW  get url of   'Click My Facebook'  link 

		// HW Check Click My Facebook'  link  is displayed, is enabled

		// HW  Click 'Click My Facebook'   and go back to previous page ,  

		//HW  get url  of 'Open Face book Link'  by using href attribute name 



	}

}
