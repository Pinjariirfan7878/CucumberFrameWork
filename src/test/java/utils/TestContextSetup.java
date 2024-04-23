package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestContextSetup {
	
	public WebDriver driver;
	public String homepageextractedProductName;
	public PageObjectManager pageobjectmanager;
	public TestBase testbase;
	public GenericUtils generic_utils;
	
	
	public TestContextSetup() throws IOException {
		testbase=new TestBase();
		pageobjectmanager=new PageObjectManager(testbase.WebdriverManager());
		generic_utils=new GenericUtils(testbase.WebdriverManager());
	}

}
