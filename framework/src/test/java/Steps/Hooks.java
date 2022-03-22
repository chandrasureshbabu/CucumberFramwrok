package Steps;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Utils.TestController;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {
	
	public TestController tc;
	
	
	public Hooks(TestController tc)
	{
		this.tc=tc;
	}
	
	@After
	public void AfterScenario() throws IOException, InterruptedException
	{
		Thread.sleep(3000);
		tc.testBase.webDriverManager().quit();
	}
	
	@AfterStep
	public void AfterStep(Scenario scenario) throws IOException
	{
		WebDriver driver =tc.testBase.webDriverManager();
		if(scenario.isFailed())
		{
			File sourcepath=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] filecontent= FileUtils.readFileToByteArray(sourcepath);
			scenario.attach(filecontent, "image/png", "image");
		}
			
		
	}

}
