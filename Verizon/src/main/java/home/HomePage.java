package home;

import common.WebAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import static webelements.HomePageWebElements.*;

public class HomePage extends WebAPI {
    @FindBy(linkText = shopsWebElement) public WebElement shops;
    @FindBy(xpath = internetLinkWebElement) public WebElement internetLink;
    @FindBy(xpath = MyVerizonWebElement) public WebElement myVerizon;
    @FindBy(xpath = profileLinkWebElement) public WebElement profileLink;
    @FindBy(id=EspaniolLinkWebElement) public WebElement Espaniol;
    @FindBy(xpath = EnglishLinkWebElement) public WebElement English;
    @FindBy(id = logoWebElement) public WebElement logo;
    @FindBy(xpath = watchTVWebElement) public WebElement watchTV;
    @FindBy(xpath = GuideLinkWebElement) public WebElement guideLink;
    @FindBy(xpath = searchBarWebElement) public WebElement searchbar;
    @FindBy(xpath = searchBarIconWebElement) public WebElement searchbarIcon;
    @FindBy(id=copyrightTextWebElement) public WebElement copyright;
    @FindBy(xpath=verizonFBWebElement) public WebElement verizonFB;
    @FindBy(xpath=storeLocatorLinkWebElement) public WebElement storeLocation;
    @FindBy(xpath=storeStatesDDWebElement) public WebElement storeStateDD;
    @FindBy(xpath=storeStateSubmitButtonWebElement) public WebElement storeStateSubmit;
    @FindBy(xpath=salesAndBillRadioButtonWebElement) public WebElement salesRB;
    @FindBy(xpath=signInHoverWebElement) public WebElement signInHover;
    @FindBy(xpath=registerLinkWebElement) public WebElement registerLink;
    @FindBy(xpath=identityDropDownWebElement) public WebElement identityDD;
    @FindBy(xpath=userIDAndPasswordBoxWebElement) public WebElement userIDANdPassBox;
    @FindBy(xpath=usernameBoxWebElement) public WebElement username;
    @FindBy(xpath=passwordBoxWebElement) public WebElement password;
    @FindBy(xpath=logINButtonWebElement) public WebElement loginButton;

    public void shopsHover(){ mouseHover(shops); }
    public void internetLinkClick(){internetLink.click();}
    public void myVerizon(){mouseHover(myVerizon);}
    public void profileLink(){profileLink.click();}
    public void EspaniolLanguageClick(){Espaniol.click();}
    public void EnglishLanguageClick(){English.click();}
    public void watchTVHover(){mouseHover(watchTV);}
    public void guideLinkClick(){guideLink.click();}
    public void searchBarItem(String item){
        searchbarIcon.click();
        searchbar.sendKeys(item);
        searchbar.sendKeys(Keys.ENTER);
    }
    public void verizonFB(){verizonFB.click();}
    public void storeLocationLink(){storeLocation.click();}
    public void selectStateDD(){selectDropDownByIndex(storeStateDD,4);}
    public void selectStateSubmitButton(){storeStateSubmit.click();}
    public void salesAndBillRadioButtonClick(){salesRB.click();}
    public void signInHover(){mouseHover(signInHover);}
    public void registerLinkClick(){registerLink.click();}
    public void identityDD(){identityDD.click();}
    public void userIDPassGeneratingBoxClick(){userIDANdPassBox.click();}
    public void username(String user){username.sendKeys(user);}
    public void password(String pass){password.sendKeys(pass);}
    public void loginButtonClick(){loginButton.click();}

    public void hoverShopsMenu(){
        windowMaximize();
        shopsHover();
        internetLinkClick();
    }
    public void validateHoverShops(){
        String actual=shops.getText();
        Assert.assertEquals(actual,"Shop","not successful");
    }
    public void myVerizonHover(){
        windowMaximize();
        myVerizon();
        profileLink();
    }
    public void validateMyVerizon(){
        String actual=myVerizon.getText();
        Assert.assertEquals(actual,"My Verizon","not successful");
    }
    public void languageSwitch(){
        windowMaximize();
        EspaniolLanguageClick();

    }
    public void validateLanguageSwitch(){
        String actual=logo.getText();
        Assert.assertEquals(actual,"","not successful");
    }
    public void watchTVMouseHover(){
        windowMaximize();
        watchTVHover();
        guideLinkClick();
    }
    public void validateWatchTV(){
        String actual=watchTV.getText();
        Assert.assertEquals(actual,"","not successful");
    }
    public void searchingItem(){
        searchBarItem("Wireless");
    }
    public void validateSearchingItem(){
        String actual=logo.getText();
        Assert.assertEquals(actual,"","not successful");
    }
    public void scrollingDownHomePage(){
        windowMaximize();
        scrollUpDownByHeight();
    }
    public void validateScrollingDown(){
        String actual=copyright.getText();
        Assert.assertEquals(actual,"© Verizon 2020","not successful");
    }
    public void FacebookPage(){
        verizonFB();
        windowSwitch();
    }
    public void validateFBPage(){
        String actual="";
        Assert.assertEquals(actual,"","not successful");
    }
    public void storeSelectByLocation(){
        storeLocationLink();
        selectStateDD();
        selectStateSubmitButton();
    }
    public void validateStoreSelect(){
        String actual=logo.getText();
        Assert.assertEquals(actual,"","not successful");
    }
    public void salesPageRadioButtonSelect(){
        storeLocationLink();
        selectStateDD();
        selectStateSubmitButton();
        salesAndBillRadioButtonClick();
    }
    public void validateRadioButton(){
        String actual=logo.getText();
        Assert.assertEquals(actual,"","not successful");
    }
    public void generatingSignInPage(){
        signInHover();
        registerLinkClick();
        identityDD();
        userIDPassGeneratingBoxClick();
    }
    public void validateGenerateSignIN(){
        String actual=identityDD.getText();
        Assert.assertEquals(actual,"User ID & Password","not successful");
    }
    public void completeSignIn(){
        signInHover();
        registerLinkClick();
        identityDD();
        userIDPassGeneratingBoxClick();
        username("user");
        password("pass");
        loginButtonClick();
    }
    public void validateCompleteSignin(){
        String actual=identityDD.getText();
        Assert.assertEquals(actual,"User ID & Password","not successful");
    }
    public void completeSignInWithExcelData(String user, String pass){
        signInHover();
        registerLinkClick();
        identityDD();
        userIDPassGeneratingBoxClick();
        username(user);
        password(pass);
        loginButtonClick();
    }
    public void searchingItemWithDB(String item){
        searchBarItem(item);
    }
    public void validateSearchingItemWithDB(){
        String actual=logo.getText();
        Assert.assertEquals(actual,"","not successful");
    }

}
