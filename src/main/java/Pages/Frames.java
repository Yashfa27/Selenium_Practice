package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Frames {
    WebDriver driver;
     public Frames(WebDriver driver){
         this.driver=driver;
     }

    public void frameFunction() {
        driver.findElement(By.id("mce_0_ifr")); //iframe id outside the another DOM
        driver.switchTo().frame(0);

         WebElement text=driver.findElement(By.xpath("//p[text()='Your content goes here.']"));
        String textContent = text.getText();
        System.out.println("Text found: " + textContent);

    }

}
