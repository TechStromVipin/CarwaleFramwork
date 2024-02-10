package BrowserRunner;

 
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

 

public class RunBrowser extends LaunchBrowser {

 
    @Parameters ("browser")
	@BeforeClass(alwaysRun = true)
	 
	public void OpenBrowser(String browser)
	{
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			
			LaunchBrowser.LaunchChrome();
			driver.get("https://www.carwale.com");
			
		}
		
		else if(browser.equals("edge"))
			
		{
			 LaunchBrowser.Launchedge();
			 driver.get("https://www.carwale.com");
		}
	
	}
    
    
    @AfterClass(alwaysRun = true)
	@Parameters ("browser")
	public void CloseBrowser(String browser) throws InterruptedException
	{
		
		 
		
		
		
		if(browser.equals("chrome"))
		{
          
		   
	 	 // driver.close();
	 	  driver.quit();

		}

		else if(browser.equals("edge"))

		{
			 //driver.close();
			 driver.quit();

		}
	}
		
	 
		
	
 
	}
	
	
	
 
