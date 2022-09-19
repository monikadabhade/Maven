package TESTNG;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNG2 
{

	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("before class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before Method ");

	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("before test ");

	}
	
	@Test
	public void test2()
	{
		System.out.println("test2");
	}
	
	@Test
	public void Test1()
	{
		System.out.println("test1");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("after test");
	}
	
	@AfterMethod
	public void after()
	{
		System.out.println("after method");
	}
	
	@AfterClass
	public void aterClass()
	{
		System.out.println("after class");
		
	}
	
	@BeforeSuite()
	public void beforeSuit()
	{
		System.out.println("before suit");
	}
	
	@AfterSuite()
	public void afterSuit()
	{
		System.out.println("after suit");
	}
	
	@AfterGroups
	public void afterGroups()
	{
		System.out.println("after groups");
	}
	
	@BeforeGroups
	public void beforeGroups()
	{
		System.out.println("before groups");
	}
	
	
}
