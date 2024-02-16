package Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ObjectRepotive.Loginpage;
import ObjectRepotive.LogoutPage;
import ObjectRepotive.ProductPage;

public class TestBaseClass {
	
	//DECLARE WEBDRIVER REFERENCE VARIABLE AND MAKE IT STATIC.
	
	public static WebDriver driver=null;
	
	//DECLARE @BEFORETEST ANNOTATION THAT WILL EXECUTE METHOD BEFORE RUNNING EACH UNIT TEST
	
	@BeforeTest
	public void basicSetUp()
	{
		System.setProperty("WebDriver.chrome.driver","\"E:\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
	     driver=new ChromeDriver();
	     
	     // TO MAXIMIZE BROWSER
	     
	     driver.manage().window().maximize();
	     
	     //OPEN HMS PAGE
	     
	     driver.get("https://www.saucedemo.com/");
	     
	     driver.manage().deleteAllCookies();
	     
	   }
	
	@Test(priority = 1)
	public void login() throws InterruptedException
	{
		//CREATE AN OBJECT OF SIMLOGINPAGE CLASS AND PASS WEBDRIVER REFERENCE TO ITS CONSTRUCTOR.
		
		Loginpage abc =new Loginpage(driver);
		
		//CALL LOGINDATA() METHOD USING REFERENCE VARIABLE USERNAME & PASSWORD AS AN INPUT
		
		abc.loginData("standard_user", "secret_sauce");
		Thread.sleep(2000);
	}
	
	@AfterTest
	public void Logout() throws InterruptedException
	
	{
		Thread.sleep(2000);
		LogoutPage xyz = new LogoutPage(driver);
		
		xyz.LogoutData();
		
	}
	
	@Test(priority = 2)
	public void Product() throws InterruptedException
	{
		Thread.sleep(1000);
		ProductPage prp =new ProductPage(driver);
		prp.ProductData();
	}

}
