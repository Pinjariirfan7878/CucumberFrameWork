package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import utils.TestContextSetup;

public class HomePageStepDefinition {
	
	public String homepageextractedProductName;
	TestContextSetup testcontestsetup;
	HomePage homepage;
	
	public HomePageStepDefinition(TestContextSetup testcontestsetup) {
		this.testcontestsetup=testcontestsetup;
		this.homepage = testcontestsetup.pageobjectmanager.getHomepage();
	}
	
	@Given("User is on GreenCart Landing Page")
	public void user_is_on_green_cart_landing_page() {
		Assert.assertTrue(homepage.getHomePagetittle().contains("GreenKart"));
	}
	@When("User search with Shortname (.+) and extracted actual name of product$")
	public void user_search_with_shortname_and_extracted_actual_name_of_product(String shortname) throws Throwable {
		homepage.searchIteam(shortname);
		Thread.sleep(2000);
		testcontestsetup.homepageextractedProductName =homepage.getProductName().split("-")[0].trim();
		System.out.println(testcontestsetup.homepageextractedProductName+" is extracted Product name on Home page");
	}
	@When("Added {string} items of the selected to the cart")
	public void added_items_of_the_selected_to_the_cart(String string) {
		homepage.addQty(3);
		homepage.addToCart();
	}
}
 