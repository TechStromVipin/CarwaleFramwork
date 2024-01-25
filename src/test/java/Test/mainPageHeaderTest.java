package Test;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BrowserRunner.RunBrowser;
import Pages.main_Page;

public class mainPageHeaderTest extends RunBrowser {

	
	public static main_Page t;
	
	
	
	
	
	
	@BeforeMethod(description = "verification of launch page and title")
	public void verification_of_launch_page_and_title() {
		driver.get("https://www.carwale.com");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		String actualtitle = driver.getTitle();

		String expectedtitle = "New Cars, Used Cars, Buy a Car, Sell Your Car - CarWale";

		System.out.println(actualtitle + " Title validation done ");

		assertEquals(actualtitle, expectedtitle);

	}

	@Test(priority = 1, description = "Verify Login and close popup",groups = {"smoke"})
	public void verify_Login() {

		t = new main_Page(driver);
		t.LogintoCarwale();
		System.out.println("Login Tested");

		t.Closepopup();
		System.out.println("popup closed");

	}

	@Test(priority = 2, description = "Hower on and Test Newcars,Usedcars and Reviews and News shoing required options",groups = {"smoke"})
	public void testHeaders() throws InterruptedException {
		t.Howeron();
		System.out.println("['New cars' , 'Used cars' & 'REVIEWS & NEWS' Hower verification done]");
	}

	@Test(priority = 3, description = "Test searchbar ,language changing option and Location option in headders",groups = {"smoke","sanity"})
	public void testrightHeader() throws InterruptedException {

		t.headerLeftOptionsTest();

	}

	@AfterMethod(description = "verification done")
	public void Verificariondone() {
		System.out.println("mainPage Header Testing done...");
	}

}
