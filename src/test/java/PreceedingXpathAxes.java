import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PreceedingXpathAxes {
    WebDriver driver;

    @BeforeMethod
    public void initial() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void Text() {
        driver.get("https://www.zoho.com/crm/signup.html");

        // Targeting the input element
        WebElement procedingInput = driver.findElement(By.xpath("//input[@name='password']/preceding::input[@id='namefield']"));
        procedingInput.sendKeys("preceding");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @AfterMethod
    public void ending() {
        driver.quit();
    }
}
