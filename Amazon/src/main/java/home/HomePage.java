package home;

import common.WebAPI;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.List;

import static webelements.HomePageWebElements.*;
import static webelements.HomePageWebElements.selectTelevisionsWebelement;


public class HomePage extends WebAPI {

    @FindBy(how = How.CSS,using = shopLinksWebElements) public List<WebElement> shopLinks;
    @FindBy(how = How.CSS,using = searchBoxWebElement) public WebElement searchBox;
    @FindBy(how = How.CSS,using = searchButtonWebElement) public WebElement searchButton;
     @FindBy(how = How.CSS,using = qtyWebElement) public WebElement qty;
     @FindBy(how = How.ID,using = addToCartWebElement) public WebElement addToCart;
    @FindBy(how = How.ID,using = checkoutWebElement) public WebElement checkout;
    @FindBy(how = How.CSS,using = iphoneTextWebElement) public WebElement iphonetext;
    @FindBy(how = How.CSS,using = wipesTextWebElement) public WebElement wipestext;
    @FindBy(how = How.CSS,using = handGlovesCartTextWebElement) public WebElement handGlovesCarttext;
    @FindBy(how = How.LINK_TEXT, using = searchTodaysDealWebelement) public WebElement todaysDeal;
    @FindBy(how = How.CSS, using = TodaysDealTextWebelement) public WebElement todaysDealText;
    @FindBy(how=How.XPATH,using = bestSellerWebElement) public WebElement bestSeller;
    @FindBy(how=How.CSS,using = bestSellerTextWebElement) public WebElement bestSellerText;
    @FindBy(how = How.CSS,using = bestSellerBooksWebElement) public WebElement bestSellerBooks;
    @FindBy(how = How.CSS,using = bestSellerBooksTextWebElement) public WebElement bestSellerBooksText;
    @FindBy(how = How.CSS,using = dropDownAppliancesWebElement) public WebElement appliancesText;
    @FindBy(how = How.CSS, using = moviesTvWebElement) public WebElement moviesTv ;
    @FindBy(how = How.XPATH, using = selectDisposableGlovesWebelement) public WebElement disposableGloves;
    @FindBy(how = How.LINK_TEXT, using = searchFindAGiftWebelement) public WebElement findAGift;
    @FindBy(how = How.LINK_TEXT, using = searchGiftForKidsWebelement) public WebElement giftForKids;
    @FindBy(how = How.CSS, using = searchGiftForKidsTextWebelement) public WebElement giftForKidsText;
    @FindBy(how = How.CSS, using = accountListWebelement) public WebElement accountList;
    @FindBy(how = How.LINK_TEXT, using = creatAListWebelement) public WebElement createAList;
    @FindBy(how = How.CSS, using = creatAListTextWebelement) public WebElement createAListText;
    @FindBy(how = How.CSS, using = mainmenuWebelement) public WebElement mainmenu;
    @FindBy(how = How.LINK_TEXT, using = selectElectronicsWebelement) public WebElement electronics;
    @FindBy(how = How.LINK_TEXT, using = selectTvVideoWebelement) public WebElement tvVideo;
    @FindBy(how = How.LINK_TEXT, using = selectTelevisionsWebelement) public WebElement television;
    @FindBy(how = How.XPATH, using = televisionsTextWebelement) public WebElement televisionText;
    @FindBy(how = How.LINK_TEXT, using = newReleasesWebElement) public WebElement newReleases;
    @FindBy(how = How.CSS, using = newReleasesTextWebElement) public WebElement newReleasesText;
    @FindBy(how = How.CSS, using = accountListsTextWebElement) public WebElement accountListsText;
    @FindBy(how = How.CSS, using = helloFrameWebElement) public WebElement helloFrame;
    @FindBy(how = How.CSS, using = helloWebElement) public WebElement hello;
    @FindBy(how = How.CSS, using = zipWebElement) public WebElement zip;
    @FindBy(how = How.CSS, using = doneWebElement) public WebElement done;
    @FindBy(how = How.CSS, using = deliverTextWebElement) public WebElement deliverText;

    public void enterKeyWord(String keyword) { searchBox.sendKeys(keyword); }
    public void clickSearchButton() { searchButton.click(); }
    public void clickAddToCart(){ addToCart.click(); }
    public void todaysDealLink(){ todaysDeal.click(); }
    public void bestSellerLink(){ bestSeller.click(); }
    public void bestSellerBooksLink(){ bestSellerBooks.click(); }
    public void amazonTodaysDeal() {
        getWindowsMaximize();
        todaysDealLink();
    }
    public void validateTodaysDeal() { validateTestCase(todaysDeal,"Today's Deals"); }
    public void bestSellerProduct() throws InterruptedException {
        getWindowsMaximize();
        bestSellerLink();
    }
    public void validateBestSellerProduct(){validateTestCase(bestSellerText,"Amazon Best Sellers");}
    public void checkBestSellerBooks() throws InterruptedException {
        bestSellerLink();
        bestSellerBooksLink();
    }
    public void validateBestSellerBooks(){validateTestCase(bestSellerBooksText,"Best Sellers in Books");}
    public void searchProduct() throws InterruptedException {
        enterKeyWord("iPhone 11 pro");
        clickSearchButton();
    }
    public void validateSearchProduct(){
        String actualResult=iphonetext.getText();
        Assert.assertEquals(actualResult,"\"iPhone 11 pro\"","iPhone is not displayed");
    }
    public void AmazonAccountLists() throws InterruptedException {
        getWindowsMaximize();
        mouseHoverByCSS("#nav-link-accountList");
    }
    public void createAList() throws InterruptedException {
        getWindowsMaximize();
        mouseHoverByCSS("#nav-link-accountList");
        createAList.click();
    }
    public void validateCreateAList(){ validateTestCase(createAListText,"Your Lists");}
    public void validateAccountLists(){ validateTestCase(accountListsText,"Your Account");}
    public void productSearch() throws InterruptedException {
        enterKeyWord("disinfectant wipes");
        clickSearchButton();
    }
    public void validateProductSearch(){validateTestCase(wipestext,"\"disinfectant wipes\"");}
    public void productAddedToCart() throws InterruptedException {
        getWindowsMaximize();
        enterKeyWord("hand gloves disposable");
        clickSearchButton();
        disposableGloves.click();
        clickAddToCart();
    }
    public void validateProductAddedToCart(){ validateTestCase(handGlovesCarttext,"Added to Cart");}
    public void AmazonAlldeptDropDown() throws InterruptedException {
        getWindowsMaximize();
        dropDownByCSS("#searchDropdownBox","Appliances");
        sleepFor(2);
    }
    public void validateDropDown(){ validateTestCase(appliancesText,"Appliances");  }
    public void amazonProductMenuBar() throws InterruptedException {
        getWindowsMaximize();
        mainmenu.click();
        electronics.click();
        sleepFor(2);
        tvVideo.click();
        television.click();
    }
    public void validateProductMenuBar(){ validateTestCase(televisionText,"Top rated");}
    public void amazonTryPrime() throws InterruptedException {
        mouseHoverByXpath("//a[@id='nav-link-prime']");
        sleepFor(5);
    }
    public void selectNewReleases() throws InterruptedException {
        getWindowsMaximize();
        newReleases.click();
        moviesTv.click();
    }
    public void validateNewReleaseMovieTv(){ validateTestCase(newReleasesText,"New Releases in Movies & TV");}
    public void findGift(){
        findAGift.click();
        giftForKids.click();
    }
    public void validateFindGift(){ validateTestCase(giftForKidsText,"GIFTS FOR KIDS 9-11");}
    public void deliveryTo(){
        hello.click();
        zip.sendKeys("23434");
        done.click();
    }
    public void validateDeliverTo(){ validateTestCase(deliverText,"Select your address");}

    public void searchProductFromDB(String keyword) throws Exception {
        enterKeyWord(keyword);
        clickSearchButton();
    }
}
