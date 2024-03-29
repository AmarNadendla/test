package testNG_TestScripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;






//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Library.OR.*;
import Library.WebGeneralLibrary;

public class TestScriptsDefinition extends WebGeneralLibrary
{
	private int count = 0;
	public ExtentReports report;
	
	@BeforeTest 
	public void onExecutionStart() 
		 
	{
		        
			  	String CurrentFolderPath = System.getProperty("user.dir");
			  	CurrentFolderPath = CurrentFolderPath.replace("\\src","");
				CurrentDirectory = CurrentFolderPath;
				TestDataPath = CurrentFolderPath + "\\TestData\\";
				ResultsFolderPath = CurrentFolderPath + "\\Results\\";
				String CurrentResultsPath = createresultsfolder();
				CurrentResultsFolderPath = CurrentResultsPath;
				ScreenshotsFolderPath = CurrentResultsFolderPath + "\\ScreenShots";
				//System.out.println("ScreenShotFolderPath::"+ScreenshotsFolderPath);
				//CurrentResultsFolderPath + "\\ScreenShots\\";
				ResultFilePath = CurrentResultsFolderPath + "\\Summary.html";
				report = new ExtentReports(ResultFilePath);
		}
	
	@AfterTest
	public void showresults()
	{   //close report
		report.close();
		driver = new FirefoxDriver();
		driver.get(ResultFilePath);
	}
	
	@BeforeMethod
	public void setup()
	{
		 
		 enableTakingScreenshots();
	}
	@AfterMethod
	public void teardown()
	{driver.close();
		//driver.quit();
		//end TestScriptReport
		report.endTest(logger);
		
	}
  @Test
  public void TC01_SingIn() throws IOException, InterruptedException 
  {
	   // count = count+1;
	 //   System.out.println("************"+count+"******************************");
	    logger = report.startTest("TC01_SignIn", "Verify P4RC Login");
	    
	    plog = "Able to Launch Browser";
	  	flog = "Unable to Launch Browser";
	  	driver=launchBrowser("chrome");
	  	
	  	
	  	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  	
	  	plog = "Able to open URL";
	  	flog = "Unable to open URL";
	  	OpenUrl(driver, getData("URL"));
	  	
	  	
	  	plog = "Able to click on SignIn Button";
	  	flog = "Unable to click on SignIn Button";
	  	ClickElement(driver, demo.StartPractising, plog, flog);
	  	

	  	plog = "Able to click on SignIn Button";
	  	flog = "Unable to click on SignIn Button";
	  	ClickElement(driver, demo.simpleformdemo, plog, flog);
	  	
	  /*	plog = "Able to Enter Email";
	  	flog = "Unable to enter Email";
	  	SetText(driver, pg_SignIn.EmailFiled, getData("email",count),plog,flog);
	  	
	  	plog = "Able to Enter Password";
	  	flog = "Unable to enter Password";
	  	SetText(driver, pg_SignIn.PasswordField, getData("password",count),plog,flog);
	  	
	  	plog = "Able to click SignIn Submit button";
	  	flog = "Unable to click SignIn Submit button";
		ClickElement(driver, pg_SignIn.SignInSubmit, plog, flog);
		
		plog = "Able to click Toggle Menu";
	  	flog = "Unable to click Toggle Menu";
		ClickElement(driver, pg_Home.ToggleMenu, plog, flog);
		
		plog = "Able to click Account";
	  	flog = "Unable to click Account";
		ClickElement(driver, pg_Account.Account, plog, flog);
		
		
		plog = "Able to click Logout";
	  	flog = "Unable to click Logout";
		ClickElement(driver, pg_Account.SignOut, plog, flog);
	 
		
		plog = "Able to locate welcometext";
	  	flog = "Unable to locate welcometext";
		Exist(driver, pg_Index.WelcomeText, plog, flog);*/
		
		
  }
  //@Test
  public void TC02_SignUp() throws InterruptedException, IOException 
  {
	    logger = report.startTest("TC02_SignUp", "Verify P4RC SignUP");
	    
	    plog = "Able to Launch Browser";
	  	flog = "Unable to Launch Browser";
	  	driver= launchBrowser("firefox");
	  	
	  	plog = "Able to open URL";
	  	flog = "Unable to open URL";
	  	OpenUrl(driver, getData("URL"));
	  	
	  	plog = "Able to click on SignUp Button";
	  	flog = "Unable to click on SignUp Button";
	  	ClickElement(driver, pg_Index.SignUpBtn, plog, flog);
	  	
	  	plog = "Able to enter first name";
	  	flog = "Unable to enter first name";
	  	SetText(driver, pg_SignUp.SignUpFnameField, getData("fname"), plog, flog);
	  	
	  	plog = "Able to enter last name";
	  	flog = "Unable to enter last name";
	  	SetText(driver, pg_SignUp.SignUpLnameField, getData("lname"), plog, flog);
	  	
	  	String randommail = randomEmail();
		
	  	plog = "Able to enter email";
	  	flog = "Unable to enter email";
	  	SetText(driver, pg_SignUp.SignUpEmailField, randommail, plog, flog);
	  	
	  	plog = "Able to enter Confemail";
	  	flog = "Unable to enter Confemail";
	  	SetText(driver, pg_SignUp.SignUpConfEmail, randommail, plog, flog);
	  	
		plog = "Able to enter password";
	  	flog = "Unable to enter password";
	  	SetText(driver, pg_SignUp.SignUpPasswrd, getData("password"), plog, flog);
	  	
	  	plog = "Able to select month";
	  	flog = "Unable to select month";
	  	ClickElement(driver, pg_SignUp.MnthDD, plog, flog);
	  	
	  	plog = "Able to select Day";
	  	flog = "Unable to select Day";
	  	ClickElement(driver, pg_SignUp.DayDD, plog, flog);
	  	
	  	plog = "Able to select year";
	  	flog = "Unable to select year";
	  	ClickElement(driver, pg_SignUp.YearDD, plog, flog);
	  	
	  	plog = "Able to click SignUp Submit";
	  	flog = "Unable to click SignUp Submit";
	  	ClickElement(driver, pg_SignUp.SignUpSubmit, plog, flog);
	  	
	  	plog = "Able to click Toggle Menu";
	  	flog = "Unable to click Toggle Menu";
		ClickElement(driver, pg_Home.ToggleMenu, plog, flog);
		
		plog = "Able to click Account";
	  	flog = "Unable to click Account";
		ClickElement(driver, pg_Account.Account, plog, flog);
		
		
		plog = "Able to click Logout";
	  	flog = "Unable to click Logout";
		ClickElement(driver, pg_Account.SignOut, plog, flog);
	 
		
		plog = "Able to locate welcometext";
	  	flog = "Unable to locate welcometext";
		Exist(driver, pg_Index.WelcomeText, plog, flog);
		
	  	
	}
  //@Test
  public void TC03_FBLogin() throws IOException, InterruptedException
  {
	  logger = report.startTest("TC03_FBLogin", "Verify P4RC SignUP");
	    
	    plog = "Able to Launch Browser";
	  	flog = "Unable to Launch Browser";
	  	driver= launchBrowser("firefox");
	  	
	  	plog = "Able to open URL";
	  	flog = "Unable to open URL";
	  	OpenUrl(driver, getData("URL"));
	  	
	  	plog = "Able to click on SignIn Button";
	  	flog = "Unable to click on SignIn Button";
	  	ClickElement(driver, pg_Index.SignInBtn, plog, flog);
	  	
	  	plog = "Able to enter fb_email";
	  	flog = "Unable to enter fb_email";
	  	SetText(driver, pg_FBlogin.FBbtn, getData("email"), plog, flog);
	  	
	  	plog = "Able to enter fb_password";
	  	flog = "Unable to enter fb_password";
	    SetText(driver, pg_FBlogin.fbpass, getData("pass"), plog, flog);
	    
	    plog = "Able to click on FB_login button";
	  	flog = "Unable to click on FB_login button";
	    ClickElement(driver,pg_FBlogin.fbsubmit, plog, flog);
	    
	    plog = "Able to click Toggle Menu";
	  	flog = "Unable to click Toggle Menu";
		ClickElement(driver, pg_Home.ToggleMenu, plog, flog);
		
		plog = "Able to click Account";
	  	flog = "Unable to click Account";
		ClickElement(driver, pg_Account.Account, plog, flog);
		
		
		plog = "Able to click Logout";
	  	flog = "Unable to click Logout";
		ClickElement(driver, pg_Account.SignOut, plog, flog);
	 
		
		plog = "Able to locate welcometext";
	  	flog = "Unable to locate welcometext";
		Exist(driver, pg_Index.WelcomeText, plog, flog);
	   
	  	
	  	
	  
  }
  
  //@Test
  public void demosite() {
	  
	  
	  
  }
  
}
