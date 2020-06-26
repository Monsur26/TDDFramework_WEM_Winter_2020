package hometest;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class HomePageTest extends WebAPI {
    static HomePage homePage;

    public static void getInitElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test(priority = 1)
    public void testRegionSelect() {
        getInitElements();
        homePage.regionSelectOptions();
        homePage.validateRegion();
    }

    @Test(priority = 2)
    public void testLoginDropDown() throws InterruptedException {
        getInitElements();
        homePage.loginDropDown();
        homePage.validateLoginDD();
    }

    @Test(priority = 3)
    public void testNewWindow() throws InterruptedException {
        getInitElements();
        homePage.onlineBankingSelectToNewWindow();
        homePage.validateTDLogo();
    }

    @Test(priority = 4)
    public void testOnlineBankingSelectAndSwitchingWindow() throws InterruptedException {
        getInitElements();
        homePage.onlineBankingSelectAndSwitchingWindow();
        homePage.validateTDLogo();
    }

    @Test(priority = 5)
    public void testProductDropDown() {
        getInitElements();
        homePage.productsDropDown();
        homePage.validateTDLogo();
    }

    @Test(priority = 6)
    public void testCommercialLinkAndIndustriesDD() {
        getInitElements();
        homePage.commercialLinkAndIndustriesDD();
        homePage.validateIndustriesDD();

    }

    @Test(priority = 7)
    public void testAskNowOption() {
        getInitElements();
        homePage.askNowOption();
        homePage.validateAskNOw();
    }

    @Test(priority = 8)
    public void testPopularQuestionsLink() throws InterruptedException {
        getInitElements();
        homePage.popularQuestionsLink();
        homePage.validateTDLogo();
    }

    @Test(priority = 9)
    public void testRightAndLeftArrowSlide() {
        getInitElements();
        homePage.rightAndLeftArrowSlide();
        homePage.validateTDLogo();
    }

    @Test(priority = 10)
    public void testLoginFunction() throws InterruptedException {
        getInitElements();
        homePage.loginFunctions();
        homePage.validateTDLogo();
    }

}
