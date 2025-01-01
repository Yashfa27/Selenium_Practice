package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    public void formAuthentication() {
        WebElement formAuth = driver.findElement(By.linkText("Form Authentication"));
        formAuth.click();
    }
}
