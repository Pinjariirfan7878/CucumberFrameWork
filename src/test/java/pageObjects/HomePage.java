package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	//By top_deal_text=By.xpath("//a[text()='Top Deals']");
	
	By search = By.xpath("//input[@type=\"search\"]");
	By ProductName=By.xpath("//h4[@class=\"product-name\"]");
	By plusButton=By.xpath("//a[text()='+']");
	By addToCart=By.xpath("//button[text()='ADD TO CART']");
	
	public void searchIteam(String name) {
		driver.findElement(search).sendKeys(name);
	}
	
	public void getsearchtext() {
		driver.findElement(search).getText();
	}
	  
	public String getProductName() {
		return driver.findElement(ProductName).getText();
	}
	
	public String getHomePagetittle() {
		return driver.getTitle();
	}
	
	public void addQty(int a) {
		for(int i=1;i<=a;i++) {
		driver.findElement(plusButton).click();
		}
	}
	public void addToCart() {
		driver.findElement(addToCart).click();
	}
	
}
