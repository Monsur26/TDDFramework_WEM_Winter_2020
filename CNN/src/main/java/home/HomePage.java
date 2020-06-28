package home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static homepagewebelements.HomePageWebElements.*;
public class HomePage extends WebAPI {

    @FindBy(xpath = TopbannerWebElement) public WebElement topBanner;
    @FindBy (xpath = LogoButtonWebElement) public WebElement LogoButton;
    @FindBy(how= How.XPATH,using = USWebElement) public WebElement US;
    @FindBy(how=How.XPATH,using = editionWebElement) public WebElement edition;
    @FindBy(how=How.XPATH,using = videoWebElement) public WebElement video;
    @FindBy(how=How.XPATH,using = travelWebElement) public WebElement travel;
    @FindBy(how=How.XPATH,using = enterteinmentWebElement) public WebElement enterteinment;
    @FindBy(how=How.XPATH,using = healthWebElement) public WebElement health;
    @FindBy(how=How.XPATH,using = politicsWebElement) public WebElement politics;
    @FindBy(how=How.XPATH,using = opinionWebElement) public WebElement opinion;
    @FindBy(how=How.XPATH,using = stylesWebElement) public WebElement styles;
    @FindBy(how=How.XPATH,using = accountWebElement) public WebElement account;

    public void TopbannerSelecting() { topBanner.click();}
    public void LogobuttonSelecting() { LogoButton.click();}

    public void bannerSelect() throws InterruptedException {
        TopbannerSelecting();
        sleepFor(2);}

    public void LogoSelect() throws InterruptedException {
        LogobuttonSelecting();
        sleepFor(2);}
    public void clickUSWebElement(){
        US.click();
    }
    public void clickEdition(){
        edition.click();
    }
    public void clickVideo(){
        video.click();
    }
    public void clickTravel(){
        travel.click();
    }
    public void clickEnterteinment(){
        enterteinment.click();
    }
    public void clickHealth(){
        health.click();
    }
    public void clickPolitics(){
        politics.click();
    }
    public void clickOpinion(){
        opinion.click();
    }
    public void clickStyles(){
        styles.click();
    }
    public void clickAccount(){
        account.click();
    }



}
