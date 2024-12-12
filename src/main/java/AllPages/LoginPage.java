package AllPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage 
{
	
	// 1. define elements with locators(name, id, class, xpath, cssSelector, 
		//		linktext, partial linktext
		//		 tagname..)

		// @FindBy is annotation -used to find ele with given loc name = loc value
	// syntax :  @FindBy(locName= "Loc value")

		// Define "userNameTxtbox" with name 	
		@FindBy(name="username")
		public WebElement userNameTxtbox;

		//Define "pwdTxtbox" using name
		@FindBy(name ="password")
		public WebElement pwdTxtbox;

		
		//Define "login" using class
		@FindBy(xpath =  "//button[@type='submit']")
		public WebElement loginBtn;
		
		// HW  Forgot your password?
		
//		@FindBy(className = "oxd-text oxd-text--p oxd-alert-content-text")// not working
//		@FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")

		//Define "InvalidcredentialsTxtMsg"
		@FindBy(xpath="//p[text()='Invalid credentials']")
		public WebElement InvalidcredentialsTxtMsg;


		// 2. We have to define "constructor"  and initialise all elements  and pass driver ref var
		public LoginPage(WebDriver driver)// 1 PC
		{
					
			//// initialise all elements 
			PageFactory.initElements(driver, this);
			// can be used to initalise all elements with locators of current class		
		}
					
		//3. define reusable method and utilise all defined elements
		// for each step , We will define seperate method 

		// Enter user name in "user name" text box
		public void enterUserName(String user)
		{		
			System.out.println("Enter user="+ user);
			
			userNameTxtbox.sendKeys(user);		
			// null *  ---> NPE
		}


		// Enter "pwd" in "pwd" text box
		public void enterPassword(String pwd)
		{			
			System.out.println("Enter pwd="+pwd);
			pwdTxtbox.sendKeys(pwd);

		}

		// Click "login" btn
		public void clickLoginBtn()
		{
			System.out.println("Click Login button");
			loginBtn.click();
		}


		// Define loginToAppl() and pass username, pwd
		public void loginToAppl(String user,String pwd)
		{
			enterUserName(user);
			enterPassword(pwd);
			clickLoginBtn();

		}
		
		//// Verify 'Invalid credentials' msg is displayed
		// Define verifyInValidCrednetialsMsg()
		public void verifyInValidCrednetialsMsg()
		{
			if(InvalidcredentialsTxtMsg.isDisplayed())
			{
				System.out.println("'Invalid credentials' msg is displayed");
			}
			else
			{
				System.out.println("'Invalid credentials' msg is displayed");
			}
		}
				
		


}
