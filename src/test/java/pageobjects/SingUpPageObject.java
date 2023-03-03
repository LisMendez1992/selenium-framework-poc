package pageobjects;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class SingUpPageObject {

	public SingUpPageObject(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	@FindBy (xpath = "//input[@ng-model=\"FirstName\"]" )
	private WebElement firstNameTextBox;
	@FindBy (xpath = "//input[@ng-model=\"LastName\"]" )
	private WebElement lastNameTextBox;

	@FindBy (xpath = "//input[@ng-model=\"EmailAdress\"]" )
	private WebElement emailTextBox;

	@FindBy (xpath = "//input[@ng-model=\"Phone\"]" )
	private WebElement phoneTextBox;










}
