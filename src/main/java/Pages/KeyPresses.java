package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KeyPresses {

    WebDriver driver;
    public KeyPresses(WebDriver driver){
        this.driver=driver;
    }

    public void keys(){
       WebElement key  =driver.findElement(By.id("target"));
       key.sendKeys(Keys.chord(Keys.CONTROL,"a"));

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
