package test.java.uk.co.automationtesting;

import base.BasePage;
import base.ExtentManager;
import base.Hooks;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageObjects.*;

import java.io.IOException;

@Listeners(resources.Listeners.class)

public class AddRemoveIItemBasketTest extends Hooks {
    public AddRemoveIItemBasketTest() throws IOException {
        super();
    }

    @Test
    public void AddRemoveItemTest() throws IOException, InterruptedException {

        ExtentManager.log("Starting AddRemoveItemBasketTest... ");

        HomePage homePage = new HomePage();
        homePage.getCookie().click();
        Thread.sleep(2000);
        homePage.getTestStoreLink().click();

        ShopHomePage shopHomePage = new ShopHomePage();

        ExtentManager.pass("Reached the shop homepage");

        shopHomePage.getProductTwo().click();

        ShopProductPage shopProductPage = new ShopProductPage();

        ExtentManager.pass("Reached the shop product page");

        Select option = new Select(shopProductPage.getSizeOption());
        option.selectByVisibleText("M");

        ExtentManager.pass("Have successfully selevted produt size");

        shopProductPage.getQuantityIncrease().click();

        ExtentManager.pass("Have successfully increased quantity");

        shopProductPage.getAddToCartButton().click();

        ShopContentPanel shopContentPanel = new ShopContentPanel();
        Thread.sleep(2000);
        shopContentPanel.getContinueShoppingButton().click();
        shopProductPage.getHomePageLink().click();

//        JavascriptExecutor js = (JavascriptExecutor)getDriver();
//        js.executeScript("argument[0].scrollIntoView()");
        shopHomePage.getProductEight().click();
        shopProductPage.getQuantityIncrease().click();
        shopProductPage.getAddToCartButton().click();
        Thread.sleep(2000);
        shopContentPanel.getCheckoutButton().click();

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.getDeleteItemOne().click();

        waitForElementInvisible(shoppingCart.getDeleteItemOne(), 2);


        System.out.println(shoppingCart.getTotalValue().getText());
        try {
            Assert.assertEquals(shoppingCart.getTotalValue().getText(),"$30.81");
            ExtentManager.pass("The total amount matches the expected amount.");
        }catch(AssertionError e){
            Assert.fail("Cart amount did not match the expected amount, it found " + shoppingCart.getTotalValue());
            ExtentManager.fail("Failed!");
        }

        shoppingCart.getProceedToCheckButton().click();

        OrderFormPersonalInfo personalInfo = new OrderFormPersonalInfo();
        Faker faker = new Faker();
        personalInfo.getGenderMr().click();
        personalInfo.getFirstNameField().sendKeys(faker.name().firstName());
        personalInfo.getLastNameField().sendKeys(faker.name().lastName());
        personalInfo.getEmailField().sendKeys(faker.internet().emailAddress());
        personalInfo.getPasswordField().sendKeys(faker.internet().password());
        personalInfo.getBirthDateField().sendKeys("01/01/2001");
        personalInfo.getReceiveOrderCheckbox().click();
        personalInfo.getPrivacyPolicyCheckbox().click();
        personalInfo.getNewsletterCheckbox().click();
        Thread.sleep(2000);
        personalInfo.getContinueButton().click();

        OrderFormDelivery formDelivery = new OrderFormDelivery();
        formDelivery.getCompanyNameField().sendKeys(faker.company().name());
        formDelivery.getAddressField().sendKeys(faker.address().fullAddress());
        formDelivery.getCityField().sendKeys(faker.address().city());
        Select optionState = new Select(formDelivery.getStateDropdown());
        optionState.selectByVisibleText("California");
        formDelivery.getZipPostalCodeField().sendKeys("12345");
        Select optionCountry = new Select(formDelivery.getCountryDropdown());
        optionCountry.selectByVisibleText("United States");
        formDelivery.getPhoneField().sendKeys(faker.phoneNumber().cellPhone());
        //formDelivery.getInvoiceSameAddressCheckbox().click();
        Thread.sleep(2000);
        formDelivery.getContinueButton().click();

        OrderFormShippingMethod shippingMethod = new OrderFormShippingMethod();
        shippingMethod.getDeliveryMessageTextbox().sendKeys(faker.address().fullAddress());
        shippingMethod.getContinueButton().click();

        OrderFormPayment payment = new OrderFormPayment();
        payment.getPayByCheck().click();
        payment.getTermsAndConditions().click();
        payment.getOrderButton().click();

    }
}
