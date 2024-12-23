import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v129.page.model.Screenshot;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.nio.file.Files;

public class RelativeLocators {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testOpenPages() {

        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //using getrect() to find size
        WebElement username =driver.findElement(By.id("input-password"));
        Rectangle rect= username.getRect();
        System.out.println(rect.getX());
        System.out.println(rect.getY());
        System.out.println(rect.height);
        System.out.println(rect.width);

        // new tab
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://mvnrepository.com/");

        // new window
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.blogger.com/about/?bpli=1");

//        // screenshot
//        File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        Files.copy(file, new File("C:\\Users\\YASHFA\\Desktop\\screenshot.jpg"));
  }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
