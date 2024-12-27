import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextFunctionXpath {
    WebDriver driver;

    @BeforeMethod
    public void initial(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void Text(){
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        WebElement label  =driver.findElement(By.xpath("//Label[text()='E-Mail Address']"));
        String labelText =label.getText();
        System.out.println("Label text is: "+ labelText);
    }

    @AfterMethod
    public void ending(){
        driver.quit();
    }
}
