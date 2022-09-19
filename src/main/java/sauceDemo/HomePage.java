package sauceDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(xpath="(//button[text()='Add to cart'])[1]")
	private WebElement addToCart;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnAddToCartButton()
	{
		String text=addToCart.getText();
		System.out.println(text);
		boolean r=addToCart.isDisplayed();
		System.out.println(r);
		addToCart.click();
	}
}
