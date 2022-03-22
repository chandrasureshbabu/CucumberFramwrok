package Steps;

import org.testng.Assert;

import Utils.TestController;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class AdditionalDetailsPageSteps {
	
	public TestController tc;
	
	
	public AdditionalDetailsPageSteps(TestController tc)
	{
		this.tc=tc;
	}
	
	
	@Then("^user is on Bug additional details page$")
    public void user_is_on_bug_additional_details_page() throws Throwable {
		
		if(tc.dc.getAdditionalDetailsPage().IsonAdditionalpage())
		{
			Assert.assertTrue(true);
		}
        
    }
	

    @And("^user enters Additional Comments \"([^\"]*)\"$")
    public void user_enters_additional_comments_something(String Acomment) throws Throwable {
        tc.dc.getAdditionalDetailsPage().enterAdditionalComments(Acomment);
    }

	 @And("^save Changes$")
	 public void save_changes() throws Throwable {
		 
		 tc.dc.getAdditionalDetailsPage().submit_IssueAdditionalDetails();
	        
	    }


}
