package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Base {
	
	public  Properties pr = new Properties();
    WebDriver driver;
   
    
	public WebDriver Initialize() throws IOException {
		
		
		FileInputStream fis = new FileInputStream("C:\\Users\\pakanji\\TestAutomation\\src\\main\\java\\resources\\gv.prop");
		pr.load(fis);
		
		if(pr.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\pakanji\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if (pr.getProperty("browser").equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\pakanji\\Downloads\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
			
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		return driver;
		}
	
	   public void getScr(String result) throws IOException {
	   File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	   
	   FileHandler.copy(scr, new File("CC:\\Users\\pakanji\\Downloads"+result+".png"));

		
		
	   }
	   
	
	
	}
	

