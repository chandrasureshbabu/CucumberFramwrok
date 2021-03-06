package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	
	
	public WebDriver driver;
	
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	By EnterABug= By.id("enter_bug");
	By HeaderLogin= By.cssSelector("#login_link_top");
	By Username=By.cssSelector("#Bugzilla_login_top");
	By Password=By.cssSelector("#Bugzilla_password_top");
	By LoginToSignin =By.cssSelector("#log_in_top");
	
	By ForgotPassword=By.xpath("//*[@id='header']//descendant::ul[1]/li[10]/a");
	
	
	public void enterABug()
	{
		driver.findElement(EnterABug).click();
		//return new LoginPage(driver);
	}
	
	public boolean  enterAbugDisplayed()
	{
		if(driver.findElement(EnterABug).isDisplayed())
			return true;
		else
			return false;
	}
	
	public boolean  _homePage_ForgotPasswordLinkIsDisplayed()
	{
		boolean LinkDisplayed=driver.findElement(ForgotPassword).isDisplayed();
		
		return LinkDisplayed;
	}
	
	public void _homepage_Login(String username,String password)
	{
		driver.findElement(Username).sendKeys(username);
		driver.findElement(Password).sendKeys(password);
		driver.findElement(LoginToSignin).click();
	}
	public  void _homepage_ClickLoginToSignin()
	{	if(!driver.findElement(LoginToSignin).isDisplayed())
		{
		driver.findElement(HeaderLogin).click();
		}
	}
	
	public boolean _homepage_CredsFieldsDisplayed()
	{
		
		if(driver.findElement(Username).isDisplayed())
		
			return true;
		return false;
	}
}
