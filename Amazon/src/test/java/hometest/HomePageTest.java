package hometest;

import common.WebAPI;
import database.Database;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class HomePageTest extends WebAPI {
    static HomePage homePage; // Reference Variable/ object of HomePage

    public static void getInitElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    public void testSearchProduct() throws InterruptedException {
        getInitElements();
        homePage.searchProduct();
        homePage.validateSearchProduct();
    }

    @Test(dataProvider = "testdata")
    public void testSearchProductFromDB(String key) throws Exception {
        getInitElements();
        homePage.searchProductFromDB(key);
    }

    @DataProvider(name = "testdata")
    public Object[] testDataFromDB() throws Exception {
        Database db = new Database();
        Object[] data = db.getUserDatafromDB().toArray();
        return data;
    }

    @Test
    public void testSearchProductSelect() throws InterruptedException {
        getInitElements();
        homePage.searchProductSelect();
        homePage.validateSearchProductSelect();
    }

    @Test
    public void testSearchProductSelectqty() throws InterruptedException {
        getInitElements();
        homePage.searchProductSelectqty();
        homePage.validateSearchProductSelectandqty();
    }

    @Test
    public void testAddToCart() throws InterruptedException {
        getInitElements();
        homePage.addToCart();
        homePage.validateAddToCart();
    }

    @Test
    public void testCheckoutItem() throws InterruptedException {
        getInitElements();
        homePage.checkout();
        homePage.validateCheckout();
    }

    @Test
    public void testFindingLinksHomePage() {
        getInitElements();
        homePage.findingLinksHomePage();
        homePage.validateFindingLinks();
    }

    @Test
    public void testDropDownItemSearch() {
        getInitElements();
        homePage.dropdownMenuItemSelectByIndex();
        homePage.validateDropdownItemSelect();
    }

    @Test
    public void testAccountsMouseHover() {
        getInitElements();
        homePage.accountsMenuHover();
        homePage.validateMenuHover();
    }

    @Test
    public void testLanguageHover() throws InterruptedException {
        getInitElements();
        homePage.languageSelect();
        homePage.validateLanguageSelect();
    }

    @Test
    public void testMenuOption() {
        getInitElements();
        homePage.menuOptionsButton();
        homePage.validateMenuOptionsButton();
    }


}
