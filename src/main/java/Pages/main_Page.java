package Pages;

 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class main_Page {

	public WebDriver driver;
	Actions a;

	@FindBy(xpath = "//a[@class='o-dJmcbh o-eemiLE']")
	private WebElement mainPageCarwale;

	@FindBy(xpath = "//div[@class='o-fzptZU o-cONQOm']")
	private WebElement LogintoCarwale;

	@FindBy(xpath = "//div[@class='o-bfyaNx o-cYOpxG o-cgpzMr o-pGqQl o-wBtSi o-bwUciP o-btTZkL o-dgodZk o-ftiAQl o-crgVKG']/..//span[@class='o-frwuxB o-brXWGL o-cjsCNH o-dAFptd o-cDoIpQ o-cpnuEd o-dsiSgT o-NBTwp o-fuiuOo o-eoatGj dbDC7A o-eNbQSA o-brXWGL o-fzoTtm o-fmSMPH  o-fznJFh b8X1Np']")
	private WebElement closepopup;

	@FindBy(xpath = "//li[@class=' nS6XVS']//div[@class='o-frwuxB o-eqqVmt o-BEqzB o-eMOUEg o-OAYdd o-bdcqQE o-fznJzu o-fznJPk o-zMnZc dvEJRN']")
	private WebElement newcars;

	@FindBy(xpath = "//div[text()='USED CARS']")
	private WebElement usedcars;

	@FindBy(xpath = "//div[text()='REVIEWS & NEWS']")
	private WebElement reviews_news;

	@FindBy(xpath = "//div[@class='o-fzoker o-dlrcWp o-fDnrXc o-frwuxB o-bmFSid qDQpiv']")
	private WebElement searchbar;

	@FindBy(xpath = "//div[@class='o-fznJzu o-fznJPk o-OAYdd o-dbKqqe o-cpnuEd o-bUVylL o-eMXLyl o-GFmfi']/..//span[contains(text(),' Suzuki Cars')]")
	private WebElement allcars_;

	@FindBy(xpath = "//div[@title='Location']")
	private WebElement location;

	@FindBy(xpath = "//div[@class=' o-cpnuEd o-eoatGj o-bfyaNx o-eemiLE o-cXBIhK o-dsALUH    o-bXKmQE o-ezujfR oEBYyU']//span[@aria-label='Close Popup']")
	private WebElement closeLocationPopup;

	@FindBy(xpath = "//div[@class='o-cKuOoN B6Jxqq']")
	private WebElement language;

	public main_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void LogintoCarwale() {
		LogintoCarwale.click();
	}

	public void Closepopup() {
		closepopup.click();
	}

	public void Howeron() throws InterruptedException {

		a = new Actions(driver);

		a.moveToElement(newcars).build().perform();

		Thread.sleep(3000);

		a.moveToElement(usedcars).build().perform();

		Thread.sleep(3000);

		a.moveToElement(reviews_news).build().perform();

	}

	public void headerLeftOptionsTest() throws InterruptedException {
		
		searchbar.click();

		Thread.sleep(3000);

		System.out.println("Search bar click success");

		a.moveToElement(searchbar);

		a.moveToElement(searchbar).sendKeys("Maruti Cars").build().perform();

	    allcars_.click();
		 
	    System.out.println("Search Bar Validation Done");
		
		mainPageCarwale.click();
		
		location.click();
		
		System.out.println("Location Pop up chacked");
		
		closeLocationPopup.click();
		
		mainPageCarwale.click();
		
		language.click();
		
		System.out.println("language img cheacked");
		
		mainPageCarwale.click();

	}

}
