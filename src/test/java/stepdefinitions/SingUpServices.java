package stepdefinitions;

import org.openqa.selenium.WebDriver;
import pageobjects.SingUpPageObject;

public class SingUpServices {
	private WebDriver driver;
	private SingUpPageObject singUpPageObject;
	public SingUpServices(WebDriver driver) {
		this.driver = driver;
		singUpPageObject = new SingUpPageObject(driver);
	}
	public void go(String url) {
		this.driver.get(url);
	}
	public void writeFirstName(String firstName) {
		this.singUpPageObject.getFirstNameTextBox().sendKeys(firstName);
	}
	public void writeLastName(String lastName) {
		this.singUpPageObject.getLastNameTextBox().sendKeys(lastName);
	}

}