package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage{
    public CheckoutPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "first-name")
    public WebElement firstNameField;
    @FindBy(id = "last-name")
    public WebElement lastNameField;
    @FindBy(id = "postal-code")
    public WebElement postalCodeField;
    @FindBy(id = "continue")
    public WebElement continueButton;

    public void fillInformations(){
        elementMethod.waitVisibleElement(firstNameField);
        elementMethod.fillElement(firstNameField,"Bianca");
        elementMethod.waitVisibleElement(lastNameField);
        elementMethod.fillElement(lastNameField,"Alexa");
        elementMethod.waitVisibleElement(postalCodeField);
        elementMethod.fillElement(postalCodeField,"001001");
    }

    public void navigateToFinalPage(){
        elementMethod.waitVisibleElement(continueButton);
        elementMethod.clickElement(continueButton);
    }

}
