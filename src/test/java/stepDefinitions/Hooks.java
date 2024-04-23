package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestContextSetup;

public class Hooks {

	TestContextSetup testcontextsetup;
	
	public Hooks(TestContextSetup testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
	}
	
	@After
	public void afterScenario() throws IOException, InterruptedException {
		Thread.sleep(2000);
		testcontextsetup.testbase.WebdriverManager().quit();
	}
	@AfterStep
	public void FailedScreenshotto_Report(Scenario scenario) throws IOException, InterruptedException {
		WebDriver driver=testcontextsetup.testbase.WebdriverManager();
		File fileimage = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		byte[] byteImage = FileUtils.readFileToByteArray(fileimage);
		scenario.attach(byteImage,"image/png","image");
		
//		if(scenario.isFailed()) {
//			File fileimage = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//			byte[] byteImage = FileUtils.readFileToByteArray(fileimage);
//			scenario.attach(byteImage,"image/png","image");
//		}
	}
}
