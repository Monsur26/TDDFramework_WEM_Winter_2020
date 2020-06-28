package hometest;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class VerizonHomePageTest extends WebAPI {
    static HomePage homePage;

    public static void getInitElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }


    @Test(priority = 1)
    public void testShopsHover() {
        getInitElements();
        homePage.hoverShopsMenu();
        homePage.validateHoverShops();
    }

    @Test(priority = 2)
    public void testMyVerizonHover() {
        getInitElements();
        homePage.myVerizonHover();
        homePage.validateMyVerizon();
    }

    @Test(priority = 3)
    public void testLanguageSwitch() {
        getInitElements();
        homePage.languageSwitch();
        homePage.validateLanguageSwitch();
    }

    @Test(priority = 4)
    public void testWatchTV() {
        getInitElements();
        homePage.watchTVMouseHover();
        homePage.validateWatchTV();
    }

    @Test(priority = 5)
    public void testSearch() {
        getInitElements();
        homePage.searchingItem();
        homePage.validateSearchingItem();
    }

    @Test(priority = 6)
    public void testScrolling() {
        getInitElements();
        homePage.scrollingDownHomePage();
        homePage.validateScrollingDown();
    }

    @Test(priority = 7)
    public void testFBpage() {
        getInitElements();
        homePage.FacebookPage();
        homePage.validateFBPage();
    }

    @Test(priority = 8)
    public void testStoreLocation() {
        getInitElements();
        homePage.storeSelectByLocation();
        homePage.validateStoreSelect();
    }

    @Test(priority = 9)
    public void testRadioButton() {
        getInitElements();
        homePage.salesAndBillRadioButtonClick();
        homePage.validateRadioButton();
    }

    @Test(priority = 10)
    public void testSignInPageGenerating() {
        getInitElements();
        homePage.generatingSignInPage();
        homePage.validateGenerateSignIN();
    }

    @Test(priority = 11)
    public void testCompleteSignIN() {
        getInitElements();
        homePage.completeSignIn();
        homePage.validateCompleteSignin();
    }



}
