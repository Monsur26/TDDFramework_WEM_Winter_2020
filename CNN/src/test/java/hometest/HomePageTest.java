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

//    @Test
//    public void loginButtonWebElement() throws InterruptedException {
//        getInitElements();
//        homepage.USWebElement();
//    }
}