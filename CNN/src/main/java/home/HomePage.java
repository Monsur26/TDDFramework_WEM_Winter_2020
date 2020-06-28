package home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

import static homepagewebelements.HomePageWebElements.*;

public class HomePage extends WebAPI {

    @FindBy(xpath = TopbannerWebElement)
    public WebElement topBanner;
    @FindBy(xpath = NavigationWebElement)
    public WebElement navigationBox;
    @FindBy(xpath = SeletctbuttonWebElement)
    public WebElement selectButton;
    @FindBy(xpath = USnewsLinkBarWebElement)
    public WebElement USnewsLink;
    @FindBy(xpath = USNewsLinkselectWebElement)
    public WebElement USNewsLinkselect;
    @FindBy(xpath = SportslinkWebElements)
    public WebElement sportsLink;
    @FindBy(xpath = SelectsportslinkWebElements)
    public WebElement sportsLinkselect;
    @FindBy(css = EditionboxWebElement)
    public WebElement edition;
    @FindBy(css = userAccountButtonWebElement)public WebElement userAcc;
    @FindBy(xpath = emailWebElement)public WebElement email;
    @FindBy(xpath = passwordWebElement)public WebElement password;
    @FindBy(xpath = CNNlogoWebElement)public WebElement CNNLogo;


    // setup methods
    //step 1
    public void TopbannerSelecting() {
        topBanner.click();  }
    //step 2
    public void Navigating() {
        navigationBox.click(); }
    //step 3
    public void Selectbutton(String itemName) {
        selectButton.sendKeys(itemName); }
    //step 4
    public void USnewsLinkbar() {
        USnewsLink.click(); }
    //step 5
    public void setSportsLink() {
        sportsLinkselect.click(); }
    //step 6
    public void setEdition() {
        edition.click();
    }
    public void userACC(){userAcc.click();}
    public void emaillogin(String emaillog){email.sendKeys(emaillog);}
    public void passwordadd(String pass){ password.sendKeys(pass);}

    //Test case1
    public void bannerSelect() throws InterruptedException {
        TopbannerSelecting();
        sleepFor(1);
    }
    //Test case2
    public void boxNavigation() throws InterruptedException {
        Navigating();
        Selectbutton("Culture");
    }
    //Test case3
    public void usNews() throws InterruptedException {
        USnewsLinkbar();
        sleepFor(3);
    }
    //Test case4
    public void sportsLink() throws InterruptedException {
        setSportsLink();
        sleepFor(3);
    }
    //Test case 5
    public void editionSet() throws InterruptedException {
        setEdition();
        sleepFor(3);
    }
    public void userACCFromExcel(String login, String password){
        userACC();
        emaillogin(login);
        passwordadd(password);

    }
}
