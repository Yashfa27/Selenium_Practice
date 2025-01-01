import Pages.Alerts;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class AlertsTest {
    WebDriver driver;

    @BeforeTest
    public void initial() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    }

    @Test
    public void AlertWorking() {
        Alerts alerts = new Alerts(driver);
        alerts.alertFunction();
        WebElement result= driver.findElement(By.cssSelector("p#result"));
        String actual=result.getText();
        String expected="You successfully clicked an alert";
        assertEquals(actual,expected);
    }

    @AfterTest
    public void end() {
        driver.quit();
    }
}
