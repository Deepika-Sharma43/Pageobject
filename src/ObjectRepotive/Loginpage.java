package ObjectRepotive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	
	// CREATE WEBDRIVER REFERENCE VARIABLE
	
	WebDriver driver;
	
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		
	}

	 By Username = By.name("user-name");
	 By Password = By.name("password");
	 By Login = By.name("login-button");
	 
	 
	 //create a method to perform operation o each web element
	 
	 public void setUsername(String strusername)
	 {
		 driver.findElement(Username).sendKeys(strusername);
		 
	 }
	 
	 public void setpassword(String strpassword)
	 {
		 driver.findElement(Password).sendKeys(strpassword);
	 }
	 
	 public void loginClick() throws InterruptedException
	 {
		 driver.findElement(Login).click();
		 Thread.sleep(2000);
		 
		 
	 }
	 
	 public void loginData(String strusername,String strpassword) throws InterruptedException
	 {
		 // this.TitleText();
		 
		 this.setUsername(strusername);
		 this.setpassword(strpassword);
		 this.loginClick();
	 }
	 

}
