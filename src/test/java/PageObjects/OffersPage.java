package PageObjects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utils.TestContextSetup;

public class OffersPage {
	public By topdeals=By.linkText("Top Deals");
	public By search=By.xpath("//input[@type='search']");
	public WebDriver driver;
	public By offerpageProductname=By.cssSelector("tr td:nth-child(1)");
	public TestContextSetup testcontextsetup;
	
	public OffersPage(WebDriver driver) {
		this.driver=driver;
	}
	public void SwitchtoOfferPage() {
		driver.findElement(topdeals).click();
		
	}
	public void searchproduct(String name) {
		driver.findElement(search).sendKeys(name);
		}
	public String getproductname() {
		return driver.findElement(offerpageProductname).getText();
		 }
}
