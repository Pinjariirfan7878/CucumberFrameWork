package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.CheckoutPage;
import utils.TestContextSetup;

public class CheckoutPageStepDefinition {
	
	TestContextSetup testcontestsetup;
	CheckoutPage checkoutpage;
	
	public CheckoutPageStepDefinition(TestContextSetup testcontestsetup) {
		this.testcontestsetup=testcontestsetup;
		this.checkoutpage=testcontestsetup.pageobjectmanager.getcheckoutpage();
	}
	
	@Then("^user proceeds to the checkout and validate the (.+) item in checkout page$")
	public void user_proceeds_to_the_checkout_and_validate_the_tom_item_in_checkout_page(String name) throws InterruptedException {
		checkoutpage.checkoutItem();
		Thread.sleep(5000);
		checkoutpage.validateAddedProductOnCheckOutPage(name);
		Assert.assertTrue(checkoutpage.verifyPromoCode());
		Assert.assertTrue(checkoutpage.verifyPlaceOrderButton());
		}
	@Then("verify user has ability to enter promo code and place the order")
	public void verify_user_has_promo_code_and_place_order() {
		//Assert.assertTrue(checkoutpage.verifyPromoCode());
		//Assert.assertTrue(checkoutpage.verifyPlaceOrderButton());
	}
}
 