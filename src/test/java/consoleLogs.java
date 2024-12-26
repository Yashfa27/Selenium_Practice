import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.log.Log;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class consoleLogs {
    WebDriver driver;

    @BeforeMethod
    public void starting(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void ViewBrowserConsoleLog(){

        // Casting
        ChromeDriver chromeDriver = (ChromeDriver) driver;
        DevTools devTools = chromeDriver.getDevTools();
        devTools.createSession();

        // interact
        devTools.send(Log.enable());

        // capture log entries
        devTools.addListener(Log.entryAdded(), logEntry -> {
            System.out.println("===========");
            System.out.println("Log Level: " + logEntry.getLevel());
            System.out.println("Log Message: " + logEntry.getText());
            System.out.println("Log URL: " + logEntry.getUrl());
        });

        // Navigate
        driver.get("https://the-internet.herokuapp.com/broken_images");
    }

    @AfterMethod
    public void ending(){
        driver.quit();
    }
}
