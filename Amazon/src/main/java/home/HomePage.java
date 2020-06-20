package home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

import static webelements.HomePageWebElements.*;
import static webelements.HomePageWebElements.selectTelevisionsWebelement;


public class HomePage extends WebAPI {

    @FindBy(how = How.CSS,using = shopLinksWebElements) public List<WebElement> shopLinks;
    @FindBy(how = How.CSS,using = searchBoxWebElement) public WebElement searchBox;
    @FindBy(how = How.CSS,using = searchButtonWebElement) public WebElement searchButton;
    @FindBy(css =artNaturalWebElement ) public WebElement artNatural;
    @FindBy(how = How.CSS,using = qtyWebElement) public WebElement qty;
    @FindBy(how = How.XPATH,using = selectQtyWebElement) public WebElement selectQty;
    @FindBy(how = How.ID,using = addToCartWebElement) public WebElement addToCart;
    @FindBy(how = How.ID,using = checkoutWebElement) public WebElement checkout;
    @FindBy(how = How.LINK_TEXT, using = searchTodaysDealWebelement) public WebElement todaysDeal;
    @FindBy(how=How.XPATH,using = bestSellerWebElement) public WebElement bestSeller;
    @FindBy(how = How.CSS,using = bestSellerBooksWebElement) public WebElement bestSellerBooks;
    @FindBy(how = How.LINK_TEXT, using = moviesTvWebElement) public WebElement moviesTv ;
    @FindBy(how = How.XPATH, using = selectLysolWebElement) public WebElement lysol;
    @FindBy(how = How.XPATH, using = selectDisposableGlovesWebelement) public WebElement disposableGloves;
    @FindBy(how = How.LINK_TEXT, using = searchFindAGiftWebelement) public WebElement findAGift;
    @FindBy(how = How.LINK_TEXT, using = searchGiftForKidsWebelement) public WebElement giftForKids;
    @FindBy(how = How.CSS, using = accountListWebelement) public WebElement accountList;
    @FindBy(how = How.CSS, using = mainmenuWebelement) public WebElement mainmenu;
    @FindBy(how = How.LINK_TEXT, using = selectElectronicsWebelement) public WebElement electronics;
    @FindBy(how = How.LINK_TEXT, using = selectTvVideoWebelement) public WebElement tvVideo;
    @FindBy(how = How.LINK_TEXT, using = selectTelevisionsWebelement) public WebElement television;
    @FindBy(how = How.LINK_TEXT, using = newReleasesWebElement) public WebElement newReleases;

    public void enterKeyWord(String keyword) { searchBox.sendKeys(keyword); }
    public void clickSearchButton() { searchButton.click(); }
    public void clickProduct(){ artNatural.click(); }
    public void clickQty(){ qty.click(); }
    public void doSelectQty(){ selectQty.click(); }
    public void clickAddToCart(){ addToCart.click(); }
    public void clickCheckout(){ checkout.click(); }
    public void todaysDealLink(){ todaysDeal.click(); }
    public void bestSellerLink(){ bestSeller.click(); }
    public void bestSellerBooksLink(){ bestSellerBooks.click(); }
    public void amazonTodaysDeal() throws InterruptedException {
        getWindowsMaximize();
        todaysDealLink();
        sleepFor(2);
    }
    public void bestSellerProduct() throws InterruptedException {
        getWindowsMaximize();
        bestSellerLink();
        sleepFor(2);
    }
    public void checkBestSellerBooks() throws InterruptedException {
        bestSellerLink();
        bestSellerBooksLink();
        sleepFor(2);
    }
    public void searchProduct() throws InterruptedException {
       // setUp("windows","chrome","https://www.amazon.com/");
        enterKeyWord("I Phone 11 pro");
        sleepFor(3);
        clickSearchButton();
        sleepFor(3);
        cleanUp();
    }
    public void AmazonAccountLists() throws InterruptedException {
        getWindowsMaximize();
        sleepFor(3);
        mouseHoverByCSS("#nav-link-accountList");
        sleepFor(5);
    }
    public void productSearch() throws InterruptedException {
        getWindowsMaximize();
        enterKeyWord("disinfectant wipes");
        sleepFor(3);
        clickSearchButton();
        sleepFor(3);
        cleanUp();
    }
    public void productAddedToCart() throws InterruptedException {
        getWindowsMaximize();
        enterKeyWord("hand gloves disposable");
        sleepFor(2);
        clickSearchButton();
        sleepFor(2);
        disposableGloves.click();
        sleepFor(3);
        clickAddToCart();
    }
    public void AmazonAlldeptDropDown() throws InterruptedException {
        getWindowsMaximize();
        sleepFor(5);
        dropDownByCSS("#searchDropdownBox","Appliances");
        sleepFor(2);
    }
    public void amazonProductMenuBar() throws InterruptedException {
        getWindowsMaximize();
        sleepFor(2);
        mainmenu.click();
        sleepFor(2);
        electronics.click();
        sleepFor(2);
        tvVideo.click();
        television.click();
    }
    public void amazonTryPrime() throws InterruptedException {
        getWindowsMaximize();
        sleepFor(2);
        mouseHoverByXpath("//a[@id='nav-link-prime']");
        sleepFor(5);
    }
    public void selectNewReleases() throws InterruptedException {
        getWindowsMaximize();
        sleepFor(2);
        newReleases.click();
        sleepFor(5);
    }

    public void validateSearchProduct(){

    }
}
