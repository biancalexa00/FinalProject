package Pages;

import HelperMethod.ElementMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected ElementMethod elementMethod;

    public BasePage(WebDriver webDriver){
        elementMethod= new ElementMethod(webDriver);
        PageFactory.initElements(webDriver,this);
    }
}
