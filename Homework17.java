import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.internal.BaseTestMethod;

import java.time.Duration;

public class Homework17 extends BaseTest {

    @Test
    public void addSongToPlaylist(){

       // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        // Initialize ChromeDriver with options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);

        try {
            // Open the URL
            driver.get("https://qa.koel.app/");

            // Wait for the page to load and the login form to be visible
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("email")));

            // Locate the email and password fields
            WebElement emailField = driver.findElement(By.name("email"));
            WebElement passwordField = driver.findElement(By.name("password"));

            // Enter credentials
            emailField.sendKeys("india.messam@testpro.io");
            passwordField.sendKeys("slcTalgy");

            // Locate and click the login button
            WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
            loginButton.click();

            // Search for a song
            WebElement sideSearchShowing = driver.findElement(By.cssSelector("[class='side search showing']"));
            sideSearchShowing.click();

            sideSearchShowing = driver.findElement(By.name,"q"());
            sideSearchShowing.sendKeys("love");
            sideSearchShowing.sendKeys(Keys.RETURN);


            //click view all button

            //click first song in search results

            //click add to button

            //choose playlist to add

            //Verify that a notation message appears containing Actual playlist name

            //use Assert.assertEquals()

            System.out.println("Login test passed!");

        } catch (Exception e) {
            System.out.println("Login test failed!");
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}

    }

}

