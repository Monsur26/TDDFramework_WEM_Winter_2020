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
    public void testOnlineBankingTdBank() throws InterruptedException {
        getInitElements();
        homePage.onlineBankingTdBank();
    }
    @Test(priority = 3)
    public void testUserNameTdBank() throws InterruptedException {
        getInitElements();
        homePage.userNameTdBank();
    }
    @Test(priority = 4)
    public void testSearchButtonTdBank() throws InterruptedException {
        getInitElements();
        homePage.searchButtonTdBank();
    }

}
