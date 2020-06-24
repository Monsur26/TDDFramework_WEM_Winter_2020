package home;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


import javax.swing.*;
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
//    @FindBy(how =How.XPATH,using = clickItem) public WebElement click;
//    @FindBy(how = How.CSS,using = wholeFoodsWebElement) public WebElement wholeFoods;
     @FindBy(how = How.CSS,using = homeIconWebElement) public WebElement homeIcon;
     @FindBy(how = How.XPATH,using = bestSellersWebElement) public WebElement bestSellers;
     @FindBy(how = How.XPATH,using = customerServiceWebElement) public WebElement customerService;
     @FindBy(how = How.XPATH,using = findGiftWebElement) public WebElement findGift;
     @FindBy(how = How.XPATH,using = accountAndListtWebElement) public WebElement accountAndList;
     @FindBy(how = How.XPATH,using = earPodProtWebElement) public WebElement earPodPro;
     @FindBy(how = How.XPATH,using = signInWebElement) public WebElement signIn;
     @FindBy(how = How.XPATH,using = orderWebElement) public WebElement order;
     @FindBy(how = How.XPATH,using = cartWebElement) public WebElement cart;
     @FindBy(how = How.XPATH,using = signInTOWebElement) public WebElement signInTO;
     @FindBy(how = How.XPATH,using = listsWebElement) public WebElement lists;
     @FindBy(how = How.XPATH,using = todaysDealMhWebElement) public WebElement todaysDealMh;
     @FindBy(how = How.XPATH,using = earPodProItemWebElement) public WebElement earPodProItem;

//     @FindBy(how = How.XPATH,using = newReleaseWebElement) public WebElement newRelease;

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
    public void clickBestSeller(){
        bestSellers.click();
    }
    public void clickCustomerService(){
        customerService.click();
    }
//    public void clickNewRelease(){
//        newRelease.click();
//    }

    public void clickFindGift(){
        findGift.click();
    }
    public void clickAccountAndList(){
        accountAndList.click();
    }
    public void clickEarPodPro(){
        earPodPro.click();
    }
    public void clickSignIn(){
        signIn.click();
    }
    public void clickOrder(){
        order.click();
    }
    public void clickCart(){
        cart.click();
    }
    public void clickSignInTO(){
        signInTO.click();
    }
    public void mouseHover(){
        WebElement element=driver.findElement(By.xpath(todaysDealMhWebElement));
        Actions action=new Actions(driver);
        action.moveToElement(todaysDealMh).build().perform();

    }
    public void clickEarPodProItem(){
        earPodProItem.click();
    }





    public void searchProduct() throws InterruptedException {
       // setUp("windows","chrome","https://www.amazon.com/");
        enterKeyWord("I Phone 11 pro");
        sleepFor(3);
        clickSearchButton();
        sleepFor(3);
        cleanUp();
    }

public void validateSearchProduct(){

}

    public void searchButton() { clickSearchButton();
    }

//    public void clickItem(){
//        clickProduct();
//    }

//    public void clickNewRelease() {
//        clickNewRelease();
//    }
//    public void clickWholeFoods(){
//        clickWholeFoods();
//    }

    public void homeIcon() {
       homeIcon.click();
    }

    public void bestSellers(){
        clickBestSeller();
    }
    public void CustomerService(){
        clickCustomerService();
    }
//    public void newRelease(){
//        clickNewRelease();
//    }

    public void findGift(){
        clickFindGift();
    }
    public void accountAndList(){
        clickAccountAndList();
    }
    public void searchItem() throws InterruptedException {
        enterKeyWord("Toys for toddlers");
        sleepFor(1);
        clickSearchButton();
        sleepFor(3);
    }


    public void searchItem2() throws InterruptedException {
        enterKeyWord("ear-pod pro");
        sleepFor(1);
        clickSearchButton();
//        sleepFor(3);
    }
    public void earPodPro(){
        clickEarPodPro();
    }
    public void signIn(){
        clickSignIn();
//        enterKeyWord("farjanewu@yahoo.com");
    }
    public void order(){
        clickOrder();
    }
    public void cart(){
        clickCart();
    }
    public void signInTO() throws InterruptedException {
        clickSignInTO();
        enterKeyWord("farjanewu@yahoo.com");
        sleepFor(2);
    }
    public void TodaysDealMh(){
        mouseHover();
    }

    public void earPodProItem(){
        clickEarPodProItem();
    }





}
