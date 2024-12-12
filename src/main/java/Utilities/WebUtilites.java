package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebUtilites 
{
	//  ............  etc
	//	int i ; // 0
	//	float f; // 0.0
	//	String name; //  null
	//	char ch ;  // space
	//	boolean b ;// false
	//	static WebDriver driver; //   null
	public static WebDriver  driver;


	//Browser :   common methods / Generic methods:
	//-------------------------------
	//		 Open chrome, Edge browser  --> openBrowser() --> Done
	//		 open url in browser		--> openUrlInBrowser("amazon.com") --> Done
	//		get title					--> getTitleOfBrowser()  -->  Done
	//		getcurrent url 		        --> HW 
	//		close single browser		--> HW
	//		close all browser			--> HW

	//***********************************************************************************************************************
	//					Browser Common/Generic Methods

	//***********************************************************************************************************************
	/*
	 * Method Name 		: openBrowser
	 * Objective		: It opens given browser i.e chrome, edge..etc
	 * Arguments		: String browserName
	 * Author		    : Shankar 
	 * Create Date 		: 16-Sep-2024
	 * Modified Date	: NA
	 * Method call		:  openBrowser("chrome");
	 * 						openBrowser("edge");
	 * 						
	 * Return type		: void
	 */

	public static WebDriver openBrowser(String browserName)
	{ //                                     chrome  browserName = chrome
		System.out.println("Open browser ="+ browserName);
		System.out.println("before initialising driver="+ driver); // ???? null
		
		if(browserName.equals("chrome"))
		{//  chrome				  true 
			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

			//		//open chrome browser
			driver =  new ChromeDriver();	
			System.out.println("driver=" + driver);
		}
		else if(browserName.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver", ".\\Drivers\\msedgedriver.exe");

			//		//open chrome browser
			driver =  new EdgeDriver();	
		}
		
		
		//  HW handle firefox browser code

		// HW Handle IE browser code
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// null * any method  --> Null pointer exception
		
		return driver;
	}


	/*
	 * Method Name 		: openUrlInBrowser
	 * Objective		: It opens given url in browser
	 * Arguments		: String url
	 * Author			: Shankar
	 * Create Date 		: 16-Sep-204
	 * Modified Date	: NA
	 * Method call		:  	openUrlInBrowser("amazon.com")	;				
	 * Return type		: void
	 */
	public static void openUrlInBrowser(String url)
	{
		System.out.println("open url ="+ url);
		System.out.println("drivr="+ driver);
		driver.get(url);
	}


	/*
	 * Method Name 		: getTitleOfBrowser
	 * Objective		: It gets title of browser
	 * Arguments		: NA
	 * Author		    :Shankar 
	 * Create Date 		: 16-Sep-2024
	 * Modified Date	: NA
	 * Method call		: String  res = getTitleOfBrowser();
	 * 						
	 * 						
	 * Return type		: String
	 */	

	public static String getTitleOfBrowser()
	{
		String actTitle = driver.getTitle();
		System.out.println("Actual Title= "+ actTitle);
		return actTitle;
	}


	/*
	 * Method Name 		: 
	 * Objective		: 
	 * Arguments		: 
	 * Author		: 
	 * Create Date 		: 
	 * Modified Date	: 
	 * Method call		:  
	 * 						
	 * 						
	 * Return type		: 
	 */


	//------------------------
	//Textbox  common Methods:
	//---------------------
	//		enter value in text box  --> enterValueInTxtbox() --> done
	//		get value from text box   --> getValueFromTxtBox()  --> done
	//		delete from text box   -->  HW

	/*
	 * Method Name 		: enterValueInTxtbox
	 * Objective		: to enter thei given value in textbox based on xpath
	 * Arguments		: String myXpath,String valToBeEntered
	 * Author			: Tulasi 
	 * Create Date 		: 16-Sep-2024
	 * Modified Date	: NA
	 * Method call		:  enterValueInTxtbox("//input[@name='firstname']","Raju");
	 * 						enterValueInTxtbox("//input[@name='lastname']","yadhav");
	 * 						
	 * Return type		: void
	 */

	public static void enterValueInTxtbox(String myXpath,String valToBeEntered)
	{		//                        //input[@name='firstname']		 Raju
		//  enter "Raju " in first name textbox
		//		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Raju");
		//		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("yadhav");
		try
		{
			//			driver.findElement(By.xpath(myXpath)).sendKeys(valToBeEntered);

			//                           /input[@name='firstname'      Raju
			//			


			//if ele is enabled, enter data

			WebElement ele =  getElement(myXpath);

			if(ele.isDisplayed())
			{
				if(ele.isEnabled())
				{
					ele.sendKeys(valToBeEntered);
				}
			}

		}
		catch (NoSuchElementException e) {
			System.out.println("Unable to find the textbox. Plz check ur xpath ="+myXpath);
		}

	}

	/*
	 * Method Name 		: getValueFromTxtBox
	 * Objective		: to get the enetered value in textbox based on xpath
	 * Arguments		: String myXpath,String valToBeEntered
	 * Author			: Tulasi 
	 * Create Date 		: 16-Sep-2024
	 * Modified Date	: NA
	 * Method call		:  enterValueInTxtbox("//input[@name='firstname']","Raju");
	 * 						enterValueInTxtbox("//input[@name='lastname']","yadhav");
	 * 						
	 * Return type		: void
	 */
	public static String getValueFromTxtBox(String myXpath)
	{	//                                          lastname1234
		String val = null;
		try
		{

			//			String val = driver.findElement(By.xpath("//input[@name='firstname']")).getAttribute("value");
			//val = driver.findElement(By.xpath(myXpath)).getAttribute("value");
			val =  getElement(myXpath).getAttribute("value");

			//			<input type="text">  
			//			<a> google </a>
		}
		catch (NoSuchElementException e) {
			System.out.println("getValueFromTxtBox.Unable to find the textbox. Plz check ur xpath ="+myXpath);
		}

		System.out.println("Val from Text box  ="+ val);
		return val;// null
	}

	//----------------------------------
	//Radio button :
	//---------------
	//		Select radio button --> HW
	//		check radio button is selected --> HW
	//		it is displayed or not --> HW
	//		is enabled --> HW


	/*
	 * Method Name 		: selectRadioBtn
	 * Objective		: to select given radio btn
	 * Arguments		: 
	 * Author			: 
	 * Create Date 		: 
	 * Modified Date	: 
	 * Method call		: 					
	 * Return type		:  
	 *  
	 */



	/*
	 * Method Name 		: 
	 * Objective		: 
	 * Arguments		: 
	 * Author			: 
	 * Create Date 		: 
	 * Modified Date	: 
	 * Method call		: 					
	 * Return type		:  
	 *  
	 */


	//---------------------------------
	//checkbox Common methods:
	//----------------
	//		click/ Select checkbox  -->  HW
	//		unselect checbox	-->  HW
	//		checkbox is selected    --> HW 
	//		isdisplayed    --> HW 
	//		is is enabled or not    --> HW 
	//----------------------------

	//Button common method :
	//------------------
	//		click button    --> HW 
	//		get button name    --> HW 
	//		isdisplayed    --> HW 
	//		is is enabled or not    --> HW 
	//---------------------------------



	//Dropdown common methods:
	//---------------	
	//		select some value in dropdown		-->  
	//		get selected value in dropdown     -->  HW 
	//		get all dropdown values 		  -->  HW 
	//		check given value/ text is exist in dropdown   --- >  HW
	//		get count values from dropdown		-->   HW
	//--------------------------------------

	//selectValueInDropdown("//select[@name='cars']","Audi");
	public static void selectValueInDropdown(String myXpath, String valToBeSelected)
	{
		try
		{
			//			WebElement dropdownEle = driver.findElement(By.xpath(myXpath));
			WebElement dropdownEle =getElement(myXpath);

			Select sel =  new Select(dropdownEle);
			System.out.println("Select Vaue='"+ valToBeSelected + "' in dropdown");
			sel.selectByVisibleText(valToBeSelected);
		}
		catch (NoSuchElementException e) {

			System.out.println("exception details="+ e);
			if(e.toString().contains("Cannot locate option with text:"))
			{
				System.out.println("Unable to find the given value='"+ valToBeSelected + "' in dropodwn.Plz check value in dropdown available or not");
			}
			else
			{
				System.out.println("Unable to find the dropdown.Plz check xpath="+ myXpath);
			}

		}
	}


	//Multi Select dropdown  common methods:
	//--------------------
	//		select multiple values in MultiSelect dropdown    --> HW 
	//		get selected values from Multi Select dropdown    --> HW 
	//		get all dropdown values  from Multi Select dropdown    --> HW 
	//		check given value/ text is exist in Multi Select dropdown    --> HW 
	//		get count values from Multi Select dropdown	    --> HW 
	//
	//------------------------------------------
	//Links:
	//------------
	//
	//
	//-----------------
	//Image :
	//--------



	// Actions class methods:

	/*
mouse over on Given Element     --> HW 
double click -->HW 
Rt click -->HW 
key board operation --? HW 
Press Tab  -->HW 
Press tab 2 or 3 times -->HW 
press enter from k/b --> HW 
	 */

	//Alert :

	/*
if alert is there,switch to alert -->HW 
-Get msg from alert popup window -->HW 
accept alert -->HW 
dismiss alert  --> HW 
	 */



	//HW JSE --> write all reusable method names for all elements ex: text box, Radio button,checkbox...etc


	//	getElement("firstname_name");
	//	getElement("idfirst_id");
	//getElement("idfirst_class");

	public static WebElement getElement(String locator)
	{  //                          firstname_name  i.e locator =firstname_name
		//                                                   idfirst_cssSelectoridfirst_id

		//                             locator=   "idfirst_id"
		System.out.println("in Getelemnt(),loca="+ locator);

		waitForElementToBeVisible(locator);
		
		WebElement ele = null;
		String sarr [] =  locator.split("_");
		//              "idfirst_id"

		// sarr[0]=idfirst,     sarr[1] =id 
		String localVal = sarr[0];// idfirst
		//                 firstname

		try
		{
			if(locator.contains("_name"))
			{
				ele = driver.findElement(By.name(localVal));
				//								firstname
			}
			else if(locator.contains("_id"))
			{
				System.out.println("check loca contains _id");
				ele = driver.findElement(By.id(localVal));
			}
			else if(locator.contains("_class"))
			{
				ele = driver.findElement(By.className(localVal));
			}
			else if(locator.contains("_xpath"))
			{
				ele = driver.findElement(By.xpath(localVal));
			}
			else if(locator.contains("_css"))
			{
				ele = driver.findElement(By.cssSelector(localVal));
			}
			else if(locator.contains("_linktext"))
			{
				ele = driver.findElement(By.linkText(localVal));
			}
			else if(locator.contains("_partiallinktext"))
			{
				ele = driver.findElement(By.partialLinkText(localVal));
			}
			//  if no locator is matching
			else
			{	

				System.out.println("You gave locator=" +locator+".Plz give valid locator format ex:  _name,_id, _class,_xpath,_css...etc");
			}

			if(ele ==  null)
			{
				System.out.println("There is no element found in the page using locator ="+ locator);
			}

		}
		catch (NoSuchElementException e) 
		{
			System.out.println("Catching NSE. There is no element found in the page using locator ="+ locator);
		}
		return ele;

	}

	public static void waitForElementToBeVisible(String locator)
	{

		// wait for ele to be visible 			
		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebDriverWait wait  = new WebDriverWait(driver, 20);

		String sarr [] =  locator.split("_");
		//              "idfirst_id"

		// sarr[0]=idfirst,     sarr[1] =id 
		String localVal = sarr[0];// idfirst
		//                 firstname

		if(locator.contains("_name"))
		{
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(localVal)));				

		}
		else if(locator.contains("_id"))
		{
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(localVal)));
		}
		else if(locator.contains("_class"))
		{
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(localVal)));
		}
		else if(locator.contains("_xpath"))
		{
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(localVal)));
		}
		else if(locator.contains("_css"))
		{
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(localVal)));
		}
		else if(locator.contains("_linktext"))
		{
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(localVal)));
		}
		else if(locator.contains("_partiallinktext"))
		{
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(localVal)));
		}
		//  if no locator is matching
		else
		{	

			System.out.println("You gave locator=" +locator+".Plz give valid locator format ex:  _name,_id, _class,_xpath,_css...etc");
		}
	}
	
	// Read properties file 
	
//  Develop resuable method to read properties file ?
	
	// readPropertiesFile("browser");
	public static String readPropertiesFile(String keyName) throws IOException
	{ //                                        browser   i.e keyName = browser
		
		Properties props = new Properties();
		String configFile = "C:\\brahma\\Practise\\SelniumPractiseNew\\JulMBtach2024WorkSpace\\SeleniumAug2422024Project\\src\\config.properties";
		FileInputStream fis  = new FileInputStream(configFile);
		props.load(fis);
	
		String keyVal =  props.getProperty(keyName);
		//              null
		// handle if given key name is not there in config file
		if(keyVal == null)
		{
			System.out.println("Given key name/ property name='" +keyName+"' is not available.Plz check in Properties file="+configFile);
			System.out.println("Read Properties file, keyname=" +keyName+" ,keyVal="+keyVal);

		}
		else
		{
			System.out.println("Read Properties file, keyname=" +keyName+" ,keyVal="+keyVal);
		}
		
		return keyVal;
	}

	public static String readORPropertiesFile(String keyName) throws IOException
	{ //                                        browser   i.e keyName = browser

		String ORPropsFile= ".\\src\\OR.properties";

		Properties props = new Properties();

		FileInputStream fis  = new FileInputStream(ORPropsFile);
		props.load(fis);

		String keyVal =  props.getProperty(keyName);
		//              null
		// handle if given key name is not there in config file
		if(keyVal == null)
		{
			System.out.println("Given key name/ property name='" +keyName+"' is not available.Plz check in OR Properties file="+ORPropsFile);
			System.out.println("Read Properties file, keyname=" +keyName+" ,keyVal="+keyVal);

		}
		else
		{
			System.out.println("Read Properties file, keyname=" +keyName+" ,keyVal="+keyVal);
		}

		return keyVal;

	}


	

}
