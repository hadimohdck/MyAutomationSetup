package PageObjects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utils.TestContextSetup;

public class CheckoutPage {

	public WebDriver driver;
	public By checkoutpageImage=By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/a[4]/img");
	public By checkoutbutton=By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[2]/button");
	public By accecptPCButton=By.xpath("//*[@id=\"root\"]/div/div/div/div/div/button");
	public By PlaceOrderButton=By.xpath("//*[@id=\"root\"]/div/div/div/div/button");
	public By CheckedOutProductName=By.xpath("//*[@id=\"productCartTables\"]/tbody/tr/td[2]/p");
	
	public CheckoutPage(WebDriver driver) {
		this.driver=driver;
	}
	public void CheckoutItems() throws InterruptedException {
		driver.findElement(checkoutpageImage).click();
		driver.findElement(checkoutbutton).click();
		System.out.println("Checkout button is clicked");
	}
	public boolean ValidatePCButton() {
		return driver.findElement(accecptPCButton).isDisplayed();
		
	}
	public boolean ValidatePlaceOrderButton() {
		return driver.findElement(PlaceOrderButton).isDisplayed();
		
	}
	public String getproductname() {
		return driver.findElement(CheckedOutProductName).getText().split("-")[0].trim();
		
	
	} 
}
