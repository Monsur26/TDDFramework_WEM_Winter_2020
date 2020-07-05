package home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

import static webelements.HomePageWebElements.*;


public class HomePage extends WebAPI {



//    @FindBy(css=shopLinksWebElements) public List<WebElement> shopLinks;
    @FindBy(how = How.CSS,using = shopLinksWebElements) public List<WebElement> shopLinks;

    // Page Objects Design Pattern/Page object Model(POM)
    @FindBy(how = How.XPATH, using = searchBoxWebElement) public WebElement searchBox;
    @FindBy(how = How.CSS,using = searchButtonWebElement) public WebElement searchButton;
    //@FindBy(how = How.XPATH,using = artNaturalWebElement) public WebElement artNatural;
    @FindBy(xpath =artNaturalWebElement ) public WebElement artNatural;
    @FindBy(how = How.CSS,using = qtyWebElement) public WebElement qty;
    @FindBy(how = How.XPATH,using = selectQtyWebElement) public WebElement selectQty;
    @FindBy(how = How.ID,using = addToCartWebElement) public WebElement addToCart;
    @FindBy(how = How.ID,using = checkoutWebElement) public WebElement checkout;
    @FindBy(xpath =bowFlexWebElement) public WebElement bowFlex;
    @FindBy(xpath = bestSellerWebElements) public WebElement bestSeller;
    @FindBy(xpath = s20UltraWebElements) public WebElement s20Ultra;
    @FindBy(xpath = rideElectricWebElements) public WebElement rideElectric;
    @FindBy(xpath = rideAddToCartWebElements) public WebElement rideAddToCart;
    @FindBy(xpath = lgOledWebElements) public WebElement lgOled;
    @FindBy(xpath = customerServiceWebElements) public WebElement customerService;
    @FindBy(xpath = returnAndRefundsWebElements) public WebElement returnAndRefund;
    @FindBy(xpath = newReleasesWebElements) public WebElement newReleases;
    @FindBy(xpath = theLastOfUsWebElements) public WebElement theLastOfUs;
    @FindBy(xpath = wholeFoodsWebElements) public WebElement wholeFoods;
    @FindBy(xpath = blackBerriessWebElements) public WebElement blackBerries;
    @FindBy(xpath = accountAndListsWebElements) public WebElement accountAndLists;
    @FindBy(xpath = findAListWebElements) public WebElement findAList;
    @FindBy(xpath = amazonLogoWebElements) public WebElement amazonLogo;

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

    //Step 4:
    public void clickProduct1(){
        bowFlex.click();
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

    // step:8
    public void SamsungS20(){
        s20Ultra.click();
    }

    // Step:9
    public void rideElectricBicycle(){
        rideElectric.click();
    }

    // Step:10
    public void rideAddToCart(){
        rideAddToCart.click();
    }

    // Step:11
    public void customerService(){
        customerService.click();
    }

    // Step:12
    public void returnAndRefunds(){
        returnAndRefund.click();
    }

    //Step:13
    public void newReleases(){
        newReleases.click();
    }

    //Step:14
    public void theLastOfUs(){
        theLastOfUs.click();
    }


    public void clickbestSeller(){
        bestSeller.click();
    }

    public void lgOled(){
        lgOled.click();
    }

    public void wholeFoods(){
        wholeFoods.click();
    }

    public void blackBerries(){
        blackBerries.click();
    }

    public void searchProduct() throws InterruptedException {
       // setUp("windows","chrome","https://www.amazon.com/");
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        enterKeyWord("I Phone 11 pro");
        sleepFor(2);
        clickSearchButton();
        sleepFor(2);
        cleanUp();
    }

    public void searchProduct1() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        enterKeyWord("Bowflex Dumbbell");
        sleepFor(2);
        clickSearchButton();
        sleepFor(2);
        clickProduct1();
        sleepFor(1);
        cleanUp();

    }

    public void clickProduct3() throws InterruptedException {
         sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        clickbestSeller();
        sleepFor(2);
        cleanUp();
    }

    public void Samsung() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        enterKeyWord("Samsung Galaxy S20 Ultra");
        sleepFor(2);
        clickSearchButton();
        sleepFor(2);
        SamsungS20();
        cleanUp();
    }

    public void Bicycle() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        rideElectricBicycle();
        sleepFor(2);
        cleanUp();
    }

    public void Oled() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        enterKeyWord("Lg Oled");
        sleepFor(2);
        clickSearchButton();
        sleepFor(2);
        lgOled();
        sleepFor(30);
        cleanUp();
    }

    public void customerRefund() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        customerService();
        sleepFor(2);
        returnAndRefunds();
        sleepFor(2);
        cleanUp();
    }

    public void Game() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        newReleases();
        sleepFor(2);
        theLastOfUs();
        sleepFor(2);
        cleanUp();
    }

    public void foodItem() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        wholeFoods();
        sleepFor(2);
        blackBerries();
        sleepFor(2);
        cleanUp();
    }

    public void amazonLogo() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        dragAndDrop(searchBox,amazonLogo);
        sleepFor(2);
        cleanUp();
    }

public void validateSearchProduct(){

}










}
