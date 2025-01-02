import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionTest {

    WebDriver driver;

    @BeforeTest
    public void initial() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void SoftAssWorking() {
        SoftAssert soft = new SoftAssert();

    driver.get("https://the-internet.herokuapp.com/inputs");


            WebElement text = driver.findElement(By.xpath("//h3[text()='Inputs']"));
            String textActual = text.getText();
            String expected = "Iputs";
            soft.assertEquals(textActual, expected, "Fail to get TEXT INPUTS");

            System.out.println("Hello");
    soft.assertAll();
}


@AfterTest
public void end() {
    driver.quit();
}
}