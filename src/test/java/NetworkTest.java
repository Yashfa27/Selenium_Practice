import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v129.network.Network;
import org.openqa.selenium.devtools.v129.network.model.ConnectionType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.Optional;

public class NetworkTest {
    WebDriver driver;

    @BeforeMethod
    public void initial() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void networkOffline() {
        // Create DevTools session in the test
        DevTools devTools = ((ChromeDriver) driver).getDevTools();
        devTools.createSession();

        // Emulate network offline
        devTools.send(Network.emulateNetworkConditions(
                false, 100, 200, 500, Optional.of(ConnectionType.WIFI),
                Optional.empty(), Optional.empty(), Optional.empty()));

        driver.get("https://www.google.com/");
    }


    @AfterMethod
    public void ending() {
            driver.quit();
    }
}
