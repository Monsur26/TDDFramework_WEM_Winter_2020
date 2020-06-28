package hometest;
import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class JetBlueHomePageTest extends WebAPI{
    static HomePage homePage;
    public static void getInitElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test(priority = 1)
    public void bookWebElement() throws InterruptedException {
        getInitElements();
        homePage.bookSelection();
    }
    @Test(priority = 2)
    public void logInWebElement() throws InterruptedException {
        getInitElements();
        homePage.clickLogIn();
    }
    @Test(priority = 3)
    public void myTripsWebElement() throws InterruptedException {
        getInitElements();
        homePage.mouseHoverMyTrips();
    }
    @Test(priority = 4)
    public void myTripsClickWebElement() throws InterruptedException {
        getInitElements();
        homePage.clickMyTrips();
    }
    @Test(priority = 5)
    public void signInEmailWebElement() throws InterruptedException {
        getInitElements();
        homePage.logIn();
    }
    @Test(priority = 6)
    public void exploreWebElement() throws InterruptedException {
        getInitElements();
        homePage.mouseHoverExplore();
    }

    @Test(priority = 7)
    public void findFlightsWebElement() throws InterruptedException {
        getInitElements();
        homePage.continueToFindFlights();
    }
    @Test(priority = 8)
    public void firtNameWebElement() throws InterruptedException {
        getInitElements();
        homePage.firstName();
    }
    @Test(priority = 9)
    public void lastNameWebElement() throws InterruptedException {
        getInitElements();
        homePage.lastName();
    }
    @Test(priority = 10)
    public void confirmationCodeWebElement() throws InterruptedException {
        getInitElements();
        homePage.putConfirmation();
    }
}
