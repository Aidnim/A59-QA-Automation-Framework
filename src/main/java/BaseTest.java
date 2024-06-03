import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class BaseTest {

    @BeforeSuite
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }
}