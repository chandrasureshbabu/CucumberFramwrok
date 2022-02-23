package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Managers.PageObjectManager;

public class TestController {

	
	public WebDriver driver;
	
	public PageObjectManager dc;
	
	public TestBase testBase;
	
	public GenericUtils genericUtils;
	
	public TestController() throws IOException
	{		
		//dc= new PageObjectManager(driver);
		
		testBase = new TestBase();
		dc= new PageObjectManager(testBase.webDriverManager());
		genericUtils= new GenericUtils(testBase.webDriverManager());
	}
}
