package home;

import common.WebAPI;
import database.Database;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

import java.util.List;

import static webelements.HomePageWebElements.*;

public class HomePage extends WebAPI {
    @FindBy(how = How.CSS,using = shopLinksWebElements) public List<WebElement> shopLinks;
    @FindBy(how = How.CSS,using = searchBoxWebElement) public WebElement searchBox;
    @FindBy(how = How.CSS,using = searchButtonWebElement) public WebElement searchButton;
    @FindBy(xpath =artNaturalWebElement ) public WebElement artNatural;
    @FindBy(how = How.CSS,using = qtyWebElement) public WebElement qty;
    @FindBy(how = How.XPATH,using = selectQtyWebElement) public WebElement selectQty;
    @FindBy(how = How.ID,using = addToCartWebElement) public WebElement addToCart;
    @FindBy(how = How.XPATH,using = checkoutWebElement) public WebElement checkout;
    @FindBy(css = accountsMenuWebElements) public WebElement accountsMenu;
    @FindBy(id = dropdownMenuWebElement) public WebElement dropdownMenu;
    @FindBy(xpath = hoverLanguageWebElement) public WebElement hoverLanguage;
    @FindBy(xpath = espaniolRadioButonWebElement) public WebElement espaniolRadioButton;
    @FindBy(xpath = menuOptionWebElement) public WebElement menuOptions;

    public  void enterKeyWord(String keyword){
        searchBox.sendKeys(keyword);
    }
    public void clickSearchButton(){
        searchButton.click();
    }
    public void clickProduct(){
        artNatural.click();
    }
    public void clickQty(){
        qty.click();
    }
    public void doSelectQty(){
        selectQty.click();
    }
    public void clickAddToCart(){
        addToCart.click();
    }
    public void clickCheckout(){
        checkout.click();
    }
    public void accountsMenuHover(){
        mouseHover(accountsMenu);
    }
    public void dropdownMenu(int indexNumber){
        selectDropDownByIndex(dropdownMenu,indexNumber);
    }
    public void languageMouseHover(){
       mouseHover(hoverLanguage);
    }
    public void espaniolRadioButton(){
        espaniolRadioButton.click();
    }
    public void menuOptions(){
        menuOptions.click();
    }

    public void searchProduct() throws InterruptedException {
        enterKeyWord("I Phone 11 pro");
        clickSearchButton();
    }
    public void validateSearchProduct(){
        Assert.assertEquals("I Phone 11 pro","I Phone 11 pro"," Not Successful Assertion");
    }
    public void searchProductSelect() throws InterruptedException {
        enterKeyWord("Hand Sanitizer");
        clickSearchButton();
        clickProduct();
    }
    public void validateSearchProductSelect(){
        Assert.assertEquals("Hand Sanitizer","Hand Sanitizer","Not valid assertion");
    }
    public void searchProductSelectqty() throws InterruptedException {
        enterKeyWord("Hand Sanitizer");
        clickSearchButton();
        clickProduct();
        clickQty();
        doSelectQty();
    }
    public void validateSearchProductSelectandqty(){
        Assert.assertEquals("Hand Sanitizer","Hand Sanitizer","Not valid assertion");
    }
    public void addToCart() throws InterruptedException {
        enterKeyWord("Hand Sanitizer");
        clickSearchButton();
        clickProduct();
        clickAddToCart();
    }
    public void validateAddToCart(){
        String actual="Add to cart";
        Assert.assertEquals(actual,"Add to cart","not successful");
    }
    public void checkout() throws InterruptedException {
        enterKeyWord("Hand Sanitizer");
        clickSearchButton();
        clickProduct();
        checkout();
    }
    public void validateCheckout(){
        String actual="Buy Now";
        Assert.assertEquals(actual,"Buy Now","not successful");
    }

    public void findingLinksHomePage(){
        System.out.println("Number of links on top menu of HomePage: "+shopLinks.size());
        for (WebElement sl:shopLinks
             ) {
            System.out.println(sl.getText());
        }
    }
    public void validateFindingLinks(){
        String actual="Best Seller";
        Assert.assertEquals(actual,"Best Seller","not successful");
    }

    public void accountsMenuMouseHover() throws InterruptedException {
        accountsMenuHover();
        sleepFor(2);
    }
    public void validateMenuHover(){
        String actual=accountsMenu.getText();
        Assert.assertEquals(actual,"Hello, Sign in\n" +
                "Account & Lists","not successful");
    }

    public void dropdownMenuItemSelectByIndex(){
        dropdownMenu(3);
        clickSearchButton();
    }
    public void validateDropdownItemSelect(){
        String actual="";
        Assert.assertEquals(actual,"","not successful");
    }
    public void languageSelect() throws InterruptedException {
        sleepFor(5);
        languageMouseHover();
        espaniolRadioButton();
    }
    public void validateLanguageSelect(){
        String actual=hoverLanguage.getText();
        Assert.assertEquals(actual," ","not successful");
    }
    public void menuOptionsButton(){
        menuOptions();
    }
    public void validateMenuOptionsButton(){
        String actual=menuOptions.getText();
        Assert.assertEquals(actual,"","not successful");
    }
    public void searchProductFromDB(String keyword) throws Exception {
        enterKeyWord(keyword);
        clickSearchButton();
    }














}
