package java.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.base.BasePage;
import java.io.IOException;

public class ShopHomePage extends BasePage {
    public WebDriver driver;

    By productOne = By.xpath("(//*[text()='Hummingbird printed t-shirt'])[1]");
    By productTwo = By.xpath("(//*[text()='Hummingbird printed sweater'])[1]");
    By productThree = By.xpath("//*[text()='The best is yet to come'...']");
    By productFour = By.xpath("//*[text()='The adventure begins Framed...']");
    By productFive = By.xpath("//*[text()='Today is a good day Framed...']");
    By productSix = By.xpath("(//*[text()='Mug The best is yet to come'])[1]");
    By productSeven = By.xpath("//*[text()='Mug The adventure begins']");
    By productEight = By.xpath("(//*[text()='Mug Today is a good day'])");

    public ShopHomePage() throws IOException {

        super();
    }

    public WebElement getProductOne() throws IOException {
        this.driver = getDriver();
        return driver.findElement(productOne);
    }

    public WebElement getProductTwo() throws IOException {
        this.driver = getDriver();
        return driver.findElement(productTwo);
    }

    public WebElement getProductThree() throws IOException {
        this.driver = getDriver();
        return driver.findElement(productThree);
    }

    public WebElement getProductFour() throws IOException {
        this.driver = getDriver();
        return driver.findElement(productFour);
    }

    public WebElement getProductFive() throws IOException {
        this.driver = getDriver();
        return driver.findElement(productFive);
    }

    public WebElement getProductSix() throws IOException {
        this.driver = getDriver();
        return driver.findElement(productSix);
    }

    public WebElement getProductSeven() throws IOException {
        this.driver = getDriver();
        return driver.findElement(productSeven);
    }

    public WebElement getProductEight() throws IOException {
        this.driver = getDriver();
        return driver.findElement(productEight);
    }

}
