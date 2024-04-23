package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CheckoutPage {
	public WebDriver driver;

	public CheckoutPage(WebDriver driver) {
		this.driver=driver;
	}

	By cartBag = By.xpath("//a[@class=\"cart-icon\"]//img");
	By checkoutButton=By.xpath("//button[text()='PROCEED TO CHECKOUT']");
	By promoCode = By.xpath("//button[text()='Apply']");
	By PlaceOrderButton=By.xpath("//button[text()='Place Order']");
	By addedProduct=By.xpath("(//tr[1])[2]//td[2]//p");

	public void checkoutItem() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(cartBag).click();
		driver.findElement(checkoutButton).click();
	}
	public void validateAddedProductOnCheckOutPage(String AddedProduct) {
		String added =driver.findElement(addedProduct).getText().split("-")[0].trim();
		Assert.assertTrue(added.contains(AddedProduct));
	}

	public boolean verifyPromoCode() {
		return driver.findElement(promoCode).isDisplayed();
	}

	public boolean verifyPlaceOrderButton() {
		return driver.findElement(PlaceOrderButton).isDisplayed();
	}

}
