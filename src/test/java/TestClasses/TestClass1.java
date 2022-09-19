package TestClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import orangeHRM.HomePage;
import orangeHRM.LogInPage;

public class TestClass1
{
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\MONIKA\\SELENIUM\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com");
		
		
		//login page test cases
		LogInPage login=new LogInPage(d);
		login.sendUserName();
		login.sendPassword();
		login.clickLoginButton();
		
		//home page test cases
		HomePage home=new HomePage(d);
		home.verifyAdminTab();
		home.verifyTimeTab();
		home.verifyMyINfoTab();
		
	
	}
}
