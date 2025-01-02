import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HardAssertionTest {

    WebDriver driver;

    @BeforeTest
    public void initial() {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
    }

    @Test
    public void hardAssWorking() {
        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        WebElement image =driver.findElement(By.xpath("//img[@class='mw-logo-icon']"));
        Assert.assertTrue(image.isDisplayed(),"Image is not displayed");

        System.out.println("Successfully Displayed--!!");


    }

    @AfterTest
    public void end() {
        driver.quit();
    }
}
