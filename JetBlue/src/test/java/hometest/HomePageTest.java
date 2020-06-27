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
//    @Test
//    public void testBookFlight() throws InterruptedException {
//        getInitElements();
//        homePage.bookFlight();
//    }
//    @Test(priority = 2)
//    public void testJetBlueTicket() throws InterruptedException {
//        getInitElements();
//        homePage.jetBlueTicket();
//    }
//    @Test(priority = 3)
//    public void testExploreNewyork() throws InterruptedException {
//        getInitElements();
//        homePage.exploreNewYork();
//    }
//    @Test(priority = 4)
//    public void testJetBlueFlightTracker() throws InterruptedException {
//        getInitElements();
//        homePage.jetBlueFlightTracker();
//    }
//    @Test(priority = 5)
//    public void testJetBlueSignIn() throws InterruptedException {
//        getInitElements();
//        homePage.jetBlueSignIn();
//    }
//    @Test(priority = 6)
//    public void testJetBlueDestination() throws InterruptedException {
//        getInitElements();
//        homePage.jetBlueDestination();
//    }
//    @Test(priority = 7)
//    public void testJetBlueCompanyCheck() throws InterruptedException {
//        getInitElements();
//        homePage.jetBlueCompanyCheck();
//    }
//    @Test(priority = 8)
//    public void testJetBlueTrip() throws InterruptedException {
//        getInitElements();
//        homePage.jetBlueTrip();
//    }
//    @Test(priority = 9)
//    public void testJetBlueFlightsHotel() throws InterruptedException {
//        getInitElements();
//        homePage.jetBlueFlightsHotel();
//    }
    @Test(priority = 10)
    public void testJetBlueCars() throws InterruptedException {
        getInitElements();
        homePage.jetBlueCars();
    }
}
