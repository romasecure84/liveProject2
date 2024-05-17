package java.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.base.BasePage;
import java.io.IOException;

public class ShoppingCart extends BasePage {
    public WebDriver driver;

    By havePromo = By.cssSelector(".promo-code-button .collapse-button");
    By promoTextBox = By.cssSelector("input[name='discount_name']");
    By promoAddButton = By.cssSelector("form[method='post']  span");
    By proceedToCheckoutButton = By.linkText("PROCEED TO CHECKOUT");
    By deleteItemOne = By.cssSelector(".cart-items .cart-item:nth-of-type(1) .float-xs-left");
    By deleteItemTwo = By.cssSelector(".cart-items .cart-item:nth-of-type(2) .float-xs-left");
    By totalValue = By.cssSelector(".cart-total .value");

    public ShoppingCart() throws IOException {
        super();
    }

    public WebElement getHavePromo() throws IOException {
        this.driver = getDriver();
        return driver.findElement(havePromo);
    }

    public WebElement getPromoTextBox() throws IOException {
        this.driver = getDriver();
        return driver.findElement(promoTextBox);
    }

    public WebElement getPromoAddButton() throws IOException {
        this.driver = getDriver();
        return driver.findElement(promoAddButton);
    }

    public WebElement getProceedToCheckButton() throws IOException {
        this.driver = getDriver();
        return driver.findElement(proceedToCheckoutButton);
    }

    public WebElement getDeleteItemOne() throws IOException {
        this.driver = getDriver();
        return driver.findElement(deleteItemOne);
    }

    public WebElement getDeleteItemTwo() throws IOException {
        this.driver = getDriver();
        return driver.findElement(deleteItemTwo);
    }

    public WebElement getTotalValue() throws IOException {
        this.driver = getDriver();
        return driver.findElement(totalValue);
    }
}
