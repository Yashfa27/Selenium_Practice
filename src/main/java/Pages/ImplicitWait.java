package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import javax.naming.ldap.Control;
import java.time.Duration;

public class ImplicitWait {
    WebDriver driver;

    public ImplicitWait(WebDriver driver){
        this.driver=driver;
    }

    public void ImplicitWaitFunction(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement button=driver.findElement(By.xpath("//button[text()='Start']"));
        button.click();

    }
}
