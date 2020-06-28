package hometest;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageTest extends WebAPI {
    static HomePage homePage;
    public static void getInitElement() {homePage= PageFactory.initElements(driver,HomePage.class);
    }
   @Test(priority = 1)
    public void testTopMenu()throws InterruptedException{
        getInitElement();
        homePage.menuTop();
    }
    @Test(priority = 2)
    public void testLogMenu()throws InterruptedException{
        getInitElement();
        homePage.menuLog();
    }
    @Test(priority = 3)
    public void testServiceMenu()throws InterruptedException{
        getInitElement();
        homePage.menuService();
    }
    @Test(priority = 4)
    public void testExploreAuto()throws InterruptedException{
        getInitElement();
        homePage.autoExplore();
    }
    @Test(priority = 5)
    public void testDiscountButton()throws InterruptedException{
        getInitElement();
        homePage.buttonDiscount();
    }
    @Test(priority = 6)
    public void testCoverageButton()throws InterruptedException{
        getInitElement();
        homePage.buttonCoverage();
    }
    @Test(priority = 7)
    public void testServiceQuick()throws InterruptedException{
        getInitElement();
        homePage.serviceQuick();
    }
    @Test(priority = 8)
    public void testSearchBar()throws InterruptedException{
        getInitElement();
        homePage.barSearch();
    }

}
