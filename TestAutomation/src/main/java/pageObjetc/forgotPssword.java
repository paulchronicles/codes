package pageObjetc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class forgotPssword {

	
	public WebDriver driver;
	
	By button = By.xpath("//span[contains(text(),'Login')]");
	By link = By.linkText("Forgot your Password?");
	By email = By.xpath("//input[@id='email']");
	By submit = By.xpath("//button[@type='submit']");
	
	
	public forgotPssword(WebDriver driver) {
		this.driver= driver;
	}

	public WebElement getButton() {
		return driver.findElement(button);
	}
	
	public WebElement getLink() {
		return driver.findElement(link);
	}
	
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	
	public WebElement getSubmit() {
		return driver.findElement(submit);
	}
	
	
	
}
