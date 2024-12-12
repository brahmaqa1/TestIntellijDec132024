package AllPages;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;//  defaul val = null
	// int a; 0

	// 1. Define all elements with locators  using @Findby annot

	// Define "profileImg" with className 
	@FindBy(className = "oxd-userdropdown-img")
	public WebElement profileImg;


	//// Define "adminMenu" xpath
	@FindBy(xpath = "//span[text()='Admin']")
	public WebElement adminMenu;


	// Define "pimMenu";


	// system user page  -"systemUserTxt";  using xpath
	@FindBy(xpath="//h5[text()='System Users']")
	public WebElement systemUserTxt;


	//		addBtn;	 classname,xpath
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	public WebElement addBtn;

	// clikAddBt //butt   oxd-button oxd-button--medium oxd-button--secondary']

	// addUserTxt using xpath //h6[text()='Add User']
	@FindBy(xpath="//h6[text()='Add User']")
	public WebElement addUserTxt;

	// userRoleDropdown; using xpath //label[text()='User Role']/parent::div/following-sibling::div
	@FindBy(xpath="//label[text()='User Role']/parent::div/following-sibling::div")
	public WebElement userRoleDropdown;

	//adminValInuserRoleDropdown; usin xpath= //div[@role='listbox']//*[text()='Admin']

	@FindBy(xpath="//div[@role='listbox']//*[text()='Admin']")
	public WebElement adminValInuserRoleDropdown;
	//Exception in thread "main" org.openqa.selenium.InvalidSelectorException: invalid selector: Unable to locate an element with the xpath expression //label[text()='User Role']/parent::div/following-sibling::div/following-sibling::div[@role='listbox']']//*[text()='Admin'] because of the following error:
	//		SyntaxError: Failed to execute 'evaluate' on 'Document': The string '//label[text()='User Role']/parent::div/following-sibling::div/following-sibling::div[@role='listbox']']//*[text()='Admin']' is not a valid XPath expression.
	//				  (Session info: chrome=114.0.5735.199)
	// note: when we give invalid xpath, it throws 'InvalidSelectorException'

	//employeeNameTxtboxEle xpath
	@FindBy(xpath="//label[text()='Employee Name']/../following-sibling::div//input")
	public WebElement employeeNameTxtboxEle;

	@FindBy(xpath="//*[text()='vin eetha Dan']")
	public WebElement valuesinEmployeeName;

	//statusArrowBtn;


	@FindBy(xpath="//label[text()='Status']/parent::div/following-sibling::div")
	public WebElement statusArrowBtn;

	//UsernameTxtbox 
	@FindBy(xpath="//label[text()='Username']/parent::div/following-sibling::div/input")
	public WebElement UsernameTxtbox;


	//PasswordTxtbox;//label[text()='Password']/parent::div/following-sibling::div/input
	@FindBy(xpath="//label[text()='Password']/parent::div/following-sibling::div/input")
	public WebElement PasswordTxtbox;

	//ConfirmPasswordTxtbox; //label[text()='Confirm Password']/parent::div/following-sibling::div/input
	@FindBy(xpath="//label[text()='Confirm Password']/parent::div/following-sibling::div/input")
	public WebElement ConfirmPasswordTxtbox;



	//saveBtn;//button[@type='submit']
	@FindBy(xpath="//button[@type='submit']")
	public WebElement saveBtn;

	//searchBtn;



	//**************************

	// 2. We have to define constructor  and initialise all elements 
	public HomePage(WebDriver driver)
	{

		PageFactory.initElements(driver, this);
		this.driver = driver;

	}


	//3. utilise all elements in reusable methods
	// // check the "profile image" is displayed in home page
	//	if Profile image is displayed- display -Login is succesfull
	//	else - Login is not succesfull
	// Define isProfileImageDisplayed()
	public void isProfileImageDisplayed()
	{
		if(profileImg.isDisplayed())
		{
			System.out.println("Login is succesfull");
		}
		else
		{
			System.out.println("Login is not succesfull");
		}		
	}







	// Navigate to diff menu options
	// Navigate to Admin menu
	public void navigateToAdminMenu()
	{
		System.out.println("Click Admin menu");
		adminMenu.click();
	}

	// navigateToPIMMenu


	//  verifySystemUserPageDisplayed
	public void verifySystemUserPageDisplayed()
	{
		if(systemUserTxt.isDisplayed())
		{
			System.out.println(" System Users page is displayed");
		}
		else
		{
			System.out.println(" System Users page is not displayed");
		}
	}


	//clickAddBtn
	public void clickAddBtn()
	{
		System.out.println("Click add button");
		addBtn.click();
	}


	//verifyAddUserpageDisplayed
	public void verifyAddUserpageDisplayed()
	{
		if(addUserTxt.isDisplayed())
		{
			System.out.println("Add user page is displayed");
		}
		else
		{
			System.out.println("Add user page is not displayed");
		}
	}


	// 	selectUserRole("Admin")
	// selectUserRole("ESS")
	public void selectUserRole(String role) throws InterruptedException
	{
		System.out.println("Click user role dropodown");
		userRoleDropdown.click();
		Thread.sleep(3000);
		System.out.println("click'" +role+"'  value in user role dropdown");
		//adminValInuserRoleDropdown.click();
		String myxpath="//div[@role='listbox']//*[text()='"+role+"']";
		driver.findElement(By.xpath(myxpath)).click();
		

	}

	//Exception in thread "main" org.openqa.selenium.support.ui.UnexpectedTagNameException: Element should have been "select" but was "div"
	//Build info: version: '3.141.59', revision: 'e82be7d358', time: '2018-11-14T08:17:03'



	// null * any method --> java.lang.NullPointerException: 



	// type some employee name(Orange test) - in "Employee Name" txt box
	public void typeEmployeeName(String empName)
	{
		System.out.println("Enter emp name="+ empName);
		employeeNameTxtboxEle.sendKeys(empName);//

		// click emp name
		//	valuesinEmployeeName.click();
		System.out.println("driver="+ driver);// null
		driver.findElement(By.xpath("//*[text()='" +empName+ "']")).click();
	}


	// Select some status =Enabled
	//			selectStatus("Enabled")
	//			selectStatus("Disabled");
	public void selectStatus(String status)
	{
		statusArrowBtn.click();

		System.out.println("Select status="+ status);
		//		driver.findElement(By.xpath("//*[text()='Enabled']")).click();
		driver.findElement(By.xpath("//*[text()='" +status+ "']")).click();

	}

	// Type some value in "user name" text box 
	public void enterUserName(String user)
	{
		System.out.println("enterUserName="+user);
		UsernameTxtbox.sendKeys(user);

	}

	// Type some value in "password"  text box
	//			EnterValueInPassword("Test@123321")
	public void EnterValueInPassword(String pwd)
	{
		System.out.println("EnterValueInPassword="+pwd);
		PasswordTxtbox.sendKeys(pwd);
	}


	//// Type some value in "Confirm password"  text box
	//EnterValueInConfirmPassword("Test@123321")
	public void EnterValueInConfirmPassword(String confirmPwd)
	{
		System.out.println("Enter confirmPwd="+confirmPwd);
		ConfirmPasswordTxtbox.sendKeys(confirmPwd);
	}



	// clikc on "Save" button
	public void clickSaveBtn()
	{
		System.out.println("Click Save button");
		saveBtn.click();
	}

	// Verify user name is exist in table or not verifyUserExistInTable(String user)
	// verifyUserExistInTable("RajaRam")
	public void verifyUserExistInTable(String user)
	{
		//div[@class='oxd-table-body']//div[text()='rajaram1']
	////div[@class='oxd-table-body']/div/div[@role='row']/div[2]/div[text()='sita']
	 String myxpath = "//div[@class='oxd-table-body']//div[text()='"+user+"']";
		WebElement ele = driver.findElement(By.xpath(myxpath));
		if(ele.isDisplayed())
		{
			System.out.println("Pass.Given user="+ user + " is exist in table");
		}
			
		else
		{
			System.out.println("Fail.Given user="+ user + " is exist in table");
		}
	}




	//searchForGivenUser


	// define 	searchForInvalidUser()  and pass user

	// Enter user in UsernameTxtbox

	//						
	//						// click Search button			


	// check isNoRecordMsgDisplayed

		// creaateNewUser()
	// createNewUser("Admin","Vin_test_1 Dan_test_1","Enabled","Ramarao","Admin123");
	public void createNewUser(String UserRole, String EmployeeName,String Status,String Username, String Password) throws InterruptedException
	{
		//Select some value (Admin) in User Role dropdown
				selectUserRole(UserRole);


				// or selectUserRole-ESS  -->  
				// working

				// type some employee name(Orange  Test) - in "Employee Name" txt box

				//                       Orange  Test
				//String empName ="Abir Hossen Munna";
				typeEmployeeName(EmployeeName);
				
				// Select some status =Enabled
				selectStatus(Status);

				// Type some value in 'user name' text box 
				//  Ramarao123  ramrao9868
//				String user= "SitaRam";
//								Random  r = new Random();
//								int randomno= r.nextInt(1000);	
//								//     50
//								String user= "ramarao" + randomno;

				enterUserName(Username);


				// Type some value in 'password'  text box
//				String pwd = "Admin123";
				
				EnterValueInPassword(Password);

				//// Type some value in 'Confirm password'  text box
				EnterValueInConfirmPassword(Password);

				Thread.sleep(3000);

				// click on Save button
				clickSaveBtn();

				// Verify  new user name is exist in table or not
				verifyUserExistInTable(Username);


	}
	



}
