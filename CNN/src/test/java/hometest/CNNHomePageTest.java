package hometest;
import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class CNNHomePageTest extends WebAPI {
    static HomePage homePage;

    public static void getInitElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test(priority = 1)
    public void testTopBanner() throws InterruptedException {
        getInitElements();
        homePage.bannerSelect();
    }

    @Test(priority = 2)
    public void testLogo() throws InterruptedException {
        getInitElements();
        homePage.LogoSelect();
    }
    @Test(priority = 3)
    public void loginButtonWebElement() {
        getInitElements();
        homePage.clickUSWebElement();
    }

    @Test(priority = 4)
    public void editionWebElement()  {
        getInitElements();
        homePage.clickEdition();
    }
    @Test(priority = 5)
    public void videoWebElement()  {
        getInitElements();
       homePage.clickVideo();
    }
    @Test(priority = 6)
    public void travelWebElement()  {
        getInitElements();
       homePage.clickTravel();
    }
    @Test(priority = 7)
    public void enterteinmentWebElement() {
        getInitElements();
       homePage.clickEnterteinment();
    }
    @Test(priority = 8)
    public void healthWebElement()  {
        getInitElements();
       homePage.clickHealth();
    }
    @Test(priority = 9)
    public void politicsWebElement()  {
        getInitElements();
        homePage.clickPolitics();
    }
    @Test(priority = 10)
    public void opinionWebElement()  {
        getInitElements();
        homePage.clickOpinion();
    }
    @Test(priority = 11)
    public void stylesWebElement()  {
        getInitElements();
        homePage.clickStyles();
    }
    @Test(priority = 12)
    public void accountWebElement()  {
        getInitElements();
        homePage.clickAccount();
    }



}
