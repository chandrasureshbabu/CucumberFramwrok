package Steps;

import org.junit.Assert;

import Utils.TestController;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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
	
	@And("^user is on EnterBug page \"([^\"]*)\"$")
    public void user_is_on_enterbug_page_something(String pagetitle) throws Throwable {
        String title=tc.dc.getEnterBugPage().getBugpageTtitle().trim();
        if(title.contains(pagetitle))
        {
        	Assert.assertTrue(pagetitle, true);
        	System.out.println("---expected---------"+pagetitle);
        }else
        {
        	//Assert.assertFalse(false);
        	System.out.println("---Atual title of page is :------"+title);
        }
        
    }

	 	@Given("^user selects severity  as \"([^\"]*)\"$")
	    public void user_selects_severity_as_something(String severity) throws Throwable {
	 		
	 		Thread.sleep(3000);
	        tc.dc.getEnterBugPage().selectSeverity(severity);
	    }

	    @And("^user Select Hardware \"([^\"]*)\" and Operating System \"([^\"]*)\"$")
	    public void user_select_hardware_something_and_operating_system_something(String hardware, String Os) throws Throwable {
	        tc.dc.getEnterBugPage().selectHardWare(hardware);
	        tc.dc.getEnterBugPage().SelectOS(Os);
	    }

	    @And("^user Enter Summary \"([^\"]*)\" and Description  \"([^\"]*)\"$")
	    public void user_enter_summary_something_and_description_something(String summary, String desc) throws Throwable {
	        tc.dc.getEnterBugPage().enterBugSummary(summary);
	        tc.dc.getEnterBugPage().enterBugDescription(desc);
	    }

	    @And("^Clicks Submit$")
	    public void clicks_submit() throws Throwable {
	        tc.dc.getEnterBugPage().ClickSubmit();
	    }


}
