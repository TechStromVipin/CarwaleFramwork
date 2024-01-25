package BrowserRunner;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
 

public class LaunchBrowser {

	
	public static WebDriver driver;
	
	 
	public static WebDriver LaunchChrome()
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\SOFTWEAR\\eclipse\\eclipse-java-2023-06-R-win32-x86_64\\eclipse\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
		Map<String,Object> prefs =new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications",2);
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs",prefs);
		
		 driver= new ChromeDriver(options);
		
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 return driver;
	}
	
	public static WebDriver Launchedge()
	{
		System.setProperty("webdriver.edge.driver", "E:\\SOFTWEAR\\eclipse\\eclipse-java-2023-06-R-win32-x86_64\\eclipse\\edgedriver_win64\\msedgedriver.exe");
		
		
		Map<String,Object> prefs =new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications",2);
		EdgeOptions options=new EdgeOptions();
		options.setExperimentalOption("prefs",prefs);
		
		 driver= new EdgeDriver(options);
		
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 return driver;
		
	}
	
	
	
}
