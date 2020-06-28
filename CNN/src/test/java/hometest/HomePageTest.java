package hometest;

import common.WebAPI;
import datasource.ReadExcelFile;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.*;

public class HomePageTest extends WebAPI {
    static HomePage homePage;

    public static void getInitElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test(dataProvider = "testdata")
    public void testUser(String user, String pass) throws InterruptedException {
        getInitElements();
        homePage.userACCFromExcel(user, pass);
        homePage.validatingCNNLogo();
    }

    @DataProvider(name = "testdata")
    public Object[][] testDataExample() {
        ReadExcelFile configuration = new ReadExcelFile("Data/CNNData.xlsx");
        int rows = configuration.getRowCount(0);
        Object[][] signin_credentials = new Object[rows][2];

        for (int i = 0; i < rows; i++) {
            signin_credentials[i][0] = configuration.getData(0, i, 0);
            signin_credentials[i][1] = configuration.getData(0, i, 1);
        }
        return signin_credentials;
    }

    @Test
    public void menuSerachTest() throws InterruptedException {
        getInitElements();
        homePage.menuSerach();
        homePage.windowScroll();
    }

    @Test
    public void testmenuSerachforitem() throws InterruptedException {
        getInitElements();
        homePage.menuSerachforitem();
        homePage.windowScroll();
    }

    @Test
    public void testmenuSerachForitemAndClick() throws InterruptedException {
        getInitElements();
        homePage.menuSerachForitemAndClick();
        homePage.windowScroll();
    }

    @Test
    public void TestUSTopNews() throws InterruptedException {
        getInitElements();
        homePage.USTopNewsOfToday();
        homePage.validatingCNNLogo();
    }

    @Test
    public void testVideoLinksButton() throws InterruptedException {
        getInitElements();
        homePage.VideoLinksButton();
        homePage.validatingCNNLogo();
    }

    @Test
    public void testhoverACC() {
        getInitElements();
        homePage.hoverToUserAcc();
        homePage.validatingCNNLogo();
    }

    @Test
    public void testUser() throws InterruptedException {
        getInitElements();
        homePage.useraccdetails();
        homePage.validatingCNNLogo();
    }

    @Test
    public void testWindowScroll() {
        getInitElements();
        homePage.windowScroll();
        homePage.validatingCNNLogo();
    }
}
