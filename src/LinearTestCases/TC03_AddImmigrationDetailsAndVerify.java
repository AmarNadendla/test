package LinearTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC03_AddImmigrationDetailsAndVerify 
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
}
