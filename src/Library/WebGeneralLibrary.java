package Library;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebGeneralLibrary extends FrameWorkLibrary
{
	public static Boolean SetText(WebDriver driver,String ObjectXpath,String Value,String plog,String flog)
    {
        Boolean stepStatus = true;
        try
        {
        	driver.findElement(By.xpath(ObjectXpath)).click();
        	driver.findElement(By.xpath(ObjectXpath)).clear();
            driver.findElement(By.xpath(ObjectXpath)).sendKeys(Value);
            String Enteredvalue="";
            Enteredvalue=driver.findElement(By.xpath(ObjectXpath)).getAttribute("value");
            if (!Enteredvalue.equalsIgnoreCase(Value))
            {
            	stepStatus = false;
            }
        }
        catch (Exception e)
        {
            stepStatus = false;
        }
        if(plog.length()>0 && flog.length()>0)
        {
        	if(stepStatus)
	        {
	        	System.out.println("<<Pass>> " + plog);
	        	plog = "";
	        }
	        else
	        {
	        	System.out.println("<<Fail>> " + flog);
	        	flog = "";
	        }
        }
        return stepStatus;
    }

	public static Boolean SetText(WebDriver driver,By ObjectXpath,String Value,String plog,String flog)
    {
        Boolean stepStatus = true;
        try
        {
        	driver.findElement(ObjectXpath).click();
        	driver.findElement(ObjectXpath).clear();
            driver.findElement(ObjectXpath).sendKeys(Value);
            String Enteredvalue="";
            Enteredvalue=driver.findElement(ObjectXpath).getAttribute("value");
            if (!Enteredvalue.equalsIgnoreCase(Value))
            {
            	stepStatus = false;
            }
        }
        catch (Exception e)
        {
            stepStatus = false;
        }
        if(plog.length()>0 && flog.length()>0)
        {
        	if(stepStatus)
	        {
	        	System.out.println("<<Pass>> " + plog);
	        	plog = "";
	        }
	        else
	        {
	        	System.out.println("<<Fail>> " + flog);
	        	flog = "";
	        }
        }
        return stepStatus;
    }
	public static Boolean SetText(WebDriver driver,String ObjectXpath,String Value)
    {
        Boolean stepStatus = true;
        try
        {
        	driver.findElement(By.xpath(ObjectXpath)).click();
        	driver.findElement(By.xpath(ObjectXpath)).clear();
            driver.findElement(By.xpath(ObjectXpath)).sendKeys(Value);
            String Enteredvalue="";
            Enteredvalue=driver.findElement(By.xpath(ObjectXpath)).getAttribute("value");
            if (!Enteredvalue.equalsIgnoreCase(Value))
            {
            	stepStatus = false;
            }
        }
        catch (Exception e)
        {
            stepStatus = false;
        }
        return stepStatus;
    }
	public static Boolean SetText(WebDriver driver,By ObjectXpath,String Value)
    {
        Boolean stepStatus = true;
        try
        {
        	driver.findElement(ObjectXpath).click();
        	driver.findElement(ObjectXpath).clear();
            driver.findElement(ObjectXpath).sendKeys(Value);
            String Enteredvalue="";
            Enteredvalue=driver.findElement(ObjectXpath).getAttribute("value");
            if (!Enteredvalue.equalsIgnoreCase(Value))
            {
            	stepStatus = false;
            }
        }
        catch (Exception e)
        {
            stepStatus = false;
        }
        return stepStatus;
    }
	public static Boolean ClickElement(WebDriver driver,String ObjectXpath,String plog,String flog)
    {
        Boolean stepStatus = true;
        try
        {
        	driver.findElement(By.xpath(ObjectXpath)).click();
        }
        catch (Exception e)
        {
            stepStatus = false;
        }
        if(plog.length()>0 && flog.length()>0)
        {
        	if(stepStatus)
	        {
	        	System.out.println("<<Pass>> " + plog);
	        	plog = "";
	        }
	        else
	        {
	        	System.out.println("<<Fail>> " + flog);
	        	flog = "";
	        }
        }
        return stepStatus;
    }
	public static Boolean ClickElement(WebDriver driver,By ObjectXpath,String plog,String flog)
    {
        Boolean stepStatus = true;
        try
        {
        	driver.findElement(ObjectXpath).click();
        }
        catch (Exception e)
        {
            stepStatus = false;
        }
        if(plog.length()>0 && flog.length()>0)
        {
        	if(stepStatus)
	        {
	        	System.out.println("<<Pass>> " + plog);
	        	plog = "";
	        }
	        else
	        {
	        	System.out.println("<<Fail>> " + flog);
	        	flog = "";
	        }
        }
        return stepStatus;
    }
	public static Boolean ClickElement(WebDriver driver,String ObjectXpath)
    {
        Boolean stepStatus = true;
        try
        {
        	driver.findElement(By.xpath(ObjectXpath)).click();
        }
        catch (Exception e)
        {
            stepStatus = false;
        }
        return stepStatus;
    }
	public static Boolean ClickElement(WebDriver driver,By ObjectXpath)
    {
        Boolean stepStatus = true;
        try
        {
        	driver.findElement(ObjectXpath).click();
        }
        catch (Exception e)
        {
            stepStatus = false;
        }
        return stepStatus;
    }
	
	public static Boolean Exist(WebDriver driver,String ObjectXpath)
    {
        Boolean stepStatus = true;
        try
        {
        	driver.findElement(By.xpath(ObjectXpath));
        }
        catch (Exception e)
        {
            stepStatus = false;
        }
        return stepStatus;
    }
	public static Boolean SetTextAndEscape(WebDriver driver,String ObjectXpath,String Value,String plog,String flog)
    {
        Boolean stepStatus = true;
        try
        {
        	driver.findElement(By.xpath(ObjectXpath)).click();
        	driver.findElement(By.xpath(ObjectXpath)).clear();
            driver.findElement(By.xpath(ObjectXpath)).sendKeys(Value);
            driver.findElement(By.xpath(ObjectXpath)).sendKeys(Keys.ESCAPE);
            wait(1);
            String Enteredvalue="";
            Enteredvalue=driver.findElement(By.xpath(ObjectXpath)).getAttribute("value");
            if (!Enteredvalue.equalsIgnoreCase(Value))
            {
            	stepStatus = false;
            }
        }
        catch (Exception e)
        {
            stepStatus = false;
        }
        if(plog.length()>0 && flog.length()>0)
        {
        	if(stepStatus)
	        {
	        	System.out.println("<<Pass>> " + plog);
	        	plog = "";
	        }
	        else
	        {
	        	System.out.println("<<Fail>> " + flog);
	        	flog = "";
	        }
        }
        return stepStatus;
    }
	public static Boolean SetTextAndEscape(WebDriver driver,String ObjectXpath,String Value)
    {
        Boolean stepStatus = true;
        try
        {
        	driver.findElement(By.xpath(ObjectXpath)).click();
        	driver.findElement(By.xpath(ObjectXpath)).clear();
            driver.findElement(By.xpath(ObjectXpath)).sendKeys(Value);
            driver.findElement(By.xpath(ObjectXpath)).sendKeys(Keys.ESCAPE);
            wait(1);
            String Enteredvalue="";
            Enteredvalue=driver.findElement(By.xpath(ObjectXpath)).getAttribute("value");
            if (!Enteredvalue.equalsIgnoreCase(Value))
            {
            	stepStatus = false;
            }
        }
        catch (Exception e)
        {
            stepStatus = false;
        }
        return stepStatus;
    }
    public static void wait(int d)
    {
    	try
    	{
    		Thread.sleep((long) (d*1000));
    	}
    	catch(Exception e)
    	{
    		
    	}
    }
    public static WebDriver launchBrowser(String BrowserName)
   	{
   		WebDriver Tempdriver = null;
   		switch(BrowserName.toLowerCase())
   		{
   			case "firefox":
   			{
   				Tempdriver = new FirefoxDriver();
   				break;
   			}
   			case "internetexplorer":
   			{
   				DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
   				capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
   				capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
   				System.setProperty("webdriver.ie.driver", "JarFiles\\BrowserServers\\IEDriverServer.exe");
   				Tempdriver = new InternetExplorerDriver(capabilities);
   				break;
   			}
   			case "chrome":
   			{
   				System.setProperty("webdriver.chrome.driver","JarFiles\\BrowserServers\\chromedriver.exe");
   				Tempdriver = new ChromeDriver();
   				break;
   			}
   			default:
   			{
   				System.out.println("please Select the correct browser");
   			}
   		}
   		return Tempdriver;
   	}

    public static Boolean OpenUrl(WebDriver driver,String URL)
    {
    	Boolean stepStatus = true;
    	try
    	{
    		driver.get(URL);
    		driver.manage().window().maximize();
    	}
    	catch(Exception e)
    	{
    		stepStatus = false;
    	}
    	String CurrentUrl = driver.getCurrentUrl();
    	if (!CurrentUrl.contains(URL))
    	{
    		stepStatus = false;
    	}
    	return stepStatus;
    }

    public static void quitBrowser(WebDriver driver)
    {
    	try
    	{
    		driver.quit();
    	}
    	catch(Exception e)
    	{
    		
    	}
    }
}
