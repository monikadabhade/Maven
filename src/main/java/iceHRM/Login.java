package iceHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login
{

	@FindBy(id="username") 
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(className="btn-medium")
	private WebElement login;
	
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void sendUsername()
	{
		username.sendKeys("admin");
	}
	
	public void sendPassword()
	{
		password.sendKeys("admin");
	}
	
	public void clickLoginButton()
	{
		login.click();
	}
}
