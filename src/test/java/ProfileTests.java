import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProfileTests extends BaseTest {

    @Test
    public void addSongToPlaylist() throws InterruptedException {

        String expectedSongAddedMessage = "Added 1 song into \"Aerith.\"";

        enterEmail("india.messam@testpro.io");
        enterPassword("slcTalgy");
        submit();

        // Replace Thread.sleep with WebDriverWait or another appropriate wait mechanism
        Thread.sleep(2000);

    }
    public void searchSong(String name)throws InterruptedException {
        WebElement searchField = driver.findElement(By.cssSelector("div#searchForm input [type='search']"));
        searchField.sendKeys(name);
        Thread.sleep(2000);

    }
    public void clickViewAllBtn()throws InterruptedException {
        WebElement viewAll = driver.findElement(By.xpath("//button[data-test='view-all-songs-btn']"));
        viewAll.click();
        Thread.sleep(2000);
    }
    public void selectFirstSongResult()throws InterruptedException {
        WebElement firstSong = driver.findElement(By.cssSelector("[class ='song-item selected']"));
        firstSong.click();
        Thread.sleep(2000);
    }
    public void clickAddToBtn() throws InterruptedException {
        WebElement addToButton = driver.findElement(By.cssSelector("[class ='btn-add-to']"));
        addToButton.click();
        Thread.sleep(2000);
    }
    public void choosePlaylist () throws InterruptedException {
        //Created playlist named "Aerith"
        WebElement playlist = driver.findElement(By.cssSelector("[href='#!/playlist/97165']"));
        playlist.click();
        Thread.sleep(2000);
    }
    public String getAddToPlaylistSuccessMsg() {
        WebElement notification = driver.findElement(By.cssSelector("div.success.show"));
        return notification.getText();

    }
}