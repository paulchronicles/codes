package QA;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjetc.loginPage;
import resources.BaseTest;

public class loginTest extends BaseTest {

	public WebDriver driver;

	@Test(dataProvider = "getData")
	public void StartTest(String username, String password) throws IOException {

		driver = InitializeBrowser();
		driver.get(prop.getProperty("url"));

		loginPage lp = new loginPage(driver);
		lp.getLoginButton().click();
		lp.getUsername().sendKeys(username);
		lp.getPassword().sendKeys(password);
		lp.getLogin().click();
	}

	@DataProvider
	public Object[][] getData() {

		Object[][] data = new Object[2][2];
		data[0][0] = "regressio";
		data[0][1] = "Amelco123";
		data[1][0] = "regression";
		data[1][1] = "Amelco123";

		return data;

	}

}
