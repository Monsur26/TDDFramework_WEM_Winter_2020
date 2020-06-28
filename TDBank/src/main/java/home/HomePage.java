package home;

import common.WebAPI;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static webelements.HomePageWebElements.*;

public class HomePage extends WebAPI {
    @FindBy(how = How.CSS, using = productlinkWebElement) public WebElement productlink;
    @FindBy(how = How.LINK_TEXT, using = findUsWebElement) public WebElement findUs;
    @FindBy(how = How.CSS, using = submitButtonWebelement) public WebElement submitButton;
    @FindBy(how = How.CSS, using = loginWebelement) public WebElement login;
    @FindBy(how = How.CSS, using = loginAccWebelement) public WebElement loginAcc;
    @FindBy(how = How.CSS, using = userWebelement) public WebElement user;
    @FindBy(how = How.CSS, using = passwordWebelement) public WebElement password;
    @FindBy(how = How.CSS, using = loginsubmitWebelement) public WebElement loginsubmit;
    @FindBy(how = How.LINK_TEXT, using = creditcardsWebelement) public WebElement creditcards;
    @FindBy(how = How.CSS, using = homeEquityWebelement) public WebElement homeEquity;
    @FindBy(how = How.CSS, using = setMylocationWebelement) public WebElement setMylocation;
    @FindBy(how = How.XPATH, using = countryWebelement) public WebElement country;
    @FindBy(how = How.XPATH, using = countryNameWebelement) public WebElement countryName;
    @FindBy(how = How.XPATH, using = learningWebelement) public WebElement learning;
    @FindBy(how = How.XPATH, using = creditNlendingWebelement) public WebElement creditNlending;

    public void MHOnProducts(){
        mouseHoverByXpath("//a[contains(text(),'Products')]");
    }
    public void MouseHoverOnProductsToServices() throws InterruptedException {
        getWindowsMaximize();
        mouseHoverByCSS("#td-desktop-nav-dropdown-link-2");
        mouseHoverByCSS("#td-desktop-nav-dropdown-link-3");
        sleepFor(3);
    }
    public void TryToFindLocation() throws InterruptedException {
        getWindowsMaximize();
        findUs.click();
        typeByCss("#q","Queens, NY, USA");
        clickOnElement("button.Locator-button--search");
    }
    public void setLogin() throws InterruptedException {
        getWindowsMaximize();
        mouseHoverByCSS(loginWebelement);
    }
    public void setLoginAcc() throws InterruptedException {
        getWindowsMaximize();
        loginAcc.click();
        user.sendKeys("Marufa Mujib");
        password.sendKeys("abcd1234");
        loginsubmit.click();
    }
    public void tryProductCreditCard() throws InterruptedException {
        getWindowsMaximize();
        mouseHoverByCSS("#td-desktop-nav-dropdown-link-2");
        creditcards.click();
    }
    public void tryHomeEquity() throws InterruptedException {
        getWindowsMaximize();
        homeEquity.click();
    }
    public void tryHomeEquityPopup() throws InterruptedException {
        getWindowsMaximize();
        homeEquity.click();
        Alert alert=driver.switchTo().alert();
        alert.accept();
       setMylocation.click();
       }
    public void tryCountry() throws InterruptedException {
        getWindowsMaximize();
        country.click();
        countryName.click();
    }
    public void userName(String userName){user.sendKeys(userName);}
    public void password(String pass){password.sendKeys(pass);}
    public void submit(){loginsubmit.click();}
    public void loginInWithExcel(String user, String pass){
        loginAcc.click();
        userName(user);
        password(pass);
        submit();
    }
    public void learningCredit(){
        learning.click();
        creditNlending.click();
    }
}
