
import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginPageTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/login");
        LoginPage loginpage= new LoginPage(driver);

        loginpage.setUsername("tomsmith");
        loginpage.setPassword("SuperSecretPassword!");
        loginpage.clickLoginButton();

    }
}

