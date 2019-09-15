package QA;

import java.io.IOException;
import java.util.logging.LogManager;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import pageObjetc.forgotPssword;
import resources.Base;

public class forgotpassword extends Base {
 Logger log = Logger.getLogger(forgotPssword.class);
 
	public WebDriver driver;
	  
	@Test
	public void TrialTest() throws IOException  {
		
		driver = Initialize();
		driver.get(pr.getProperty("url"));
		driver.manage().window().maximize();
		
		log.info("Successfully logged In!");
	
	
		forgotPssword fp = new forgotPssword(driver);
		fp.getButton().click();
		fp.getLink().click();
		fp.getEmail().sendKeys("otpman@yopmail.com");
		fp.getSubmit().click();
		
		
		
		
		
	}

}
