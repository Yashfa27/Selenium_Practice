package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UploadFile {
    WebDriver driver;

    UploadFile(WebDriver driver){
        this.driver=driver;
    }

    public void UploadF(){
        WebElement ChooseFileButton=driver.findElement(By.cssSelector("input#file-upload"));
        ChooseFileButton.click();
    }
}
