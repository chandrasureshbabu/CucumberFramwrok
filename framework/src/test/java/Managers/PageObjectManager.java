package Managers;

import org.openqa.selenium.WebDriver;

import Pageobjects.EnterBugPage;
import Pageobjects.HomePage;
import Pageobjects.InvalidUsernameOrPasswordPage;
import Pageobjects.LoginPage;
import Pageobjects.WelcomeToBugZillaPage;

public class PageObjectManager {
	
	public WebDriver driver;
	
	public HomePage homePage;
	
	public LoginPage loginPage;
	
	public EnterBugPage enterBugPage;
	
	public WelcomeToBugZillaPage welcomeToBugzillaPage;
	
	public InvalidUsernameOrPasswordPage invalidUsernameOrPasswordPage;

	
	






	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	
	

	public HomePage getHomepage() {
		
		homePage= new HomePage(driver);
		return homePage;
	}

	

	
	  public LoginPage getLoginPage() {
	  
	  loginPage = new LoginPage(driver);
	  
	  return loginPage; }
	 

	public EnterBugPage getEnterBugPage() {
		
	    enterBugPage= new EnterBugPage(driver);
		return enterBugPage;
	}
	
	public WelcomeToBugZillaPage GetWelcomeToBugZillaPage()
	{
		welcomeToBugzillaPage= new WelcomeToBugZillaPage(driver);
		
		return welcomeToBugzillaPage;
	}
	
	public InvalidUsernameOrPasswordPage getInvalidUsernameOrPasswordPage() {
		
		invalidUsernameOrPasswordPage = new InvalidUsernameOrPasswordPage(driver);
		
		return invalidUsernameOrPasswordPage;
	}



	
	
	
	

}
