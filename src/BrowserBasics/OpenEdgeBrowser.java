package BrowserBasics;

import org.openqa.selenium.edge.EdgeDriver;

public class OpenEdgeBrowser {

	public static void main(String[] args) {
		// open Edge browser 
		//  2 steps
		//1 . Set property -chromerdriver.exe file path
		//2.  create obj for 'ChromeDriver' class

		//System.setProperty("webdriver.chrome.driver", " path of chromedriver .exe ");
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
//		ChromeDriver driver =  new ChromeDriver();				
//		//		//open chrome browser -create obj for ChromeDriver class
		
		
	//	System.setProperty("webdriver.edge.driver", "C:\\Users\\Lenovo\\Downloads\\edgedriver_win64 (8)\\msedgedriver.exe");
	//  give relative path of edgedriver.exe 
			System.setProperty("webdriver.edge.driver", ".\\Drivers\\msedgedriver4535.exe");

		//Exception in thread "main" org.openqa.selenium.remote.NoSuchDriverException: msedgedriver located at .\Drivers\msedgeddriver.exe, but invalid
//		For documentation on this error,
		

		// Always give correct path of edge driver file name and path 
		
		// create obj for EdgeDriver-class
					// open edge browser 
			EdgeDriver driver = new EdgeDriver();

	}

}
