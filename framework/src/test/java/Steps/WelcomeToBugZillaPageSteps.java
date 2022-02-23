package Steps;



import Utils.TestController;

import io.cucumber.java.en.Then;



public class WelcomeToBugZillaPageSteps {
	
	public TestController tc;
	
	public WelcomeToBugZillaPageSteps(TestController tc)
	{
		this.tc=tc;
	}
	
	
	@Then("Users should be able to login to Bugzilla successfully")
	public void users_should_be_able_to_login_to_bugzilla_successfully() throws InterruptedException {
		Thread.sleep(3000);
	    tc.dc.GetWelcomeToBugZillaPage()._userIsOn_WelcomeToBugZillaPage();
	}
	
	@Then("Click on Logout link")
	public void click_on_logout_link() throws InterruptedException {
		Thread.sleep(3000);
	    tc.dc.GetWelcomeToBugZillaPage()._ClickLogoutFrom_WelcomeToBugZillaPage();
	}
	

}
