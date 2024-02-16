package ObjectRepotive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


 

public class LogoutPage {
	// CREATE WEBDRIVER REFERENCE VARIABLE
	
		WebDriver driver;
		public LogoutPage(WebDriver driver)
		{
			this.driver=driver;
			
		}
		
		By MenuButton =By.id("react-burger-menu-btn");
		//By Logout = By.xpath("//a[@id='logout_sidebar_link']");
		By Logout = By.id("logout_sidebar_link");
		//By Logout =By.xpath("//*[@id=\"logout_sidebar_link\"]");
		//By Logout = By.cssSelector("#logout_sidebar_link");
		
		
		
	
	public void MenuBtn() throws InterruptedException
	{
		Thread.sleep(2000);
	
		driver.findElement(MenuButton).click();
	}
	
	public void LogOt() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(Logout).click();
	}
	
	public void LogoutData() throws InterruptedException
	{
		this.MenuBtn();
		this.LogOt();
	}

}
