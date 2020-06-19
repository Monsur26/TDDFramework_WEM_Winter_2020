package home;
import common.WebAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static homepagewebelements.HomePageWebElements.*;


public class HomePage extends WebAPI{
    @FindBy(css = menuBoxWebElement)public WebElement menuBox;
    @FindBy(xpath = headerSearchBarWebElement)public WebElement headerSearch;
    @FindBy(className = buttonSearchBarWebElement)public WebElement searchButton;
    @FindBy(xpath = USNewsLinkBarWebElement)public WebElement USNewsLink;
    @FindBy(xpath = USNewsLinkTopNewsBarWebElement)public WebElement USNewsLinkTopNews;
    @FindBy(xpath = videosLinkWebElements)public WebElement videosLink;
    @FindBy(xpath = videosLinkSelectedWebElements)public WebElement selectedvideoLink;
    @FindBy(css = userAccountButtonWebElement)public WebElement userAcc;
    @FindBy(xpath = emailWebElement)public WebElement email;
    @FindBy(xpath = passwordWebElement)public WebElement password;

    public void menuBoxGenerating(){
        menuBox.click();
    }
    public void heeadersearchbox(String searchitem){
        headerSearch.sendKeys(searchitem);
    }
    public void clicksearchbutton(){ headerSearch.sendKeys(Keys.ENTER); }
    public void USNewsLink(){
        USNewsLink.click();
    }
    public void USTopNews(){
        USNewsLinkTopNews.click();
    }
    public void videoLink(){
        videosLink.click();
    }
    public void videoSelectedLink(){
        selectedvideoLink.click();
    }
    public void userACC(){userAcc.click();}
    public void emaillogin(String emaillog){email.sendKeys(emaillog);}
    public void passwordadd(String pass){ password.sendKeys(pass);}

    public void menuSerach() throws InterruptedException {
        menuBoxGenerating();
        sleepFor(2);
    }
    public void menuSerachforitem() throws InterruptedException {
        menuBoxGenerating();
        heeadersearchbox("Donald Trump");
    }
    public void menuSerachForitemAndClick() throws InterruptedException {
        menuBoxGenerating();
        heeadersearchbox("Donald Trump");
        clicksearchbutton();
    }
    public void USTopNewsOfToday() throws InterruptedException {
        USNewsLink();
        sleepFor(2);
        USTopNews();
    }
    public void VideoLinksButton() throws InterruptedException {
        videoLink();
        videoSelectedLink();
        sleepFor(10);
    }
    public void hoverToUserAcc(){
        Actions actions=new Actions(driver);
        actions.moveToElement(userAcc).perform();
    }

    public void useraccdetails() throws InterruptedException {
        userACC();
        emaillogin("DJT@WH.com");
        passwordadd("MAGA");
    }

}
