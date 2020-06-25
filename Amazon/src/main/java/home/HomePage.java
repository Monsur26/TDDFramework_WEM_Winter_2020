package home;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
//import org.w3c.dom.html.HTMLInputElement;
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

    @FindBy(how = How.XPATH,using = stickersWebElement ) public WebElement stickers;
    @FindBy(how = How.XPATH,using = sandalsWebElements) public WebElement sandals;
  @FindBy(how = How.XPATH,using = flowersWebElements) public WebElement flowers;
  @FindBy(how = How.XPATH,using = penWebElements) public WebElement pen;
  @FindBy(how = How.XPATH,using = mirrorWebElements) public WebElement mirror;
  @FindBy(how = How.XPATH,using = pillowWebElements) public WebElement pillow;
  @FindBy(how = How.XPATH,using = popcornWebElements) public WebElement popcorn;
  @FindBy(how = How.XPATH,using = headphonesWebElements) public WebElement headphones;

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
    public void clickStickers(){
        stickers.click();
    }
        public void clickSandals(){
            sandals.click();
        }
        public void clickFlowers(){
        flowers.click();
    }
    public void clickPen(){
        pen.click();
    }
    public void clickMirror(){
        mirror.click();
    }
    public void clickPillow(){
        //click pillow
        pillow.click();
    }
    public void clickPopcorn(){
        //click pillow
        popcorn.click();
    }
    public void clickHeadphones(){
        //click pillow
        headphones.click();
    }
    public void searchProduct() throws InterruptedException {
       // setUp("windows","chrome","https://www.amazon.com/");
        enterKeyWord("I Phone 11 pro");
        sleepFor(3);
        clickSearchButton();
        sleepFor(3);
        cleanUp();
    }
    public void searchProduct1() throws InterruptedException {
        // setUp("windows","chrome","https://www.amazon.com/");
        enterKeyWord("pink notebook");
        sleepFor(3);
        clickSearchButton();
        sleepFor(3);
        cleanUp();
    }

    public void searchProduct2() throws InterruptedException {
        // setUp("windows","chrome","https://www.amazon.com/");
        enterKeyWord("stickers hello kitty");
        sleepFor(3);
        clickSearchButton();
        sleepFor(3);
        clickStickers();
        sleepFor(3);
        cleanUp();
    }
    public void searchProduct3() throws InterruptedException {
        // setUp("windows","chrome","https://www.amazon.com/");
        enterKeyWord("orange sandals");
        sleepFor(3);
        clickSearchButton();
        clickSandals();
        clickQty();
        sleepFor(3);
        cleanUp();
    }
    public void searchProduct4() throws InterruptedException {
        // setUp("windows","chrome","https://www.amazon.com/");
        enterKeyWord("flowers");
        sleepFor(3);
        clickSearchButton();
        sleepFor(3);
        clickFlowers();
        sleepFor(3);
        cleanUp();
    }



    public void searchProduct5() throws InterruptedException {
        // setUp("windows","chrome","https://www.amazon.com/");
        enterKeyWord("feather pen");
        sleepFor(3);
        clickSearchButton();
        sleepFor(3);
        clickPen();
        sleepFor(3);
        cleanUp();
    }
    public void searchProduct6() throws InterruptedException {
        // setUp("windows","chrome","https://www.amazon.com/");
        enterKeyWord("mirror");
        sleepFor(3);
        clickSearchButton();
        sleepFor(3);
        clickMirror();
        sleepFor(3);
        clickQty();
        sleepFor(3);
        cleanUp();
    }
    public void searchProduct7() throws InterruptedException {
        // setUp("windows","chrome","https://www.amazon.com/");
        enterKeyWord("rainbow pillow");
        sleepFor(3);
        clickSearchButton();
        sleepFor(3);
        clickPillow();
        sleepFor(3);
        clickQty();
       doSelectQty();
        sleepFor(3);
        cleanUp();
    }
    public void searchProduct8() throws InterruptedException {
        // setUp("windows","chrome","https://www.amazon.com/");
        enterKeyWord("popcorn tub");
        sleepFor(3);
        clickSearchButton();
        sleepFor(3);
        clickPopcorn();
        cleanUp();
    }
    public void searchProduct9() throws InterruptedException {
        // setUp("windows","chrome","https://www.amazon.com/");
        enterKeyWord("pink headphones");
        sleepFor(3);
        clickSearchButton();
        sleepFor(3);
        clickHeadphones();
        sleepFor(3);
        cleanUp();
    }
    public void searchProduct10() throws InterruptedException {
        // setUp("windows","chrome","https://www.amazon.com/");
        enterKeyWord("pink headphones");
        sleepFor(3);
        clickSearchButton();
        sleepFor(3);
        clickHeadphones();
        sleepFor(3);
        clickQty();
        doSelectQty();
        cleanUp();
    }
public void validateSearchProduct(){

}










}
