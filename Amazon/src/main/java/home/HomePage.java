package home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static webelements.HomePageWebElements.*;
public class HomePage extends WebAPI {

    @FindBy(how = How.CSS,using = searchBoxWebElement) public WebElement searchBox;
    @FindBy(how = How.CSS,using = searchButtonWebElement) public WebElement searchButton;
    @FindBy(how = How.CSS,using = homeIconWebElement) public WebElement homeIcon;
    @FindBy(how = How.XPATH,using = bestSellersWebElement) public WebElement bestSellers;
    @FindBy(how = How.XPATH,using = customerServiceWebElement) public WebElement customerService;
    @FindBy(how = How.XPATH,using = accountAndListtWebElement) public WebElement accountAndList;
    @FindBy(how = How.LINK_TEXT, using = newReleasesWebElement) public WebElement newReleases;
    @FindBy(how = How.CSS, using = accountListWebelement) public WebElement accountList;


    public  void enterKeyWord(String keyword){ searchBox.sendKeys(keyword); }
    public void clickSearchButton(){ searchButton.click(); }
    public void clickBestSeller(){ bestSellers.click(); }
    public void clickCustomerService(){ customerService.click(); }
    public void clickAccountAndList(){ accountAndList.click(); }
    public void getWindowsMaximize() {}


    public void AmazonAccountLists() throws InterruptedException {
        getWindowsMaximize();
        sleepFor(3);
        mouseHoverByCSS("#nav-link-accountList");
        sleepFor(5);
    }


    public void searchProduct() throws InterruptedException {
        enterKeyWord("I Phone 11 pro");
        sleepFor(3);
        clickSearchButton();
        sleepFor(3);
        cleanUp();
    }
    public void searchButton() throws InterruptedException {
        clickSearchButton();
        sleepFor(4);
    }

    public void homeIcon() throws InterruptedException {
        homeIcon.click();
        sleepFor(4);
    }

    public void bestSellers() throws InterruptedException {
        clickBestSeller();
        sleepFor(4);
    }
    public void CustomerService() throws InterruptedException {
        clickCustomerService();
        sleepFor(4);
    }

    public void accountAndList() throws InterruptedException {
        clickAccountAndList();
        sleepFor(5);
    }

    public void searchItem() throws InterruptedException {
        enterKeyWord("Toys for toddlers");
        sleepFor(5);
        clickSearchButton();
        sleepFor(5);
    }

    public void searchItem2() throws InterruptedException {
        enterKeyWord("ear-pod pro");
        sleepFor(5);
        clickSearchButton();
        sleepFor(5);
    }
    public void selectNewReleases() throws InterruptedException {
        getWindowsMaximize();
        sleepFor(5);
        newReleases.click();
        sleepFor(5);
    }



}