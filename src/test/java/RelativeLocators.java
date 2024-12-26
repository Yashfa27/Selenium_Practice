import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;


public class RelativeLocators {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testOpenPages() throws IOException {

        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //using getrect() to find size
        WebElement password =driver.findElement(By.id("input-password"));
        Rectangle rect= password.getRect();
        System.out.println(rect.getX());
        System.out.println(rect.getY());
        System.out.println(rect.height);
        System.out.println(rect.width);

        //using Relative Locator
        WebElement usingPasswordField =driver.findElement(By.id("input-password"));
        WebElement targetUserName=driver.findElement(RelativeLocator.with(By.tagName("input")).above(usingPasswordField));
        Rectangle rectangle= password.getRect();
        System.out.println(rectangle.getX());

        // new tab
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://mvnrepository.com/");

        // new window
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.blogger.com/about/?bpli=1");

       // screenshot
        File screenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File(".//Screenshot/screen.png"));

        // Full page screenshot
        Shutterbug.shootPage(driver, Capture.FULL, true)
                .save("C:\\Users\\YASHFA\\Desktop\\SS\\ss.png");
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
