package hometest;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageTest extends WebAPI {
    static HomePage homePage;
    public static void getInitElement() {homePage= PageFactory.initElements(driver,HomePage.class);
    }
   @Test
    public void testTopMenu()throws InterruptedException{
        getInitElement();
        homePage.menuTop();
    }
    @Test
    public void testLogMenu()throws InterruptedException{
        getInitElement();
        homePage.menuLog();
    }
    @Test
    public void testServiceMenu()throws InterruptedException{
        getInitElement();
        homePage.menuService();
    }
    @Test
    public void testExploreAuto()throws InterruptedException{
        getInitElement();
        homePage.autoExplore();
    }
    @Test
    public void testDiscountButton()throws InterruptedException{
        getInitElement();
        homePage.buttonDiscount();
    }
    @Test
    public void testCoverageButton()throws InterruptedException{
        getInitElement();
        homePage.buttonCoverage();
    }
    @Test
    public void testServiceQuick()throws InterruptedException{
        getInitElement();
        homePage.serviceQuick();
    }
    @Test
    public void testSearchBar()throws InterruptedException{
        getInitElement();
        homePage.barSearch();
    }
    @Test
    public void testSearchButton()throws InterruptedException{
        getInitElement();
        homePage.buttonsearch();
    }

}
