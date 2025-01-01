import Pages.WaitStrategy;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class WaitStrategyTest {
    WebDriver driver;

    @BeforeTest
    public void initial() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
    }

    @Test
    public void WaitWorking() {
        WaitStrategy waitStrategy= new WaitStrategy(driver);
        waitStrategy.WaitTimeFunction();

        WebElement text=driver.findElement(By.xpath("//h4[text()='Hello World!']"));
        String actual=text.getText();
        String expected="Hello World!";
        assertEquals(actual,expected);
    }

    @AfterTest
    public void end() {
        driver.quit();
    }
}
