package sauceDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(id="user-name") 
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(name="login-button")
	private WebElement login;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void sendUsername()
	{
		username.sendKeys("standard_user");
	}
	
	public void sendPassword()
	{
		password.sendKeys("secret_sauce");
	}
	
	public void clickLoginButton()
	{
		login.click();
	}
	
}
