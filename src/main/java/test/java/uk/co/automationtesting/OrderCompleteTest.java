package test.java.uk.co.automationtesting;

import base.ExtentManager;
import base.Hooks;
import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageObjects.*;

import java.io.IOException;

@Listeners(resources.Listeners.class)

public class OrderCompleteTest extends Hooks {
    public OrderCompleteTest() throws IOException {
        super();
    }

    @Test(testName = "End")
    public void endToEndTest() throws InterruptedException, IOException {

        ExtentManager.log("Starting OrderCompleteTest... ");

        HomePage homePage = new HomePage();
        homePage.getCookie().click();
        Thread.sleep(2000);
        homePage.getTestStoreLink().click();

        ExtentManager.pass("Reached the shop homepage");

        ShopHomePage shopHomePage = new ShopHomePage();
        shopHomePage.getProductOne().click();

        ShopProductPage shopProductPage = new ShopProductPage();
        Select option = new Select(shopProductPage.getSizeOption());
        option.selectByVisibleText("M");
        shopProductPage.getQuantityIncrease().click();
        shopProductPage.getAddToCartButton().click();

        ShopContentPanel shopContentPanel = new ShopContentPanel();
        shopContentPanel.getCheckoutButton().click();

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.getHavePromo().click();
        shoppingCart.getPromoTextBox().sendKeys("20OFF");
        shoppingCart.getPromoAddButton().click();
        Thread.sleep(2000);
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
