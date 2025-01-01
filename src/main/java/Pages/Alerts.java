package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Alerts {
    WebDriver driver;

    public Alerts(WebDriver driver){
        this.driver=driver;
    }

    public void alertFunction(){
        WebElement alertTrigger=driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
        alertTrigger.click();
        driver.switchTo().alert().accept();
    }



}
