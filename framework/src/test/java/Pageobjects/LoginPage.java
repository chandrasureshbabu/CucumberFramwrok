package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	By Username= By.id("Bugzilla_login");
	
	By Password= By.cssSelector("#Bugzilla_password");
	
	By Login=By.id("log_in");
	
	
	public void enterCreds(String username, String password)
	{
		driver.findElement(Username).sendKeys(username);
		driver.findElement(Password).sendKeys(password);
		
	}
	
	public EnterBugPage _frmLoginPage()
	{
		driver.findElement(Login).click();
		
		return new  EnterBugPage(driver);
	}
	
	public boolean loginButtonisDisplayed()
	{
		return driver.findElement(Login).isDisplayed();
		
		
	}
	
	

}
