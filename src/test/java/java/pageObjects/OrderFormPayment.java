package java.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.base.BasePage;
import java.io.IOException;

public class OrderFormPayment extends BasePage {
    public WebDriver driver;

    By payByWire = By.cssSelector("[for='payment-option-1'] span");
    By payByCheck = By.cssSelector("[for='payment-option-2'] span");
    By termsAndConditions = By.xpath("//form[@id='conditions-to-approve']/ul//label[@class='js-terms']");
    By orderButton = By.xpath("//div[@id='payment-confirmation']//button[@type='submit']");

    public OrderFormPayment() throws IOException {
        super();
    }
    public WebElement getPayByWire() throws IOException {
        this.driver = getDriver();
        return driver.findElement(payByWire);
    }
    public WebElement getPayByCheck() throws IOException {
        this.driver = getDriver();
        return driver.findElement(payByCheck);
    }
    public WebElement getTermsAndConditions() throws IOException {
        this.driver = getDriver();
        return driver.findElement(termsAndConditions);
    }
    public WebElement getOrderButton() throws IOException {
        this.driver = getDriver();
        return driver.findElement(orderButton);
    }
}
