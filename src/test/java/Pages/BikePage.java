package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BikePage extends BasePage{

    public BikePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "add-to-cart")
    public WebElement addToCartBikePage;
    @FindBy(id = "shopping_cart_container")
    public WebElement shoppingCart;
    @FindBy(id = "remove")
    public WebElement removeBikePage;
    @FindBy(id = "back-to-products")
    public WebElement backToProductPageButton;

    public void setAddToCartBikePage(){
        elementMethod.waitVisibleElement(addToCartBikePage);
        elementMethod.clickElement(addToCartBikePage);
    }

    public void navigateToCartPage(){
        elementMethod.waitVisibleElement(shoppingCart);
        elementMethod.clickElement(shoppingCart);
    }

    public void setRemoveBikePage(){
        elementMethod.waitVisibleElement(removeBikePage);
        elementMethod.clickElement(removeBikePage);
    }

    public void navigateToProductPage(){
        elementMethod.waitVisibleElement(backToProductPageButton);
        elementMethod.clickElement(backToProductPageButton);
    }

}
