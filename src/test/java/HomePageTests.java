import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends BaseTest {

    @Test
    public void welcomeMessageVisible () throws InterruptedException{
        enterEmail("india.messam@testpro.io");
        enterPassword("Testing123");
        submit();

        WebElement welcomeMessage = driver.findElement(By.xpath("//*[@id=\"homeWrapper\"]/header/div[2]/h1"));
        Assert.assertTrue(welcomeMessage.isDisplayed(), "Welcome message is not displayed");

}
    @Test
    public void viewRecentlyPlayedBtn() throws InterruptedException {
        enterEmail("india.messam@testpro.io");
        enterPassword("Testing123");
        submit();
        WebElement recentlyPlayedBtn = driver.findElement(By.xpath("//*[@id=\"homeWrapper\"]/div/div[1]/section[2]/h1/button"));
        Assert.assertTrue(recentlyPlayedBtn.isDisplayed(),"Recently Played button is not displayed");

    }



}

