import Pages.UploadFile;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class UploadFileTest {
    WebDriver driver;

    @BeforeTest
    public void initial() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
    }

    @Test
    public void UploadWorking() {
        UploadFile uploadfile=new UploadFile(driver);
        uploadfile.UploadF();

        WebElement SubmitButton=driver.findElement(By.id("file-submit"));
        SubmitButton.click();

        WebElement textVerify=driver.findElement(By.xpath("//h3[text()='File Uploaded!']"));

        String actual=textVerify.getText();
        String expected="File Uploaded!";
        assertEquals(actual,expected);
    }

    @AfterTest
    public void end() {
        driver.quit();
    }
}
