package home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends WebAPI {
    @FindBy(xpath = "//input[@placeholder='Where from?']")
    public WebElement jbFrom;
    @FindBy(xpath = "/html/body/jb-app/jb-basic-template/div/div/jb-section-header-container/div/div/div[1]/div/jb-section-container/div/div/jb-book-trip-container/jb-pattern-block/div/div[2]/div/jb-booker-tabs-container/div/jb-tabs/section/div[1]/jb-tab-panel/jb-booker-tabs-wrapper/div/jb-booker-air-wrapper/div/jb-booker-air/form/div/jb-city-pair-selector/div/jb-city-selector[1]/div/div[2]/ul/li[7]/span\n")
    public WebElement jbFromBrowseByRegion;
    @FindBy(xpath = "//button[contains(text(),'Africa')]")
    public WebElement jbFromAfrica;
    @FindBy(xpath = "//button[contains(text(),'Asia')]")
    public WebElement jbFromAsia;
    @FindBy(xpath = "//button[contains(text(),'Caribbean & Central America')]")
    public WebElement jbFromCA;
    @FindBy(xpath = "//button[contains(text(),'Europe')]")
    public WebElement jbFromEurope;
    @FindBy(xpath = "//button[contains(text(),'Middle East')]")
    public WebElement jbFromArab;
    @FindBy(xpath = "//button[contains(text(),'South America')]")
    public WebElement jbFromSA;
    @FindBy(xpath = "//button[contains(text(),'United States & Canada')]")
    public WebElement jbFromNA;
    @FindBy(xpath = "//span[contains(text(),'Buffalo, NY (BUF)')]")
    public WebElement jbFromNABuffaloNY;
    @FindBy(xpath = "//span[contains(text(),'Detroit, MI (DTW)')]")
    public WebElement jbFromNADetroitMI;
    @FindBy(xpath = "//html//body//jb-app//jb-footer//div//div//div//ul//li//a[contains(text(),'Timetables')]")
    public WebElement jbTimeTables;
    @FindBy(xpath = "//select[@id='ddlFromStations']")
    public WebElement jbTimeTablesSearch;
    @FindBy(xpath = "//option[contains(text(),'Ponce, PSE (PSE)')]")
    public WebElement jbTimeTablesSearchFinal;

    public void jbFrom(){
        jbFrom.click();
    }
    public void JbFromBrowseByRegion(){
        jbFromBrowseByRegion.click();
    }
    public void setJBFromAfrica(){
        jbFromAfrica.click();
    }
    public void setJBFromAsia(){
        jbFromAsia.click();
    }
    public void setJBFromCA(){
        jbFromCA.click();
    }
    public void setJBFromEurope(){
        jbFromEurope.click();
    }
    public void setJBFromArab(){
        jbFromArab.click();
    }
    public void setJBFromSA(){
        jbFromSA.click();
    }
    public void setJBFromNA(){
        jbFromNA.click();
    }
    public void setJBFromNABuffaloNY(){
        jbFromNABuffaloNY.click();
    }
    public void setJBFromNADetroitMI(){
        jbFromNADetroitMI.click();
    }
    public void setJbTimeTablesComplete() throws InterruptedException {
        jbTimeTables.click();
        sleepFor(3);
    }

}
