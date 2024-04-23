package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.OfferPage;
import utils.TestContextSetup;

public class OfferPageStepDefinition {
	
	public String offerpageextractedProductName;
	TestContextSetup testcontestsetup;
	
	public OfferPageStepDefinition(TestContextSetup testcontestsetup) {
		this.testcontestsetup=testcontestsetup;
	}
	
	@Then("^User search for (.+) shortname in offer page$")
	public void user_search_for_shortname_in_offer_page_to_check_if_product_exist(String product) throws Throwable {
		switchToOfferPage();
		OfferPage offerpage = testcontestsetup.pageobjectmanager.getOfferPage();
		offerpage.searchIteam(product);
		Thread.sleep(2000);
		offerpageextractedProductName = offerpage.getProductName();
		System.out.println(offerpageextractedProductName+" is extracted Product name on Offer page");
	}
	@Then("validate both extract product name is same of offer page and home page")
	public void validate_both_extract_product_name_is_same_of_offer_page_and_home_page() {
	   Assert.assertEquals(testcontestsetup.homepageextractedProductName,offerpageextractedProductName);
	}
	
	public void switchToOfferPage() {
		testcontestsetup.generic_utils.SwitchToChildWindow();
	}

}
