package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {

public WebDriver driver;
	
	public OfferPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By search = By.xpath("//input[@type=\"search\"]");
	By ProductName=By.xpath("//td[1]");
	
	public void searchIteam(String name) {
		driver.findElement(search).sendKeys(name);
	}
	
	public void getsearchtext() {
		driver.findElement(search).getText();
	}
	  
	public String getProductName() {
		return driver.findElement(ProductName).getText();
	}
	
	
}
