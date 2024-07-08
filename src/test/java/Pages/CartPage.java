package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{
    public CartPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "remove-sauce-labs-backpack")
    public WebElement removeBackpackButton;
    @FindBy(id = "checkout")
    public WebElement checkoutButton;
    @FindBy(id = "remove-sauce-labs-bolt-t-shirt")
    public WebElement removeTshirtFromCart;
    @FindBy(id = "continue-shopping")
    public WebElement continueShoppingButton;

    public void removeFromCart(){
        elementMethod.waitVisibleElement(removeBackpackButton);
        elementMethod.clickElement(removeBackpackButton);
    }

    public void navigateToCheckout(){
        elementMethod.waitVisibleElement(checkoutButton);
        elementMethod.clickElement(checkoutButton);
    }

    public void removeOtherItemFromCart(){
        elementMethod.waitVisibleElement(removeTshirtFromCart);
        elementMethod.clickElement(removeTshirtFromCart);
    }

    public void navigateBackToProductPage(){
        elementMethod.waitVisibleElement(continueShoppingButton);
        elementMethod.clickElement(continueShoppingButton);
    }

}
