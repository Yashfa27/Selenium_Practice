
import Pages.ImplicitWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class implicitWaitTest {
    WebDriver driver;

    @BeforeTest
    public void initial() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
    }

    @Test
    public void ImplicitWorking() {
        ImplicitWait implicit=new ImplicitWait(driver);
        implicit.ImplicitWaitFunction();
    }

    @AfterTest
    public void end() {
        driver.quit();
    }
}
