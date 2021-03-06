package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pageobjects.HomePage;
import Utils.TestController;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomepageSteps {
	
	
	//public WebDriver driver;
	TestController tc;
	
	public HomepageSteps(TestController tc)
	{
		this.tc=tc;
	}
	
	@Given("user is on Home page")
	public void user_is_on_home_page() {
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Drivers\\chromedriver.exe"); tc.driver= new ChromeDriver();
		 * tc.driver.get("http://localhost:5001/");
		 * tc.driver.manage().window().maximize();
		 */
		boolean  displayed=	tc.dc.getHomepage().enterAbugDisplayed();
		System.out.println("Is on Home page :"+displayed);
	}
	
	@When("user clicks on EnterBug link")
	public void user_clicks_on_enter_bug_link() {
	    //tc.driver.findElement(By.id("enter_bug")).click();
		
	    //HomePage homepage= new HomePage(tc.driver);
		
		 
		/*
		 * HomePage homePage=tc.pageObjectManager.getHomepage(tc.driver);
		 * homePage.enterABug(); or
		 */
		
		
		
	    tc.dc.getHomepage().enterABug();
	    
	}
	@Given("Open Bugzilla HomePage in the Browser")
	public void open_bugzilla_home_page_in_the_browser() {
		
	   if(tc.dc.getHomepage()._homePage_ForgotPasswordLinkIsDisplayed())
	   {
		   System.out.println("navigated to HomePage");
	   }
	}
	
	@When("Click on LoginLink on Homepage")
	public void click_on_login_link_on_homepage() throws InterruptedException {
		
			tc.dc.getHomepage()._homepage_ClickLoginToSignin();
			Thread.sleep(5000);
	}
	
	@When("username and Password fields appears on Homepage")
	public void username_and_password_fields_appears_on_homepage() {
	    if(tc.dc.getHomepage()._homepage_CredsFieldsDisplayed())
	    {
	    	System.out.println("Cred fields appear");
	    }else
	    {
	    	System.out.println("Cred fields  not appear");
	    }
	}
	
	 @And("^Enter username (.+) Password and (.+) click Login$")
	    public void enter_username_password_and_click_login(String username, String password) throws Throwable {
		 if(tc.dc.getHomepage()._homepage_CredsFieldsDisplayed())
		    {
			 Thread.sleep(10000);
		    	tc.dc.getHomepage()._homepage_Login(username, password);
		    }
	        
	    }
	 
	 @Then("Redirected to Homepage")
	 public void redirected_to_homepage() {
		 
		 if(tc.dc.getHomepage()._homePage_ForgotPasswordLinkIsDisplayed())
		   {
			   System.out.println("navigated to HomePage");
		   }
	     
	 }
	
	

}
