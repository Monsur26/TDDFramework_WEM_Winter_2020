package home;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.ArrayList;
import java.util.List;

import static homepagewebelements.HomePageWebElements.*;

public class HomePage extends WebAPI {
    @FindBy(how = How.CSS,using = cnnUSWebElement) public WebElement cnnUS;
    @FindBy(how = How.CSS,using = cnnEditionWebElement) public WebElement cnnEdition;
    @FindBy(how = How.LINK_TEXT,using = editionInterWebElement) public WebElement editionInter;
    @FindBy(how = How.CSS,using = menuBarWebElement) public WebElement menuBar;
    @FindBy(how = How.CSS,using = menuSearchWebElement) public WebElement menuSearch;
    @FindBy(how = How.CSS,using = searchSubmitWebElement) public WebElement searchSubmit;
    @FindBy(how = How.CSS,using = cnnBusinessWebElement) public WebElement cnnBusiness;
    @FindBy(how = How.CSS,using = cnnBusinessPerspWebElement) public WebElement cnnBusinessPers;
    @FindBy(how = How.CSS,using = entertainmentWebElement) public WebElement entertainment;
    @FindBy(how = How.CSS,using = topstoryWebElement) public WebElement topstory;
    @FindBy(how = How.CSS,using = cnnsubheaderlistWebElement) public WebElement cnnsubheader ;
    @FindBy(how = How.XPATH,using = cnnPoliticsWebElement) public WebElement cnnPolitics ;
    @FindBy(how = How.XPATH,using = cnnPoliticsElection2020WebElement) public WebElement cnnPoliticsElection ;
    @FindBy(how = How.XPATH,using = cnnPElecStatesWebElement) public WebElement cnnPoliticsElectionStates ;
    @FindBy(how = How.XPATH,using = cnnStateVAWebElement) public WebElement stateVA;

    public void cnnUS(){
        cnnUS.click();
    }
    public void cnnEdition(){
        cnnEdition.click();
        editionInter.click();

    }
    public void cnnMenuBar() throws InterruptedException {
        menuBar.click();
        typeByCss("#header-search-bar","economy");
        searchSubmit.click();
    }
    public void cnnBusiness(){
        cnnBusiness.click();
        scrollDownVertically();
    }
    public void cnnEntertainment(){
        entertainment.click();
        topstory.click();
        implicitWait(10);
    }
    public void cnnBusinessPerspectives(){
        cnnBusiness.click();
        cnnBusinessPers.click();
        navigateRefresh();
    }
    public void cnnGoBackHP(){
        cnnBusiness.click();
        cnnBusinessPers.click();
        System.out.println(getCurrentPageUrl());
        goBackToHomeWindow();

    }
    public void cnnSubHeaders(){
//        List<WebElement> elements = driver.findElements(By.name("name"));
        List<WebElement> list = new ArrayList<WebElement>();
            list = driver.findElements(By.cssSelector("li[class='sc-chPdSV jUoWJl']"));
            System.out.println("Number of elements:" +list.size());

            for (int i=0; i<list.size();i++){
                System.out.println( list.get(i).getAttribute("data-section"));
            }

    }
    public void cnnPolitics() throws InterruptedException {
        cnnPolitics.click();
        cnnPoliticsElection.click();
        implicitWait(10);
        navigateRefresh();
        implicitWait(10);
    }
    public void cnnElectionStates(){
        cnnPolitics.click();
        cnnPoliticsElection.click();
        mouseHoverByXpath("//body/div/div/div/div/div/div/div[5]");
        implicitWait(10);
        stateVA.click();

    }

}
