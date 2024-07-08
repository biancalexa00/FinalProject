package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "user-name")
    public WebElement userField;
    @FindBy(id = "password")
    public WebElement passwordField;
    @FindBy(id = "login-button")
    public WebElement loginButton;


    public void navigateToProductsPage(){
        elementMethod.waitVisibleElement(userField);
        elementMethod.fillElement(userField,"standard_user");

        elementMethod.waitVisibleElement(passwordField);
        elementMethod.fillElement(passwordField,"secret_sauce");

        elementMethod.waitVisibleElement(loginButton);
        elementMethod.clickElement(loginButton);
    }

    public void logInBlockedUser(){
        elementMethod.waitVisibleElement(userField);
        elementMethod.fillElement(userField,"locked_out_user");

        elementMethod.waitVisibleElement(passwordField);
        elementMethod.fillElement(passwordField,"secret_sauce");

        elementMethod.waitVisibleElement(loginButton);
        elementMethod.clickElement(loginButton);
    }

}




