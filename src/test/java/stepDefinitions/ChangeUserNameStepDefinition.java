package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class ChangeUserNameStepDefinition {

    WebDriver driver;

    WebDriverWait wait;

    @Given("I am logged into to Koel music application")
        public void loggedIn  (){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        String url = "https://qa.koel.app/";
        driver.get(url);

        WebElement emailField = driver.findElement(By.cssSelector("input[type='email']"));
        emailField.clear();
        emailField.sendKeys("india.messam@testpro.io");

        WebElement passwordField = driver.findElement(By.cssSelector("input[type='password']"));
        passwordField.clear();
        passwordField.sendKeys("Testing123");

        WebElement submit = driver.findElement(By.cssSelector("button[type='submit']"));
        submit.click();

    }

    @When("I click on the user icon")
    public void iClickOnTheUserIcon() {
        WebElement avatarIcon = driver.findElement(By.cssSelector("[class='avatar']"));
        avatarIcon.click();
    }

    @And("click on the current password field")
    public void clickOnTheCurrentPasswordField() {
    }

    @And("Enter the current password in the current password field")
    public void enterTheCurrentPasswordInTheCurrentPasswordField() {
        WebElement passwordField = driver.findElement(By.cssSelector("input[type='password']"));
        passwordField.clear();
        passwordField.sendKeys("Testing123");
    }

    @And("click on the name field")
    public void clickOnTheNameField() {
        WebElement nameField = driver.findElement(By.cssSelector("[id='inputProfileEmail']"));
        nameField.click();
    }

    @And("clear the name field")
    public void clearTheNameField() {
        clearTheNameField();
    }

    @And("type in new username {string} into empty name field")
    public void typeInNewUsernameIntoEmptyNameField(String arg0) {
    }

    @And("click the save button")
    public void clickTheSaveButton() {
    }

    @And("a successful profile updated message should be seen")
    public void aSuccessfulProfileUpdatedMessageShouldBeSeen() {
    }

    @Then("I should had successfully changed the user name")
    public void iShouldHadSuccessfullyChangedTheUserName() {
    }
}
