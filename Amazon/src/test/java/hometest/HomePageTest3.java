package hometest;
import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageTest3 extends WebAPI {
    static HomePage homePage;
    public static void getInitElements(){
        homePage= PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    public void testSearchProductSelectqty() throws InterruptedException {
        getInitElements();
        homePage.searchProductSelectqty();
        homePage.validateSearchProductSelectandqty();
    }
}
