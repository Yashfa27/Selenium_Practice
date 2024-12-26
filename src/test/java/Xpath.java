import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class Xpath {
    WebDriver driver;
    @BeforeMethod
    public void initial(){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }

    @Test
        public void path(){
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        WebElement inputField=driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
        inputField.sendKeys("alice@yopmail.com");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @AfterMethod
        public void ending(){
            driver.quit();
    }
}