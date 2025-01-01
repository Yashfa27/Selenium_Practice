import Pages.Frames;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class FramesTest {
    WebDriver driver;

    @BeforeTest
    public void initial() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/iframe");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void framesVerifying() {
     Frames frames= new Frames(driver);
     frames.frameFunction();
    }

    @AfterTest
    public void end() {
        driver.quit();
    }
}
