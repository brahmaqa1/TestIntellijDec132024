package AllWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownUsingClick {

	public static void main(String[] args) throws InterruptedException {
		//open chrome browser		
				System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
				WebDriver  driver = new ChromeDriver();

				Thread.sleep(3000);
				// open url -file:///C:/brahma/Practise/qtp%20practise/web%20apps/SampleWebpage.html
				driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/SampleWebpage.html");
				
				// click on cars dropdown and click 'audival' specific value in dropdown
				driver.findElement(By.id("carid")).click();
				
				Thread.sleep(3000);
				//select[@id='carid']/option[text()='Audi']
				driver.findElement(By.xpath("//select[@id='carid']/option[text()='Audi']")).click();
//				driver.findElement(By.xpath("//option[text()='Audi']")).click();
//				driver.findElement(By.xpath("//*[text()='Audi']")).click();

				Thread.sleep(3000);
				driver.findElement(By.id("carid")).click();
				
				//click 'bmwval'


				// click cars drodown ele and click  Marithi using text
				//<option>Maruthi</option>
				//   //option[text()='Maruthi'] // use can this also



	}

}
