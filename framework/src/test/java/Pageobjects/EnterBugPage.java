package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EnterBugPage {
	
	public WebDriver driver;
	
	
	public EnterBugPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By Logout= By.xpath("//*[@id='header']//descendant::ul[1]/li[11]/a");
	
	public HomePage logout()
	{
		driver.findElement(Logout).click();
		
		return new HomePage(driver);
	}
	
	public  boolean Logoutlinkdisplayed()
	{
		if(driver.findElement(Logout).isDisplayed())
		{
			return true;
		}
		return false;
	}
	

}
