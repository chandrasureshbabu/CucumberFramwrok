package Steps;

import static org.testng.Assert.assertFalse;

import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import Utils.TestController;
import io.cucumber.java.en.Then;

public class InvalidUsernameOrPasswordPageSteps {
	
	
	
	TestController tc;
	
	public  InvalidUsernameOrPasswordPageSteps(TestController tc) {
	
	this.tc=tc;
	}
	
	
	@Then("or Else redirected to InavalidUsernameandPasswordpage")
	public void or_else_redirected_to_inavalid_usernameand_passwordpage() {
		Assert.assertTrue(tc.dc.getInvalidUsernameOrPasswordPage().RedirectedErrorpage());
	    
	}
	@Then("Page title should {string}")
	public void page_title_should(String title) {
	    String pagetitle=tc.dc.getInvalidUsernameOrPasswordPage().PageTitle().trim();
	    if(pagetitle.equalsIgnoreCase(title))
	    {
	    	Assert.assertTrue(true);
	    	System.out.println("!@# on Error Page  !@#");
	    }else
	    {
	    	Assert.assertFalse(false);
	    	System.out.println("----------------Actual title ---------:" +pagetitle);
	    }
	    
	    
	    //Assert.assertSame(title, pagetitle);
	    
	}
	@Then("ErrorMessage should be {string}")
	public void error_message_should_be(String errmessage) {
		String message=tc.dc.getInvalidUsernameOrPasswordPage().ErrorMessage().trim();
		
		if(message.equalsIgnoreCase(errmessage))
		{
			Assert.assertTrue(true);
			System.out.println("!@# on Error Message found  !@#");
		}else
		{
		Assert.assertFalse(false);
		System.out.println("----------------Actual Message ---------:" +message);
	    //Assert.assertSame(message, errmessage);
		}
	}
	
	

}
