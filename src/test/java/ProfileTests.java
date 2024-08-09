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


        Thread.sleep(2000);

    }
    public void searchSong(String name)throws InterruptedException {
        WebElement searchField = driver.findElement(By.cssSelector("[type='search']"));
        searchField.sendKeys(name);
        Thread.sleep(2000);

    }
    public void clickViewAllBtn()throws InterruptedException {
        WebElement viewAll = driver.findElement(By.xpath("[href='#!/songs']"));
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
    @Test
    public void deletePlaylist () throws InterruptedException {
        String expectedPlaylistDeletedMessage = "Deleted playlist \"Cloud.\"";

        enterEmail("india.messam@testpro.io");
        enterPassword("slcTalgy");
        submit();

        Thread.sleep(2000);

    }
    public void openPlaylist(){
        WebElement emptyPlaylist = driver.findElement(By.cssSelector("[href='#!/playlist/98789']"));
        emptyPlaylist.click();
    }
    public void clickDeletePlaylistBtn() throws InterruptedException {
        WebElement deletePlaylist = driver.findElement(By.cssSelector("[class='del btn-delete-playlist']"));
        deletePlaylist.click();
        Thread.sleep(2000);
    }
    public String getDeletedPlaylistMsg() {
        WebElement notificationMsg = driver.findElement(By.cssSelector("div.success.show"));
        return  notificationMsg.getText();
    }
}
