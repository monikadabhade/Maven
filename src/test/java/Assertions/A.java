package Assertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import orangeHRM.HomePage;
import orangeHRM.LogInPage;
public class A 
{
	WebDriver d;
	SoftAssert s=new SoftAssert();
	@BeforeClass
	public void BeforeClass()
	{
		System.setProperty("webdriver.chrome.driver","D:\\MONIKA\\SELENIUM\\chromedriver.exe");
	    d=new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com");
		
	}
	
	@Test(priority=1)//Soft Assertion
	public void verifyHomePage() throws InterruptedException//non static methods of SoftAssert
	{
		HomePage home=new HomePage(d);
		home.verifyAdminTab();
		home.verifyTimeTab();
		home.verifyMyINfoTab();
		String actualResult=d.getCurrentUrl();
		String expectedResult="https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
//		s.assertEquals(actualResult, expectedResult);
//		s.assertNotEquals(actualResult, expectedResult);
//		s.assertTrue(true);
		s.assertFalse(true);

		System.out.println("home page passed");
//		s.assertAll();

	}
	
	@Test(priority=0)//Hard Assertion
	public void verifyLoginPage()//Assert class static methods
	{
		LogInPage login=new LogInPage(d);
		login.sendUserName();
		login.sendPassword();
		boolean result=login.clickLoginButton();//it returns boolean result
		String actualResult=d.getCurrentUrl();
		String expectedResult="https://opensource-demo.orangehrmlive.com/web/index.php/pim";
//		Assert.assertEquals(actualResult,expectedResult);//it will not execute next test case if it is failed
//		Assert.assertNotEquals(actualResult,expectedResult);//it execute if both results are not same
//		Assert.assertTrue(result);//it execute next line if boolean value is true
		Assert.assertFalse(false);//it execute only if boolean value is false
//		Assert.fail();//to fail the test case forcefully
		System.out.println("login passed");
		
		
	}
	
}
