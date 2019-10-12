package LinearTestCases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC05_AddLanguage_Qualifications 
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
		driver.findElement(By.xpath("//input[@id='addLanguage']")).click();	
		driver.findElement(By.xpath("//select[@id='language_code']/option[text()='English']")).click();	
		driver.findElement(By.xpath("//select[@id='language_lang_type']/option[text()='Speaking']")).click();	
		driver.findElement(By.xpath("//select[@id='language_competency']/option[text()='Good']")).click();	
		driver.findElement(By.xpath("//textarea[@id='language_comments']")).sendKeys("Entered Language Details");
		driver.findElement(By.xpath("//input[@id='btnLanguageSave']")).click();	
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.quit();
	}
}
