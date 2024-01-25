package BrowserRunner;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
 
public class aftereachtestmethods extends LaunchBrowser {

	public static String screenshotsubname;
	
	
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("new test execution started");
	}
	
	
	
	
	@AfterTest 
	public void screenshot(String filename)
		{
			if(screenshotsubname==null)
			{	LocalDateTime date= LocalDateTime.now();
			    
			DateTimeFormatter dateformat=DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
				
			screenshotsubname=date.format(dateformat); 
			
			                 }
			TakesScreenshot t = (TakesScreenshot) driver;
	        
	        File source=  t.getScreenshotAs(OutputType.FILE) ;

	        File dest =new File("./screenshots/img.png"+screenshotsubname+filename); //in screenshot folder screenshotname snaps are saved
	        
	        try {
	       	 org.openqa.selenium.io.FileHandler.copy(source, dest);
	        }
	        catch(Exception e){
	       	 
	       	 e.printStackTrace();
			
			}
			
			
		}
}
