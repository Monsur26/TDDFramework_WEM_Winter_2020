package home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;
import static webelements.HomePageWebElements.*;

public class HomePage extends WebAPI {
    @FindBy(how = How.XPATH,using = insuranceWebElement) public WebElement insurance;
    @FindBy(how = How.LINK_TEXT,using = shopAllPlansWebElement) public WebElement shopAllPlans;
    @FindBy(how = How.XPATH,using = memberResourcesWebElement) public WebElement memberResource;
    @FindBy(how = How.XPATH,using = understandInWebElement) public WebElement understandIn;
    @FindBy(how = How.CSS,using = searchBoxWebElement) public WebElement searchBox;
    @FindBy(how = How.CSS,using = searchButtonWebElement) public WebElement searchButton;
    @FindBy(how = How.LINK_TEXT,using = findADoctorWebElement) public WebElement findADoctor;
    @FindBy(how = How.LINK_TEXT,using = findOnlineDoctorWebElement) public WebElement findOnlineDoctor;
    @FindBy(how = How.XPATH,using = signInWebElement) public WebElement signIn;
    @FindBy(how = How.LINK_TEXT,using = singInMyuhcWebElement) public WebElement signInMyuhc;
    @FindBy(how = How.CSS,using = userNameWebElement) public WebElement user;
    @FindBy(how = How.CSS,using = passwordWebElement) public WebElement password;
    @FindBy(how = How.CSS,using = submitSignInWebElement) public WebElement submitSignIn;
    @FindBy(how = How.XPATH,using = findVProviderWebElement) public WebElement findVProvider;

    public void UHCHomePage(){
        String title= driver.getTitle();
        System.out.println("Title : "+driver.getTitle()); }
    public void UHCInsurance() { insurance.click(); }
    public void UHCInsuranceShopAllPlans() {
        UHCInsurance();
        shopAllPlans.click();
    }
    public void UHCMemberResources(){memberResource.click(); }
    public void UHVMReUnderstandIn(){
       memberResource.click();
        understandIn.click();
    }
    public void UHCSearch(){
        searchBox.sendKeys("Dental Plan");
        searchButton.click();
    }
    public void UHCFindADoctor(){
        findADoctor.click();
        findOnlineDoctor.click();
    }
    public void UHCSignIn(){
        signIn.click();
        signInMyuhc.click();
    }
    public void windowHandle(){
        Set<String> windowIds =driver.getWindowHandles();
        Iterator<String> iter=windowIds.iterator();
        String mainWindow=iter.next();
        String childWindow=iter.next();
        driver.switchTo().window(childWindow);
    }
    public void UHCSignInWindowsHandle(){
        System.out.println("Main window : "+driver.getTitle());
        signIn.click();
        signInMyuhc.click();
        windowHandle();
        System.out.println("child window :"+driver.getTitle());
    }
    public void MyuscFindProvider() throws InterruptedException {
        System.out.println("Main window : "+driver.getTitle());
        signIn.click();
        signInMyuhc.click();
        windowHandle();
        System.out.println("child window :"+driver.getTitle());
        findVProvider.click();
    }
    public void userName(String userName){user.sendKeys(userName);}
    public void password(String pass){password.sendKeys(pass);}
    public void submit(){submitSignIn.click();}
    public void loggingIn(){
        signIn.click();
        signInMyuhc.click();
        userName("abcd");
        password("abcd");
        submit();
    }
    public void myUHCuserSignin(){
        signIn.click();
        signInMyuhc.click();
    }
    public void validateLoggingIn(){
        String actual=password.getText();
        Assert.assertEquals(actual,"","not successful");
    }
    public void loginInWithExcel(String user, String pass){
        myUHCuserSignin();
        userName(user);
        password(pass);
        submitSignIn.click();
    }


}
