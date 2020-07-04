package hometest;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utility.Database;

public class HomePageTestDB extends WebAPI {

    static HomePage homePage; // Reference Variable/ object of HomePage

    public static void getInitElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }


    @Test(dataProvider = "testdata")
    public void testSearchProductFromDB(String key) throws Exception {
        getInitElements();
        homePage.searchProductFromDB(key);
    }
    @DataProvider(name = "testdata")
    public Object[] testDataFromDB() throws Exception {
        Database db=new Database();
        Object[] data=db.getUserDatafromDB().toArray();
        return data;
    }

}
