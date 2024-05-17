package java.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.base.BasePage;
import java.io.IOException;

public class ShopProductPage extends BasePage {
    public WebDriver driver;

    By sizeOption = By.cssSelector("[aria-label='Size']");
    By quantityIncrease = By.cssSelector(".touchspin-up");
    By quantityDecrease = By.cssSelector(".touchspin-down");
    By addToCartButton = By.cssSelector(".add-to-cart.btn.btn-primary");
    By homepageLink = By.xpath("//span[.='Home']");

    public ShopProductPage() throws IOException {
        super();
    }

    public WebElement getSizeOption() throws IOException {
        this.driver = getDriver();
        return driver.findElement(sizeOption);
    }

    public WebElement getQuantityIncrease() throws IOException {
        this.driver = getDriver();
        return driver.findElement(quantityIncrease);
    }

    public WebElement getQuantityDecrease() throws IOException {
        this.driver = getDriver();
        return driver.findElement(quantityDecrease);
    }

    public WebElement getAddToCartButton() throws IOException {
        this.driver = getDriver();
        return driver.findElement(addToCartButton);
    }

    public WebElement getHomePageLink() throws IOException {
        this.driver = getDriver();
        return driver.findElement(homepageLink);
    }
}
