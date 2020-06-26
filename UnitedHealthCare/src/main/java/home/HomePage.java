package home;

import common.WebAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import java.util.List;
import static webelements.HomePageWebElements.*;

public class HomePage extends WebAPI {
    @FindBy(xpath=uhcLogoWebElement) public WebElement uhcLogo;
    @FindBy(xpath=covidNoticeCloseWebElement) public WebElement covidNoticeClose;
    @FindBy(xpath=searchBoxWebElement) public WebElement searchBox;
    @FindBy(xpath=insuranceButtonWebElement) public WebElement insuranceButton;
    @FindBy(xpath=medicareButtonWebElement) public WebElement medicareButton;
    @FindBy(xpath=medicareZipCodeWebElement) public WebElement medicareZip;
    @FindBy(xpath=shopForAPlanWebElement) public WebElement shopFor;
    @FindBy(xpath=signInMenuWebElement) public WebElement signInMenu;
    @FindBy(xpath=myuhcSignInWebElement) public WebElement myuhc;
    @FindBy(xpath=espaniolWeElement) public WebElement espaniolLng;
    @FindBy(xpath=englishWebElement) public WebElement englishLng;
    @FindBy(xpath=upperMenuLInksWebElement) public List<WebElement> upperMenuLinks;
    @FindBy(linkText=welcomeMemberSignInWebElement) public WebElement welcomeMember;
    @FindBy(xpath=newPageSigninWebElement) public WebElement newPageSignInButton;
    @FindBy(xpath=exploreMedicareWebElement) public WebElement exploreMedicareButton;
    @FindBy(xpath=signInButtonWebElement) public WebElement signInButton;
    @FindBy(xpath=userNameWebElement) public WebElement user;
    @FindBy(xpath=passwordWebElement) public WebElement password;
    @FindBy(xpath=submitSignInWebElement) public WebElement submitSigIn;
    @FindBy(xpath=myuhcSigininLinkWebElement) public WebElement siginLinkMyUHC;


    public void setCovidNoticeClose(){covidNoticeClose.click();}
    public void searchBox(String key){
        searchBox.sendKeys(key);
        searchBox.sendKeys(Keys.ENTER);
    }
    public void insuranceButton(){insuranceButton.click();}
    public void medicareButton(){medicareButton.click();}
    public void medicareZip(String digits){
        medicareZip.sendKeys(digits);
        medicareZip.sendKeys(Keys.ENTER);
        windowSwitch();
        implicitWait(5);
    }
    public void setSignInMenu(){
        signInMenu.click();
    }
    public void setMyuhc(){
        String winHandleBefore = driver.getWindowHandle();
        myuhc.click();
        windowSwitch();
        implicitWait(5);
        switchToPreviousWindow(winHandleBefore);
    }
    public void myUhcSignInButtonClick(){
        signInMenu.click();
        siginLinkMyUHC.click();
        windowSwitch();
        signInButton.click();
    }
    public void username(String userName){user.sendKeys(userName);}
    public void password(String pass){password.sendKeys(pass);}
    public void clickSubmit(){submitSigIn.click();}
    public void setEspaniolLng() throws InterruptedException {espaniolLng.click(); }
    public void setEnglishLng(){englishLng.click();}
    public void upperLinks(){
        upperMenuLinks.size();
        windowSwitch();
    }
    public void welcomeMemberSignIn(){
        welcomeMember.click();
        windowSwitch();
    }
    public void dragUHCLogo(){
        dragAndDrop(uhcLogo,searchBox);
    }
    public void dragExploreMedicare(){
        dragAndDrop(exploreMedicareButton,searchBox);
    }
    public void covidNotice(){
        setCovidNoticeClose();
    }

    public void validateCovidNotice(){
        String actual=uhcLogo.getText();
        Assert.assertEquals(actual,"","not successful");
    }
    public void searchingItem(){
        searchBox("Plans");
    }
    public void validateSearchBox(){
        String actual=searchBox.getText();
        Assert.assertEquals(actual,"","not successful");
    }
    public void insuranceButtonSearch(){
        insuranceButton();
        medicareButton();
    }
    public void validateInsuranceButtonSearch(){
        String actual=insuranceButton.getText();
        Assert.assertEquals(actual,"Insurance","not successful");
    }
    public void medicareZipSearch(){
        insuranceButton();
        medicareButton();
        medicareZip("11417");
    }
    public void validateMedicareZipSearch(){
        String actual=shopFor.getText();
        Assert.assertEquals(actual,"Shop For a Plan","not successful");
    }
    public void signingIn(){
    setSignInMenu();
    setMyuhc();
    }
    public void validateSignIn(){
        String actual=signInMenu.getText();
        Assert.assertEquals(actual,"Sign In","not successful");
    }
    public void languageSelect() throws InterruptedException {
    setEspaniolLng();
    }
    public void validateLanguage(){
        String actual="Individuals and Families";
        Assert.assertEquals(actual,"Individuals and Families","not successful");
    }
    public void getUpperMenuLinks(){
        upperLinks();
    }
    public void memberSignIn(){
        welcomeMemberSignIn();
    }
    public void validateMemberSignIn(){
        String actual="Sign In";
        Assert.assertEquals(actual,"Sign In","not successful");
    }
    public void dragAndDropUHCLogo(){
    dragUHCLogo();
    }
    public void ExploreMedicareDrag(){
    dragExploreMedicare();
    }

    public void validateExploreMedicare(){
        String actual=exploreMedicareButton.getText();
        Assert.assertEquals(actual,"Explore Medicare Plans","not successful");
    }
    public void loggingIn(){
        myUhcSignInButtonClick();
        username("abcd");
        password("abcd");
        clickSubmit();
    }
    public void validateLoggingIn(){
        String actual=password.getText();
        Assert.assertEquals(actual,"","not successful");
    }
    public void loginInWithExcel(String user, String pass){
        myUhcSignInButtonClick();
        username(user);
        password(pass);
        clickSubmit();

    }

}
