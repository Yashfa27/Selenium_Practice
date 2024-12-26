import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.emulation.Emulation;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Optional;

public class MockGeolocation {
    WebDriver driver;

    @BeforeMethod
    public void initial(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void geolocation(){
        ChromeDriver driver = new ChromeDriver();
        DevTools devtools = driver.getDevTools();
        devtools.createSession();
        devtools.send(Emulation.setGeolocationOverride(Optional.of(33.7233),
                                                      Optional.of(73.0435),
                                                       Optional.of(1)));

        driver.get("https://mylocation.org/");
    }
    @AfterMethod
    public void ending(){
        driver.quit();
    }
}
