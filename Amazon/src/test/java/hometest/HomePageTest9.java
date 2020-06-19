package hometest;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageTest9 extends WebAPI {
    static HomePage homePage;
    public static void getInitElement(){homePage= PageFactory.initElements(driver,HomePage.class); }

    @Test
    public void testLanguageHover() throws InterruptedException {
        getInitElement();
        homePage.languageSelect();
        homePage.validateLanguageSelect();
    }
}
