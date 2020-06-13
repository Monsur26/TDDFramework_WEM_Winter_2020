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

    // setup methods
    //step 1
    public void TopbannerSelecting() {
        topBanner.click();
    }

    //step 2
    public void Navigating() {
        navigationBox.click();
    }

    //step 3
    public void Selectbutton(String itemName) {
        selectButton.sendKeys(itemName);
    }

    //step 4
    public void USnewsLinkbar() {
        USnewsLink.click();
    }

    //step 4
    public void setSportsLink() {
        sportsLinkselect.click();
    }

    //step 5

public void setEdition() {
        edition.click();
}

    // Test case methods

    //Test case1
    public void bannerSelect() throws InterruptedException {
        TopbannerSelecting();
        sleepFor(1);
    }

    //Test case2
    public void boxNavigation() throws InterruptedException {
        Navigating();
        sleepFor(3);
        Selectbutton("Culture");
        sleepFor(3);
    }

    //Test case3
    public void usNews() throws InterruptedException {
        USnewsLinkbar();
        sleepFor(3);
    }

    //Test case4
    public void sportsLink() throws InterruptedException {
        sportsLink();
        sleepFor(3);
    }
    //Test case 5
    public void editionSet() throws InterruptedException {
        editionSet();
        sleepFor(3);
    }

}
