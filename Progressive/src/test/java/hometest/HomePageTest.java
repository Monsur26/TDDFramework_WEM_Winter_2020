package hometest;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utility.ReadExcelFile;

public class HomePageTest extends WebAPI {
    static HomePage homePage;

    public static void getInitElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test(priority = 1)
    public void testClickExploreButton() throws InterruptedException {
        getInitElements();
        homePage.clickExploreButton();
        homePage.validateExploreButton();
    }

    @Test(priority = 2)
    public void testClickClaimButton() throws InterruptedException {
        getInitElements();
        homePage.clickClaimButton();
        homePage.validateClaimButton();
    }

    @Test(priority = 3)
    public void testClickAnswersButton() throws InterruptedException {
        getInitElements();
        homePage.clickAnswersButton();
        homePage.validateAnswersButton();
    }

    @Test(priority = 4)
    public void testPopUpClose() {
        getInitElements();
        homePage.popUpClose();
        homePage.validatePopUp();
    }

    @Test(priority = 5)
    public void testSearchingItem() {
        getInitElements();
        homePage.searchingItem();
        homePage.validateSearching();
    }

    @Test(priority = 6)
    public void testLogin() {
        getInitElements();
        homePage.enterLoginPage();
        homePage.validatelogin();
    }

    @Test(priority = 6)
    public void testLoginCredentials() {
        getInitElements();
        homePage.LoginInfo();
        homePage.validateLoginCredential();
    }

    @Test(priority = 7)
    public void testIteamSearching() {
        getInitElements();
        homePage.itemsSearch();
        homePage.validateItemSearch();
    }

    @Test(priority = 8)
    public void testScrolling() {
        getInitElements();
        homePage.scrollingDownHomePage();
        homePage.validateScrollingDown();
    }

    @Test(priority = 9)
    public void testDragnDrop() {
        getInitElements();
        homePage.dragAndDropLogo();
        homePage.validateDragnDrop();
    }

    @Test(dataProvider = "testdata")
    public void testLoginFromExcel(String user, String pass) {
        getInitElements();
        homePage.LoginFromExcelData(user, pass);
        homePage.validateExcel();
    }

    @DataProvider(name = "testdata")
    public Object[][] testDataExample() {
        ReadExcelFile configuration = new ReadExcelFile("Data/Progressive.xlsx");
        int rows = configuration.getRowCount(0);
        Object[][] signin_credentials = new Object[rows][2];

        for (int i = 0; i < rows; i++) {
            signin_credentials[i][0] = configuration.getData(0, i, 0);
            signin_credentials[i][1] = configuration.getData(0, i, 1);
        }
        return signin_credentials;
    }


}
