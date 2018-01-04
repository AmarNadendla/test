package LinearTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC08_AddLicense_Qualifications 
{
	public static void main(String[] args) throws InterruptedException 
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
		
		driver.findElement(By.xpath("//input[@id='addLicense']")).click();
		driver.findElement(By.xpath("//select[@id='license_code']/option[text()='Driving License']")).click();
		driver.findElement(By.xpath("//input[@id='license_license_no']")).sendKeys("e3hg32345");
		driver.findElement(By.xpath("//input[@id='license_date']")).click();
		driver.findElement(By.xpath("//input[@id='license_date']")).sendKeys("2012-02-02");
		driver.findElement(By.xpath("//input[@id='license_date']")).sendKeys(Keys.ENTER);	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='license_renewal_date']")).click();
		driver.findElement(By.xpath("//input[@id='license_renewal_date']")).sendKeys("2016-02-02");
		driver.findElement(By.xpath("//input[@id='license_renewal_date']")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='btnLicenseSave']")).click();
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.quit();
	}
}
