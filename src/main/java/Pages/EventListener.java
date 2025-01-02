package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;

public class EventListener implements WebDriverListener {

    public void afterClick(WebElement element){
        System.out.println("Clicking on an element" + element);
    }
    public void afterGet(WebElement element, String url){
        System.out.println("Navigate to URL" + url);
    }
}
