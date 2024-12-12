package CanvasBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CanvasBasics1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
//		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver  = new ChromeDriver();

		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ChartColumns.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		 try {
	            // Navigate to the webpage with the canvas chart
	            Thread.sleep(3000);

	            // Locate the canvas element
	            WebElement canvas = driver.findElement(By.id("pieChart"));

	            // JavaScript to simulate a click at specific coordinates (e.g., x=150, y=75)
	            String calculateAndClickScript = 
	            	    "var canvas = arguments[0];" +
	            	    "var ctx = canvas.getContext('2d');" +
	            	    "var dataPoint = {x: 150, y: 75}; // Replace with dynamic logic if needed" +
	            	    "var event = new MouseEvent('click', {" +
	            	    "    clientX: canvas.getBoundingClientRect().left + dataPoint.x," +
	            	    "    clientY: canvas.getBoundingClientRect().top + dataPoint.y," +
	            	    "    bubbles: true," +
	            	    "    cancelable: true" +
	            	    "});" +
	            	    "canvas.dispatchEvent(event);";
	            	((JavascriptExecutor) driver).executeScript(calculateAndClickScript, canvas);

	            
	            System.out.println("Click on the canvas chart data point.");
	            Thread.sleep(3000);
	            // Execute the script to click on the canvas
	            ((JavascriptExecutor) driver).executeScript(calculateAndClickScript, canvas);
	            Thread.sleep(3000);
	            System.out.println("Clicked on the canvas chart data point.");
	        } finally {
	            // Close the browser
//	            driver.quit();
	        }
	    }
	}