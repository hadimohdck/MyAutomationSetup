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
import PageObjects.LandingPage;
public class LandingPageStepDefinition {
	
	public WebDriver driver;
	public String productname;
	public TestContextSetup ts;
	public LandingPage lp;
	
	public LandingPageStepDefinition(TestContextSetup ts)
	{
		
		this.ts=ts;
		this.lp=ts.pom.getLandingPage();
		
		
	}

	
	@Given("User is on GreenCart landing page")
	public void user_is_on_green_cart_landing_page() throws InterruptedException {
	    
	    Thread.sleep(5000);
	    Assert.assertTrue(lp.gettitleofPage().contains("GreenKart"));
//	    
	   
	}
	@When("^User searched with (.+) and extracted actual name of product$")
	public void user_searched_with_and_extracted_actual_name_of_product(String shortname) throws InterruptedException {
		
		this.lp.searchproduct(shortname);
		Thread.sleep(2000);
		ts.productname=this.lp.getproductname();
		Thread.sleep(2000);
	    System.out.println(ts.productname);}
	
	
	@When("added {string} items of the selected product to the cart")
	public void addeditems(String quantity) {
		this.lp.incrementquantity(Integer.parseInt(quantity));
		this.lp.addtocart();
		
		
		
	}
}
