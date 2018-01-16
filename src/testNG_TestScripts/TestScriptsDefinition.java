package testNG_TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.commands.Click;

import Library.OR.pg_EmergencyContacts;
import Library.OR.pg_HomePage;
import Library.OR.pg_Login;
import Library.WebGeneralLibrary;

public class TestScriptsDefinition extends WebGeneralLibrary
{
	   public  String plog;
	    public String flog;
  @Test
  public void TC01_AddEmergencyContactsAndVerify() 
  {
	   
	  	WebDriver driver= launchBrowser("chrome");
	  	OpenUrl(driver, getData("URL"));
	  	
	  	plog = "Able to Enter UserName";
	  	flog = "Unable to enter UserName";
	  	SetText(driver, pg_Login.Edt_UserName, getData("UserName"),plog,flog);
	  	
	  	plog = "Able to Enter Password";
	  	flog = "Unable to enter Password";
	  	SetText(driver, pg_Login.Edt_Password, getData("Password"),plog,flog);
	  	
	  	plog = "Able to click loginbutton";
	  	flog = "Unable to click loginbutton";
	  	ClickElement(driver, pg_Login.Btn_Login, plog, flog);
	  	
	  	plog = "Able to click MyInfo";
	  	flog = "Unable to click MyInfo";
	  	ClickElement(driver, pg_HomePage.Lnk_MyInfo, plog, flog);
		
	  	plog = "Able to click EmergencyContacts";
	  	flog = "Unable to click EmergencyContacts";
		ClickElement(driver, pg_HomePage.lnk_EmergencyContacts, plog, flog);
		
		plog = "Able to click Add button";
	  	flog = "Unable to click Add Button";
		ClickElement(driver, pg_EmergencyContacts.Btn_Add, plog, flog);
		
		plog = "Able to enter name";
	  	flog = "Unable to enter name";
		SetText(driver, pg_EmergencyContacts.Edt_Name,getData("Name"),plog, flog);
		
		plog = "Able to enter Relationship";
	  	flog = "Unable to enter Relationship";
		SetText(driver, pg_EmergencyContacts.Edt_Relationship,getData("RelationShip") ,plog, flog);
		
		
		plog = "Able to enter HomePhone number";
	  	flog = "Unable to enter Homephone number";
		SetText(driver, pg_EmergencyContacts.HomePhone, getData("HomePhone"), plog, flog);
		
		plog = "Able to enter MobilePhone number";
	  	flog = "Unable to enter Mobilephone number";
		SetText(driver, pg_EmergencyContacts.MobilePhone, getData("MobilePhone"), plog, flog);
		
		
		plog = "Able to enter WorkPhone number";
	  	flog = "Unable to enter Workephone number";
		SetText(driver, pg_EmergencyContacts.worktele, getData("WorkPhone"), plog, flog);
		
		plog = "Able to click on save button";
	  	flog = "Unable to click on save button";
		ClickElement(driver, pg_EmergencyContacts.Btn_save, plog, flog);
		
//		driver.findElement(By.xpath("//a[@id='welcome']")).click();
//		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.quit();
  }
  @Test
  public void TC02_AddDependenciesAndVerify() throws InterruptedException 
  {
	  	WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://testingmasters.com/hrm/symfony/web/index.php/dashboard/");
		SetText(driver, pg_Login.Edt_UserName, "ankit3", plog, flog);
		//driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("ankit3");
		SetText(driver, pg_Login.Edt_Password, "abcd1234", plog, flog);
		//driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("abcd1234");
		ClickElement(driver, pg_Login.Btn_Login, plog, flog);
		//driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		driver.findElement(By.xpath("//b[text()='My Info']")).click();
		driver.findElement(By.xpath("//a[text()='Dependents']")).click();
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		driver.findElement(By.xpath("//input[@id='dependent_name']")).sendKeys("Reddy");
		driver.findElement(By.xpath("//select[@id='dependent_relationshipType']/option[text()='Child']")).click();
		driver.findElement(By.xpath("//input[@id='dependent_dateOfBirth']")).click();
		driver.findElement(By.xpath("//input[@id='dependent_dateOfBirth']")).sendKeys("2016-09-08");
		driver.findElement(By.xpath("//input[@id='dependent_dateOfBirth']")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='btnSaveDependent']")).click();
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.quit();
  }
 // @Test
  public void TC03_AddImmigrationDetailsAndVerify() throws InterruptedException 
  {
	  WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://testingmasters.com/hrm/symfony/web/index.php/dashboard/");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("ankit3");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("abcd1234");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

		driver.findElement(By.xpath("//b[text()='My Info']")).click();
		driver.findElement(By.xpath("//a[text()='Immigration']")).click();
		driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
		driver.findElement(By.xpath("//input[@id='immigration_number']")).sendKeys("501");
		driver.findElement(By.xpath("//input[@id='immigration_passport_issue_date']")).click();
		driver.findElement(By.xpath("//input[@id='immigration_passport_issue_date']")).sendKeys("2016-09-08");
		driver.findElement(By.xpath("//input[@id='immigration_passport_issue_date']")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='immigration_passport_expire_date']")).click();
		driver.findElement(By.xpath("//input[@id='immigration_passport_expire_date']")).sendKeys("2017-09-08");
		driver.findElement(By.xpath("//input[@id='immigration_passport_expire_date']")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='immigration_i9_status']")).sendKeys("yes");
		driver.findElement(By.xpath("//select[@id='immigration_country']/option[text()='India']")).click();
		driver.findElement(By.xpath("//input[@id='immigration_i9_review_date']")).click();
		driver.findElement(By.xpath("//input[@id='immigration_i9_review_date']")).sendKeys("2019-10-08");
		driver.findElement(By.xpath("//input[@id='immigration_i9_review_date']")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@id='immigration_comments']")).sendKeys("Addind Details");
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.quit();
  }
 // @Test
  public void TC04_AddEducation_Qualifications() throws InterruptedException 
  {
	  WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://testingmasters.com/hrm/symfony/web/index.php/dashboard/");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("ankit3");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("abcd1234");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		driver.findElement(By.xpath("//b[text()='My Info']")).click();
		driver.findElement(By.xpath("//a[text()='Qualifications']")).click();
		
		driver.findElement(By.xpath("//input[@id='addEducation']")).click();	
		driver.findElement(By.xpath("//select[@id='education_code']/option[text()='B.Tech']")).click();
		driver.findElement(By.xpath("//input[@id='education_institute']")).sendKeys("JNTUH");
		driver.findElement(By.xpath("//input[@id='education_major']")).sendKeys("Computer Science");
		driver.findElement(By.xpath("//input[@id='education_year']")).sendKeys("2012");
		driver.findElement(By.xpath("//input[@id='education_gpa']")).sendKeys("65");
		driver.findElement(By.xpath("//input[@id='education_start_date']")).click();
		driver.findElement(By.xpath("//input[@id='education_start_date']")).sendKeys("2009-09-08");
		driver.findElement(By.xpath("//input[@id='education_start_date']")).sendKeys(Keys.ENTER);	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='education_end_date']")).click();
		driver.findElement(By.xpath("//input[@id='education_end_date']")).sendKeys("2014-09-10");
		driver.findElement(By.xpath("//input[@id='education_end_date']")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='btnEducationSave']")).click();
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.quit();
  }
 // @Test
  public void TC06_AddWorkExperience_Qualifications() throws InterruptedException 
  {
	  WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://testingmasters.com/hrm/symfony/web/index.php/dashboard/");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("ankit3");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("abcd1234");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		driver.findElement(By.xpath("//b[text()='My Info']")).click();
		driver.findElement(By.xpath("//a[text()='Qualifications']")).click();
		driver.findElement(By.xpath("//input[@id='addWorkExperience']")).click();
		driver.findElement(By.xpath("//input[@id='experience_employer']")).sendKeys("TestingMasters");
		driver.findElement(By.xpath("//input[@id='experience_jobtitle']")).sendKeys("QA Engineer");
		driver.findElement(By.xpath("//input[@id='experience_from_date']")).click();
		driver.findElement(By.xpath("//input[@id='experience_from_date']")).sendKeys("2016-02-08");
		driver.findElement(By.xpath("//input[@id='experience_from_date']")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='experience_to_date']")).click();
		driver.findElement(By.xpath("//input[@id='experience_to_date']")).sendKeys("2017-02-08");
		driver.findElement(By.xpath("//input[@id='experience_to_date']")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@id='experience_comments']")).sendKeys("Entered experience comments");
		driver.findElement(By.xpath("//input[@id='btnWorkExpSave']")).click();
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.quit();
  }
}
