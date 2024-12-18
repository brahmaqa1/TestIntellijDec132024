package ActionsBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropByBasics {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();

		Thread.sleep(3000);
		// get("url ") - to open the url in chrome browser
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/dragdrop2.html");

		// Drag and drop image ele by x - axis 50,0

		Actions act = new Actions(driver);
		WebElement  srcEle =  driver.findElement(By.id("moveMe"));
		act.dragAndDropBy(srcEle, 50, 0);

		// moves the imag to x-axis i.e right side

		Thread.sleep(2000);

		// Drag and drop image ele by x - axis 100,0
		act.dragAndDropBy(srcEle, 100, 0).perform();;

		Thread.sleep(2000);

		// Drag and drop image ele by x - axis 150,0
		act.dragAndDropBy(srcEle, 150, 0).perform();;

		Thread.sleep(2000);

		// Drag and drop image ele by  y- axis 0,50
		act.dragAndDropBy(srcEle, 0, 50).perform();;

		Thread.sleep(2000);

		// Drag and drop image ele by  y- axis 0,100
		act.dragAndDropBy(srcEle, 0, 100).perform();;

		Thread.sleep(2000);

		// Drag and drop image ele by  y- axis 0,150
		act.dragAndDropBy(srcEle, 0, 150).perform();;

		Thread.sleep(2000);

		// Drag and drop image ele by  y- axis 0,200
		act.dragAndDropBy(srcEle, 0, 200).perform();;

		Thread.sleep(2000);


		// Hw  Drag and drop image ele  (top side)

		// Hw  Drag and drop image ele left side

		System.out.println("ends");



	}

}
