package Pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class main_Page_Add {

	public WebDriver driver;

	@FindBy(xpath = "//a[@class='o-dJmcbh o-eemiLE']")
	private WebElement mainPageCarwale;

	@FindBy(xpath = "//div[@class='banner-content-wrapper js-impression-tracking-banner']")
	private WebElement jeepAddBanner;

	public main_Page_Add(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void bannerTests() throws InterruptedException {

		 

		jeepAddBanner.click();
		Thread.sleep(3000);

		String currenturl = driver.getCurrentUrl();

		System.out.println(currenturl + " this is add url ");

		ArrayList<String> nextpageURL = new ArrayList<String>(driver.getWindowHandles());

		System.out.println(nextpageURL);
		
		driver.switchTo().window(nextpageURL.get(0));

	}

}
