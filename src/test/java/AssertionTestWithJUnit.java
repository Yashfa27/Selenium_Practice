import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;

public class AssertionTestWithJUnit {

    WebDriver driver;

    @BeforeEach
    public void initial() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void Assert() {
        driver.get("https://the-internet.herokuapp.com/inputs");

        WebElement text = driver.findElement(By.xpath("//h3[text()='Inputs']"));
        String textActual = text.getText();
        String expected = "Inputs";
        Assertions.assertEquals(expected, textActual, "Fail to get TEXT INPUTS");

        WebElement text2 = driver.findElement(By.xpath("//p[text()='Number']"));
        String textActual2 = text2.getText();
        String expected2 = "Number";
        Assertions.assertEquals(expected2, textActual2, "Fail to get text Number");
    }

    @AfterEach
    public void end() {
        driver.quit();
    }
}
