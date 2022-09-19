package iceHRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home
{
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath="//span[text()='Admin']") 
	private WebElement admin;
	
	@FindBy(xpath="//a[text()=' Company Structure ']")
	private WebElement companyStructure;
	
	@FindBy(xpath="//span[text()='Manage']")
	private WebElement manage;
	
	@FindBy(xpath="//a[text()=' Attendance ']")
	private WebElement attendance;
	
	public Home(WebDriver driver)
	{
		this.driver=driver;
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		PageFactory.initElements(driver,this);
	}
	
	public void clickAdminTab()
	{
		boolean result=admin.isDisplayed();
		System.out.println(result);
		admin.click();
	}
	
	public void selectCompanyStructure()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=' Company Structure ']")));
		boolean result=companyStructure.isDisplayed();
		System.out.println(result);
		companyStructure.click();;
	}
	
	public void clickManageTab()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Manage']")));
		boolean result=manage.isDisplayed();
		System.out.println(result);
		manage.click();
	}
	
	public void selectAttendance()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=' Attendance ']")));
		boolean result=attendance.isDisplayed();
		System.out.println(result);
		attendance.click();
	}
	
	
}
