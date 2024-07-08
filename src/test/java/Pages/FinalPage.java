package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FinalPage extends BasePage{
    public FinalPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "finish")
    public WebElement finishButton;

    public void finishTest(){
        elementMethod.waitVisibleElement(finishButton);
        elementMethod.clickElement(finishButton);
    }
}
