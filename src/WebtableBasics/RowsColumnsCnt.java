package WebtableBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RowsColumnsCnt {

	public static void main(String[] args) {
		//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32 (8)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		// . Represents current project folder name

		//		//open chrome browser // ctrl + shift + 0 
		WebDriver  driver =  new ChromeDriver();
		// get("url ") - to open the url in chrome browser
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/WebTableAll.html");
		//  get all rows cnt in 'test case' table
		//table[@name='TestCaseTable']/tbody/tr  - 4 ele  4 rows 
		//table[@name='TestCaseTable']//tr  - 4ele
		List<WebElement> alltrTags =  driver.findElements(By.xpath("//table[@name='TestCaseTable']/tbody/tr"));
		//                                    4 els
		
		 int rowsCnt = alltrTags.size();
		 
		System.out.println("rowsCnt="+rowsCnt);// rowsCnt=4

		// get columns cnt in table
		//table[@name='TestCaseTable']/tbody/tr[1]/th
		List<WebElement> allthTags =  driver.findElements(By.xpath("//table[@name='TestCaseTable']/tbody/tr[1]/th"));

		int colsCnt =  allthTags.size();
		System.out.println("colsCnt="+colsCnt);// colsCnt=5
		

		// HW   Write xpath to get rows cnt without using tbody 

		//HW get rows cnt  Use child / descendant

		// HW   Write xpath to get columns cnt without using tbody 

		


	}

}
