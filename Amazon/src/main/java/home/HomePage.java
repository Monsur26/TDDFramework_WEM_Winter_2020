package home;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;
import java.util.List;

import static webelements.HomePageWebElements.*;


public class HomePage extends WebAPI {



//    @FindBy(css=shopLinksWebElements) public List<WebElement> shopLinks;
    @FindBy(how = How.CSS,using = shopLinksWebElements) public List<WebElement> shopLinks;

    // Page Objects Design Pattern/Page object Model(POM)
    @FindBy(how = How.CSS,using = searchBoxWebElement) public WebElement searchBox;
    @FindBy(how = How.CSS,using = searchButtonWebElement) public WebElement searchButton;
    //@FindBy(how = How.XPATH,using = artNaturalWebElement) public WebElement artNatural;
    @FindBy(css =artNaturalWebElement ) public WebElement artNatural;
    @FindBy(how = How.CSS,using = qtyWebElement) public WebElement qty;
    @FindBy(how = How.XPATH,using = selectQtyWebElement) public WebElement selectQty;
    @FindBy(how = How.ID,using = addToCartWebElement) public WebElement addToCart;
    @FindBy(how = How.ID,using = checkoutWebElement) public WebElement checkout;

    //Nadim
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Pringles Potato Crisps Chips, Flavored 15 Count Va')]")
    public WebElement leChips;
    @FindBy(how = How.XPATH, using = "//a[@id='nav-hamburger-menu']")
    public WebElement amazonMainMenuDropDown;
    @FindBy(how = How.XPATH, using = "//div[@id='hmenu-container']//li[2]//a[1]")
    public WebElement amazonPrimeVideo;
    @FindBy(how = How.XPATH, using = "//ul[@class='hmenu hmenu-visible hmenu-translateX']//li[3]//a[1]")
    public WebElement amazonActualPrimeVideo;
    @FindBy(how = How.XPATH, using = "//a[@id='nav-link-accountList']")
    public WebElement accountAndLists;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Your Account')]")
    public WebElement accountAndListsYourAccount;


    // Steps:1: // Enter keyword in search box
    public  void enterKeyWord(String keyword){
        // Enter keyword in search box
        searchBox.sendKeys(keyword);
    }
    // Steps:2:
    public void clickSearchButton(){
        // Click searchButton
        searchButton.click();
    }

    // Steps:3:
    public void clickProduct(){
        // Click Product
        artNatural.click();
    }

    // Steps:4:
    public void clickQty(){
        // Click Quantity
        qty.click();
    }

    // Steps:5:
    public void doSelectQty(){
        // Select Quantity
        selectQty.click();
    }
    // Steps:6:
    public void clickAddToCart(){
        // Click Add to Cart
        addToCart.click();
    }

    // Steps:7:
    public void clickCheckout(){
        // Click Checkout
        checkout.click();
    }

    //CHIPS
    public void clickPringles(){
        leChips.click();
    }


    public void searchProduct() throws InterruptedException {
       // setUp("windows","chrome","https://www.amazon.com/");
        enterKeyWord("I Phone 11 pro");
        sleepFor(3);
        clickSearchButton();
        sleepFor(3);
        cleanUp();
    }

    public void searchChips() throws InterruptedException, IOException {
        setUp(true, "", "windows", "", "chrome", "", "https://www.amazon.com");
        enterKeyWord("chips");
        sleepFor(3);
        clickSearchButton();
        sleepFor(3);
        clickPringles();
        sleepFor(3);
        cleanUp();
    }

    public void clickAmazonPrimeVideo() throws InterruptedException, IOException {
        setUp(true, "", "windows", "", "chrome", "", "https://www.amazon.com");
        amazonMainMenuDropDown.click();
        sleepFor(2);
        amazonPrimeVideo.click();
        sleepFor(2);
        amazonActualPrimeVideo.click();
    }

    public void hoverAccountListAndClickYourAccount() throws InterruptedException, IOException {
        setUp(true, "", "windows", "", "chrome", "", "https://www.amazon.com");
        sleepFor(3);
        WebElement searchBtn = driver.findElement(By.xpath("//span[contains(@class,'nav-line-2')][contains(text(),'Account & Lists')]"));
        sleepFor(3);
        Actions action = new Actions(driver);
        action.moveToElement(searchBtn).perform();
        accountAndListsYourAccount.click();
        sleepFor(2);
    }




public void validateSearchProduct(){

}










}
