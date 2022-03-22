package Pageobjects;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class EnterBugPage {
	
	public WebDriver driver;
	
	
	public EnterBugPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private  By Logout= By.xpath("//*[@id='header']//descendant::ul[1]/li[11]/a");
	
	private By Severity=By.xpath("//select[@id='bug_severity']");
	
	private By HardWare= By.id("rep_platform");
	
	private By OS= By.id("op_sys");
	
	private By Summary=By.name("short_desc");
	
	private By Description=By.name("comment");
	
	private By submit=By.id("commit");
	
	private By pageTitle=By.xpath("//*[@id='title']");
	
	public Wait waitforElement(By locator)
	{
		Wait<WebDriver> wait= new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(1))
				.ignoring(NoSuchElementException.class, ElementNotVisibleException.class);
		wait.until(ExpectedConditions.elementToBeSelected(locator));
		
		return wait;
	}
	
	public String getBugpageTtitle()
	{
		String Title=driver.findElement(pageTitle).getText();
		
		return Title;
	}
	
	public HomePage logout()
	{
		driver.findElement(Logout).click();
		
		return new HomePage(driver);
	}
	
	public  boolean Logoutlinkdisplayed()
	{
		if(driver.findElement(Logout).isDisplayed())
		{
			return true;
		}
		return false;
	}
	
	
	public void selectSeverity(String severity)
	{
		WebElement Bugseverity=driver.findElement(Severity);
		Select select= new Select(Bugseverity);
		
		List<WebElement> severityOptions=select.getOptions();
		
		for(WebElement severityOption : severityOptions )
		{
			if(severityOption.getText().equals(severity))
			{
				select.selectByVisibleText(severity);
			}
		}
	}
	
	
	
	public void selectHardWare(String hardware)
	{
		WebElement hrdware= driver.findElement(HardWare);
		
		Select select= new Select(hrdware);
		
		List<WebElement> hardwareoptions=select.getOptions();
		
		
		for(WebElement hrdwareOption:hardwareoptions)
		{
			if(hrdwareOption.getText().equals(hardware))
			{
				select.selectByVisibleText(hardware);
			}
		}
		
	}
	

	
	public void SelectOS(String os)
	{
		WebElement OperatingSys= driver.findElement(OS);
		Select select= new Select(OperatingSys);
		List<WebElement> OpSyss=select.getOptions();
		
		for(WebElement OpSys:OpSyss)
		{
			if(OpSys.getText().equals(os))
			{
				select.selectByVisibleText(os);
			}
		}
	}
	
	
	public void  enterBugSummary(String IssueSummary)
	{
		driver.findElement(Summary).sendKeys(IssueSummary);
	}
	
	public void enterBugDescription(String IssueDescription)
	{
		driver.findElement(Description).sendKeys(IssueDescription);
	}
	
	public void ClickSubmit() throws InterruptedException
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,900)");
		driver.findElement(submit).click();
	}
}
