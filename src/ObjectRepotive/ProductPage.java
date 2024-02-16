package ObjectRepotive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
	
	WebDriver driver;
	public ProductPage(WebDriver driver)
	
	{
	   this.driver=driver;
	}
	
	//By AllItems =By.id("inventory_sidebar_link");
	//By AllItems = By.cssSelector("#inventory_sidebar_link");
	By selectPro = By.xpath("//*[@id=\"item_4_title_link\"]/div");
	
	By AddtoCart =By.id("add-to-cart-sauce-labs-backpack");
	
	By CartClick =By.xpath("//*[@id=\"shopping_cart_container\"]/a");
	
	By CheckOut= By.id("checkout");
	
	By FirstName =By.id("first-name");
	By LastName = By.id("last-name");
	By ZipCode = By.id("postal-code");
	By ContinueBtn = By.id("continue");
	By Finishbtn = By.id("finish");


/*public void allItem() {
	driver.findElement(AllItems).click();
}*/
	
	public void SelectProduct()
  {
	driver.findElement(selectPro).click();
}
	public void AddCart() throws InterruptedException
	
	  {
		  driver.findElement(AddtoCart).click();
		  Thread.sleep(200);
	  }
	
	public void CartBtn() throws InterruptedException
	{
		driver.findElement(CartClick).click();
		Thread.sleep(200);
	}
	
	public void checkout() throws InterruptedException
	{
		driver.findElement(CheckOut).click();
		Thread.sleep(200);
	}
	
	public void CheckOutInfo() throws InterruptedException
	{
		driver.findElement(FirstName).sendKeys("deep");
		driver.findElement(LastName).sendKeys("joshi");
		driver.findElement(ZipCode).sendKeys("1234567");
		driver.findElement(ContinueBtn).click();
		driver.findElement(Finishbtn).click();
		Thread.sleep(200);
	}
  
  public void ProductData() throws InterruptedException {
	  
	//  this.allItem();
	  this.SelectProduct();
	  this.AddCart();
	  this.CartBtn();
	  this.checkout();
	  this.CheckOutInfo();
	  
  }
  
}
