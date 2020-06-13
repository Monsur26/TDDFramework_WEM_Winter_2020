package home;
import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static webelements.HomePageWebElements.*;

public class HomePage extends WebAPI {

    @FindBy(css = exploreProductWebElement) public WebElement exploreProduct;
    @FindBy(css = autoProductWebElement) public WebElement autoProduct;
    @FindBy(css = claimWebElement) public WebElement claimbutton;
    @FindBy(css = claimOverviewWebElement) public WebElement claimOverview;
    @FindBy(css = answersWebElement) public WebElement answersbutton;
    @FindBy(css = seeAllTopicWebElement) public WebElement seeAllProductButton;

    public void exploreButton(){exploreProduct.click();}
    public void autoProduct(){autoProduct.click();}
    public void claimButton(){claimbutton.click();}
    public void claimOverview(){claimOverview.click();}
    public void answerButton(){answersbutton.click();}
    public void AllProductAnswer(){seeAllProductButton.click();}

    public void clickExploreButton() throws InterruptedException {
        exploreButton();
        sleepFor(2);
        autoProduct();
        cleanUp();

    }

    public void clickClaimButton() throws InterruptedException {
        claimButton();
        sleepFor(2);
        claimOverview();
        cleanUp();

    }

    public void clickAnswersButton() throws InterruptedException {
        answerButton();
        sleepFor(2);
        AllProductAnswer();
        cleanUp();

    }


}
