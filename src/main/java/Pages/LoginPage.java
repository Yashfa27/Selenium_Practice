package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    By username = By.id("username");
    By password = By.id("password");
    By loginButton = By.cssSelector("button.radius");

    public void setUsername(String name) {
        driver.findElement(username).sendKeys(name);
    }

    public void setPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

}
