package pageObjetc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

;

public class loginPage {

	WebDriver driver;

	By button = By.xpath("//span[contains(text(),'Login')]");
	By username = By.xpath("//input[@id='username']");
	By password = By.xpath("//input[@id='password']");
	By click = By.xpath("//button[@type='submit']");

	public loginPage(WebDriver driver) {
		this.driver = driver;

	}

	public WebElement getLoginButton() {
		return driver.findElement(button);
	}

	public WebElement getUsername() {
		return driver.findElement(username);
	}

	public WebElement getPassword() {
		return driver.findElement(password);
	}

	public WebElement getLogin() {
		return driver.findElement(click);
	}
}


