package hometest;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageTest extends WebAPI {
    static HomePage homePage; // Reference Variable/ object of HomePage
    public static void getInitElements(){
        homePage= PageFactory.initElements(driver, HomePage.class);
    }

    @Test(priority = 1)
    public void testSearchSubmit() throws InterruptedException {
        getInitElements();
        homePage.trivagoSearch();
    }


//    @TestPending
//    public void testSearchMoreFilter() throws InterruptedException {
//        getInitElements();
//        homePage.trivagoSearchMoreFilter();
//    }
    @Test(priority = 2)
    public void testTrivagoMenu() throws InterruptedException {
        getInitElements();
        homePage.trivagoMenu();
    }
    @Test(priority = 3)
    public void testTrivagoCurrency() throws InterruptedException {
        getInitElements();
        homePage.trivagoCurrency();
    }
    @Test(priority = 4)
    public void testTrivagoLogin() throws InterruptedException {
        getInitElements();
        homePage.trivagoLogin();
    }
    @Test(priority = 5)
    public void testTrivagoCheckIn() throws InterruptedException {
        getInitElements();
        homePage.trivagoCheckIn();
    }
    @Test(priority = 6)
    public void testTrivagoCheckInOut() throws InterruptedException {
        getInitElements();
        homePage.trivagoCheckInOut();
    }
    @Test(priority = 7)
    public void testTrivagoCheckInOutRoom() throws InterruptedException {
        getInitElements();
        homePage.trivagoCheckInOutSearch();
    }
    @Test(priority = 8)
    public void testTrivagoSearchSort() throws InterruptedException {
        getInitElements();
        homePage.trivagoSearchHotelSort();
    }
    @Test(priority = 9)
    public void testTrivagoSearchScroll() throws InterruptedException {
        getInitElements();
        homePage.trivagoSearchScroll();
    }
    @Test(priority = 10)
    public void testTrivagoSearchMoreFilter() throws InterruptedException {
        getInitElements();
        homePage.trivagosearchMoreFilter();
    }
    @Test(priority = 11)
    public void testTrivagoFilterHotelFacility() throws InterruptedException {
        getInitElements();
        homePage.trivagosearchHotelFacility();
    }
    @Test(priority = 12)
    public void testTrivagoUKHotelFacility() throws InterruptedException {
        getInitElements();
        homePage.SearchUKHotelFacility();
    }
}
