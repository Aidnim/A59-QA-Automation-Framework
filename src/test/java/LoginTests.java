import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test
    public void loginValidEmailPassword() throws InterruptedException {


        enterEmail("india.messam@testpro.io");
        enterPassword("slcTalgy");
        submit();

        WebElement avatarIcon = driver.findElement(By.cssSelector("img[class='avatar']"));

        Assert.assertTrue(avatarIcon.isDisplayed());

    }

   @Test
    public void loginInvalidEmailValidPassword()throws InterruptedException {


    enterEmail("india.wrongemail@testpro.io");
    enterPassword("slcTalgy");
    submit();
    Thread.sleep(2000);

    Assert. assertEquals(driver.getCurrentUrl(),url);

    }

   @Test
    public void loginValidEmailEmptyPassword()throws InterruptedException {

    enterEmail("india.messam@testpro.io");
    submit();
    Thread.sleep(2000);

    Assert.assertEquals(driver.getCurrentUrl(),url);


    }


}
