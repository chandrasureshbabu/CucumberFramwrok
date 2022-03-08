package Steps;

import Utils.TestController;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginpageSteps {
	
	
	//public WebDriver driver;
	TestController tc;
	//LoginPage loginpage;
	
	public LoginpageSteps(TestController tc)
	{
		this.tc=tc;
	}

	@Then("user lands on the Login page")
	public void user_lands_on_the_login_page() {
	   // tc.driver.findElement(By.id("log_in")).isDisplayed();
		
	   //loginpage= new LoginPage(tc.driver);
		
		/*
		 * loginpage= tc.pageObjectManager.getLoginPage(tc.driver);
		 
		 * if(loginpage.loginButtonisDisplayed())
		 * or
		 */
	    if(tc.dc.getLoginPage().loginButtonisDisplayed())
	    {
	    	System.out.println("Navigated to Loginpage");
	    }else
	    {
	    	System.out.println("Not navigated to Login page");
	    }
	}
	@And("^Enter username (.+) Password and (.+) click Login$")
    public void enter_username_password_and_click_login(String username, String password) throws Throwable {
        tc.dc.getLoginPage().enterCreds(username, password);
    }
	
	@Given("User navigated to Login page of Bugizilla")
	public void user_navigated_to_login_page_of_bugizilla() {
	   tc.dc.getHomepage().enterABug();
	}
	
	@Then("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
	    //tc.driver.findElement(By.id("Bugzilla_login")).sendKeys("chandra_nemani@hotmail.com");
	    //tc.driver.findElement(By.cssSelector("#Bugzilla_password")).sendKeys("Password1");
		
		
	    //loginpage.enterCreds("chandra_nemani@hotmail.com", "Password1");
		//or
	    tc.dc.getLoginPage().enterCreds("chandra_nemani@hotmail.com", "Password1");
   
	}
	
	@Then("clicks on login")
	public void clicks_on_login() {
		//tc.driver.findElement(By.id("log_in")).click();
		
		//loginpage._frmLoginPage();
		//or
		tc.dc.getLoginPage()._frmLoginPage();
	}

}
