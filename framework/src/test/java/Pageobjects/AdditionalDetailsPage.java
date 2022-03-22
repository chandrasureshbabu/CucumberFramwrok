package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdditionalDetailsPage {

	
	public WebDriver driver;
	
	
	public AdditionalDetailsPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	private  By AdditionalComments=By.id("comment");
	
	private  By submit= By.id("commit");
	
	
	public void enterAdditionalComments(String comments)
	{
		driver.findElement(AdditionalComments).sendKeys(comments);
	}
	
	public void submit_IssueAdditionalDetails()
	{
		driver.findElement(submit).click();
	}
	
	public boolean IsonAdditionalpage()
	{
		if(driver.findElement(AdditionalComments).isDisplayed())
			
		return true;
		else
		return false;
		
		
	}
	
	
	
}
