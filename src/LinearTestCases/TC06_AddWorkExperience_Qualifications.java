package LinearTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC06_AddWorkExperience_Qualifications 
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
