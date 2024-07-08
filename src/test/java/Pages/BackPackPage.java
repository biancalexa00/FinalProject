package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BackPackPage extends BasePage{
    public BackPackPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "add-to-cart")
    public WebElement addToCartBackpackPage;
    @FindBy(id = "shopping_cart_container")
    public WebElement shoppingCart;
    @FindBy(id = "remove")
    public WebElement removeBackpackPage;
    @FindBy(id = "back-to-products")
    public WebElement backToProductPageButton;

    public void setAddToCartBackpackPage(){
        elementMethod.waitVisibleElement(addToCartBackpackPage);
        elementMethod.clickElement(addToCartBackpackPage);
    }

    public void navigateToCartPage(){
        elementMethod.waitVisibleElement(shoppingCart);
        elementMethod.clickElement(shoppingCart);
    }

    public void setRemoveBackpackPage(){
        elementMethod.waitVisibleElement(removeBackpackPage);
        elementMethod.clickElement(removeBackpackPage);
    }

    public void navigateToProductPage(){
        elementMethod.waitVisibleElement(backToProductPageButton);
        elementMethod.clickElement(backToProductPageButton);
    }

}
