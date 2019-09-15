package QA;

import java.io.IOException;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import org.openqa.selenium.WebDriver;


import resources.BaseTest;

public class GenerateLog extends BaseTest {
	public WebDriver driver;
	Logger log = Logger.getLogger(GenerateLog.class);
	
	@Test
	public void Test() throws IOException {
		
		driver = InitializeBrowser();
		driver.get(prop.getProperty("url"));
		
		log.info("Winner");
	
		
	}

}
