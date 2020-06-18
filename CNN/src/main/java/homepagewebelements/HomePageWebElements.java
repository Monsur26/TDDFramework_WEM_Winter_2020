package homepagewebelements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageWebElements {

    @FindBy(xpath = "//body/div[@id='nav__plain-header']/div/div[@id='nav']/header[@id='header-nav-container']/div/div/div/div/button[1]//*[local-name()='svg']")
    public WebElement cnnSearchButton;
}
