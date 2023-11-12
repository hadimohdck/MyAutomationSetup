package StepDefenitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;

import PageObjects.OffersPage;
import Utils.TestContextSetup;
import io.cucumber.java.en.Then;

public class OfferPageStepDefinition {
	public String offerpageProductname;
	TestContextSetup ts;
	
	public OfferPageStepDefinition(TestContextSetup ts) {
		
		this.ts=ts;
		
	}
	
	@Then("^User searched for same shortname (.+) in offers page to check if the same product exists$")
	public void user_searched_for_same_shortname_in_offers_page_to_check_if_the_same_product_exists(String shortName) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    OffersPage op=ts.pom.getOffersPage();
		op.SwitchtoOfferPage();
		ts.genericutils.SwitchWindowToChild();
	    op.searchproduct(shortName);
	    Thread.sleep(2000);
	    offerpageProductname = op.getproductname();
	    Assert.assertEquals(ts.productname, offerpageProductname);
	
	}

}
