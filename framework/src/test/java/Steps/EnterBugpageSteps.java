package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Pageobjects.EnterBugPage;
import Utils.TestController;
import io.cucumber.java.en.Then;

public class EnterBugpageSteps {
	
	//public WebDriver driver;
	
	TestController tc;
	
	
	
	
	public EnterBugpageSteps(TestController tc)
	{
		this.tc=tc;
	}
	
	@Then("user should land on EnterBugPage")
	public void user_should_land_on_enter_bug_page() throws InterruptedException {
		/*
		 * if(tc.driver.findElement(By.xpath(
		 * "//*[@id='header']//descendant::ul[1]/li[11]/a")).isDisplayed()) {
		 * tc.driver.findElement(By.xpath(
		 * "//*[@id='header']//descendant::ul[1]/li[11]/a")).click();
		 * Thread.sleep(3000); tc.driver.quit(); }
		 */
		//EnterBugPage enterBugPage= new EnterBugPage(tc.driver);
		
		/*
		 * EnterBugPage enterBugPage=tc.pageObjectManager.getEnterBugPage(tc.driver);
		 * 
		 * if(enterBugPage.Logoutlinkdisplayed())
		 * or
		 */
	if(tc.dc.getEnterBugPage().Logoutlinkdisplayed())
	   {
		   //enterBugPage.logout();
			//or
			Thread.sleep(3000);
		   tc.dc.getEnterBugPage().logout();
	   }
	}

}
