package pageObjetc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class registrationPage {
	WebDriver driver;

	By register = By.xpath("//span[contains(text(),'Register')]");
	By forename = By.xpath("//input[@id='forename']");
	By surname = By.xpath("//input[@id='surname']");
	By username = By.xpath("//input[@id='username']");
	By password = By.xpath("//input[@id='password']");
	By confirmpassword = By.xpath("//input[@id='confirmPassword']");
	By arrow = By.xpath("//div[@class='iti-arrow']");
	By flag = By.xpath("//span[contains(text(),'United Kingdom')]");
	By number = By.xpath("//input[@placeholder='07400 123456']");
	By dropdown = By.xpath("//div[11]//div[1]//div[2]//select[1]");
	By street = By.xpath("//input[@id='street']");
	By email = By.xpath("//input[@id='email']");
	By submit = By.xpath("//button[@type ='submit']");

	public registrationPage(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement getRegisterButton() {
		return driver.findElement(register);
	}

	public WebElement getForename() {
		return driver.findElement(forename);
	}

	public WebElement getSurname() {
		return driver.findElement(surname);
	}

	public WebElement getUsername() {
		return driver.findElement(username);
	}
	
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	
	public WebElement getConfirmPassword() {
		return driver.findElement(confirmpassword);
	}
	
	public WebElement getArrow() {
		return driver.findElement(arrow);
	}
	
	public WebElement getFlag() {
		return driver.findElement(flag);
	}
		
	public WebElement getNumber() {
			return driver.findElement(number);
	}

	public WebElement getDropdown() {
		return driver.findElement(dropdown);
	}
	
	public WebElement getStreet() {
		return driver.findElement(street);
	}
	
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	
	public WebElement getSubmit() {
		return driver.findElement(submit);
	}

}
