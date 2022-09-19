package TestClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import sauceDemo.HomePage;
import sauceDemo.LoginPage;

public class SausDemo
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\MONIKA\\SELENIUM\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.saucedemo.com");
		
		LoginPage login=new LoginPage(d);
		login.sendUsername();
		login.sendPassword();
		login.clickLoginButton();
		
		HomePage home=new HomePage(d);
		home.clickOnAddToCartButton();
		
	}	
}
