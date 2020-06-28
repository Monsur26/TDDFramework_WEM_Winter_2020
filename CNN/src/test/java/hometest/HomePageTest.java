package hometest;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utility.ReadExcelFile;

public class HomePageTest extends WebAPI {
    static HomePage homePage;

    public static void getInitElements(){
        homePage= PageFactory.initElements(driver,HomePage.class);
    }
/*
    @Test
    public void testTopBanner() throws InterruptedException {
        getInitElements();
        homePage.bannerSelect();
    }*/
    @Test(dataProvider = "testdata")
    public void testUser(String user, String pass) throws InterruptedException {
        getInitElements();
        homePage.userACCFromExcel(user, pass);

    }

    @DataProvider(name = "testdata")
    public Object[][] testDataExample() {
        ReadExcelFile configuration = new ReadExcelFile("Data/data.xlsx");
        int rows = configuration.getRowCount(0);
        Object[][] signin_credentials = new Object[rows][2];

        for (int i = 0; i < rows; i++) {
            signin_credentials[i][0] = configuration.getData(0, i, 0);
            signin_credentials[i][1] = configuration.getData(0, i, 1);
        }
        return signin_credentials;
    }

}
