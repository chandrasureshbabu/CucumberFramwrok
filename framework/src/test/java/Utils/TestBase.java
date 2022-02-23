package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public WebDriver driver;
	
	public WebDriver webDriverManager() throws IOException
	{
		
		File f= new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Global.properties");
		FileInputStream fis= new FileInputStream(f);
		Properties prop= new Properties();
		prop.load(fis);
		
		String url_properties=prop.getProperty("Url");
		String url_maven=System.getProperty("url");
		String browser_properties=prop.getProperty("browser");
		String browser_maven=System.getProperty("browser");
		
		
		//result =testcondition!?value1:value2;
		
		String url=url_maven!=null?url_maven:url_properties;
		String browser=browser_maven!=null?browser_maven:browser_properties;
			
		if(driver==null)
		{
			if(browser.equalsIgnoreCase("chrome"))
			
				{		
					System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\src\\test\\resources\\chromedriver.exe");
					driver= new ChromeDriver();
					
				}
			if(browser.equalsIgnoreCase("firefox"))
				{
				System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+ "\\src\\test\\resources\\geckodriver.exe");
				driver= new FirefoxDriver();
				}
			
			if(browser.equalsIgnoreCase("edge"))
				{
				System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+ "\\src\\test\\resources\\Edge.exe");
				driver= new FirefoxDriver();
				}
			driver.get(url);
			}
		
		return driver;
	}	
}

