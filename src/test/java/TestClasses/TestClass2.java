package TestClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import iceHRM.Home;
import iceHRM.Login;

public class TestClass2 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\MONIKA\\SELENIUM\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("Https://icehrm-open.gamonoid.com");

		Login login=new Login(d);
		login.sendUsername();
		login.sendPassword();
		login.clickLoginButton();
		
		Home home=new Home(d);
		home.clickAdminTab();
		home.selectCompanyStructure();
		home.clickManageTab();
		home.selectAttendance();
		
		
	}

}
