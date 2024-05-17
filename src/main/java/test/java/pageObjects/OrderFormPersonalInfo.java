package test.java.pageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class OrderFormPersonalInfo extends BasePage {
    public WebDriver driver;

    By genderMr = By.cssSelector("label:nth-of-type(1)  input[name='id_gender']");
    By genderMrs = By.cssSelector("label:nth-of-type(2)  input[name='id_gender']");
    By firstNameField = By.cssSelector("input#field-firstname");
    By lastNameField = By.cssSelector("input#field-lastname");
    By emailField = By.cssSelector(".tab-content [role='tabpanel']:nth-of-type(1) [name='email']");
    By passwordField = By.cssSelector(".field-password-policy [name]");
    By birthDateField = By.cssSelector("input#field-birthday");
    By receiveOrdersCheckbox = By.cssSelector("div:nth-of-type(7)  span > label");
    By privacyPolicyCheckbox = By.cssSelector("div:nth-of-type(8)  span > label");
    By newsletterCheckBox = By.cssSelector("div:nth-of-type(9)  span > label");
    By continueButton = By.cssSelector("form#customer-form  button[name='continue']");

    public OrderFormPersonalInfo() throws IOException {
        super();
    }

    public WebElement getGenderMr() throws IOException {
        this.driver = getDriver();
        return driver.findElement(genderMr);
    }
    public WebElement getGenderMrs() throws IOException {
        this.driver = getDriver();
        return driver.findElement(genderMrs);
    }
    public WebElement getFirstNameField() throws IOException {
        this.driver = getDriver();
        return driver.findElement(firstNameField);
    }
    public WebElement getLastNameField() throws IOException {
        this.driver = getDriver();
        return driver.findElement(lastNameField);
    }
    public WebElement getEmailField() throws IOException {
        this.driver = getDriver();
        return driver.findElement(emailField);
    }
    public WebElement getPasswordField() throws IOException {
        this.driver = getDriver();
        return driver.findElement(passwordField);
    }
    public WebElement getBirthDateField() throws IOException {
        this.driver = getDriver();
        return driver.findElement(birthDateField);
    }
    public WebElement getReceiveOrderCheckbox() throws IOException {
        this.driver = getDriver();
        return driver.findElement(receiveOrdersCheckbox);
    }
    public WebElement getPrivacyPolicyCheckbox() throws IOException {
        this.driver = getDriver();
        return driver.findElement(privacyPolicyCheckbox);
    }
    public WebElement getNewsletterCheckbox() throws IOException {
        this.driver = getDriver();
        return driver.findElement(newsletterCheckBox);
    }
    public WebElement getContinueButton() throws IOException {
        this.driver = getDriver();
        return driver.findElement(continueButton);
    }
}
