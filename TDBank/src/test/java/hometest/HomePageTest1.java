package hometest;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageTest1 extends WebAPI {

    static HomePage homePage; // Reference Variable/ object of HomePage
    //
//
    public static void getInitElements(){
        homePage= PageFactory.initElements(driver, HomePage.class);
    }


    @Test
    public void testGetTitle(){
        getInitElements();
        getTitle();
    }
    @Test
    public void testProducts() throws InterruptedException {
        getInitElements();
        homePage.MouseHoverOnProductsToServices();
    }
    @Test
    public void testFindLocation() throws InterruptedException {
        getInitElements();
        homePage.TryToFindLocation();
    }
    @Test
    public void testLogin() throws InterruptedException {
        getInitElements();
        homePage.setLogin();
    }
    @Test
    public void testLoginAcc() throws InterruptedException {
        getInitElements();
        homePage.setLoginAcc();
    }
    @Test
    public void testProductCreditCard() throws InterruptedException {
        getInitElements();
        homePage.tryProductCreditCard();
    }
    @Test
    public void testHomeEquity() throws InterruptedException {
        getInitElements();
        homePage.tryHomeEquity();
    }
    @Test
    public void testHomeEquityPopup() throws InterruptedException {
        getInitElements();
        homePage.tryHomeEquityPopup();
    }
    @Test
    public void testCountryOption() throws InterruptedException {
        getInitElements();
        homePage.tryCountry();
    }
    @Test
    public void testLearingCredit() throws InterruptedException {
        getInitElements();
        homePage.learningCredit();
    }
    @Test
    public void testMHOnProducts() throws InterruptedException {
        getInitElements();
        homePage.MHOnProducts();
    }

}
