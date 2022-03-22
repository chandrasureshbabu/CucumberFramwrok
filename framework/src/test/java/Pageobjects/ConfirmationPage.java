package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ConfirmationPage {

	
	WebDriver driver;
	
	
	public ConfirmationPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By ChangesSubmitted=By.xpath("//*[@id='bugzilla-body']/dl/dt");

	By IssueNo=By.xpath("//a[contains(text(),'bug')]");
	
	By Logout=By.xpath("//body/div[@id='header']/ul[1]/li[11]/a[1]");
	
	public String  confirmationPagetitle()
	{
		String title=driver.getTitle();
		return title;
	}
	
	public void  changesSubmitted(String Changes)
	{
		 String submmited=  driver.findElement(ChangesSubmitted).getText();
		 
		 if(submmited.contains(Changes))
		 {
			 Assert.assertTrue(true, submmited);
		 }
	}
	
	public boolean bugNoLinkIsPresent()
	{
		if(driver.findElement(IssueNo).isEnabled())
		{
			return true;
		}
		else
			return false;
	}
	
	
	public void ClickLogout()
	{
		driver.findElement(Logout).click();
	}
	
	
}
