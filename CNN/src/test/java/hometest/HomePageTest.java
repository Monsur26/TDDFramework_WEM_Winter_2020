package hometest;
import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageTest extends WebAPI {
    static HomePage homepage;

    public static void getInitElements() {
        homepage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    public void loginButtonWebElement() throws InterruptedException {
        getInitElements();
        homepage.clickUSWebElement();
    }

    @Test
    public void editionWebElement() throws InterruptedException {
        getInitElements();
        homepage.clickEdition();
    }
    @Test
    public void videoWebElement() throws InterruptedException {
        getInitElements();
        homepage.clickVideo();
    }
    @Test
    public void travelWebElement() throws InterruptedException {
        getInitElements();
        homepage.clickTravel();
    }
    @Test
    public void enterteinmentWebElement() throws InterruptedException {
        getInitElements();
        homepage.clickEnterteinment();
    }
    @Test
    public void healthWebElement() throws InterruptedException {
        getInitElements();
        homepage.clickHealth();
    }
    @Test
    public void politicsWebElement() throws InterruptedException {
        getInitElements();
        homepage.clickPolitics();
    }
    @Test
    public void opinionWebElement() throws InterruptedException {
        getInitElements();
        homepage.clickOpinion();
    }
    @Test
    public void stylesWebElement() throws InterruptedException {
        getInitElements();
        homepage.clickStyles();
    }
    @Test
    public void accountWebElement() throws InterruptedException {
        getInitElements();
        homepage.clickAccount();
    }
}