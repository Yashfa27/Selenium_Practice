package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class Hover {
    WebDriver driver;
    public Hover(WebDriver driver){
        this.driver= driver;
    }

    public void hoverFunction(){
        WebElement hoverEle=driver.findElement(By.cssSelector("#content > div > div:nth-child(3) > img"));
        Actions action = new Actions(driver);
        action.moveToElement(hoverEle).perform();
    }
}
