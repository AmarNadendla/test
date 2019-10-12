package Library;

import org.openqa.selenium.By;

public class OR 
{
	public static class pg_Login
	{
		public static By Edt_UserName = By.xpath("//input[@id='txtUsername']");
		public static By Edt_Password = By.xpath("//input[@id='txtPassword']");
		public static By Btn_Login = By.xpath("//input[@id='btnLogin']");
	}
	public static class pg_HomePage
	{
		public static By Lnk_MyInfo = By.xpath("//b[text()='My Info']");
		public static By lnk_EmergencyContacts = By.xpath("//a[text()='Emergency Contacts']");
	}
	public static class pg_EmergencyContacts
	{
		public static By Btn_Add = By.xpath("//input[@value='Add']");
		public static By Edt_Name = By.xpath("//input[@id='emgcontacts_name']");
		public static By Edt_Relationship = By.xpath("//input[@id='emgcontacts_relationship']");
		public static By HomePhone = By.xpath("//input[@id='emgcontacts_homePhone']");
		public static By MobilePhone = By.xpath("//input[@id='emgcontacts_mobilePhone']");
		public static By worktele = By.xpath("//input[@id='emgcontacts_workPhone']");
		public static By Btn_save = By.xpath("//input[@id='btnSaveEContact']");
		
	}
	
}
