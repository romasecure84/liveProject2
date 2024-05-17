package java.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.base.BasePage;
import java.io.IOException;

public class OrderFormDelivery extends BasePage {
    public WebDriver driver;

    By firstNameField = By.cssSelector(".form-fields input#field-firstname");
    By lastNameField = By.cssSelector(".form-fields input#field-lastname");
    By companyNameField = By.cssSelector("input#field-company");
    By addressField = By.cssSelector("input[name='address1']");
    By addressComplementField = By.cssSelector("input[name='address2']");
    By cityField = By.cssSelector("input#field-city");
    By stateDropdown = By.cssSelector("select#field-id_state");
    By zipPostalCodeField = By.cssSelector("input#field-postcode");
    By countryDropdown = By.cssSelector("select#field-id_country");
    By phoneField = By.cssSelector("input#field-phone");
    By invoiceSameAddressCheckbox = By.cssSelector("input#use_same_address");
    By continueButton = By.cssSelector("button[name='confirm-addresses']");

    public OrderFormDelivery() throws IOException {
        super();
    }
    public WebElement getFirstNameField() throws IOException {
        this.driver = getDriver();
        return driver.findElement(firstNameField);
    }
    public WebElement getLastNameField() throws IOException {
        this.driver = getDriver();
        return driver.findElement(lastNameField);
    }
    public WebElement getCompanyNameField() throws IOException {
        this.driver = getDriver();
        return driver.findElement(companyNameField);
    }
    public WebElement getAddressField() throws IOException {
        this.driver = getDriver();
        return driver.findElement(addressField);
    }
    public WebElement getAddressComplementField() throws IOException {
        this.driver = getDriver();
        return driver.findElement(addressComplementField);
    }
    public WebElement getCityField() throws IOException {
        this.driver = getDriver();
        return driver.findElement(cityField);
    }
    public WebElement getStateDropdown() throws IOException {
        this.driver = getDriver();
        return driver.findElement(stateDropdown);
    }
    public WebElement getZipPostalCodeField() throws IOException {
        this.driver = getDriver();
        return driver.findElement(zipPostalCodeField);
    }
    public WebElement getCountryDropdown() throws IOException {
        this.driver = getDriver();
        return driver.findElement(countryDropdown);
    }
    public WebElement getPhoneField() throws IOException {
        this.driver = getDriver();
        return driver.findElement(phoneField);
    }
    public WebElement getInvoiceSameAddressCheckbox() throws IOException {
        this.driver = getDriver();
        return driver.findElement(invoiceSameAddressCheckbox);
    }
    public WebElement getContinueButton() throws IOException {
        this.driver = getDriver();
        return driver.findElement(continueButton);
    }
}
