package hometest;
import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TDBankHomePageTest extends WebAPI {
    static HomePage homepage;
    public static void getInitElements(){
        homepage= PageFactory.initElements(driver, HomePage.class);
    }
    @Test(priority = 1)
    public void loginButtonWebElement() throws InterruptedException {
        getInitElements();
        homepage.clickOnLogin();
    }
    @Test(priority = 2)
    public void loginclickWebElement() throws InterruptedException {
        getInitElements();
        homepage.clickLoginButton();
    }
    @Test(priority = 3)
    public void smallBusinessWebElement() throws InterruptedException {
        getInitElements();
        homepage.clickSmallBusiness();
    }
    @Test(priority = 4)
    public void investingWebElement()  {
        getInitElements();
        homepage.investing();
    }
    @Test(priority = 5)
    public void productWebElement() throws InterruptedException {
        getInitElements();
        homepage.clickProduct();
    }
    @Test(priority = 6)
    public void findUsWebElement() throws InterruptedException {
        getInitElements();
        homepage.clickFindUs();
    }
    @Test(priority = 7)
    public void searchWebElement()  {
        getInitElements();
        homepage.clickSearch();
    }
    @Test(priority = 8)
    public void servicesMHWebElement() throws InterruptedException {
        getInitElements();
        homepage.mouseHoverServices();
    }
    @Test(priority = 9)
    public void productMHWebElement() throws InterruptedException {
        getInitElements();
        homepage.mouseHoverProduct();
    }
    @Test(priority = 10)
    public void logInMHWebElement() throws InterruptedException {
        getInitElements();
        homepage.mouseHoverLogIn();
    }

    @Test(priority = 11)
    public void searchMHWebElement() throws InterruptedException {
        getInitElements();
        homepage.mouseHoverSearch();
    }
    @Test(priority = 12)
    public void learnMoreMHWebElement() throws InterruptedException {
        getInitElements();
        homepage.mouseHoverLearnMore();
    }

    @Test(priority = 13)
    public void flgWebElement()  {
        getInitElements();
        homepage.clickOnFlag();
    }
    @Test(priority = 14)
    public void helpWebElement() throws InterruptedException {
        getInitElements();
        homepage.clickHelp();
    }






}
