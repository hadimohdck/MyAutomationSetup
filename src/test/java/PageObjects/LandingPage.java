package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	public WebDriver driver;
	By search=By.xpath("//input[@type='search']");
	By product=By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/h4");
	By plusIcon=By.cssSelector("a.increment");
	By addtoCartButton=By.cssSelector(".product-action button");
	
	public LandingPage(WebDriver driver) {	
		this.driver=driver;
		
	}
	public void incrementquantity(int quantity) {
		for(int i =1;i<quantity;i++)
		{driver.findElement(plusIcon).click();}	
	}
	public void addtocart() {
		driver.findElement(addtoCartButton).click();
	}
	
	public void searchproduct(String name) {
		driver.findElement(search).sendKeys(name);
		}
	public String getproductname() {
		return driver.findElement(product).getText().split("-")[0].trim();
		 }
	public String gettitleofPage() {
		return driver.getTitle();
		
	}
	

}
