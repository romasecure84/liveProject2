package test.java.pageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class ShopContentPanel extends BasePage {
    public WebDriver driver;

    By continueShoppingButton = By.xpath("//button[contains(text(),'Continue')]");
    By checkoutButton = By.xpath("//*[text()='Proceed to checkout']");

    public ShopContentPanel() throws IOException {
        super();
    }

    public WebElement getContinueShoppingButton() throws IOException {
        this.driver = getDriver();
        return driver.findElement(continueShoppingButton);
    }

    public WebElement getCheckoutButton() throws IOException {
        this.driver = getDriver();
        return driver.findElement(checkoutButton);
    }
}
