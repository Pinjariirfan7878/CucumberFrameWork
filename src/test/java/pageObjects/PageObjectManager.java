package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	public WebDriver driver;
	public HomePage homepage;
	public OfferPage offerpage;
	public CheckoutPage checkoutpage;
	
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	public HomePage getHomepage() {
		homepage=new HomePage(driver);
		return homepage;
	}
	public OfferPage getOfferPage() {
		offerpage=new OfferPage(driver);
		return offerpage;
	}
	
	public CheckoutPage getcheckoutpage() {
		checkoutpage=new CheckoutPage(driver);
		return checkoutpage;
	}
	
	
}
