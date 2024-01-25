package Test;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

 
import Pages.main_Page_Add;

public class verifyAddMainPage extends mainPageHeaderTest {

	
	@BeforeMethod
	public void verify_MainPage()
	{
		driver.get("https://www.carwale.com");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		String actualtitle = driver.getTitle();

		String expectedtitle = "New Cars, Used Cars, Buy a Car, Sell Your Car - CarWale";

		System.out.println(actualtitle + " Title validation done ");

		assertEquals(actualtitle, expectedtitle);

	}
	
	
	@Test(priority = 1,description = "Test Jeep Banner Add",groups = {"sanity"})
	public void click_to_test_jeep_Add() throws InterruptedException  
	{
		
		main_Page_Add t=new main_Page_Add(driver);
		t.bannerTests();
		
		 
		 
		
	}
	
	@AfterMethod
	public void add_verification_done()
	{
		
		System.out.println("add verification done");
		
		
	}
	
	
	
}
