package home;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

import static webelements.HomePageWebElements.*;



public class HomePage extends WebAPI {
     @FindBy(how = How.LINK_TEXT,using = wirelessWebElement) public WebElement wireless;
     @FindBy(how = How.XPATH,using = shopWebElement) public WebElement shop;
     @FindBy(how = How.LINK_TEXT,using = inHomeWebElement) public WebElement inHome;
     @FindBy(how = How.CSS,using = inHomeShopWebElement) public WebElement inHomeShop;
     @FindBy(how = How.CSS,using = shopDealWebElement) public WebElement shopDeal;
     @FindBy(how = How.CSS,using = fiosTvtestDriveWebElement) public WebElement fiosTvTestDrive;
     @FindBy(how = How.CSS,using = wirelessPhonesWebElement) public WebElement wirelessPhones;
//     @FindBy(how = How.LINK_TEXT,using = wirelessPhonesWebElement) public WebElement wirelessPhones;
     @FindBy(how = How.CSS,using = wirelessPhonesPricingWebElement) public WebElement wirelessPhonesPricing;
     @FindBy(how = How.CSS,using = wirelessPhonesFilterWebElement) public WebElement wirelessPhonesFilter;
     @FindBy(how = How.CSS,using = wirelessPhonesFilterBrandsWebElement) public WebElement wirelessPhonesFilterBrands;
     @FindBy(how = How.CSS,using = wirelessPhonesfilterBrandnameWebElement) public WebElement wirelessPhonesfilterBrandname;
     @FindBy(how = How.CSS,using = searchBoxWebElement) public WebElement searchBox;
     @FindBy(how = How.CSS,using = inHomewatchTVWebElement) public WebElement inHomeWatchTV;
     @FindBy(how = How.LINK_TEXT,using = inHomewatchTVGuideWebElement) public WebElement inHomeWatchTVGuide;
     @FindBy(how = How.CSS,using = signInWebElement) public WebElement signIn;
     @FindBy(how = How.LINK_TEXT,using = myAccountWebElement) public WebElement myAccount;
     @FindBy(how = How.CSS,using = userIdWebElement) public WebElement userId;
     @FindBy(how = How.CSS,using = passwordWebElement) public WebElement password;
     @FindBy(how = How.CSS,using = checkBoxWebElement) public WebElement checkBox;
     @FindBy(how = How.CSS,using = submitWebElement) public WebElement submit;

     public void VerizonShop(){
         wireless.click();
         mouseHoverUseWebelement(shop);
     }
     public void scrollDownVertically(){
         JavascriptExecutor js = (JavascriptExecutor)driver;
         js.executeScript("scrollBy(0,4500)");
        }
    public void scrollUpVertically(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("scrollBy(0,-5550)");
    }
     public void ScrollDownVerizonWireless() throws InterruptedException {
         getWindowsMaximize();
         implicitWait(5);
         wireless.click();
         implicitWait(10);
         scrollDownVertically();
     }
     public void VerizonInHomeShopDeals(){
         inHome.click();
         mouseHoverUseWebelement(inHomeShop);
         implicitWait(5);
         shopDeal.click();
     }


    public void InHomeShopDealsTVcheckBox(){
         WebElement element=driver.findElement(By.cssSelector(""));
         if(!element.isSelected()){
             element.click();
             System.out.println(" Option selected ");
         } else {
             System.out.println(" Already selected");
         }
    }
    public void FiosTvTestDriverSelected() throws InterruptedException {
         inHome.click();
         mouseHoverByCSS("#vcm_menu1 > a");
         implicitWait(5);
         shopDeal.click();
         implicitWait(10);
         scrollDownVertically();
         if (fiosTvTestDrive.isSelected()){
            System.out.println("It  is already Selected");
            sleepFor(2);
         }else {
             fiosTvTestDrive.click();
             System.out.println(" It is now Selected"); }
         sleepFor(5);
    }

    public void wirelessPhonesScrolldownNUp(){
         wireless.click();
         wirelessPhones.click();
         scrollDownVertically();
         implicitWait(5);
         scrollUpVertically();
    }
    public void wirelessPhonesPricing(){
         wireless.click();
         wirelessPhones.click();
         dropDownByCSS("#paymentOptions","Retail Price");
    }
    public void wirelessPhonesFilterBrand(){
         getWindowsMaximize();
         wireless.click();
         wirelessPhones.click();
         wirelessPhonesFilter.click();
         wirelessPhonesFilterBrands.click();
         if(!wirelessPhonesfilterBrandname.isSelected()){
             wirelessPhonesfilterBrandname.click();
             System.out.println(" already selected ");
         }else {
             wirelessPhonesfilterBrandname.click();
             System.out.println(" Samsung");
         }
    }
    public void enterKeyWord(String keyword) { searchBox.sendKeys(keyword); }
    public void searchProduct() throws InterruptedException {
         getWindowsMaximize();
         inHome.click();
//         searchBox.click();
//         enterKeyWord("iPhone 11 Pro");


        typeOnInputBox("#scbsearchtopinpu","Phone");
//       typeOnElementNEnter("#scbsearchtopinpu","iPhone 11 Pro");
//        typeOnInputBox("#scbsearchtopinpu","iPhone 11 Pro");
        sleepFor(5);
    }
    public void VerizoninHomeWatchTVGuide() throws InterruptedException {
         getWindowsMaximize();
         inHome.click();
         sleepFor(5);
         mouseHoverByCSS("#vcm_menu4 > a");
         sleepFor(5);
         inHomeWatchTVGuide.click();
    }
    public void VerizonSignIn() throws InterruptedException {
         getWindowsMaximize();
         wireless.click();
         mouseHoverByCSS("#gnavAccountMenu");
         sleepFor(2);
         myAccount.click();
         userId.sendKeys("7576687300");
         password.sendKeys("abcd1234");
         submit.click();
    }


}
