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
    @Test
    public void testGetTitle() throws InterruptedException {
        getInitElements();
        homePage.tryToBookFlight();
    }
    @Test
    public void testSearchFlight() throws InterruptedException {
        getInitElements();
        homePage.searchflight();
    }
    @Test
    public void testTripOption() throws InterruptedException {
        getInitElements();
        homePage.tripOption();
    }
    @Test
    public void testCheckBoxTBPoint() throws InterruptedException {
        getInitElements();
        homePage.setCheckBoxUseTBPoint();
    }
    @Test
    public void TestExplore(){
        getInitElements();
        homePage.setExplore();
    }
    @Test
    public void testFightsNHotel() throws InterruptedException {
        getInitElements();
        homePage.setFlightsNHotel();
    }
    @Test
    public void testTravelInfo() throws InterruptedException {
        getInitElements();
        homePage.setTravelInfo();
    }
    @Test
    public void testJoinUs() throws InterruptedException {
        getInitElements();
        homePage.setJoinUs();
    }
    @Test
    public void testSetRegion() throws InterruptedException {
        getInitElements();
        homePage.setRegion();
    }
    @Test
    public void testExploreDestination() throws InterruptedException {
        getInitElements();
        homePage.exploreDestination();
    }
    @Test
    public void testTravelAlerts() throws InterruptedException {
        getInitElements();
        homePage.travelAterls();
    }
    @Test
    public void testVacationDeals() throws InterruptedException {
        getInitElements();
        homePage.vacationDeals();
    }

}
