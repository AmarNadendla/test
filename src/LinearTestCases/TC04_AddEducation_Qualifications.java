package LinearTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC04_AddEducation_Qualifications 
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
}
