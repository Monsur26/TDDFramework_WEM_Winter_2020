package home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static webelements.HomePageWebElements.*;

public class HomePage extends WebAPI {
    @FindBy(how = How.ID, using = searchBarWebElement) public WebElement searchBar;
    @FindBy(xpath = searchButtonWebElement) public WebElement searchButton;
    @FindBy(xpath = understandingCoverageWebElement) public WebElement understandingCoverage;
    @FindBy(xpath = closeAdWebElement) public WebElement closeAd;

    public void searchBar(String Keyword){
        searchBar.sendKeys(Keyword);
    }
    public void searchButton(){
        searchButton.click();
    }
    public void understandingCoverage(){
        understandingCoverage.click();
    }
    public void closeAd(){
        closeAd.click();
    }
    public void searchBarUnitedHealthInsurance() throws InterruptedException {
        sleepFor(2);
        searchBar("Full Coverage");
        sleepFor(2);
        cleanUp();
    }
    public void searchResultUnitedHealthCareInsurance() throws InterruptedException {
        sleepFor(2);
        searchBar("Full Coverage");
        sleepFor(2);
        searchButton();
        sleepFor(2);
        cleanUp();
    }
    public void understandingCoverageUnitedHealthCare() throws InterruptedException {
        sleepFor(2);
        searchBar("Full Coverage");
        sleepFor(2);
        searchButton();
        sleepFor(2);
        understandingCoverage();
        sleepFor(2);
        cleanUp();
    }
}
