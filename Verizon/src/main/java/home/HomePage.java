package home;
import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.json.JsonException;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import common.WebAPI;

import java.lang.reflect.InvocationTargetException;

import static webelements.Verizon_HomePageWebElements.*;
public class HomePage extends WebAPI {

    @FindBy (xpath =wirelessWebElement ) public WebElement wireless;
    @FindBy (xpath =shopWebElement ) public WebElement shop;
    @FindBy (xpath =searchWebElement ) public WebElement search;
    @FindBy (xpath =plansWebElement ) public WebElement plans;
    @FindBy (xpath =minusWebElement ) public WebElement minus;
    @FindBy (css =dealsWebElement ) public WebElement deals;
    @FindBy (xpath =teachersWebElement ) public WebElement teach;
    @FindBy (xpath =signWebElement ) public WebElement sign;
    @FindBy (xpath =compassWebElement ) public WebElement com;
    @FindBy (xpath =storeWebElement ) public WebElement store;
    @FindBy (xpath =sbarWebElement ) public WebElement sbar;
    @FindBy (xpath =iphoneWebElement ) public WebElement iphone;
    @FindBy (xpath =radiobutton1WebElement ) public WebElement radio1;
    @FindBy (xpath =radiobutton2WebElement ) public WebElement radio2;
    @FindBy (css =mobileappsWebElement ) public WebElement mob;


    public void wireless(){
        wireless.click();
        Actions a = new Actions(driver);
        a.moveToElement(shop).click().build().perform();
    }
    public void search(){
        Actions a = new Actions(driver);
        a.moveToElement(search).click().build().perform();
        search.sendKeys("galaxy phone");
    }
    public void plans(){
        Actions a = new Actions(driver);
        a.moveToElement(plans).click().build().perform();
        minus.click();
    }
    public void teacher() throws InterruptedException {
     mouseHoverByXpath(dealsWebElement);
     sleepFor(3);
     teach.click();
    }
    public void signin() throws InterruptedException {
   sign.click();
//    my.click();
    }
    public void locate(){
        com.click();
    }
    public void stores(){
        store.click();
        sbar.click();
        sbar.sendKeys("12345");
    }
    public void iphone(){
        Actions a = new Actions(driver);
        a.moveToElement(shop).click().build().perform();
    }
    public void radiobuttons(){
        Actions a = new Actions(driver);
        a.moveToElement(shop).click().build().perform();
        radio1.click();
        radio2.click();
    }
    public void refresh() throws InterruptedException {
       sign.click();
       navigateRefresh();
    }









































}
