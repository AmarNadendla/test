package testPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class TestcaseDefinition {

	public WebDriver driver;
	
	@BeforeTest
	public void lunchbrowser()
	{
	
	System.setProperty("webdriver.chrome.driver","E:\\Tmasters\\P4RC_TestNGFramework516\\JarFiles\\BrowserServers\\chromedriver.exe");
	driver = new ChromeDriver();
	
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.close();
	}
	
	
	@Test
	public void getUrl()
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.seleniumeasy.com/test/");
	}
	
	
	
}
