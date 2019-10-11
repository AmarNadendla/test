package Library;




import org.openqa.selenium.By;


public class OR 
{
	public static class pg_Index{
		
		public static By SignInBtn = By.xpath("//a[contains(text(),'Sign In')]");
		public static By SignUpBtn = By.xpath("//a[contains(text(),'Sign Up')]");
		public static By SkipBtn = By.xpath("//a[contains(text(),'Skip')]");
		public static By WelcomeText = By.xpath("//h1[text()='Play for Rewards!']");
		//Play for Rewards!
	
	}
	public static class pg_SignIn
	{
		public static By LinkTerms = By.xpath("//a[contains(text(),'Terms')]");
		public static By LinkBackNav = By.xpath("//a[contains(text(),'back')]");
		
		public static By EmailFiled = By.xpath("//input[@type='email']");
		public static By PasswordField = By.xpath("//input[@type='password']");
		public static By SignInSubmit = By.xpath("//input[@type='submit']");
		
		public static By ForgotPaswrdLink = By.xpath("//a[contains(text(),'Forgot Password?')]");
		public static By ResetPasswrdField = By.xpath("//input[@type='email']");
		public static By ResetPaswrdSubmit = By.xpath("//input[@value='Send']");
	}
	public static class pg_SignUp
	{
		public static By SignUpFnameField = By.xpath("//input[@name='first_name']");
		public static By SignUpLnameField = By.xpath("//input[@name='last_name']");
		public static By SignUpEmailField = By.xpath("//input[@name='email_address']");
		public static By SignUpConfEmail = By.xpath("//input[@name='confirm_email_address']");
		public static By SignUpPasswrd = By.xpath("//input[@name='password']");
		public static By MnthDD = By.xpath("//select[@name='month']/option[@value='01']");
		public static By DayDD = By.xpath("//select[@name='day']/option[@value='01']");
		public static By YearDD= By.xpath("//select[@name='year']/option[@value='1992']");
		public static By SignUpSubmit = By.xpath("//input[@value='Sign Up']");
	}
	public static class pg_Home{
		
		public static By ToggleMenu = By.xpath("//a[contains(text(),'Main Menu')]");
		
	}
	public static class pg_Account{
		
		public static By Account = By.linkText("Account");
				//By.xpath("//a[text()='Account']");
		public static By SignOut = By.linkText("Sign Out");
				//By.xpath("//a[text()='Sign Out']");
	}
	public static class pg_FBlogin{
		
		public static By FBbtn = By.xpath("//a[text()='Login with Facebook']");
		public static By fbemail = By.xpath("//input[@name='email']");
		public static By fbpass = By.xpath("//input[@name='pass']");
		public static By fbsubmit = By.xpath("//input[@value='Log In']");
		
	}
	
	public static class demo{
		public static By StartPractising = By.xpath("//a[@id='btn_basic_example']");
		public static By simpleformdemo = By.xpath("//div[@class='list-group']/a[text()='Simple Form Demo']");
		
		
	}
	
	
}
