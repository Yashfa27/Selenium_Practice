import Pages.EventListener;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EventListnerTest {

    WebDriver driver;

    @BeforeTest
    public void initial() {
        WebDriverManager.chromedriver().setup();
        EventListener eventListener = new EventListener();
        driver = new EventFiringDecorator<>(eventListener).decorate(new ChromeDriver());
    }

    @Test
    public void waitWorking() {
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        WebElement button=driver.findElement(By.xpath("//button[text()='Start']"));
        button.click();

    }

    @AfterTest
    public void end() {
        driver.quit();
    }
}
