package home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

import static webelements.HomePageWebElements.*;


public class HomePage extends WebAPI {



//    @FindBy(css=shopLinksWebElements) public List<WebElement> shopLinks;
    @FindBy(how = How.CSS,using = shopLinksWebElements) public List<WebElement> shopLinks;

    // Page Objects Design Pattern/Page object Model(POM)
    @FindBy(how = How.CSS,using = searchBoxWebElement) public WebElement searchBox;
    @FindBy(how = How.CSS,using = searchButtonWebElement) public WebElement searchButton;
    //@FindBy(how = How.XPATH,using = artNaturalWebElement) public WebElement artNatural;
    @FindBy(xpath =artNaturalWebElement ) public WebElement artNatural;
    @FindBy(how = How.CSS,using = qtyWebElement) public WebElement qty;
    @FindBy(how = How.XPATH,using = selectQtyWebElement) public WebElement selectQty;
    @FindBy(how = How.ID,using = addToCartWebElement) public WebElement addToCart;
    @FindBy(how = How.ID,using = checkoutWebElement) public WebElement checkout;
    @FindBy(css = accountsMenuWebElements) public WebElement accountsMenu;
    @FindBy(id = dropdownMenuWebElement) public WebElement dropdownMenu;


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

    //Accounts menu mouseHover
    public void accountsMenuHover(){
        Actions ac=new Actions(driver);
        ac.moveToElement(accountsMenu).perform();

    }

    public void dropdownMenu(int indexNumber){
        Select s=new Select(dropdownMenu);
        s.selectByIndex(indexNumber);
    }





    /**
     * first test case
     * searching for a product
     * @throws InterruptedException
     */
    public void searchProduct() throws InterruptedException {
       // setUp("windows","chrome","https://www.amazon.com/");
        enterKeyWord("I Phone 11 pro");
        sleepFor(3);
        clickSearchButton();
        sleepFor(3);
        cleanUp();
    }

    public void validateSearchProduct(String expected){

        Assert.assertEquals("I Phone 11 pro",expected," Not Successful Assertion");
    }

    /**
     * 2nd test case
     * search product and select product.
     * @throws InterruptedException
     */
    public void searchProductSelect() throws InterruptedException {
        enterKeyWord("Hand Sanitizer");
        sleepFor(2);
        clickSearchButton();
        sleepFor(2);
        clickProduct();
        cleanUp();
    }

    public void validateSearchProductSelect(String expected){
        Assert.assertEquals("Hand Sanitizer",expected,"Not valid assertion");
    }

    /**
     * Test Case 3
     * search product and select quantity
     * @throws InterruptedException
     */
    public void searchProductSelectqty() throws InterruptedException {
        enterKeyWord("Hand Sanitizer");
        sleepFor(2);
        clickSearchButton();
        sleepFor(2);
        clickProduct();
        sleepFor(2);
        clickQty();
        sleepFor(2);
        doSelectQty();
        sleepFor(1);
        cleanUp();
    }
    public void validateSearchProductSelectandqty(String expected){
        Assert.assertEquals("Hand Sanitizer",expected,"Not valid assertion");
    }


    /**
     * Test Case 4
     * @throws InterruptedException
     */
    public void addToCart() throws InterruptedException {
        enterKeyWord("Hand Sanitizer");
        sleepFor(2);
        clickSearchButton();
        sleepFor(2);
        clickProduct();
        sleepFor(2);
        clickQty();
        sleepFor(2);
        doSelectQty();
        sleepFor(2);
        clickAddToCart();
        cleanUp();

    }
    public void checkout() throws InterruptedException {
        enterKeyWord("Hand Sanitizer");
        sleepFor(2);
        clickSearchButton();
        sleepFor(2);
        clickProduct();
        sleepFor(2);
        clickQty();
        sleepFor(2);
        doSelectQty();
        sleepFor(2);
        clickAddToCart();
        sleepFor(2);
        checkout();
        cleanUp();

    }

    public void findingLinksHomePage(){
        System.out.println("Number of links on top menu of HomePage: "+shopLinks.size());

    }

    public void accountsMenuMouseHover() throws InterruptedException {
        accountsMenuHover();
        sleepFor(2);

    }

    public void dropdownMenuItemSelectByIndex(){
        dropdownMenu(3);
        clickSearchButton();
    }













}
