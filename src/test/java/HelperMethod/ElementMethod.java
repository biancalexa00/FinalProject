package HelperMethod;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementMethod {
    public WebDriver webDriver;

    public ElementMethod(WebDriver webDriver){this.webDriver=webDriver;}

    public void scrollElementByPixel(Integer x, Integer y){
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy("+x+" ,"+y+")", "");
    }

    public void waitVisibleElement (WebElement element){
        WebDriverWait wait= new WebDriverWait(webDriver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void clickElement (WebElement element) {
        waitVisibleElement(element);
        element.click();
    }

    public void fillElement(WebElement element, String value) {
        waitVisibleElement(element);
        element.sendKeys(value);
    }

    public void selectTextElement(WebElement element, String value){
        waitVisibleElement(element);
        Select select= new Select(element);
        select.selectByVisibleText(value);
        System.out.println(value);
    }

    public void printElementText(WebElement element){
        System.out.println(element.getText());
    }
}
