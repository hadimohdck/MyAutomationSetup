package StepDefenitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Utils.TestContextSetup;
import PageObjects.CheckoutPage;
import PageObjects.LandingPage;
public class CheckOutPageStepDefenition {
	
	public WebDriver driver;
	public String productname;
	public TestContextSetup ts;
	public CheckoutPage checkoutpage;
	
	public CheckOutPageStepDefenition(TestContextSetup ts)
	{
		
		this.ts=ts;
		this.checkoutpage=ts.pom.getCheckoutPage();
		
	}
	@Then("Verify User has ability to enter promo code and place order")
	public void Verify_User_has_ability_to_enter_promo_code_and_place_order() {
		
		Assert.assertTrue(checkoutpage.ValidatePCButton());
		Assert.assertTrue(checkoutpage.ValidatePlaceOrderButton());
		
	}
	@Then("^User proceeds to Checkout and validate (.+) in checkouts page$")
	public void User_proceeds_to_Checkout_and_validate_Name_in_checkouts_page(String name) throws InterruptedException {
		
		this.checkoutpage.CheckoutItems();
		Thread.sleep(5000);
		Assert.assertEquals(name,this.checkoutpage.getproductname());
				
	}

	

}
