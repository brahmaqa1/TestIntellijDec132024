package WebtableBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromTable {

	public static void main(String[] args) {

//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32 (8)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		// . Represents current project folder name

		//		//open chrome browser
		ChromeDriver  driver =  new ChromeDriver();
		// get("url ") - to open the url in chrome browser
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/WebTableAll.html");

		// read data from row -1  column -1		
		//table[@name='TestCaseTable']/tbody/tr[1]/th[1]
		String data11 = driver.findElement(By.xpath("//table[@name='TestCaseTable']/tbody/tr[1]/th[1]")).getText();
		
		System.out.println("data11="+data11);
		
		// HW read data from row -1  and Column -2

		//HW read data from row -1  and Column -3


		// get complete data from row-1 
		//		 TCID Test Case Description Expected Value Actual Value Result

		String row1Data=  driver.findElement(By.xpath("//table[@name='TestCaseTable']/tbody/tr[1]")).getText();
		System.out.println("row1Data="+row1Data);
		
		// HW  get complete data from row-2
		
//		HW  get complete data from row-3 

		// get all coumn names //table[@name='TestCaseTable']/tbody/tr[1]/th
		List<WebElement> allthTags =  driver.findElements(By.xpath("//table[@name='TestCaseTable']/tbody/tr[1]/th"));
		String colName = null;
		for(int i=0;i<=allthTags.size()-1;i++)
		{
			colName =  allthTags.get(i).getText();
			//
			System.out.println("colName="+colName);
		}
			
		
		
		
		//		                ColumnNames =TCID
		//				ColumnNames =Test Case Description
		//				ColumnNames =Expected Value
		//				ColumnNames =Actual Value
		//				ColumnNames =Result


		// HW 2. get all columns   use for each loop 

//		/ HW 3. get all columns  using iterator() 

		//HW 4.  get all columns  using listIterator()


	}

}
