package hometest;
import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TrivagoHomePageTest extends WebAPI {
    static HomePage homePage;
    public static void getInitElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }


    @Test(priority = 1)
    public void languageWebElement() throws InterruptedException {
        getInitElements();
        homePage.clickLanguage();
    }
    @Test(priority = 2)
    public void currencyWebElement() throws InterruptedException {
        getInitElements();
        homePage.clickCurrency();
    }
    @Test(priority = 3)
    public void menuWebElement() throws InterruptedException {
        getInitElements();
        homePage.mouseHoverMenu();
    }
    @Test(priority = 4)
    public void logInWebElement() throws InterruptedException {
        getInitElements();
        homePage.clickLogIn();
    }
    @Test(priority = 5)
    public void searchWebElement() throws InterruptedException {
        getInitElements();
        homePage.searchButton();
    }
    @Test(priority = 6)
    public void searchClickWebElement() throws InterruptedException {
        getInitElements();
        homePage.searchClickButton();
    }
    @Test(priority = 7)
    public void searchClickWebElemen1() throws InterruptedException {
        getInitElements();
        homePage.searchPlace();
    }
    @Test(priority = 8)
    public void checkInWebElement() throws InterruptedException {
        getInitElements();
        homePage.CheckInSelection();
    }
    @Test(priority = 9)
    public void checkOutWebElement() throws InterruptedException {
        getInitElements();
        homePage.CheckOutSelection();
    }
    @Test(priority = 10)
    public void roomWebElement() throws InterruptedException {
        getInitElements();
        homePage.roomSelection();
    }
    @Test(priority = 11)
    public void searchPlWebElement() throws InterruptedException {
        getInitElements();
        homePage.searchPlBoston();

    }
}
