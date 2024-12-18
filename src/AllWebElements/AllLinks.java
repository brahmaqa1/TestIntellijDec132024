package AllWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks {

	public static void main(String[] args) throws InterruptedException {
		//open chrome browser		
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();

		Thread.sleep(3000);
		// open url -file:///C:/brahma/Practise/qtp%20practise/web%20apps/SampleWebpage.html
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/SampleWebpage.html");

		///  HW get all Links count :  input , a , select  --->   <a href =" url"> My Gmail  </a>
//		List<WebElement> allLinks =  driver.findElements(By.xpath("//a"));
		List<WebElement> allLinks =  driver.findElements(By.tagName("a"));
		int linksCnt =  allLinks.size();
		System.out.println("linksCnt="+linksCnt);

		// get 1st link and click
//		allLinks.get(0).click();

		// get fist link text -- o/p:  My Gmail
		String  firstLinkText =  allLinks.get(0).getText();
		//                          <a> My Gmail </a>
		System.out.println("firstLinkText="+firstLinkText);// My gmail

		// HW get 2nd link and its text  (Open Face book)

		// HW get 3rd link and its text (Open Amazon Link)


		// get 9th link text

		//				 System.out.println("ninthLinkText=");
		// IndexOutOfBoundsException: Index 9 out of bounds for length 9
		// bcoz we dont have index no = 9   as list stores values/ elements in index no  0 to 8 .


		//HW  get 2nd link and click 		// clicks Open Facebook link

		// get 1st Link  url (href)
		String firstLinkUrl =  allLinks.get(0).getAttribute("href");
		System.out.println("firstLinkUrl="+firstLinkUrl);

		//HW  get 2nd link url

		// HW get 3rd link url


		// get all visible link texts from page  using for loop with index no?
		for(int i=0;i<=allLinks.size()-1;i++)
		{
			String linkText = allLinks.get(i).getText();
			System.out.println("linkText="+linkText);
		}
		

		//				 linkText=My gmail
		//						 linkText=Open Facebook
		//						 linkText=Open amazon
		//						 
		//**************************************************
		// HW   // get all visible link texts from page  using for each loop



		// 3 .HW  // get all visible link texts from page  using iterator()



		// 4 .HW   // get all visible link texts from page  using listiterator()


	}

}
