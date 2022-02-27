package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InvalidUsernameOrPasswordPage {
	
	
	public WebDriver driver;
	
	
	public  InvalidUsernameOrPasswordPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	By PageTitle=By.xpath("//*[@id='header']//p");
	
	By ErrorMessage=By.xpath("//*[@id='bugzilla-body']//td");
	
	public boolean  RedirectedErrorpage()
	{
		return driver.findElement(ErrorMessage).isDisplayed();
	}
	
	public String  PageTitle()
	{
		return driver.findElement(PageTitle).getText();
	}
	
	public String  ErrorMessage()
	{
		return driver.findElement(ErrorMessage).getText();
	}
	
	
	

}
