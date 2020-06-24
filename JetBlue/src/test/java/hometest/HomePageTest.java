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

    @Test
    public void bookWebElement() throws InterruptedException {
        getInitElements();
        homePage.bookSelection();
    }
    @Test
    public void logInWebElement() throws InterruptedException {
        getInitElements();
        homePage.clickLogIn();
    }
    @Test
    public void myTripsWebElement() throws InterruptedException {
        getInitElements();
        homePage.mouseHoverMyTrips();
    }
    @Test
    public void myTripsClickWebElement() throws InterruptedException {
        getInitElements();
        homePage.clickMyTrips();
    }
    @Test
    public void signInEmailWebElement() throws InterruptedException {
        getInitElements();
        homePage.logIn();
    }
    @Test
    public void exploreWebElement() throws InterruptedException {
        getInitElements();
        homePage.mouseHoverExplore();
    }
    @Test
    public void exploreLAWebElement() throws InterruptedException {
        getInitElements();
        homePage.exploreLA();
    }


}
