package hometest;
import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomeTest7 extends WebAPI {
    static HomePage homePage; // Reference Variable/ object of HomePage


    public static void getInitElements(){
        homePage= PageFactory.initElements(driver, HomePage.class);
    }
    @Test
    public void testUser() throws InterruptedException {
        getInitElements();
        homePage.useraccdetails();
    }
}