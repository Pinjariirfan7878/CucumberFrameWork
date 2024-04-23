package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
 
	public WebDriver driver;
	
	public WebDriver WebdriverManager() throws IOException {
		
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
		Properties pro=new Properties();
		pro.load(fis);
		String url=pro.getProperty("URL");
		String browser=pro.getProperty("browser");
		if(driver==null) {
			if(browser.equalsIgnoreCase("chrome"))
				driver =new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firfox")) {
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
		return driver;
	}
}
