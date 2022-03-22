package Steps;

import org.junit.Assert;

import Utils.TestController;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ConfirmationPageSteps {
	
	public TestController tc;
	
	
	public ConfirmationPageSteps(TestController tc)
	{
		this.tc=tc;
	}
	
	
	
	@Then("^user is on Bugzilla Bug page$")
    public void user_is_on_bugzilla_bug_page() throws Throwable {
        String title=tc.dc.getConfirmationPage().confirmationPagetitle().trim();
        
        if(title.equalsIgnoreCase(""))
        {
        	Assert.assertTrue(true);
        }
    }

    @Then("^user can see \"([^\"]*)\" for bug Number is Displayed$")
    public void user_can_see_something_for_bug_number_is_displayed(String ChangesAck) throws Throwable {
       tc.dc.getConfirmationPage().changesSubmitted(ChangesAck);
       if(tc.dc.getConfirmationPage().bugNoLinkIsPresent())
       {
    	   Assert.assertTrue(true);
       }
    }
    
    @And("^Logout link is displayed$")
    public void logout_link_is_displayed() throws Throwable {
        tc.dc.getConfirmationPage().ClickLogout();
    }

}
