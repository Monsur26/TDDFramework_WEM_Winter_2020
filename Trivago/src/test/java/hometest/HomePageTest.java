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
    public void testMenuHoverAndSelect() {
        getInitElements();
        homePage.menuHoverAndSelect();
        homePage.validationMenuHoverAndSelect();
    }

    @Test(priority = 2)
    public void testDropDownUSD() throws InterruptedException {
        getInitElements();
        homePage.dropDownUSD();
        homePage.validateUSDDropdown();
    }

    @Test(priority = 3)
    public void testDropDownBottom() {
        getInitElements();
        homePage.dropDownBottom();
        homePage.validateDropdownBottom();
    }

    @Test(priority = 4)
    public void testArrowSlide() {
        getInitElements();
        homePage.arrowSlide();
        homePage.validateArrowSlide();
    }

    @Test(priority = 5)
    public void testEmailSubscription() {
        getInitElements();
        homePage.emailSubscription();
        homePage.validateEmailSubscription();
    }

    @Test(priority = 6)
    public void testCheckin() {
        getInitElements();
        homePage.checkin();
        homePage.validateCheckin();
    }

    @Test(priority = 7)
    public void testCheckout() {
        getInitElements();
        homePage.checkout();
        homePage.validateCheckout();
    }

    @Test(priority = 8)
    public void testRoomDetail() {
        getInitElements();
        homePage.roomDetail();
        homePage.validateRoomDetail();
    }

    @Test(priority = 9)
    public void testCompleteSearch() {
        getInitElements();
        homePage.completeBookingSearch();
        homePage.validateCompleteBookingSearch();
    }

    @Test(priority = 10)
    public void testTrivagoInstragramPage() throws InterruptedException {
        getInitElements();
        homePage.trivagoInstagramPage();
        homePage.validateTrivagoInstagramPage();
    }
}
