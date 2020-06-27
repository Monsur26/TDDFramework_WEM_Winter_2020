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
    public void testSearchBarTrivago() throws InterruptedException {
        getInitElements();
        homePage.searchBarTrivago();
    }
    @Test(priority = 2)
    public void testCheckInInitiateTrivago() throws InterruptedException {
        getInitElements();
        homePage.checkInInitiateTrivago();
    }
    @Test(priority = 3)
    public void testCheckInDateSelectTrivago() throws InterruptedException {
        getInitElements();
        homePage.checkInDateSelectTrivago();
    }
    @Test(priority = 4)
    public void testEmailTrivago() throws InterruptedException {
        getInitElements();
        homePage.emailTrivago();
    }
    @Test(priority = 5)
    public void testLoginTrivago() throws InterruptedException {
        getInitElements();
        homePage.loginTrivago();
    }
    @Test(priority = 6)
    public void testLoginDataTrivago() throws InterruptedException {
        getInitElements();
        homePage.loginDataTrivago();
    }
    @Test(priority = 7)
    public void testMenuRecentlyTrivago() throws InterruptedException {
        getInitElements();
        homePage.menuRecentlyTrivago();
    }
}
