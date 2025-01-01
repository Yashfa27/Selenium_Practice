package Pages;
import org.openqa.selenium.WebDriver;

public class AppNavigation{
    WebDriver driver;
    WebDriver.Navigation navigate;

    public AppNavigation(WebDriver driver){
        this.driver=driver;
        navigate = driver.navigate();
    }

    public void GoTo(){
        navigate.to("https://the-internet.herokuapp.com/dynamic_loading/1");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void Backward(){
        navigate.back();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void Forword(){
        navigate.forward();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void Refresh(){
        navigate.refresh();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
