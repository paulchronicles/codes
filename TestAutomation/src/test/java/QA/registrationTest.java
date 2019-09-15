package QA;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjetc.registrationPage;
import resources.BaseTest;

public class registrationTest extends BaseTest {
	
	public WebDriver driver;
	
	@Test
	public void registration() throws IOException {
	
		driver = InitializeBrowser();
		driver.get(prop.getProperty("url"));
		
		
		registrationPage rp = new registrationPage(driver);
		rp.getRegisterButton().click();
		rp.getForename().sendKeys("starboy");
		rp.getSurname().sendKeys("Elysian");
		rp.getUsername().sendKeys("stardom581");
		rp.getPassword().sendKeys("Amelco123");
		
		rp.getConfirmPassword().sendKeys("Amelco123");
		Select select = new Select(rp.getDropdown());
		
		
	

		driver.manage().window().maximize();
		
		rp.getStreet().sendKeys("London");
		rp.getEmail().sendKeys("starman581@yopmail.com");
		rp.getArrow().click();
		rp.getFlag().click();
		rp.getNumber().sendKeys("07452673491");
		
		select.selectByVisibleText("United Kingdom");
		rp.getSubmit().click();
	//	Assert.assertEquals(actual, expected);
	
	  
	}
}
