package BrowserBasics;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowerBasics1 {

	public static void main(String[] args) {
		//  2 steps
		//1 . Set property -chromerdriver.exe file path
		//2.  create obj for 'ChromeDriver' class

		//System.setProperty("webdriver.chrome.driver", " path of chromedriver .exe ");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

		//  Relative path 
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		//  . --> refers current project folder 

		//		//open chrome browser -create obj for ChromeDriver class
//		ChromeDriver driver = new ChromeDriver();


		//new ChromeDriver();	// opens chrome browser
		// FAQ Walmart  new ChromeDriver(); does it create obj or not?
		//  yes.  it creates object	
		new ChromeDriver();

	}

}
