package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	WebDriver driver;
	public Properties prop = new Properties();
	public WebDriver InitializeBrowser() throws IOException {

		
		FileInputStream fis = new FileInputStream("C:\\Users\\pakanji\\TestAutomation\\src\\main\\java\\resources\\gv.prop");
		prop.load(fis);

		String browsername = prop.getProperty("browser");

		if (browsername.equals("firefox")) {

			System.setProperty("webdriver.gecko.driver", "C:\\Users\\pakanji\\Downloads\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		else if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\pakanji\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

		return driver;
	}

}
