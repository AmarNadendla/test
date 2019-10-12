package LinearTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC02_AddDependenciesAndVerify 
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
}
