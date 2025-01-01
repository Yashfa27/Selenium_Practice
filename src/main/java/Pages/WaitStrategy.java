package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitStrategy {
    WebDriver driver;

    public WaitStrategy(WebDriver driver){
        this.driver=driver;
    }

    public void WaitTimeFunction(){
        WebElement button=driver.findElement(By.xpath("//button[text()='Start']"));
        button.click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("loading"))));
    }
}
