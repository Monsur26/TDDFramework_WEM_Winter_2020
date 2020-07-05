package hometest;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageTest extends WebAPI {
    static HomePage homePage; // Reference Variable/ object of HomePage


    public static void getInitElements() throws InterruptedException {
        homePage= PageFactory.initElements(driver, HomePage.class);
    }
    @Test
    public void testRememberMeTdBank() throws InterruptedException {
        getInitElements();
        homePage.loginButtonTdBank();
    }
    @Test(priority = 2)
    public void testUserNameTdBank() throws InterruptedException {
        getInitElements();
        homePage.userNameTdBank();
    }
    @Test(priority = 3)
    public void testPassWordTdBank() throws InterruptedException {
        getInitElements();
        homePage.passWordTdBank();
    }
    @Test(priority = 4)
    public void testSearchButtonTdBank() throws InterruptedException {
        getInitElements();
        homePage.searchButtonTdBank();
    }
    @Test(priority = 5)
    public void testProductCheckingTdBank() throws InterruptedException {
        getInitElements();
        homePage.productCheckingTdBank();
    }
    @Test(priority = 6)
    public void testServicesStudentBankingTdBank() throws InterruptedException {
        getInitElements();
        homePage.servicesStudentBankingTdBank();
    }
    @Test(priority = 7)
    public void testProductsSavingsTdBank() throws InterruptedException {
        getInitElements();
        homePage.productSavingsTdBank();
    }
    @Test(priority = 8)
    public void testSAvingsStateTdBank() throws InterruptedException {
        getInitElements();
        homePage.savingsStateTdBank();
    }
    @Test(priority = 9)
    public void testLogInEasyWebTdBank() throws InterruptedException {
        getInitElements();
        homePage.logInEasyWebTdBank();
    }
    @Test(priority = 10)
    public void testServicesForeignExchangeServices() throws InterruptedException {
        getInitElements();
        homePage.servicesForeignExchangeServices();
    }

}
