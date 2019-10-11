package testNG_TestScripts;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Library.FrameWorkLibrary;
import Library.WebGeneralLibrary;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Login extends WebGeneralLibrary
{
	//public ExtentReports report;
	//public String ScreenshotsFolderPath= "E:\\Tmasters\\ZIPFiles\\P4RC_TestNGFramework\\src\\Results\\Screenshots";
	//public String ScreenshotName = "amar";
	//public WebDriver driver;
	//@BeforeTest
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
			System.out.println("ScreenShotFolderPath::"+ScreenshotsFolderPath);
					//CurrentResultsFolderPath + "\\ScreenShots\\";
			ResultFilePath = CurrentResultsFolderPath + "\\Summary.html";
			report = new ExtentReports(ResultFilePath);
			CurrentIteration = 0;
			StartIteration = 0;
			EndIteration = 0;
	 
//	String ResultPath = "E:\\Tmasters\\ZIPFiles\\P4RC_TestNGFramework\\ExtentReport.html";	
//	//add report
//	report = new ExtentReports(ResultPath, true);
}
	@AfterTest
	public void exit(){
		driver.quit();
		//driver.get("");
		
	}
	@Test
	public void SignIn() throws IOException, InterruptedException
	{
		driver = new FirefoxDriver();
		logger = report.startTest("TC01_SignIn", "Verify P4RC Login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enableTakingScreenshots();
		plog = "Able to open URL";
	  	flog = "Unable to open URL";
	  	OpenUrl(driver, getData("URL"));
		//driver.get("http://test.p4rc.com/resources/wl/index.html");
		
		//takescreenshot(driver);
		driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
		//takescreenshot(driver);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("newuser11@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("amar0404");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Main Menu')]")).click();
		driver.findElement(By.linkText("Account")).click();
		
		
		driver.findElement(By.linkText("Sign Out")).click();
		//driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		   //end TestScriptReport
		report.endTest(logger);
			//close report
		report.close();
	}
}
