package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomeToBugZillaPage {
	
	public WebDriver driver;
	
	public WelcomeToBugZillaPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	By Logout = By.xpath("//*[@id='header']//descendant::ul[1]/li[10]/a");
	
	
	
	public void  _userIsOn_WelcomeToBugZillaPage()
	{
		if(driver.findElement(Logout).isDisplayed())
		{
			String username=driver.findElement(Logout).getText();
			System.out.println(username);
		}
	}
	
	public void  _ClickLogoutFrom_WelcomeToBugZillaPage()
	{
		if(driver.findElement(Logout).isDisplayed())
		{
			driver.findElement(Logout).click();
		}
	}
}
