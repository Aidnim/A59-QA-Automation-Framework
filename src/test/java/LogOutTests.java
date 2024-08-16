import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogOutTests extends BaseTest {
    @Test
    public void LogOutBtnPresent () throws InterruptedException{
        enterEmail("india.messam@testpro.io");
        enterPassword("slcTalgy");
        submit();

        WebElement LogoutBtn = driver.findElement(By.cssSelector("[class='fa fa-sign-out']"));
        Assert.assertTrue(LogoutBtn.isDisplayed());
    }
    @Test
    public void SuccessfulLogoutAfterLogin () throws InterruptedException{
        enterEmail("india.messam@testpro.io");
        enterPassword("slcTalgy");
        submit();

        WebElement LogoutBtn = driver.findElement(By.cssSelector("[class='fa fa-sign-out']"));
        LogoutBtn.click();

        WebElement koelLogo = driver.findElement(By.cssSelector("[class='logo']"));
        Assert.assertTrue(koelLogo.isDisplayed());

    }


}
