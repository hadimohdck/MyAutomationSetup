package StepDefenitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Utils.TestContextSetup;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {
	
	TestContextSetup ts;
	
	public Hooks(TestContextSetup ts) {
		this.ts=ts;
		
	}
	@After
	public void AfterScenario() throws IOException {	
		ts.testbase.WebDriverManager().quit();
		
	}
	@AfterStep
	public void AddScreensot(Scenario scenario) throws IOException {
		WebDriver driver=ts.testbase.WebDriverManager();
		if(scenario.isFailed()) {
			File sourcepath=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] filecontents=FileUtils.readFileToByteArray(sourcepath);
			scenario.attach(filecontents, "image/png", "image");
		}
		
	}
}
