package LinearTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC01_AddEmergencyContactsAndVerify 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://testingmasters.com/hrm/symfony/web/index.php/dashboard/");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("ankit3");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("abcd1234");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		driver.findElement(By.xpath("//b[text()='My Info']")).click();
		driver.findElement(By.xpath("//a[text()='Emergency Contacts']")).click();
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		driver.findElement(By.xpath("//input[@id='emgcontacts_name']")).sendKeys("Kiran");
		driver.findElement(By.xpath("//input[@id='emgcontacts_relationship']")).sendKeys("Arun");
		driver.findElement(By.xpath("//input[@id='emgcontacts_homePhone']")).sendKeys("04085667476");
		driver.findElement(By.xpath("//input[@id='emgcontacts_mobilePhone']")).sendKeys("85667476");
		driver.findElement(By.xpath("//input[@id='emgcontacts_workPhone']")).sendKeys("9985667476");
		driver.findElement(By.xpath("//input[@id='btnSaveEContact']")).click();
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.quit();
	}
}
