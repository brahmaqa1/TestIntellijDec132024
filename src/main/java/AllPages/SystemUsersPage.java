package AllPages;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SystemUsersPage {

	WebDriver driver;// null
	//	1.define all elements with locator name  = loc val
	// UsernameTxtbox;	//label[text()='Username']/../following-sibling::div/input
	@FindBy(xpath ="//label[text()='Username']/../following-sibling::div/input")
	public WebElement UsernameTxtbox;

	// searchBtn;//button[@type='submit']
	@FindBy(xpath="//button[@type='submit']")
	public WebElement searchBtn;

	// RecordFoundTxt;//span[text()='(1) Record Found']
	@FindBy(xpath="//span[text()='(1) Record Found']")
	public WebElement RecordFoundTxt;

	//deleteRecordTxt;//p[text()='The selected record will be permanently deleted. Are you sure you want to continue?']
	@FindBy(xpath="//p[text()='The selected record will be permanently deleted. Are you sure you want to continue?']")
	public WebElement deleteRecordTxt;


	//	yesDeleteBtn;//div[@class='orangehrm-modal-footer']/button/i
	// //button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")
	public WebElement yesDeleteBtn;


	//2 Define constr
	public SystemUsersPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}


	//3 .
	// EnterValueInUserName(String val)
	public void EnterValueInUserName(String val)
	{
		System.out.println("Search with  user="+val);
		UsernameTxtbox.sendKeys(val);

	}
	/// click Search button ClickSearch()
	public void ClickSearch()
	{
		System.out.println("click Search button");
		try
		{
			searchBtn.click();
		}
		catch (ElementClickInterceptedException e) {
			System.out.println("Catchng ElementClickInterceptedException in ClickSearch()");
		}
		
	}



	// Verify  '(1) Record Found'  msg is displayed verify1RecordFoundMsg
	public void verify1RecordFoundMsg()
	{		
		if(RecordFoundTxt.isDisplayed())
		{
			System.out.println("Pass.'(1) Record Found'  msg is displayed");
		}
		else
		{
			System.out.println("Fail. '(1) Record Found'  msg is  not displayed");
		}

	}



	// Select given user name -selectCheckboxForGivenUser(String user)
	public void selectCheckboxForGivenUser(String user) throws InterruptedException
	{	

		Thread.sleep(4000);
		System.out.println("select checkbox for given user ="+ user);
		//			
		//div[@class='oxd-table-body']/div/div[@role='row']/div[2]/div[text()='Anthony.Nolan']/parent::div/preceding-sibling::div/div
		//
		String myxpath = "//div[@class='oxd-table-body']/div/div[@role='row']/div[2]/div[text()='" +user+ "']/parent::div/preceding-sibling::div/div"; 
		try {
			driver.findElement(By.xpath(myxpath)).click();
		} catch (NoSuchElementException e) {
			System.out.println("NoSuchElementException. Please check user="+ user + " is avaialble in table");
		}
		

	}


	//				// Click delete image icon -clickDeleteImageForUser(String user)

	public void clickDeleteImageForUser(String user) throws InterruptedException
	{

		//div[@class='oxd-table-body']/div/div[@role='row']/div[2]/div[text()='Alice']/parent::div/following-sibling::div[4]//i[contains(@class,'trash')]

		Thread.sleep(4000);

		String myxpath="//div[@class='oxd-table-body']/div/div[@role='row']/div[2]/div[text()='" +user+"']/../following-sibling::div[4]//i[@class='oxd-icon bi-trash']";
		System.out.println("click Delete image icon for user="+ user);
		driver.findElement(By.xpath(myxpath)).click();
		//			System.out.println("NoSuchElementException. Please check user="+ user + " is avaialble");

	}

	//				
	//	// Verify the msg -The selected record will be permanently deleted. Are you sure you want to continue?
	// verifyDeleteRecordMsgDisplayed
	public void verifyDeleteRecordMsgDisplayed() throws InterruptedException
	{
		//		Thread.sleep(4000);
		if(deleteRecordTxt.isDisplayed())
		{
			System.out.println("Pass.The selected record will be permanently deleted. Are you sure you want to continue? is displayed");
		}
		else
		{
			System.out.println("Fail.The selected record will be permanently deleted. Are you sure you want to continue? is  not displayed");
		}

	}

	//// Click Yes Delete button-clickYesDeleteBtn()
	public void clickYesDeleteBtn()
	{
		System.out.println("clickYesDeleteBtn");
		yesDeleteBtn.click();
	}


	//// Verify Record should not be available in table  or No records found
	//searchForGivenUser
	public void searchForGivenUser(String user)
	{
		EnterValueInUserName(user);
		ClickSearch();
	}

}
