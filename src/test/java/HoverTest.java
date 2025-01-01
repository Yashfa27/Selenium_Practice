import Pages.Hover;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HoverTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        Hover hoverImg= new Hover(driver);

        driver.get("https://the-internet.herokuapp.com/hovers");
        hoverImg.hoverFunction();
    }
}
