package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage{
    public ProductsPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    public WebElement backpackAddToCart;
    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    public WebElement bikeLightAddToCart;
    @FindBy(className = "shopping_cart_link")
    public WebElement cartLink;
    @FindBy(id = "remove-sauce-labs-backpack")
    public WebElement removeBackPackFromProductPage;
    @FindBy(id = "remove-sauce-labs-bike-light")
    public WebElement removeBikeFromProductPage;
    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    public WebElement tshirtAddToCart;
    @FindBy(id = "react-burger-menu-btn")
    public WebElement menuItem;
    @FindBy(id = "logout_sidebar_link")
    public WebElement logOutButton;
    @FindBy(id = "item_4_title_link")
    public WebElement backpackLink;
    @FindBy(id = "item_0_title_link")
    public WebElement bikeLink;

    public void addToCartItems(){
        elementMethod.waitVisibleElement(backpackAddToCart);
        elementMethod.clickElement(backpackAddToCart);

        elementMethod.waitVisibleElement(bikeLightAddToCart);
        elementMethod.clickElement(bikeLightAddToCart);
    }

    public void navigateToCartPage(){
        elementMethod.waitVisibleElement(cartLink);
        elementMethod.clickElement(cartLink);
    }

    public void removeItemsFromProductPage(){
        elementMethod.waitVisibleElement(removeBackPackFromProductPage);
        elementMethod.clickElement(removeBackPackFromProductPage);

        elementMethod.waitVisibleElement(removeBikeFromProductPage);
        elementMethod.clickElement(removeBikeFromProductPage);
    }

    public void addOtherItemToCart(){
        elementMethod.waitVisibleElement(tshirtAddToCart);
        elementMethod.clickElement(tshirtAddToCart);
    }

    public void openMenu(){
        elementMethod.waitVisibleElement(menuItem);
        elementMethod.clickElement(menuItem);
    }

    public void logOut(){
        elementMethod.waitVisibleElement(logOutButton);
        elementMethod.clickElement(logOutButton);
    }

    public void navigateToBackpackPage(){
        elementMethod.waitVisibleElement(backpackLink);
        elementMethod.clickElement(backpackLink);
    }

    public void navigateToBikePage(){
        elementMethod.waitVisibleElement(bikeLink);
        elementMethod.clickElement(bikeLink);
    }


}
