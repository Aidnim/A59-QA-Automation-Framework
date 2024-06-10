import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Homework16 extends BaseTest {
    @Test
    public void registrationNavigation() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//  Fork before branch.
        String url = "https://qa.koel.app/";
        driver.get(url);
//  Locate web element for email by cssSelector
        WebElement emailField = driver.findElement(By.cssSelector("input[type='email']"));
        emailField.clear();
        emailField.sendKeys("india.messam@testpro.io");

//  Input password web element by cssSelector
        WebElement passwordField = driver.findElement(By.cssSelector("input[type='password']"));
        passwordField.clear();
        passwordField.sendKeys("slcTalgy");

//  Click button to log in
        WebElement submit = driver.findElement(By.cssSelector("button[type='submit']"));
        submit.click();
 // Avatar logged in icon
        WebElement avatarIcon = driver.findElement(By.cssSelector("img[class='avatar']"));
//  Expected result
        Assert.assertTrue(avatarIcon.isDisplayed());
 // Log out
        driver.quit();

        }

    }

