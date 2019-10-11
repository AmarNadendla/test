package Library;

import java.io.IOException;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebGeneralLibrary extends FrameWorkLibrary
{
	public String randomEmail()
    {
		
		return "random-" + UUID.randomUUID().toString() + "@example.com";
	}
	
	public static Boolean SetText(WebDriver driver,String ObjectXpath,String Value,String plog,String flog) throws IOException, InterruptedException
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
        updateLogStep(stepStatus);
        return stepStatus;
    }

	public static Boolean SetText(WebDriver driver,By ObjectXpath,String Value,String plog,String flog) throws IOException, InterruptedException
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
        updateLogStep(stepStatus);
        return stepStatus;
        
    }
	public static Boolean SetText(WebDriver driver,String ObjectXpath,String Value) throws IOException, InterruptedException
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
        updateLogStep(stepStatus);
        return stepStatus;
    }
	public static Boolean SetText(WebDriver driver,By ObjectXpath,String Value) throws IOException, InterruptedException
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
        updateLogStep(stepStatus);
        return stepStatus;
    }
	public static Boolean ClickElement(WebDriver driver,String ObjectXpath,String plog,String flog) throws IOException, InterruptedException
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
        updateLogStep(stepStatus);
        return stepStatus;
    }
	public static Boolean ClickElement(WebDriver driver,By ObjectXpath,String plog,String flog) throws IOException, InterruptedException
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
        updateLogStep(stepStatus);
        return stepStatus;
    }
	public static Boolean ClickElement(WebDriver driver,String ObjectXpath) throws IOException, InterruptedException
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
        updateLogStep(stepStatus);
        return stepStatus;
    }
	public static Boolean ClickElement(WebDriver driver,By ObjectXpath) throws IOException, InterruptedException
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
        updateLogStep(stepStatus);
        return stepStatus;
    }
	
	public static Boolean Exist(WebDriver driver,By ObjectXpath,String plog,String flog) throws IOException, InterruptedException
    {
        Boolean stepStatus = true;
        try
        {
        	driver.findElement((ObjectXpath));
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
        updateLogStep(stepStatus);
        return stepStatus;
    }
	public static Boolean SetTextAndEscape(WebDriver driver,String ObjectXpath,String Value,String plog,String flog) throws IOException, InterruptedException
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
        updateLogStep(stepStatus);
        return stepStatus;
    }
	public static Boolean SetTextAndEscape(WebDriver driver,String ObjectXpath,String Value) throws IOException, InterruptedException
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
        updateLogStep(stepStatus);
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
   		WebDriver driver = null;
   		switch(BrowserName.toLowerCase())
   		{
   			case "firefox":
   			{
   				driver = new FirefoxDriver();
   				break;
   			}
   			case "internetexplorer":
   			{
   				DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
   				capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
   				capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
   				System.setProperty("webdriver.ie.driver", "JarFiles\\BrowserServers\\IEDriverServer.exe");
   				driver = new InternetExplorerDriver(capabilities);
   				break;
   			}
   			case "chrome":
   			{
   				System.setProperty("webdriver.chrome.driver","JarFiles\\BrowserServers\\chromedriver.exe");
   				driver = new ChromeDriver();
   				break;
   			}
   			default:
   			{
   				System.out.println("please Select the correct browser");
   			}
   		}
   		return driver;
   	}

    public static Boolean OpenUrl(WebDriver driver,String URL) throws IOException, InterruptedException
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
    	updateLogStep(stepStatus);
    	
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
