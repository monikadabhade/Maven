package TESTNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TimeOut
{
	@BeforeClass
	public  void beforeClass()
	{
		System.out.println("before class");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("after class");
	}
	
	@Test(timeOut=2000)//if method can not execute in given time it will get skipped
	public void testA() throws InterruptedException
	{
		System.out.println("--testA ");
//		Thread.sleep(4000);
	}
	
	@Test
	public void testB()
	{
		System.out.println("--testB");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before method");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after method");
	}
	
	
	
}
