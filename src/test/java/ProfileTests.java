import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProfileTests extends BaseTest {

    @Test
    public void addSongToPlaylist() throws InterruptedException {

        String expectedSongAddedMessage = "Added 1 song into \"Aerith.\"";

        enterEmail("india.messam@testpro.io");
        enterPassword("Testing123");
        submit();

        // Replace Thread.sleep with WebDriverWait or another appropriate wait mechanism
        Thread.sleep(2000);

    }
    @Test
    public void searchSong(String name)throws InterruptedException {
        enterEmail("india.messam@testpro.io");
        enterPassword("Testing123");
        submit();

        WebElement searchField = driver.findElement(By.cssSelector("div#searchForm input [type='search']"));
        searchField.sendKeys(name);
        Thread.sleep(2000);

    }
    @Test
    public void clickViewAllBtn()throws InterruptedException {
        enterEmail("india.messam@testpro.io");
        enterPassword("Testing123");
        submit();

        WebElement viewAll = driver.findElement(By.xpath("//button[data-test='view-all-songs-btn']"));
        viewAll.click();
        Thread.sleep(2000);
    }
    @Test
    public void selectFirstSongResult()throws InterruptedException {
        enterEmail("india.messam@testpro.io");
        enterPassword("Testing123");
        submit();

        WebElement firstSong = driver.findElement(By.cssSelector("[class ='song-item selected']"));
        firstSong.click();
        Thread.sleep(2000);
    }
    @Test
    public void clickAddToBtn() throws InterruptedException {
        enterEmail("india.messam@testpro.io");
        enterPassword("Testing123");
        submit();

        WebElement addToButton = driver.findElement(By.cssSelector("[class ='btn-add-to']"));
        addToButton.click();
        Thread.sleep(2000);
    }
    @Test
    public void choosePlaylist () throws InterruptedException {
        enterEmail("india.messam@testpro.io");
        enterPassword("Testing123");
        submit();

        //Created playlist named "Aerith"
        WebElement playlist = driver.findElement(By.cssSelector("[href='#!/playlist/97165']"));
        playlist.click();
        Thread.sleep(2000);
    }
    @Test
    public String getAddToPlaylistSuccessMsg() {
        WebElement notification = driver.findElement(By.cssSelector("div.success.show"));
        return notification.getText();

    }
}