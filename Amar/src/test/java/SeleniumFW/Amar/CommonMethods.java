package SeleniumFW.Amar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CommonMethods {
	
    public static WebDriver driver= null;
	
	
	public static WebDriver Browser(String browser)
	{  
		if(  browser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability("marionette",true);
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\DataDriven\\chromedriver.exe");
			driver = new ChromeDriver();
			//driver.manage().window().maximize();
		}else
		{
			System.out.println("Plese Enter Browser Name");
		}
		return driver;
	}
	
	public void getUrl(String url)
	{
		try
		{
			driver.get(url);
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Problem in getUrl()");
		}
	}
	public void clickElement(String Xpath)
	{
		try
		{
			driver.findElement(By.xpath(Xpath)).click();
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Problem in clickElement()");
		}
		
	}

}
