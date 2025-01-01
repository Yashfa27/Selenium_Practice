package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;

public class UploadFile {
    WebDriver driver;

    public UploadFile(WebDriver driver){
        this.driver=driver;
    }

    public void UploadF(){
        WebElement ChooseFileButton=driver.findElement(By.id("file-upload"));
        ChooseFileButton.sendKeys("C:\\Users\\YASHFA\\Desktop\\Assignment.pdf");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
