package hometest;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class PageTest3 extends WebAPI {
    static HomePage homePage ;
    public static void getInitElements() { homePage = PageFactory.initElements(driver,HomePage.class); }
    @Test
    public void testServiceMenu () throws InterruptedException {
        getInitElements();
        homePage.menuService();
    }

}
