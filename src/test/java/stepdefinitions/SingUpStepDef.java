package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.SingUpPageObject;

public class SingUpStepDef {

    @Given("Client wants to have an account")
    public void clientWantsToHaveAnAccount() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        SingUpServices singUpServices = new SingUpServices(driver);
        singUpServices.go("https://demo.automationtesting.in/Register.html");
        singUpServices.writeFirstName("Lis");
        singUpServices.writeLastName("Mendez");
        Thread.sleep(4000);
        driver.quit();
    }

    @When("Client sends required information to get the account")
    public void clientSendsRequiredInformationToGetTheAccount() {
        System.out.println("Step 2");
    }

    @Then("Client should be told that the account was created")
    public void clientShouldBeToldThatTheAccountWasCreated() {
        System.out.println("Step 3");
    }
}



