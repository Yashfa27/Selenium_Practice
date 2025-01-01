import Pages.AppNavigation;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppNavigationTest {
    WebDriver driver;

    @BeforeTest
    public void initial() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
    }

    @Test
    public void NavigationWorking() {
        AppNavigation appNavigation=new AppNavigation(driver);
        appNavigation.GoTo();
        appNavigation.Backward();
        appNavigation.Forword();
        appNavigation.Refresh();
    }

    @AfterTest
    public void end() {
        driver.quit();
    }
}
